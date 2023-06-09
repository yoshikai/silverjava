package tools;

import java.io.*;
import java.util.*;

/**
 * 模擬試験添削ツール
 */
public class PracticeCorrection {

    //模擬試験解答のファイルの場所
    public final static String MOGI_MOHAN_KAITOU_PATH = "./mogi";
    //模擬試験解答のファイル名
    public final static String MOGI_MOHAN_KAITOU = "mogi1_answer.txt";
    //受講生の回答欄の置き場所
    final static String RESULT_PATH = "./result";
    public static void main(String[] args) throws IOException {
        //mogiフォルダにある模範解答を取得
        Mohan mohan = new Mohan(PracticeCorrection.MOGI_MOHAN_KAITOU_PATH, PracticeCorrection.MOGI_MOHAN_KAITOU);
        Map<String, String> resultMap = mohan.getAnswerMap();
        //resultフォルダにあるtextファイル一覧を取得
        File dir = new File(RESULT_PATH);
        File[] files = dir.listFiles(new TextFileFilter());
        if(files == null) return;

        //まとめファイル出力
        String all = "all.txt";
        File allFile = new File(RESULT_PATH + "/" + all);
        FileWriter allFw = new FileWriter(allFile, false);

        for(int i=0; i<files.length; i++){
            try {
                //回答文読み込み
                FileInputStream fis = new FileInputStream(files[i]);
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                //添削結果出力
                String out = "【採点済み】" + files[i].getName();
                File outFile = new File(RESULT_PATH + "/" + out);
                FileWriter fw = new FileWriter(outFile, false);
                //まとめファイルに名前を追加
                allFw.append(files[i].getName());

                String data;
                int examCnt = 0;
                int correctCnt = 0;
                while ((data = br.readLine()) != null) {
                    //先頭が#の場合はスキップ
                    if(data == null || data.isEmpty() || data.startsWith("#")){
                        continue;
                    }
                    String[] tmp = data.split(":");
                    //添削結果メッセージ
                    StringBuilder correctionMsg = new StringBuilder();
                    //改行だけなどの場合はcontinue
                    if(tmp == null || tmp.length != 2){
                        continue;
                    }
                    tmp[1] = commaTextSort(tmp[1]);
                    //回答した問題Noに対する正解を取得
                    if(!resultMap.containsKey(tmp[0])){
                        //回答した問題文に対応する回答がない場合→回答のナンバリングが間違えているため
                        //添削結果に追加
                    }
                    examCnt++;  //出題数をインクリメント
                    String correct = resultMap.get(tmp[0]);
                    //正誤判定
                    correctionMsg.append("\t\t"); //タブ文字追加
                    if(correct.equals(tmp[1])){
                        correctionMsg.append("〇");
                        correctCnt++;   //正解数をインクリメント
                    }
                    else{
                        correctionMsg.append("×");
                    }
                    fw.append(data).append(correctionMsg).write("\r\n");;
                }
                String result = "正解数:" + correctCnt + " / 出題数:" + mohan.getExamCnt();
                fw.append("\r\n").append(result).flush();
                //まとめファイルには正解数/問題数を出力
                allFw.append("\t" + correctCnt + "/" + mohan.getExamCnt() + "\r\n").flush();

                fw.flush();
                fw.close();
                //テキストファイル全部読み終えたらclose
                br.close();
                fis.close();

                //答えと突き合わせ

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        allFw.flush();
        allFw.close();
    }

    /**
     * カンマで区切られた文字列を、文字列のみ抜き出してソート(昇順)を行うメソッド
     * 小文字の場合は大文字に変換します。
     * @param s "d,c,b,a"のようなカンマ区切りの文字列
     * @return "A,B,C,D"
     */
    private static String commaTextSort(String s){
        String[] t = s.split(",");
        Arrays.sort(t);
        StringBuilder sb = new StringBuilder();
        Arrays.asList(t).forEach(str -> {
            sb.append(str.toUpperCase() + ",");
        });
        int i = sb.lastIndexOf(",");
        if(i > 0){
            return sb.substring(0, i);
        }
        return sb.toString();
    }
}

/**
 * テキストファイル(拡張子が.txt)のみをフォルダから取得するフィルター
 */
class TextFileFilter implements FilenameFilter{
    @Override
    public boolean accept(File dir, String name) {
        if(name.matches("^(?=.*all).*$")){
            return false;
        }
        if(name.matches("^(?=.*採点済).*$")){
            return false;
        }
        if (name.endsWith(".txt")) {
            return true;
        }
        return false;
    }
}

/**
 * 模範解答を取得保持するクラス
 */
class Mohan{
    private String path = null;
    private String name = null;

    private int examCnt = 0;
    private Map<String, String> map = new HashMap<String, String>();
    /**
     * 模範解答のファイルパスとファイル名を受け取り、
     * 問題No：正解の回答をマッピング情報として保持します。
     * @param path
     * @param name
     */
    public Mohan(String path, String name) throws IOException {
        this.path = path;
        this.name = name;
        setUp();
    }

    public void setUp() throws IOException {
        File mohan = new File(path + "/" + name);
        FileInputStream fis = new FileInputStream(mohan);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String data;
        while ((data = br.readLine()) != null) {
            //#で始まった行は無視
            if(data == null || data.isEmpty() || data.startsWith("#")){
                continue;
            }
            String[] tmp = data.split(":");
            if(tmp.length == 2 && tmp[1] != null){
                tmp[1] = tmp[1].toUpperCase();  //回答を大文字に変換
            }
            this.map.put(tmp[0],tmp[1]);
            examCnt++;
        }
        br.close();
        fis.close();
    }

    public Map<String, String> getAnswerMap(){
        return this.map;
    }

    /**
     * 出題数（返却しているのは回答数だけど）を返すメソッド
     * @return
     */
    public int getExamCnt(){
        return this.examCnt;
    }
}

/**
 * テキストファイルの１行単位の回答を表すクラス。
 */
class Kaitou{
    /*
    * 模擬試験の問題文No
    * */
    private String no;
    /**
     * 回答者が入力した回答となる選択肢のリスト
     */
    private String answer;

    private boolean correct = false;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    /**
     * 模擬試験の回答
     */
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String ans) {
        this.answer = ans;
    }

    /**
     * 正解か不正解かのフラグ。falseは不正解、trueは正解
     */
    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
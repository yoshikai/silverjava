package chap6.p267;

import java.util.ArrayList;
import java.util.Collections;

class Employee2 implements Comparable<Employee2>{
    private String name;
    private Integer id;
    public Employee2(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee2 o) {
        int id = o.getId(); //比較対象のEmployeeオブジェクトのID
        int own = this.getId(); //自分のID
        if(id > own){
            return -1;  //自分のIDが小さい場合（比較対象のEmployeeオブジェクトのIDが大きい）は-1を返す
        }
        else if(id < own){
            //自分のIDが大きい場合は、整数を返す
            return 1;
        }
        else{
            //IDが同じ値の場合は0を返す
            return 0;
        }
    }
}

public class Sample {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2("taro", 20);
        Employee2 e2 = new Employee2("tomoko", 10);
        Employee2 e3 = new Employee2("hiromi", 50);
        ArrayList<Employee2> ary = new ArrayList<>();
        ary.add(e1);
        ary.add(e2);
        ary.add(e3);
        System.out.println("ArrayListのインデックス順での表示");
        print(ary);
        System.out.println("MyRule で定義した昇順での表示");
        Collections.sort(ary);
        print(ary);
    }

    public static void print(ArrayList<Employee2> ary) {
        for (Employee2 obj : ary) {
            System.out.println(obj.getId() + " " + obj.getName());
        }
    }
}


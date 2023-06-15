package practice1.Q10;
class Foo{
    static int func(){
        return 10;
    }
}
class Bar{
    public void test(){
        System.out.println("hello");
    }
}
class sample{
    public static void main(String[] args){
        System.out.print(Foo.func());
        new Bar().test();
        System.out.println("Sample");

    }
}
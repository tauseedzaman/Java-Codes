class A{
    int x = 1;
    void showX(){
        System.out.println(x);
    }
}
class B extends A{
    int x =10;
    void showX(){
        System.out.println(x);
    }
}

class polymorph{
    public static void main(String[] args) {
        B objB;
        A objA = new A();
        objB = objA;
        objB.showX();
        // System.out.println("Hello WOrld");
    }
}
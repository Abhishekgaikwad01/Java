public class Swap {
    public static void main(String[] args) {
        Swap s = new Swap();
        s.swap(10, 20);
    }
    void swap(int a, int b){
        System.out.println("a="+a+" and b=" + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" and b=" + b);
    }
}

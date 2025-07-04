public class ObjectCreation {
    public void myMethod()
    {
        int x =1;
        int y =2;
        int q=x+y;
        System.out.println(q);
    }

    public static void main(String[] args) {
        int a=2;
        int b=1;
        int c=a-b;
        System.out.println(c);
        ObjectCreation m=new ObjectCreation();
        m.myMethod();
    }
}

package Unit2;

public class Example {
    //method1
    public void method1(int a){
    }

    public boolean method2(){
        return true;
    }

    private String method3(int a){
        return "";
    }

    public void method4(String name){
    }

    public double method5(){
        return 2;
    }

    public int method6(boolean isStudent){
        return 2;
    }
}

class Tester{
    public static void main(String[] args) {
        Example e1 = new Example();

        e1.method4("Mery");
        double var1 = e1.method5();
        System.out.println(e1.method6(true));
        int var2 = e1.method6(false);
    }
}

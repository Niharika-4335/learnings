package learn;
class A {
    static int t = 0;
    A() {
        t++;  
    }

    static void TotalStudents() {
        System.out.println(t);
    }
}

public class Instance {
    public static void main(String[] args) {
         A a=new A();
         A a1=new A();
         a1.TotalStudents();
    }
}


package Basics;

public class Tuesday {
    
     public static void main(String[] args) {
        
        B obj = new B();
        obj.show();
    }
    
    //private int a = 10;
}

class B extends Tuesday {
    void show() {
        System.out.println("Encapsulation");  
    }
}

package org.example.tricks;

import java.util.Objects;

class ConstCheck{
    int a;

    ConstCheck(int a){
        this.a = a;
    }
    ConstCheck(Object a){
        this.a = 5;
    }
    ConstCheck(String a){
        this.a = 8;
    }
    static void show(){
        System.out.println("parent");
    }


}

class Consts extends ConstCheck{
    Consts(int a) {
        super(a);
    }

    static void show(){
        System.out.println("child");
    }
}
public class Tricks {
    static int t =9;
    static int checkPostfix(int a){
        return a++;
    }

    static boolean isPowerOf2(int x){
        if(x == 0 || x == 1)
            return false;
        if ((x & (x - 1)) == 0)
            return true;
        else
            return false;
    }
    static boolean ternary(int n){
        return n%2==0?true:false;
    }
    public static void main(String[] args) {

        int a =5;
        System.out.println(checkPostfix(a));
        System.out.println(isPowerOf2(8));
        System.out.println(ternary(10));

        ConstCheck constCheck = new ConstCheck(null);
        System.out.println(constCheck.a);

       Consts.show();

        System.out.println(t);
    }
}

package org.example.tricks;

class First{
    private int i;
    private int j;

    First(int i, int j){
        this.i = i;
        this.j = j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "First{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
public class ObjectReference {
    public static void main(String[] args) {
        First first = new First(10, 20);

        First second = first;
        second.setI(100);
        second.setJ(200);

        System.out.println(second);
    }
}

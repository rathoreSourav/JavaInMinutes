package org.example.tricks;

public class ConceptRevision {

    public void shows(){
        System.out.println("show");
    }
    public int shows(int x){
        return 1;
    }

public static void main(String[] args) {

    int y = 0;
    int z = 0;
    int x=z=1;
    System.out.println(y+","+x+","+z);
}
}
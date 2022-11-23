package CoreJava;
//int chat float...etc primitive
//Integer Float Character Class

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        int a=5;
        Integer ii= new Integer(a);//the method of puting primitive value to an object is called boxing
        Integer jj=a; //Auto Boxing

        int j= jj.intValue();//unboxing-  object to primitive
        int i=ii;//AutoUnboxing

        ArrayList<Integer> values= new ArrayList<Integer>(); // Collections and Generics concept
        values.add(3);
        values.add(4);
        values.add(8);



    }
}

package Package2;


import Package1.Class1;
//import Package1.Class2;

public class Runner2 {

    public static void main(String[] args) {

        Class1 c1 = new Class1();
//        Class2 c2 = new Class2();

//        // no a
//        System.out.println(c1.b);
//        // no c
//        // no d
//
//        // no a
//        System.out.println(c2.b);
//        // no c
//        // no d



//       in order to create this object the Package2.Class3 was imported
        Class3 c3 = new Class3();
        System.out.println(c3.b); // thnx to the extension/inheritance

        c3.two();
//        c3.four();


    }
}

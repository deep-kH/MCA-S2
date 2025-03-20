/*
 * enerally string is a sequence of char. In java, striong is a=n object that
 * represent sequence of charecters
 * Java.lan.string is the package and string is the pre defined class in java
 * How to create a string object.
 * 1. By string iteral - using ""
 * String s = "Java"
 * 2. By new keyword
 * String s = new String("ABC")
 * 
 * Each time we create a string literal, the jDM checks the string constant pool
 * If the string already exist in the pool, referance to the pool instance is
 * returned.
 * 
 * If the string deos not exist in the pool, a new string instance is created
 * and placed in the pool
 * Using new keyword, JDM will create a new string object, in normal heap
 * memory.and the literal "abc" is placed in the string constant pool
 * The variable s will refer to the object in a heap,
 * Carequence interface : Interface available in java.lan package It enables
 * flexible and implimentnation indipendant text processing actross the java
 * classes and
 * diff classes are diff string handling classes .
 * 1. String
 * 2. StringBuffer
 * 3. StringBuilder
 * Sring class encapsulate a series of charecter once instantiated, a string
 * objects content is fixed and cannot be modified.(immutable) This immutability ensures, that string objexts are safe.
 * eg : String s = "Java"
 * : String s = new String("HELLO WORLD")
 * Length is a methid in string class to find the length
 */

import java.lang.*;

class Stin {

    public static void main(String args[]) {
        String s = "Helo World";
        String str = new String("Helo  Earth");
        String appstr = new String("With") + "\t" + s + " " + str;
        System.out.println(s);
        System.out.println(str);
        System.out.println(appstr);
        System.out.println("ithrem " + appstr.length());
    }
}
/*
 * It represent a mutable sequesnce of charecters
 * It include various string manipulation operation slike insertion, deletion
 * append etc
 * Styntax: StringBuffer --Objectname-- = new StringBuffer
 */

class InnerStin {
    public static void main(String args[]) {
        StringBuffer Ob = new StringBuffer("A B C");
        Ob.append(" Onnum parayanda");
        String Ob2 = new String("Ith njana ");
        System.out.println(Ob2);
        // No string manipulatuon in String class
        Ob.delete(1, 10);
        System.out.println(Ob);
        System.out.println(Ob.length() + " Ennam");
    }

}
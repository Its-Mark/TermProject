/**
 * Term Project
 * Due: 5/7/2020
 * @author Mark Garcia mark.garcia.8001@gmail.com
 * @author Brandon Wiitannen brandon.wiitannen01@student.csulb.edu
 */

/**
 * Singleton.java
 *
 * The singleton pattern.
 *
 * Note - there are more efficient approaches than what is
 * being used here - notably the  double-checked locking idiom.
 */

public class Singleton
{
   private static Singleton instance;

   // declare the constructor as private which prevents object creation via new
   private Singleton() { }

   public static  Singleton getInstance() {
     if (instance == null) 
       instance = new Singleton();

     return instance;
   }
}

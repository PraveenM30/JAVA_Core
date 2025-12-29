package JAVA.OOPS.Abstraction;

public class A_Notes {

    /* Exposing only the essentials features of an object to the user and hiding the inner details to reduce
    the complexity,maintenance and reusability.

     using 2 keywords we can achieve
     1. Abstract
     2. Interface

     Rules for Abstract
     1. Methods with header but without implementations is known as Abstarct method or incomplete method.
     2. The class should be prefixed with abstract.
       ex: public abstract class Test1{
              }
     3. To create a Abstract method , the abstract keyword should be prefixed with method name
        ex: abstract void m1();
     4. In a class if we have abstract method then its mandatory to make class as abstract.
     5. Not able to create a object for abstract method.

     Rules for Interface
     1. Complete functions cannot be used in interface class.
     2. one interface can Extend another Interface.
     3. One Class can extend only one class but it can implement multiple interface.
      ex: class A extends b implements I1,I2{}
     4. Implement keyword can is used to implement the interface.


      diff b/w abstract and interface
       * interface cannot have concrete method/complete functions but abstract can have concrete method.

    */
}

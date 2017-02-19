import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Write a Java program that reads the name of a class from the command line and emits the
 interface of the class in Java syntax (interface or class, modifiers, constructors, methods,
 fields; no method bodies).
 Hint: You can load a class whose name you know with java.lang.Class.forName(). The
 java.lang.Class class offers a rich interface that enables you to inspect the interface of
 any class.
 Apply this program to a set of classes and interfaces as test input. You may also use the
 program on itself
 */
public class Question1 {

    public static void main(String[] args) throws ClassNotFoundException {

        Question1 commandLineReader = new Question1();
        System.out.println("enter class: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Class inputClass = Class.forName(input);
        Class<?>[] classes = inputClass.getInterfaces();
        //ArrayList interfaces = new ArrayList(inputClass.getInterfaces());
          for (int i = 0; i < classes.length ;i++) {
              System.out.println(inputClass.getInterfaces()[i]);
          }





    }



}

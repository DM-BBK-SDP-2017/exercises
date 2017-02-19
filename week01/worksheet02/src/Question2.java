/*
2. Write a program that reads a class name and a list of arguments, and creates an object of
        that class where the read arguments are passed to the constructor.
        Hint: Treat arguments as strings. A java.lang.Class can enumerate its constructors.
        Choose a constructor with the appropriate parameter count. Then, find the parameter
        types. To create typed argument objects, call the appropriate constructors that take a
        string as their only argument. Call dynamic constructors using
        java.lang.reflect.Constructor.newInstance().
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Question2 {


    public void execute(String input, Object[] args) {



        //Object newObj = Constructor.newInstance(classArgs)

        //CinputClass.newInstance();
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Question2 commandLineReader = new Question2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter class: ");
        ArrayList<Constructor> consts = new ArrayList(Arrays.asList(Class.forName(scanner.next()).getConstructors()));
        System.out.println("enter args: ");
        String[] classArgs = scanner.next().split(" ");

        Constructor usableConst = consts.stream()
                .filter(x -> x.getParameterCount() == classArgs.length)
                .findAny()
                .get();


        /*consts = consts.stream().filter(x -> 0 != Arrays.stream(x.getParameterTypes())
                .filter(y -> y.getName().equals("java.lang.String")).toArray().length   )
                .toArray();*/

/*
        Class[] usableConstParams = usableConst.getParameterTypes();
        Object[] params = new Object[usableConstParams.length];
        for (int i = 0; i < usableConstParams.length; i++) {
            params[i] = usableConstParams[i].    newInstance()
        }




                        usableConst.newInstance(classArgs);
*/









    }
}

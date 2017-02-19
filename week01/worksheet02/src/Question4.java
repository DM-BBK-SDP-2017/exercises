import java.util.ArrayList;
import java.util.Arrays;

/**
 4. Normally it is up to the programmer to write a toString() method for each class one
 creates. This exercise is about writing a general toString method once and for all. As part
 of the reflection API for java, it is possible to find out which fields exist for a given object,
 and to get their values. The purpose of this exercise is to make a toString method that
 gives a printed representation of any object, in such a manner that all fields are printed,
 and references to other objects are handled as well.
 To solve this exercise, you will need to examine the java.lang.reflect API. You will
 (probably) end up with around 50–60 lines of code, including that necessary for trying it
 out. */


public class Question4 {

    public Object targetObj = null;

    public Question4(Object targetObj) {
        this.targetObj = targetObj;
    }

    @Override
    public String toString() {
        return toStringRecursiveHelper(targetObj);
    }

    public String toStringRecursiveHelper(Object obj) {
        Object[] returnArray = Arrays.stream(obj.getClass().getFields()).toArray();
        StringBuilder returnString = new StringBuilder();
        for (int i = 0; i < returnArray.length ; i++) {

            returnString.append(returnArray[i].toString()).append(toStringRecursiveHelper(returnArray[i]));

        }
        return returnString.toString();




               // .forEach(x -> x.get((Object) x.getClass()));
    }


}

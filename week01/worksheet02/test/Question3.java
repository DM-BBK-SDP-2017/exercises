/**
 3. Write a JUnit test to help grade the internal correctness of a student’s submitted program
 for a hypothetical assignment.
 Make the tests fail if the class under test has any of the following:
 • more than four fields
 • any non-private fields
 • any fields of type ArrayList
 • fewer than two private helper methods
 • any method that has a throws clause
 • any method that returns an int
 • missing a zero-argument constructor */

import org.junit.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Question3 {

    public class StudentClass{};
    StudentClass studentClass = new StudentClass();

    @Test
    public void testFourFields() {
        assert studentClass.getClass().getFields().length < 5;
    }

    @Test
    public void testNonPrivate() {
        assert Arrays.stream(studentClass.getClass().getFields())
                .filter(x -> x.isAccessible())
                .count() == 0;
    }

    @Test
    public void testNoArrayList() {
        assert Arrays.stream(studentClass.getClass().getFields())
                .filter(x -> x.getType().getName().contains("java.util.ArrayList"))
                .count() == 0;

    }

    @Test // fewer than two private helper methods
    public void testMoreThatTwoPrivateHelperMethods() {
        assert Arrays.stream(studentClass.getClass().getMethods())
                .filter(x -> x.isAccessible() == false)
                .count() < 2;
    }

    @Test //any method that has a throws clause
    public void testThrows() {
        assert Arrays.stream(studentClass.getClass().getMethods())
                .filter(x -> x.getExceptionTypes().length != 0)
                .count() == 0;
    }

    @Test //any method that has a return type int
    public void testReturnsInt() {
        assert Arrays.stream(studentClass.getClass().getMethods())
                .filter(x -> x.getReturnType().equals(Integer.TYPE))
                .count() == 0;
    }

    @Test
     // missing a zero-argument constructor */
    public void testZeroArgConst() {
        assert Arrays.stream(studentClass.getClass().getConstructors())
                .filter(x -> x.getParameterCount() == 0)
                .count() > 0;

    }



}

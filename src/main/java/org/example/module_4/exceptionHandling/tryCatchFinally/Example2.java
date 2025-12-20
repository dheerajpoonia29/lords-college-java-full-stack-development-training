package org.example.module_4.exceptionHandling.tryCatchFinally;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Program started");
        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println("Accessing array elements:" + array[3]);
            int result = 10/0;
            String name = "danny";
            System.out.println("Length of the name string: " + name.length());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred: " + e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        } catch(NullPointerException e) {
            System.out.println("Null Pointer Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed");
        }

        System.out.println("Program ended");
    }
}

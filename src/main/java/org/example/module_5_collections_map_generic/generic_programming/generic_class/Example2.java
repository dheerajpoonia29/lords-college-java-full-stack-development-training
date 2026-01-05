package org.example.module_5_collections_map_generic.generic_programming.generic_class;

public class Example2 {
    public static void main(String[] args) {
        MyClass<Integer> ob1 = new MyClass<>();
        System.out.println("ob1 var = " + ob1.getVar());
//        ob1.var = 88;
        ob1.setVar(88);
        System.out.println("ob1 var = " + ob1.getVar());

        MyClass<String> ob2 = new MyClass<>();
        System.out.println("ob2 var = " + ob2.getVar());
        ob2.setVar("Generics are powerful");
        System.out.println("ob2 var = " + ob2.getVar());
    }
}

class MyClass<T> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T userVar) {
        var = userVar;
    }
}

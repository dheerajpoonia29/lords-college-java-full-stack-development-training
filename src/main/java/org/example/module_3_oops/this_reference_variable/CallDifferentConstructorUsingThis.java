package org.example.module_3_oops.this_reference_variable;

public class CallDifferentConstructorUsingThis {
    CallDifferentConstructorUsingThis() {
        this("alice", "engineer");
        System.out.println("Default constructor called");
    }

    CallDifferentConstructorUsingThis(String name) {
        this(name, "engineer");
        System.out.println("Constructor with name: " + name);
    }

    CallDifferentConstructorUsingThis(String name, String profession) {
        System.out.println("Constructor with name: " + name + " and profession: " + profession);
    }

    public static void main(String[] args) {
        CallDifferentConstructorUsingThis obj = new CallDifferentConstructorUsingThis("bob");
    }
}

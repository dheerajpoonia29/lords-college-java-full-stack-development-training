package org.example.module_8.hibernate;

import jakarta.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue
    @Column(name="id")
    int id;

    @Column(name="name")
    String name;

    @Column(name="age")
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package ru.otus.java.oop.inheritance;

// extends Object - всегда неявно, писать не надо
public class Person extends Object {
    private String name;

    public Person(String name) {
        this.name = name;
    }

//region toString

//    @Override
//    public String toString() {
//        return this.name;
//    }

//endregion

//region equals, hashCode

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Person person = (Person) o;
//
//        return name != null
//                ? name.equals(person.name)
//                : person.name == null;
//    }
//
//    @Override
//    public int hashCode() {
//        return name != null ? name.hashCode() : 0;
//    }

//endregion
}

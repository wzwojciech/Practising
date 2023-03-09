package org.example;

public class Worker {

    String name;
    String surname;
    String id;

    public Worker(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Worker w = (Worker) obj;
        return this.name.equals(w.name) && this.surname.equals(w.surname) && this.id.equals(w.id);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(id.substring(0, 1));
    }

    @Override
    public String toString() {
        return "Worker{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", id='" + id + '\'' + '}';
    }

}

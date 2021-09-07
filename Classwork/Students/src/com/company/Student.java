package com.company;

public class Student {
    String name;
    String surname;
    String email;
    String repoLink;

    public Student(String name, String surname, String email, String repoLink) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.repoLink = repoLink;
    }

    public void display() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepoLink() {
        return repoLink;
    }

    public void setRepoLink(String repoLink) {
        this.repoLink = repoLink;
    }
}

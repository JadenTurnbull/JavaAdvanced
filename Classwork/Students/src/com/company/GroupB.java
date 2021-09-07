package com.company;

public class GroupB extends Student{
    private int totalMembers = 0;
    private String course;

    public GroupB(String name, String surname, String email, String repoLink, int totalMembers, String course) {
        super(name, surname, email, repoLink);
        this.totalMembers = totalMembers;
        this.course = course;
    }

    public GroupB(String name, String surname, String email, String repoLink, String course) {
        super(name, surname, email, repoLink);

        this.course = course;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Number of students: " + getTotalMembers());
        System.out.println("Course: " + getCourse());
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}


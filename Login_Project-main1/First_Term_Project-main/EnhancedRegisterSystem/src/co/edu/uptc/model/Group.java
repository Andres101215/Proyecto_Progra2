package co.edu.uptc.model;

import java.util.ArrayList;

public class Group {
      private int Id;
    private String Faculty;
    private String Name;
    private String Initial;
    private String email;
    private String goal;
    private ArrayList<Project> projects ;

    public Group() {
    }
    
    public Group(int id, String faculty, String name, String initial, String email, String goal,
        ArrayList<Project> projects) {
        Id = id;
        Faculty = faculty;
        Name = name;
        Initial = initial;
        this.email = email;
        this.goal = goal;
        this.projects = projects;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getInitial() {
        return Initial;
    }

    public void setInitial(String initial) {
        Initial = initial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------------------------------------\n"
        +"Grupo Id: " + Id + "\nFaculty: " + Faculty + "\nName: " + Name + "\nInitial: " + Initial + "\nEmail: "
                + email + "\nGoal:\n" + goal;
    }
}
package ESMAD;

import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private String coordinator;
    private ArrayList<Integer> subjectIds = new ArrayList<Integer>();



    /*
        Constructors
     */

    public Course(int id, String name, String coordinator) {
        this.id = id;
        this.name = name;
        this.coordinator = coordinator;
    }




    /*
        Getters and Setters
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    public ArrayList<Integer> getSubjectIds() {
        return subjectIds;
    }

    public void setSubjectIds(ArrayList<Integer> subjectIds) {
        this.subjectIds = subjectIds;
    }




    /*
        Methods
     */

    public void addSubject(int subjectId) {
        if (this.subjectIds.contains(subjectId)) {
            System.out.println("Subject already in Course.");
        }
        else {
            this.subjectIds.add(subjectId);
        }
    }

    public void removeSubject(int subjectId) {
        if (!this.subjectIds.contains(subjectId)) {
            System.out.println("Subject not found.");
        }
        else {
            this.subjectIds.remove(subjectId);
        }
    }




    public static void main(String[] args) {

    }
}

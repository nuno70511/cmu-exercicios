package ESMAD;

public class Subject {
    private int id;
    private String name;
    private int nStudents;



    /*
        Constructors
     */

    public Subject(int id, String name) {
        this.id = id;
        this.name = name;
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

    public int getNumberStudents() {
        return nStudents;
    }

    public void setNumberStudents(int nStudents) {
        this.nStudents = nStudents;
    }





    public static void main(String[] args) {

    }
}

package ESMAD;

import java.util.ArrayList;
import java.util.Scanner;

public class MyProgram {

    private ArrayList<Course> courses;
    private ArrayList<Subject> subjects;

    private int nextCourseId;
    private int nextSubjectId;

    public MyProgram() {
        this.courses = new ArrayList<Course>();
        this.subjects = new ArrayList<Subject>();

        this.nextCourseId = 1;
        this.nextSubjectId = 1;
    }

    public void createCourse(MyProgram myProgram, Scanner sc) {
         do {
            System.out.println("Type the course name:");
            String courseName = sc.next();

            System.out.println("Type the course coordinator:");
            String coordinator = sc.next();

            Course newCourse = new Course(myProgram.nextCourseId, courseName, coordinator);
            myProgram.courses.add(newCourse);

            myProgram.nextCourseId++;

            System.out.println("Create another course? (y) / Press any other key to escape.");
        } while (sc.next().equals("y"));
    }

    public void createSubject(MyProgram myProgram, Scanner sc) {
        do {
            System.out.println("Type the subject name:");
            String subjectName = sc.next();

            Subject newSubject = new Subject(myProgram.nextSubjectId, subjectName);
            myProgram.subjects.add(newSubject);

            myProgram.nextSubjectId++;

            System.out.println("Create another subject? (y) / Press any other key to escape.");
        } while (sc.next().equals("y"));
    }

    public void addSubjectToCourse(MyProgram myProgram, Scanner sc) {
        if (myProgram.courses.size() == 0) {
            System.out.println("There are no courses.");
            System.out.println("");
        }
        else if (myProgram.subjects.size() == 0) {
            System.out.println("There are no subjects.");
            System.out.println("");
        }
        else {
            do {
                myProgram.printSubjects(myProgram);

                System.out.println("Select a subject id:");
                int selectedSubjectId = sc.nextInt();

                boolean isSubjectIdValid = false;
                for (Subject subject : myProgram.subjects) {
                    if (subject.getId() == selectedSubjectId) {
                        isSubjectIdValid = true;

                        myProgram.printCourses(myProgram);

                        System.out.println("Select a course id:");
                        int selectedCourseId = sc.nextInt();

                        boolean isCourseIdValid = false;
                        for (Course course : myProgram.courses) {
                            if (course.getId() == selectedCourseId) {
                                isCourseIdValid = true;

                                course.addSubject(selectedSubjectId);

                                break;
                            }
                        }

                        if (!isCourseIdValid) {
                            System.out.println("Invalid course id.");
                        }

                        break;
                    }
                }

                if (!isSubjectIdValid) {
                    System.out.println("Invalid subject id.");
                }

                System.out.println("Add another subject? (y) / Press any other key to escape.");
            } while (sc.next().equals("y"));
        }
    }

    public void showCourseSubjects(MyProgram myProgram, Scanner sc) {
        if (myProgram.courses.size() == 0) {
            System.out.println("There are no courses.");
            System.out.println("");
        }
        else {
            do {
                myProgram.printCourses(myProgram);

                System.out.println("Select a course id:");
                int selectedCourseId = sc.nextInt();

                boolean isCourseIdValid = false;
                for (Course course : myProgram.courses) {
                    if (course.getId() == selectedCourseId) {
                        isCourseIdValid = true;

                        if (course.getSubjectIds().size() > 0) {
                            myProgram.printSubjects(myProgram);
                        }
                        else {
                            System.out.println("No subjects in the selected course.");
                        }

                        break;
                    }
                }

                if (!isCourseIdValid) {
                    System.out.println("Invalid course id.");
                }

                System.out.println("Show subjects of another course? (y) / Press any other key to escape.");
            } while (sc.next().equals("y"));
        }
    }

    public void showSubjectStudentCount(MyProgram myProgram, Scanner sc) {
        if (myProgram.subjects.size() == 0) {
            System.out.println("There are no subjects.");
            System.out.println("");
        }
        else {
            do {
                myProgram.printSubjects(myProgram);

                System.out.println("Select a subject id:");
                int selectedSubjectId = sc.nextInt();

                int nStudents = 0;
                boolean isSubjectIdValid = false;
                for (Subject subject : myProgram.subjects) {
                    if (subject.getId() == selectedSubjectId) {
                        isSubjectIdValid = true;

                        nStudents = subject.getNumberStudents();

                        break;
                    }
                }

                if (!isSubjectIdValid) {
                    System.out.println("Invalid subject id.");
                }
                else {
                    System.out.println("There are " + nStudents + " students in the subject.");
                }

                System.out.println("Show student count for another subject? (y) / Press any other key to escape.");
            } while (sc.next().equals("y"));
        }
    }

    public void showCourseStudentCount(MyProgram myProgram, Scanner sc) {
        if (myProgram.courses.size() == 0) {
            System.out.println("There are no courses.");
            System.out.println("");
        }
        else {
            do {
                myProgram.printCourses(myProgram);

                System.out.println("Select a course id:");
                int selectedCourseId = sc.nextInt();

                boolean isCourseIdValid = false;
                for (Course course : myProgram.courses) {
                    if (course.getId() == selectedCourseId) {
                        isCourseIdValid = true;

                        ArrayList<Integer> subjectIds = course.getSubjectIds();

                        int nStudents = 0;
                        if (myProgram.subjects.size() > 0 && subjectIds.size() > 0) {
                            for (int id : subjectIds) {
                                for (Subject subject : myProgram.subjects) {
                                    if (subject.getId() == id) {
                                        nStudents += subject.getNumberStudents();
                                    }
                                }
                            }
                        }

                        System.out.println("There are " + nStudents + " students in the course.");

                        break;
                    }
                }

                if (!isCourseIdValid) {
                    System.out.println("Invalid course id.");
                }

                System.out.println("Show student count for another course? (y) / Press any other key to escape.");
            } while (sc.next().equals("y"));
        }
    }

    public void editSubjectStudentCount(MyProgram myProgram, Scanner sc) {
        if (myProgram.subjects.size() == 0) {
            System.out.println("There are no subjects.");
            System.out.println("");
        }
        else {
            do {
                myProgram.printSubjects(myProgram);

                System.out.println("Select a subject id:");
                int selectedSubjectId = sc.nextInt();

                boolean isSubjectIdValid = false;
                for (Subject subject : myProgram.subjects) {
                    if (subject.getId() == selectedSubjectId) {
                        isSubjectIdValid = true;

                        System.out.println("Number of students:");
                        int nStudents = sc.nextInt();

                        subject.setNumberStudents(nStudents);

                        break;
                    }
                }

                if (!isSubjectIdValid) {
                    System.out.println("Invalid subject id.");
                }

                System.out.println("Edit another subject? (y) / Press any other key to escape.");
            } while (sc.next().equals("y"));
        }
    }


    public void removeSubject(MyProgram myProgram, Scanner sc) {
        if (myProgram.subjects.size() == 0) {
            System.out.println("There are no subjects.");
            System.out.println("");
        }
        else {
            do {
                myProgram.printSubjects(myProgram);

                System.out.println("Select a subject id:");
                int selectedSubjectId = sc.nextInt();

                int indexOfSubject = -1;
                for (int i = 0; i < myProgram.subjects.size(); i++) {

                    int subjectId = myProgram.subjects.get(i).getId();
                    if (subjectId == selectedSubjectId) {
                        indexOfSubject = i;
                        break;
                    }
                }

                if (indexOfSubject != -1) {
                    myProgram.subjects.remove(indexOfSubject);
                }
                else {
                    System.out.println("Invalid subject id.");
                }

                System.out.println("Remove another subject? (y) / Press any other key to escape.");
            } while (sc.next().equals("y"));
        }
    }

    public void removeCourse(MyProgram myProgram, Scanner sc) {
        if (myProgram.courses.size() == 0) {
            System.out.println("There are no courses.");
            System.out.println("");
        }
        else {
            do {
                myProgram.printCourses(myProgram);

                System.out.println("Select a course id:");
                int selectedCourseId = sc.nextInt();

                int indexOfCourse = -1;
                for (int i = 0; i < myProgram.courses.size(); i++) {

                    int courseId = myProgram.courses.get(i).getId();
                    if (courseId == selectedCourseId) {
                        indexOfCourse = i;
                        break;
                    }
                }

                if (indexOfCourse != -1) {
                    myProgram.courses.remove(indexOfCourse);
                }
                else {
                    System.out.println("Invalid course id.");
                }

                System.out.println("Remove another course? (y) / Press any other key to escape.");
            } while (sc.next().equals("y"));
        }
    }

    public void printCourses(MyProgram myProgram) {
        System.out.println("ID | NAME | COORDINATOR");
        for (Course course : myProgram.courses) {
            System.out.println(course.getId() + "  | " + course.getName() + " | " + course.getCoordinator());
        }
        System.out.println("");
    }

    public void printSubjects(MyProgram myProgram) {
        System.out.println("ID | NAME");
        for (Subject subject : myProgram.subjects) {
            System.out.println(subject.getId() + "  | " + subject.getName());
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        MyProgram myProgram = new MyProgram();
        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            printMenu();
            byte selectedOption = sc.nextByte();

            switch (selectedOption) {
                case 0:
                    myProgram.createCourse(myProgram, sc);
                    break;
                case 1:
                    myProgram.createSubject(myProgram, sc);
                    break;
                case 2:
                    myProgram.addSubjectToCourse(myProgram, sc);
                    break;
                case 3:
                    myProgram.showCourseSubjects(myProgram, sc);
                    break;
                case 4:
                    myProgram.showSubjectStudentCount(myProgram, sc);
                    break;
                case 5:
                    myProgram.showCourseStudentCount(myProgram, sc);
                    break;
                case 6:
                    myProgram.editSubjectStudentCount(myProgram, sc);
                    break;
                case 7:
                    myProgram.removeSubject(myProgram, sc);
                    break;
                case 8:
                    myProgram.removeCourse(myProgram, sc);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        };

        sc.close();
    }

    public static void printMenu() {
        System.out.println("0 | Create course");
        System.out.println("1 | Create subject");
        System.out.println("2 | Add subject to course");
        System.out.println("3 | Show course subjects");
        System.out.println("4 | Show number of students registered for a subject");
        System.out.println("5 | Show number of students registered for a course");
        System.out.println("6 | Edit number of students registered for a subject");
        System.out.println("7 | Remove subject");
        System.out.println("8 | Remove course");
        System.out.println("Select option:");
    }
}

public class Student {

    public String name;
    public int age;
    public boolean isFemale;
    public String datamatikerTeam;
    public int studentID;


    public Student(String name, int age, boolean isFemale, String datamatikerTeam, int studentID) {
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.datamatikerTeam = datamatikerTeam;
        this.studentID = studentID;
    }

    public void printStudentName() {
    	System.out.println("Student name: " + name + " From: " + datamatikerTeam);
    }

   


}
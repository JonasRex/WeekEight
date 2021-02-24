public class Teacher {
    public String name;
    public int age;
    public boolean isFemale;


    public Teacher(String name, int age, boolean isFemale) {
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;

    }
public void printTeacherName() {
    	System.out.println("Teachers name is: " + name);
    }
}
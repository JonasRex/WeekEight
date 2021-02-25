//For this task you should reuse the Student class from Task 3. 
//    Methods of reusing the class could be: 
//    - copy the Students.java file and add it to a new folder called task5
//    - copy the content of the Students class from Task 3 and create the class once more in this folder
//    - Open the task 3 folder and continue working in this.
//    Either method is fine - it is up to you. 
//    
//5.a Create a new class Datamatik or reuse the one you created earlier. Add an array of Students with 10 elements in it. This should be a class variable (static). From the main method, add 10 student instances to the array. Each student must have a unique reference.
//
//5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. The function should return the field "name" (the name of the student) and print it (the integer should be used as the index nuber of the student to be printed). Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.
//
//5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string. Loop through all elements in the array until you find the element with the name received as a parameter. Then return the index of that student. Call this method with different names from the main method of Datamatik


class Datamatik {


public static void main(String [] args) {
	Student[] students = new Student[10];
	students[0] = new Student("Jonas", 36, false, "Hold J", 1255);
	students[1] = new Student("Viktor", 20, false, "Hold J", 8863);
	students[2] = new Student("Louise", 25, true, "Hold J", 3514);
	students[3] = new Student("Lone", 30, true, "Hold X", 1777);
	students[4] = new Student("Jakob", 26, false, "Hold X", 6395);
	students[5] = new Student("Lasse", 29, false, "Hold X", 0356);
	students[6] = new Student("Daniella", 22, true, "Hold x", 5364);
	students[7] = new Student("Maria", 31, true, "Hold Z", 3810);
	students[8] = new Student("Karina", 28, true, "Hold Z", 6003);
	students[9] = new Student("Thor", 23, false, "Hold Z", 7631);

		

	
	System.out.println(returnName(students, 3810));
	
	System.out.println(returnIndex(students, "Thor"));

	}



	public static String returnName(Student[] students, int number) {
        String studentX = null;
        for (int i = 0; i < students.length; i++) {
            if ((int)number == (int)students[i].studentID) {
                studentX = students[i].name;
                break;     // Husk break ellers forsætter den med at loope og ender med at sige ERROR!
            } else {
                studentX = "ERROR";
            }
        }

        return studentX;
    }

    public static int returnIndex(Student[] students, String studentName) {
        int studentX = 0;
        for (int i = 0; i < students.length; i++) {
            if (studentName == students[i].name) {
                studentX = students[i].studentID;
                break;     // Husk break ellers forsætter den med at loope og ender med at sige ERROR!
            } else {
                studentX = 0;
            }
        }

        return studentX;
    }



}
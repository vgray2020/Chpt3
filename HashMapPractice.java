package exercises.ch3;

import java.util.Scanner;
import java.util.HashMap;
import java. util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newStudentId = input.nextInt();

            // Read in the newline before looping back
            input.nextLine();



        } while (!newStudentId.equals(-1));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue();

        }
    }


}

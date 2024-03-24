import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * This class, ListStudent, contains a simple demonstration of using a LinkedList in Java to store the names of students.
 * The program adds some student names, reverses the list, removes a name, and then prints the first and last elements of the list.
 *  @author Joseph Kabesha
 * @author Isaiah Ayres
 */
 
public class ListStudent  {
    public static void main(String[] args) {
        // Create a new LinkedList to store the students' names
        LinkedList<String> students = new LinkedList<>();
        
        // Add some students' names to the list
        
        students.add("Tom");
        students.add("Jerry");
        students.add("Alice");
        students.add("Bob");
        students.add("Mike");
        
        System.out.println("List of students names: " + students); // Print initial list
        
        // Reverse the LinkedList
        Collections.reverse(students);
        System.out.println("Reversed: " + students); // Print reversed list
        
        // Remove a student's name from the list
        students.remove("Alice");
        System.out.println("New list after remove a student's name from the list:  " + students); // Print new list after removal
        
        // Print the last and first elements in the list after the removal
        System.out.println("Last student: " + students.getLast());
        System.out.println("First student: " + students.getFirst());
    }
}
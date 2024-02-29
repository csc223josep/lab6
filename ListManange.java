import java.util.LinkedList;
import java.util.List;

public class ListManange {
    public static void main(String[] args) {
        List<String> students = new LinkedList<>();
        students.add("Tom");
        students.add("Jerry");
        students.add("Tom");
        students.add("Jerry");
        System.out.println("Before remove duplicate: " + students);
        removeDuplicate(students);
        System.out.println("\nAfter remove duplicate: " + students);
    }

    private static void removeDuplicate(List<String> list){
        // 使用哈希表
        


    }}
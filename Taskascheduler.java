import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * TaskScheduler
 *  @author Joseph Kabesha
 * @author Isaiah Ayres
 
 */
public class Taskascheduler {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>(6, new TaskCompare());
        tasks.add(new Task(3, "do"));
        tasks.add(new Task(1, "study"));
        tasks.add(new Task(2, "eat"));
        tasks.add(new Task(4, "see"));
        tasks.add(new Task(5, "play"));
        tasks.add(new Task(6, "live"));

        // Output the initial queue order
        System.out.println("Initial Queue Order:");
        displayQueue(tasks);

        // Update the priority of a specific task
        updateTaskPriority(tasks, "study", 0); // Update the priority of "see" task to 1

        // Reprocess and display tasks based on the updated priorities
        System.out.println("\nQueue Order after Updating Priority:");
        displayQueue(tasks);
    }

    // Method to update the priority of a specific task
    public static void updateTaskPriority(PriorityQueue<Task> tasks, String taskName, int newPriority) {
        for (Task task : tasks) {
            if (task.name.equals(taskName)) {
                task.priority = newPriority;
                break;
            }
        }
    }

    // Method to display the queue
    public static void displayQueue(PriorityQueue<Task> tasks) {
        for (Task task : tasks) {
            System.out.println("Task: " + task.name + ", Priority: " + task.priority);
        }
    }
}

class Task {
    public int priority;
    public String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

class TaskCompare implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        return Integer.compare(t1.priority, t2.priority);
    }
}

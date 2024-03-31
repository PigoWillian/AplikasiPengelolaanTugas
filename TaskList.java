import java.util.LinkedList;
import java.util.Queue;

class TaskList {
    private Queue<Task> taskQueue;

    public TaskList() {
        this.taskQueue = new LinkedList<>();
    }

    public void addTask(Task task) {
        taskQueue.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            Task removedTask = taskQueue.poll();
            System.out.println("Task removed: " + removedTask);
        }
    }

    public void displayTasks() {
        if (taskQueue.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            System.out.println("Tasks:");
            for (Task task : taskQueue) {
                System.out.println(task);
            }
        }
    }
}

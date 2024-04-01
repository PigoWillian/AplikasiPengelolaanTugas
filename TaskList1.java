package LinkedList;
import java.util.LinkedList;

public class TaskList {
    private LinkedList<Task> tasks;

    public TaskList() {
        tasks = new LinkedList<>();
    }

    // Menambah tugas ke daftar
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Menghapus tugas dari daftar berdasarkan judul
    public void removeTask(String judul) {
        for (Task task : tasks) {
            if (task.getJudul().equals(judul)) {
                tasks.remove(task);
                break;
            }
        }
    }

    // Menampilkan daftar tugas
    public void displayTasks() {
        System.out.println("Daftar Tugas:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        TaskList taskList = new TaskList();
        taskList.addTask(new Task("Membaca Buku", "Baca novel fiksi"));
        taskList.addTask(new Task("Belajar Java", "Pelajari konsep OOP"));
        taskList.displayTasks();
        taskList.removeTask("Membaca Buku");
        taskList.displayTasks();
    }
}
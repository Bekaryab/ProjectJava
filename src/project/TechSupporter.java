package project;

import java.util.Vector;

/**
 * Класс TechSupporter представляет технического сотрудника, который может управлять задачами.
 */
public class TechSupporter extends Employee {
    private Vector<String> tasks; // Список задач технического сотрудника

    /**
     * Конструктор для создания экземпляра технического сотрудника.
     */
    public TechSupporter(String id, String name, String position, String email, String task) {
        super(id, name, position, email);
        tasks = new Vector<>();
    }

    /**
     * Принять задачу.
     */
    public void acceptOrder(String task) {
        if (task != null && !task.isEmpty()) {
            tasks.add(task);
            System.out.println("Task accepted: " + task);
        } else {
            System.out.println("Invalid task.");
        }
    }

    /**
     * Отклонить задачу.
     */
    public void rejectOrder(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            System.out.println("Task rejected: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    /**
     * Выполнить задачу.
     */
    public void performTask() {
        if (!tasks.isEmpty()) {
            String taskToPerform = tasks.remove(0);
            System.out.println("Performing task: " + taskToPerform);
        } else {
            System.out.println("No tasks to perform.");
        }
    }
}
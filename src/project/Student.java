package project;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Student представляет студента с идентификатором, именем, средним баллом (GPA) и списком курсов.
 */
public class Student extends Course {
    private String id; // Идентификатор студента
    private String name; // Имя студента
    private double gpa; // Средний балл студента
    public List<Course> courses; // Список курсов студента

    /**
     * Конструктор для создания экземпляра студента.
     */
    public Student(String id, String name, double gpa, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.courses = new ArrayList<>();
    }

    /**
     * Получить идентификатор студента.
     */
    public String getId() {
        return id;
    }

    /**
     * Получить имя студента.
     */
    public String getName() {
        return name;
    }

    /**
     * Получить средний балл студента.
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Установить средний балл студента.
     */
    public void setGpa() {
        this.gpa = gpa;
    }

    /**
     * Зарегистрироваться на курс.
     */
    public void registerForCourses(Course course) {
        courses.add(course);
        System.out.println("Registered for course: " + course.getName());
    }

    /**
     * Просмотреть транскрипт студента.
     */
    public void viewTranscript() {
        System.out.println("Transcript for student " + name + ":");
        for (Course course : courses) {
            System.out.println(" - " + course.getName());
        }
        System.out.println("GPA: " + gpa);
    }
}
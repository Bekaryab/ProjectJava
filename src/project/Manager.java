package project;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Manager для управления сотрудниками, курсами и новостями.
 */
public class Manager extends Employee {
    private List<Employee> managedEmployees;

    /**
     * Конструктор менеджера.
     */
    public Manager(String id, String name, String position, String email) {
        super(id, name, position, email);
        this.managedEmployees = new ArrayList<>();
    }

    /**
     * Добавить сотрудника.
     */
    public void addEmployee(Employee employee) {
        managedEmployees.add(employee);
        System.out.println("Employee added: " + employee.readMessage());
    }

    /**
     * Удалить сотрудника.
     */
    public void removeEmployee(Employee employee) {
        managedEmployees.remove(employee);
        System.out.println("Employee removed: " + employee.readMessage());
    }

    /**
     * Показать список сотрудников.
     */
    public void listEmployees() {
        System.out.println("Employees managed by " + this.getName() + ":");
        for (Employee employee : managedEmployees) {
            System.out.println(" - " + employee.readMessage());
        }
    }

    /**
     * Добавить курс.
     */
    public void addCourse(Course course, List<Course> courseList) {
        courseList.add(course);
        System.out.println("Course added: " + course.getName());
    }

    /**
     * Добавить новость.
     */
    public void addNews(String title, String description, Language language, List<News> newsList) {
        News news = new News(title, description, language);
        newsList.add(news);
        news.addNews();
    }

    /**
     * Удалить курс.
     */
    public void removeCourse(Course course, List<Course> courseList) {
        if (courseList.remove(course)) {
            System.out.println("Course removed: " + course.getName());
        } else {
            System.out.println("Course not found: " + course.getName());
        }
    }

    /**
     * Удалить новость.
     */
    public void removeNews(String title, List<News> newsList) {
        News toRemove = null;
        for (News news : newsList) {
            if (news.getName().equals(title)) {
                toRemove = news;
                break;
            }
        }
        if (toRemove != null) {
            newsList.remove(toRemove);
            toRemove.deleteNews();
        } else {
            System.out.println("News not found: " + title);
        }
    }
}

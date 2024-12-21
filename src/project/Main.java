package project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		List<Employee> employess =  new ArrayList<>();
		
		// Создание менеджера
        Manager manager = new Manager("001", "Иван Иванов", "Директор", "ivan@example.com");
        System.out.println("Создан менеджер: " + manager.getName());

        // Создание сотрудников
        Employee employee1 = new Employee("002", "Анна Смирнова", "Преподаватель", "anna@example.com");
        Employee employee2 = new Employee("003", "Петр Петров", "Ассистент", "petr@example.com");

        // Добавление сотрудников через менеджера
        manager.addEmployee(employee1);
        manager.addEmployee(employee2);

        // Список сотрудников
        manager.listEmployees();

        // Создание курсов
        Course mathCourse = new Course();
        mathCourse.setCourseID("C101");
        mathCourse.setName("Математика");
        
        Course programmingCourse = new Course();
        programmingCourse.setCourseID("C102");
        programmingCourse.setName("Программирование");

        // Список курсов
        List<Course> courseList = new ArrayList<>();

        // Добавление курсов через менеджера
        manager.addCourse(mathCourse, courseList);
        manager.addCourse(programmingCourse, courseList);

        // Удаление курса
        manager.removeCourse(programmingCourse, courseList);

        // Создание новостей
        List<News> newsList = new ArrayList<>();
        manager.addNews("Новость 1", "Описание новости 1", Language.RU, newsList);
        manager.addNews("Новость 2", "Описание новости 2", Language.EN, newsList);

        // Удаление новости
        manager.removeNews("Новость 1", newsList);

        // Создание сотрудника техподдержки
        TechSupporter techSupporter = new TechSupporter("004", "Сергей Техник", "Техподдержка", "sergey@example.com", "");
        techSupporter.acceptOrder("Починить проектор");
        techSupporter.performTask();

        // Демонстрация работы новостей
        for (News news : newsList) {
            news.viewNews();
        }
    }
}

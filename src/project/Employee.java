package project;

/**
 * Класс Employee представляет сотрудника с идентификатором, именем, должностью и электронной почтой.
 */
public class Employee {
    private String id; // Идентификатор сотрудника
    private String name; // Имя сотрудника
    private String position; // Должность сотрудника
    private String email; // Электронная почта сотрудника

    /**
     * Конструктор для создания экземпляра сотрудника.
     */
    public Employee(String id, String name, String position, String email) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.email = email;
    }

    /**
     * Отправить сообщение.
     */
    public void sendMessenge(String message) {
        System.out.println("Message send: " + message);
    }

    /**
     * Прочитать сообщение.
     */
    public String readMessage() {
        return "Reading message";
    }

    /**
     * Получить идентификатор сотрудника.
     */
    public String getId() {
        return id;
    }

    /**
     * Получить имя сотрудника.
     */
    public String getName() {
        return name;
    }

    /**
     * Установить имя сотрудника.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получить электронную почту сотрудника.
     */
    public String getEmail() {
        return email;
    }
}
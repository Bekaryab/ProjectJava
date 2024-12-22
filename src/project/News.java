package project;

/**
 * Класс News представляет новость с названием, описанием и языком.
 */
public class News {
    private String name; // Название новости
    private String description; // Описание новости
    private Language language; // Язык новости

    /**
     * Конструктор для создания экземпляра новости.
     */
    public News(String name, String description, Language language) {
        this.name = name;
        this.description = description;
        this.language = language;
    }

    /**
     * Добавить новость.
     */
    public void addNews() {
        System.out.println("News added: " + name);
    }

    /**
     * Удалить новость.
     */
    public void deleteNews() {
        System.out.println("News deleted: " + name);
    }

    /**
     * Просмотреть новость.
     */
    public void viewNews() {
        System.out.println("Viewing news: " + name);
    }

    /**
     * Получить название новости.
     */
    public String getName() {
        return name;
    }
}
package project;

public class News {
	private String name;
	private String description;
    private Language language;

    public News(String name, String description, Language language) {
        this.name = name;
        this.description = description;
        this.language = language;
    }

    public void addNews() {
        System.out.println("News added: " + name);
    }

    public void deleteNews() {
        System.out.println("News deleted: " + name);
    }

    public void viewNews() {
        System.out.println("Viewing news: " + name);
    }

}

package project;

/**
 * Класс Course представляет курс с уникальным идентификатором, названием и типом.
 */
public class Course {
    private String courseID; // Идентификатор курса
    private String name; // Название курса
    private CourseType type; // Тип курса

    /**
     * Получить идентификатор курса.
     */
    public String getCourseID() {
        return courseID;
    }

    /**
     * Установить идентификатор курса.
     */
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    /**
     * Получить тип курса.
     */
    public CourseType getType() {
        return type;
    }

    /**
     * Установить тип курса.
     */
    public void setType(CourseType type) {
        this.type = type;
    }

    /**
     * Получить название курса.
     */
    public String getName() {
        return name;
    }

    /**
     * Установить название курса.
     */
    public void setName(String name) {
        this.name = name;
    }
}

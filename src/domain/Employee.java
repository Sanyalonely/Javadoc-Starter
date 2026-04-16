package domain;

/**
 * Базовий клас, що описує загальні характеристики співробітника компанії.
 * Служить фундаментом для всіх інших посад у системі.
 * @author Пилипенко
 */
public class Employee {

    private String name;
    private String jobTitle;
    private int level;
    private String dept;

    @Override
    public String toString() {
        return "\nEmployee Info:" + "\nName: " + name + "\nJob Title: " + jobTitle + "\nLevel: " + level + "\nDept: " + dept;
    }

    /**
     * Створює співробітника з повним набором даних.
     * @param name ім'я співробітника
     * @param jobTitle назва посади
     * @param level рівень кваліфікації
     * @param dept відділ
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.level = level;
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням.
     * Створює об'єкт із базовими значеннями параметрів.
     */
    public Employee() {
        this.name = "John Doe";
        this.jobTitle = "Worker";
        this.level = 1;
        this.dept = "Staff";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

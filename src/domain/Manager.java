package domain;

/**
 * Представляє співробітника на керівній посаді.
 * Керує групою інших співробітників.
 */
public class Manager extends Employee {

    private Employee[] employees;

    /**
     * Повний конструктор для створення менеджера.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Конструктор для створення менеджера тільки зі списком підлеглих.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор за замовчуванням.
     * Створює масив для 10 співробітників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Формує список імен усіх підлеглих.
     * @return рядок з іменами через кому
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees(); 
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployeesList() {
        return employees;
    }
}

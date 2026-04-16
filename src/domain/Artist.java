package domain;

/**
 * Представляє співробітника на посаді митця/художника.
 * Наслідується від загального класу Employee.
 * @author Пилипенко
 */
public class Artist extends Employee {

    private String[] skiils;

    /**
     * Повний конструктор для створення об'єкта Artist з усіма параметрами.
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор для створення митця тільки зі списком навичок.
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Конструктор за замовчуванням.
     * Створює масив навичок на 10 елементів.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає список навичок у вигляді відформатованого рядка.
     * @return рядок із навичками, розділеними комою
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Отримує текстове представлення об'єкта митця.
     * @return рядок із даними співробітника та його навичками
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }
    
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    public String[] getSkillsLSist() {
        return skiils;
    }
}

package domain;
/**
 * Представляє редактора, який є спеціалізацією митця.
 * Додає функціонал для роботи з електронним редагуванням текстів.
 */
public class Editor extends Artist {

    private boolean electronicEditing;
    /**
     * Повний конструктор для створення редактора з усіма параметрами.
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Конструктор для створення редактора зі списком навичок.
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Конструктор з налаштуванням типу редагування.
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Конструктор за замовчуванням.
     * Встановлює електронне редагування як пріоритетне.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * Повертає текстове представлення об'єкта з урахуванням типу редагування.
     * @return рядок з даними редактора
     */
    @Override
    public String toString() {
        String s = super.toString();
        if (electronicEditing) {
            s = s + "\nEditing preferences: electronic";
        } else {
            s = s + "\nEditing preferences: paper";
        }
        return s;
    }

    public boolean getEditing() {
        return electronicEditing;
    }

    public void setEditing(boolean electronicEditing) {
        this.electronicEditing = electronicEditing;
    }
}

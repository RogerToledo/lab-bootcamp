package br.com.me.lab.dominio;

public class Course extends Content {
    private int workload;

    public Course(String title, String description, int workload) {
        setTitle(title);
        setDescription(description);
        this.workload = workload;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP + workload;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}

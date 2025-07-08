package br.com.me.lab.dominio;

import java.time.LocalDate;

public class MentoringSession extends Content {
    private LocalDate date;

    public MentoringSession(String title, String description, LocalDate date) {
        setTitle(title);
        setDescription(description);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}

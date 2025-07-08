package br.com.me.lab.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Content> contentEnrolled = new LinkedHashSet<>();
    private Set<Content> contentFinished = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void bootcampEnroll(Bootcamp bootcamp) {
        this.contentEnrolled.addAll(bootcamp.getContent());
        bootcamp.getEnrolledDevs().add(this);
    }

    public void proceed() {
        Optional<Content> content = this.contentEnrolled.stream().findFirst();
        if(content.isPresent()) {
            this.contentFinished.add(content.get());
            this.contentEnrolled.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXP() {
        return this.contentFinished.stream().mapToDouble(Content::calculateXP).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Content> getContentEnrolled() {
        return contentEnrolled;
    }

    public void setContentEnrolled(Set<Content> contentEnrolled) {
        this.contentEnrolled = contentEnrolled;
    }

    public Set<Content> getContentFinished() {
        return contentFinished;
    }

    public void setContentFinished(Set<Content> contentFinished) {
        this.contentFinished = contentFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(contentEnrolled, dev.contentEnrolled) && Objects.equals(contentFinished, dev.contentFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contentEnrolled, contentFinished);
    }
}

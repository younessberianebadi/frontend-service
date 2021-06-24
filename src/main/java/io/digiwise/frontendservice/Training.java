package io.digiwise.frontendservice;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Training {

    enum Type{
        Tactique,
        Physique,
        Fonctionnel
    }

    enum Category{
        U6,
        U8,
        U10,
        U12,
        U14,
        U16
    }


    private long id;
    private Type type;
    private LocalDateTime datetime;
    private Category category;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }


    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    public LocalDateTime getDatetime() {
        return datetime;
    }
    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }


    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public Training(Type type, LocalDateTime datetime, Category category) {
        this.type = type;
        this.datetime = datetime;
        this.category = category;
    }

    public Training(){}

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", type=" + type +
                ", datetime=" + datetime +
                ", category=" + category +
                '}';
    }
}

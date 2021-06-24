package io.digiwise.frontendservice;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Player {
    public enum sexe{
        male,
        female
    }

    public enum nationality{
        moroccan,
        foreigner
    }

    public enum category{
        u8,
        u10,
        u12,
        u14,
        u16
    }

    private long id;

    private String fname;


    private String lname;


    private nationality nationality;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private sexe sexe;


    private category category;


    private float weight;


    private float height;

    public Player(){


    }


    public Player(long id, String fname, String lname, Player.nationality nationality, LocalDate birthday, Player.sexe sexe, Player.category category, float weight, float height) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.nationality = nationality;
        this.birthday = birthday;
        this.sexe = sexe;
        this.category = category;
        this.weight = weight;
        this.height = height;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public nationality getNationality() {
        return nationality;
    }

    public void setNationality(nationality nationality) {
        this.nationality = nationality;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Player.sexe getSexe() {
        return sexe;
    }

    public void setSexe(Player.sexe sexe) {
        this.sexe = sexe;
    }

    public Player.category getCategory() {
        return category;
    }

    public void setCategory(Player.category category) {
        this.category = category;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

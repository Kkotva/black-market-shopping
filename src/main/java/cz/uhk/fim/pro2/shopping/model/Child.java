package cz.uhk.fim.pro2.shopping.model;

import java.util.Date;

public class Child {
    private String personalId;
    private Date birthDate;
    private String displayName;
    private GenderType gender;
    private boolean virginity;
    private double weight;
    private boolean race;
    private String nationality;
    private int skinTone;
    private int eyeColor;
    private int hairColor;

    public Child() {
    }

    public Child(String personalId, Date birthDate, String displayName, GenderType gender, boolean virginity, double weight, boolean race, String nationality, int skinTone, int eyeColor, int hairColor) {
        this.personalId = personalId;
        this.birthDate = birthDate;
        this.displayName = displayName;
        this.gender = gender;
        this.virginity = virginity;
        this.weight = weight;
        this.race = race;
        this.nationality = nationality;
        this.skinTone = skinTone;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public boolean isVirginity() {
        return virginity;
    }

    public void setVirginity(boolean virginity) {
        this.virginity = virginity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isRace() {
        return race;
    }

    public void setRace(boolean race) {
        this.race = race;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getSkinTone() {
        return skinTone;
    }

    public void setSkinTone(int skinTone) {
        this.skinTone = skinTone;
    }

    public int getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(int eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHairColor() {
        return hairColor;
    }

    public void setHairColor(int hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Child{" +
                "personalId='" + personalId + '\'' +
                ", birthDate=" + birthDate +
                ", displayName='" + displayName + '\'' +
                ", gender=" + gender +
                ", virginity=" + virginity +
                ", weight=" + weight +
                ", race=" + race +
                ", nationality='" + nationality + '\'' +
                ", skinTone=" + skinTone +
                ", eyeColor=" + eyeColor +
                ", hairColor=" + hairColor +
                '}';
    }
}

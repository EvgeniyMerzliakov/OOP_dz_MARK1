package ru.geekbrains.hw_1.family_tree.Human;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human {
    String firstName;
    String lastName;
    Gender gender;
    LocalDate birthDate;
    int age;
    List<String> parents;
    List<String> children;

    public Human(String firstName, String lastName , Gender gender, int yearBirth, int monthBirth, int dayOfMonthBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = LocalDate.of(yearBirth, monthBirth, dayOfMonthBirth);
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public void addParents(String firstName, String lastName){
        String parent = firstName + " " + lastName;
        parents.add(parent);
    }

    public void addChildren(String firstName, String lastName){
        String child = firstName + " " + lastName;
        children.add(child);
    }

    public void ageHuman(){
        LocalDate itsTimeNow = LocalDate.now();
        Period period = Period.between(birthDate, itsTimeNow);
        age = period.getYears();
    }

    @Override
    public String toString() {
        if (parents.isEmpty()) parents.add("Отсутствуют");
        if (children.isEmpty()) children.add("Отсутствуют");
        return "Имя: " + firstName + ", Фамилия: " + lastName + ", Пол: " +  gender + ", Родители: " + parents + ", Дети: " + children + ", Возраст: " + age ;
    }
}

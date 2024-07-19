package ru.geekbrains.hw_1.family_tree.Human;

import java.time.LocalDate;
import java.time.Period;

public class DeadHuman extends Human{
    LocalDate deathDate;

    public DeadHuman(String firstName, String lastName, Gender gender, int yearBirth, int monthBirth, int dayOfMonthBirth, int yearDeath, int monthDeath, int dayOfMonthDeath) {
        super(firstName, lastName, gender, yearBirth, monthBirth, dayOfMonthBirth);
        this.deathDate = LocalDate.of(yearDeath, monthDeath, dayOfMonthDeath);
    }

    public void ageHuman() {
        Period period = Period.between(birthDate, deathDate);
        age = period.getYears();
    }

    @Override
    public String toString() {
        return super.toString() + " - Нет в живых";
    }
}

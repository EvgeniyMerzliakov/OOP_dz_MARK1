package ru.geekbrains.hw_1.family_tree;

import ru.geekbrains.hw_1.family_tree.Human.DeadHuman;
import ru.geekbrains.hw_1.family_tree.Human.Gender;
import ru.geekbrains.hw_1.family_tree.Human.Human;
import ru.geekbrains.hw_1.family_tree.tree.FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree ft = new FamilyTree();
        Human oleg = new Human("Олег", "Кочетков", Gender.Male, 2015, 3, 25);
        Human ignat = new Human("Игнат", "Кочетков", Gender.Male, 1987,12,29);
        Human elena = new Human("Елена", "Кочеткова", Gender.Female, 1992,8,12);
        DeadHuman afdotia = new DeadHuman("Авдотия", "Кускова", Gender.Female, 1934,6,11,2010,1,4);
        Human aliona = new Human("Алена", "Кускова", Gender.Female, 2000,5,9);
        Human anton = new Human("Антон", "Кусков", Gender.Male, 2020, 9,23);

        oleg.addParents("Игнат", "Кочетков");
        oleg.addParents("Елена", "Кочеткова");
        ignat.addChildren("Олег", "Кочетков");
        elena.addParents("Авдотия", "Кускова");
        elena.addChildren("Олег", "Кочетков");
        afdotia.addChildren("Елена", "Кочеткова");
        afdotia.addChildren("Алена", "Кускова");
        aliona.addParents("Авдотия", "Кускова");
        aliona.addChildren("Антон", "Кусков");
        anton.addParents("Алена", "Кускова");

        oleg.ageHuman();
        ignat.ageHuman();
        elena.ageHuman();
        afdotia.ageHuman();
        aliona.ageHuman();
        anton.ageHuman();

        ft.addHuman(afdotia);
        ft.addHuman(ignat);
        ft.addHuman(elena);
        ft.addHuman(aliona);
        ft.addHuman(oleg);
        ft.addHuman(anton);

        System.out.println(ft);

    }
}

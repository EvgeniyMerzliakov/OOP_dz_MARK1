package ru.geekbrains.hw_1.family_tree.tree;

import ru.geekbrains.hw_1.family_tree.Human.Human;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<Human> humans;

    public FamilyTree() {
        humans = new ArrayList<>();
    }

    public void addHuman(Human human){
        humans.add(human);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Human elem : humans) {
            stringBuilder.append(elem).append("\n");
        }
        return stringBuilder.toString();
    }
}

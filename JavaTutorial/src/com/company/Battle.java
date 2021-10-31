package com.company;

import java.util.Random;

public class Battle {

    public void run(SuperPerson person1, SuperPerson person2) {
        System.out.println("Битва начинается!!!");

        while (true) {
            if (whoStart() == 0) {
                System.out.println(person1.name + " наносит удар");
                person1.weapon.launch();
                person2.level = (byte) (person2.level - person1.weapon.damage);
                System.out.println("Жизненная энергия игрока " + person2.name + " уменьшилась до " + person2.level + " процентов");
            } else {
                System.out.println(person2.name + " наносит удар");
                person2.weapon.launch();
                person1.level = (byte) (person1.level - person2.weapon.damage);
                System.out.println("Жизненная энергия игрока " + person1.name + " уменьшилась до " + person1.level + " процентов");
            }

            if (person1.level <= 0) {
                System.out.println("Победил игрок: " + person2.name);
                break;
            }

            if (person2.level <= 0) {
                System.out.println("Победил игрок: " + person1.name);
                break;
            }
        }
    }

    int whoStart() {
        Random random = new Random();
        int randomNum = random.nextInt(2);
        return randomNum;
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {
        SuperPerson ironMan = new SuperPerson();
        ironMan.name = "Железный человек";
        ironMan.superpower = "Костюм железного человека";
        ironMan.gender = 'м'; /* м -мужской, ж - женский */
        ironMan.age = 47;
        ironMan.power = 80;
        ironMan.agility = 40;
        ironMan.intelligence = 90;
        ironMan.position = 'х'; // х - хороший, п - плохой, н - нейтральный
        Weapon weaponIronMan = new FireWeapon();
        weaponIronMan.damage = 20;
        ironMan.weapon = weaponIronMan;

        PersonDescription personDescription = new PersonDescription("Описание персонажа");
        personDescription.setNameValue(ironMan.name);
        personDescription.setPowerValue(String.valueOf(ironMan.power));
        personDescription.setAgilityValue(String.valueOf(ironMan.agility));
        personDescription.setIntelligenceValue(String.valueOf(ironMan.intelligence));
        personDescription.setPositionValue(getPosition(ironMan.position));
        personDescription.setSuperPowerValue(ironMan.superpower);

        personDescription.setVisible(true);
    }

    static String getPosition(char ch) {
        if (ch == 'х') {
            return "Хороший";
        } else if (ch == 'п') {
            return "Плохой";
        } else {
            return "нейтральный";
        }
    }
}

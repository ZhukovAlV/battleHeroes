package com.company;

public class Test2 {

    public static void main(String[] args) {

        // Создаем первого персонажа
        SuperPerson spiderMan = new SuperPerson();
        spiderMan.name = "Питер Паркер";
        spiderMan.superpower = "Spider";
        spiderMan.gender = 'м';
        spiderMan.age = 20;
        spiderMan.agility = 90;
        spiderMan.power = 60;
        spiderMan.intelligence = 60;
        spiderMan.position = 'х'; /// х-хороший, п-плохой, н-нейтральный

        Weapon spiderManWeapon = new ChemicalWeapon();
        spiderManWeapon.damage = 20;

        spiderMan.weapon = spiderManWeapon;



        // Создаем второго
        SuperPerson ironMan = new SuperPerson();
        ironMan.name = "IronMan";
        ironMan.superpower = "Костюм железного человека";
        ironMan.gender = 'м'; /* м -мужской, ж - женский */
        ironMan.age = 47;
        ironMan.power = 80;
        ironMan.agility = 40;
        ironMan.intelligence = 90;
        ironMan.position = 'х'; // х - хороший, п - плохой, н - нейтральный

        FireWeapon weaponIronMan = new FireWeapon();
        weaponIronMan.damage = 20;

        ironMan.weapon = weaponIronMan;

        Battle battle = new Battle();
        battle.run(spiderMan,ironMan);

    }
}

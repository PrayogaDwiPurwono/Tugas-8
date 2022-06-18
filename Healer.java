package com.Tugas8;

public class Healer extends Character {
    Healer(){
        setHP(70);
        setAttack(10);
        setDefense(10);
    }

    void heal(){
        setHP(getHP() + 25);
    }

    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 7.5)
            return true;
        else
            return false;
    }
}

//Prayoga Dwi Purwono
//215150707111021
//TI-E/Tugas 8

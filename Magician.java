package com.Tugas8;

public class Magician extends Character {

    Magician (){
        setHP(100);
        setAttack(60);
        setDefense(10);
    }

    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 4.5)
            return true;
        else
            return false;
    }
}

//Prayoga Dwi Purwono
//215150707111021
//TI-E/Tugas 8

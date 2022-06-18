package com.Tugas8;

    public class Titan extends Character {
        Titan(){
            setHP(200);
            setAttack(45);
            setDefense(0);
        }

        @Override
        public boolean attack() {
            double counter = Math.random() * 10;
            if (counter > 0 && counter <= 5.0)
                return true;
            else
                return false;
        }
}

//Prayoga Dwi Purwono
//215150707111021
//TI-E/Tugas 8

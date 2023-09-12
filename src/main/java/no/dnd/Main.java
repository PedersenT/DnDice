package no.dnd;

public class Main {


    public static void main(String[] args) {

        Spell spell = new Spell();
        Smite smite = new Smite();
        Attack attack = new Attack();
        DiceThrow diceThrow = new DiceThrow();

        spell.fireball(3);

        //smite not included sword damage
        smite.divineSmite(5, true, false);

        //sword attack 1d10
        attack.sword(false);

        //rolls hits and damage in one
        diceThrow.rollDamage(6, diceThrow.rollHits(40, 18, 2));

        //rolls only hits
//        diceThrow.rollHits(40, 18, 2);

        //rolls only damage
//        diceThrow.rollDamage(6, 2);



    }
}

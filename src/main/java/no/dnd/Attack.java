package no.dnd;

public class Attack {

    public void sword(Boolean isCrit){
        System.out.println("\nSTICK'EM REAL GOOD");
        DiceThrow diceThrow = new DiceThrow();
        int numberOfDice=1;
        int totalDamage=0;
        if(isCrit){
            numberOfDice+=numberOfDice;
        }
        totalDamage=diceThrow.rollDamageForClasses(10,numberOfDice);

        System.out.println("\nTotal damage: " + totalDamage + "\n");
    }


}

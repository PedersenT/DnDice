package no.dnd;

public class Smite {

    public void divineSmite(Integer spellSlotLevel, Boolean isCrit, Boolean isUndead){
        System.out.println("\nSMITE THE HEATHENS!! ");

        DiceThrow diceThrow = new DiceThrow();
        int totalDamage = 0;
        int numberOfDice = 2 + (spellSlotLevel-1);
        if(isUndead){
            numberOfDice++;
        }
        if(isCrit){
            numberOfDice+=numberOfDice;
        }

        totalDamage=diceThrow.rollDamageForClasses(8,numberOfDice);
        System.out.println(
                "\nDamage: " + totalDamage + " boooom! " + "\n");









    }

}

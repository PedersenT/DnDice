package no.dnd;

public class Spell {


    public void fireball(Integer spellSlotLevel){
        DiceThrow diceThrow = new DiceThrow();

        if(spellSlotLevel<3){
            System.out.println("\nFIREBALL!! \n...?? Spell level too low :(  ->  " + spellSlotLevel);
        }
        else{
            int numberOfDice = 8 + (spellSlotLevel - 3);
            int totalDamage=0;
            System.out.println("\nFIREBALL! LET'S BLAST'EM!!");

            totalDamage=diceThrow.rollDamageForClasses(6,numberOfDice);

            System.out.println(
                    "\nFull damage: " + totalDamage + " boooom! " +
                            "\nHalf damage: " + totalDamage/2 + "\n");
        }
    }





}

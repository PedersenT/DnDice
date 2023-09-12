package no.dnd;

public class DiceThrow {
    public Integer rollHits(Integer numberOfDice, Integer numberToHit, Integer hitModifier){
        System.out.println("\nHitting on " + numberToHit + "'s. LET'S GO!");
        int numberOfHits=0;

        for(int i=1; i<=numberOfDice; i++){
            int hitRoll = (int) (Math.random() * 20) + 1 + hitModifier;
            if(hitRoll>=numberToHit){
                numberOfHits++;
                System.out.print("roll: " + i + " = " + hitRoll + " HITS! | ");
            }
            else{
                System.out.print("roll: " + i + " = " + hitRoll + " MISSES! | ");
            }
        }
        System.out.println("\nTotal number of hits: " + numberOfHits + "\n");

        return numberOfHits;
    }

    public Integer rollDamageForClasses(Integer typeOfDice, Integer numberOfDice){
        int totalDamage=0;

        for(int i=1; i<=numberOfDice; i++){
            int damageRoll = (int) (Math.random() * typeOfDice) + 1;
            totalDamage += damageRoll;
            System.out.print("roll: " + i + " dmg: " + damageRoll + " | ");
        }
        return totalDamage;
    }

    public void rollDamage(Integer typeOfDice, Integer numberOfDice){
        System.out.println("\nThrowing for damage with " + numberOfDice + "d" + typeOfDice + ". GET'EM!");

        int totalDamage = rollDamageForClasses(typeOfDice, numberOfDice);

        System.out.println("\nTotal damage: " + totalDamage + "\n");



    }

}
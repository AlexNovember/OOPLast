import animals.Lion;
import animals.Wolf;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolfFactory;
import terminal.TerminalReader;
import terminal.parser.ZooCommandParser;
import zoo.Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        LionCage cage = L2();
        ArrayList<Lion> lions = cage.getLions();
        cage.sortLionsMane();
         */
        ArrayList<Wolf> wolves = WolfFactory.createWolves(5);
        WolfCage cage = new WolfCage();
        cage.setWolves(wolves);
        cage.setGarbageWeight(120);
        cage.setFoodWeight(1200);
        ArrayList<Lion> lionsCollection = LionsFactory.createLions(25);
        LionCage cagel = new LionCage();
        cagel.setLions(lionsCollection);
//          System.out.println(cage.getWolves().toString());
//        System.out.println("-------------");
//        cage.wolfHwSort();
//        System.out.println(cage.getWolves().toString());
//        for(Wolf wolf: cage){
//            System.out.println(wolf);
        Zoo zoo = new Zoo(cage, cagel, null);
        TerminalReader term = TerminalReader.newTerminalReader(new ZooCommandParser());
        term.setZoo(zoo);
        term.endless();
        System.out.println();
        }





    public static LionCage L2() {
        ArrayList<Lion> lionsCollection = LionsFactory.createLions(25);
        for (Lion lion : lionsCollection) {
            System.out.println(lion.toString());
        }
        LionCage cage = new LionCage();
        cage.setLions(lionsCollection);
        cage.giveFood(1200);
        cage.setGarbageWeight(150);
        System.out.println(cage);
        System.out.println(cage.getLions().size());

        cage.cleanCage(50);
        for (Lion lion : lionsCollection) {
            System.out.println(lion.toString());
        }
        cage.takeOffAnimal();
        System.out.println(cage);
        System.out.println(cage.getLions().size());
        return cage;
        
    }


}

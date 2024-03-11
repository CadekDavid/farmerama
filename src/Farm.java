import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> field = new ArrayList<>(5);
    private double capacity = 100;


    public void plant(Flower f){
        System.out.println("How much ha would you like to plant?");
        if (f.neededArea < capacity){
            capacity -= f.neededArea;
            field.add(f);
        }


    }



}

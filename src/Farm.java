import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> field = new ArrayList<>(5);
    private double capacity = 100;


    public Flower selectFlower (){

    }
    public void plant(Flower f){
        if (f.neededArea < capacity){
            capacity -= f.neededArea;
            field.add(f);
        }


    }



}

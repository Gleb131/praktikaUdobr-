package rut.model;

import java.util.ArrayList;
import java.util.List;

public class Fertilizer {
    String name;
    double price;
List<Fertilizer> fertilizers = new ArrayList<>(); 

public Fertilizer(String name, double price) {
    this.name = name;
    this.price = price;
}
public String getName(){
    return name;
}
public double getPrice(){
    return price;
}
/*
public void genereittesfertilizer(){
             fertilizers.add(new Fertilizer("Аммофос NP 12:52", 50.0));
             fertilizers.add(new Fertilizer("Аммиачная селитра N 34,4", 30.0));
             fertilizers.add(new Fertilizer("Карбамид N 46,2", 40.0));}
*/

}


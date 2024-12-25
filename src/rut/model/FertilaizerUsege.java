package rut.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rut.model.CropCalculation;

public class FertilaizerUsege {
private Fertilizer fertilizer;
private double price, qualt;
private Date usageDate;
//List<FertilaizerUsege> fertilaizerUseges = new ArrayList<>();
public FertilaizerUsege(Fertilizer fertilizer, double price, double qualt, Date usageDate) {
    this.fertilizer = fertilizer;
    this.price = price;
    this.qualt = qualt;
    this.usageDate = usageDate;
}
/* 
public double getPrice() {
    return price;
}

public double getQualtt() {
    return qualt;
}



public void FertilaizerUsege(){
        fertilaizerUseges.add(new FertilaizerUsege(fertilizer, price, qualt, usageDate));
    }
*/
}
package rut.model;
import java.util.ArrayList;
import java.util.List;
// поменять название (урожай,поле)
public class CropCalculation {
    // объед в один класс и исп список объектов этого класса
    private Fertilizer fertilizers;    
    private double tsenaUdobr;
    private double kolihCrop;
    private double kolihUdobr;
    private double tsenaCrop; 
    private double area;

    public CropCalculation(Fertilizer fertilizers, double kolihCrop , double area, double kolihUdobr,
     double tsenaCrop,double tsenaUdobr) {
        this.fertilizers = fertilizers;
        this.kolihCrop = kolihCrop;
        this.area = area;
        this.tsenaCrop = tsenaCrop;
        this.kolihUdobr = kolihUdobr;
        this.tsenaUdobr = tsenaUdobr;
    }
    
    public double fertilizers(){
        return kolihCrop*tsenaCrop - kolihUdobr*tsenaUdobr;
    }
    

    public  double kalkuleit() 
        {
            // Убедимся, что значения не равны нулю, чтобы избежать деления на ноль
            if (kolihUdobr <= 0 || area <= 0) {
            }
        return ((kolihCrop / area) /kolihUdobr );
    }

}

        

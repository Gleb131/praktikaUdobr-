package rut.view.console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import rut.model.CropCalculation;
import rut.model.Fertilizer;
public class ConsoleViaw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ошибка: количество удобрений и площадь должны быть больше нуля.");
        
        System.out.print("Введите количество удобрений (в кг): ");
        double kolihUdobr = scanner.nextDouble();

        System.out.print("Введите площадь, на которой применялись удобрения (в гектаров): ");
        double area = scanner.nextDouble();

        System.out.print("Введите полученный урожай (в тонн): ");
        double kolihCrop = scanner.nextDouble();

        System.out.print("Введите цену удобрения:");
        double tsenaUdobr = scanner.nextDouble();

        System.out.print("Введите цену урожая: ");
        double tsenaCrop = scanner.nextDouble();

        String name = scanner.toString();
        
        Fertilizer fertilizers;
        fertilizers = new Fertilizer("", 0);
        CropCalculation cropCalculation = new CropCalculation(fertilizers,kolihCrop, area, kolihUdobr, tsenaCrop, tsenaUdobr);

        double profit = cropCalculation.fertilizers();
        double efficiency = cropCalculation.kalkuleit();

        System.out.printf("Прибыль: %.2f рублей\n", profit);
        System.out.printf("Эффективность удобрений: %.2f \n", efficiency);
      
        scanner.close(); // Закрываем сканер
    }       
}  
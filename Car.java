package MainSystem;
import MainSystem.*;

public class Car{

    private String CarId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;


    public Car(String CarId, String brand, String model, double basePricePerDay){
        this.CarId=CarId;
        this.brand=brand;
        this.model=model;
        this.basePricePerDay=basePricePerDay;
        this.isAvailable=true;
    }


    //getter setter model - that means private data members cannot be accessed outside the class
    public String getCardId(){
        return CarId;
    }
    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public void rent(){
        isAvailable=false;
    }

    public double CalculatePrice(){
        return basePricePerDay;
    }

    public void returnCar(){
        isAvailable=true;
    }
}




package MainSystem;
import java.beans.Customizer;

import MainSystem.*;

public class Rent {

    private Car car;
    private Customer customer;
    private int rentalDays;

    public Rent(Car car, Customer customer, int rentalDays){
        this.car=car;
        this.customer=customer;
        this.rentalDays=rentalDays;
    }

    public Car getCar(){
        return car;
    }

    public Customer getCustomerCar(){
        return customer;
    }

    public int rentDays(){
        return rentalDays;
    }
    
}

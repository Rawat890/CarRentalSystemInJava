package MainSystem;
import java.util.*;
import MainSystem.*;


public class CarRentalSystem{

    private List<Car>cars;
    private List<Customer>customers;
    private List<Rent>rentals;

    public CarRentalSystem(){
        cars =new ArrayList<>();
        customers =new ArrayList<>();
        rentals =new ArrayList<>();
    }

    //add car method
    public void addCar(Car car){
        cars.add(car);
    }
    //add car customer
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    //add rent days for customer
    public void rentCar(Car car, Customer customer, int days){
        if (car.getIsAvailable()) {
            car.rent();    // now not available
            rentals.add(new Rent(car, customer, days));
        }else{
            System.out.println("The car is not available for rent");
        }
    }



    //return car
        public void returnCar(Car car){
            car.returnCar();
            Rent rentalToRemove=null;
            for (Rent rent : rentals) {
                
            }
        
    }
}
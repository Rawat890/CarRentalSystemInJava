package MainSystem;
import MainSystem.*;

import java.util.*;

public class Customer {
    private String CustomerId;
    private String name;
    private String phone;

    public Customer(String CustomerId, String name, String phone){
        this.name=name;
        this.CustomerId=CustomerId;
        this.phone=phone;
    }


    public String getCustomerId(){
        return CustomerId;
    }
    public String getNameOfCustomer(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
}

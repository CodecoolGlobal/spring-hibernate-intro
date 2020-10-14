package com.raczkowski;

import com.raczkowski.entity.cascadetypes.Client;
import com.raczkowski.entity.cascadetypes.Product;
import com.raczkowski.entity.collections.User;
import com.raczkowski.entity.embedded.Address;
import com.raczkowski.entity.embedded.RealEstate;
import com.raczkowski.entity.embeddedobjectkeys.PropertyName;
import com.raczkowski.entity.embeddedobjectkeys.RealEstateEnhanced;
import com.raczkowski.entity.inheritance.SuperCar;
import com.raczkowski.entity.inheritance.TwoWheeler;
import com.raczkowski.entity.inheritance.Vehicle;
import com.raczkowski.entity.onetomany.Customer;
import com.raczkowski.entity.onetomany.Order;
import com.raczkowski.entity.onetoone.Company;
import com.raczkowski.entity.onetoone.Employee;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@Component
public class SamplesProvider {

    public RealEstate createRealEstateSample() {
        return new RealEstate("Hilton",
                new Address("5th Avenue", 1256),
                new Address("34th Street", 12313));
    }

    public RealEstateEnhanced createRealEstateEnhancedSample() {
        return new RealEstateEnhanced(new PropertyName("Hilton", "Trump Estates"),
                new Address("5th Avenue", 1256));
    }

    public User createUserSample() {
        return new User("Przemek", "Raczko",
                asList(new Address("5th Avenue", 1256),
                        new Address("34th Street", 12313)));
    }

    public Company createCompanySample() {
        return new Company("Codecool");
    }

    public Employee createEmployeeSample() {
        return new Employee("Przemyslaw Raczkowski", createCompanySample());
    }

    public List<Order> createOrdersSample1() {
        return asList(new Order(20, new Date()),
                new Order(50, new Date())
        );
    }

    public List<Order> createOrdersSample2() {
        return asList(new Order(70, new Date()),
                new Order(100, new Date()));
    }

    public List<Customer> createCustomersList() {
        return asList(
                new Customer("Przemek", "Raczko", createOrdersSample1()),
                new Customer("Inny", "Gość", createOrdersSample2())
        );
    }

    public Vehicle createVehicleSample() {
        return new Vehicle("Vehicle");
    }

    public Vehicle createSuperCarSample() {
        return new SuperCar("Bugatti", 420);
    }

    public Vehicle createTwoWheelerSample() {
        return new TwoWheeler("Kross", 3);
    }

    public List<Product> createProductSamples() {
        return asList(new Product("SomeProduct"),
                new Product("AnotherProduct"));
    }

}

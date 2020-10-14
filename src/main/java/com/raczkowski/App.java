package com.raczkowski;

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
import com.raczkowski.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@SpringBootApplication
public class App {

    private final UserRepository userRepository;
    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;
    private final RealEstateRepository realEstateRepository;
    private final RealEstateEnhancedRepository realEstateEnhancedRepository;
    private final EmployeeRepository employeeRepository;
    private final CompanyRepository companyRepository;
    private final DriverRepository driverRepository;
    private final CarRepository carRepository;
    private final VehicleRepository vehicleRepository;

    public App(UserRepository userRepository,
               CustomerRepository customerRepository,
               OrderRepository orderRepository,
               RealEstateRepository realEstateRepository,
               RealEstateEnhancedRepository realEstateEnhancedRepository,
               EmployeeRepository employeeRepository,
               CompanyRepository companyRepository,
               DriverRepository driverRepository,
               CarRepository carRepository,
               VehicleRepository vehicleRepository) {
        this.userRepository = userRepository;
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
        this.realEstateRepository = realEstateRepository;
        this.realEstateEnhancedRepository = realEstateEnhancedRepository;
        this.employeeRepository = employeeRepository;
        this.companyRepository = companyRepository;
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {



        };
    }

    private RealEstate createRealEstateSample() {
        return new RealEstate("Hilton",
                new Address("5th Avenue", 1256),
                new Address("34th Street", 12313));
    }

    private RealEstateEnhanced createRealEstateEnhancedSample() {
        return new RealEstateEnhanced(new PropertyName("Hilton", "Trump Estates"),
                new Address("5th Avenue", 1256));
    }

    private User createUserSample() {
        return new User("Przemek", "Raczko",
                asList(new Address("5th Avenue", 1256),
                        new Address("34th Street", 12313)));
    }

    private Company createCompanySample() {
        return new Company("Codecool");
    }

    private Employee createEmployeeSample() {
        return new Employee("Przemyslaw Raczkowski", createCompanySample());
    }

    private List<Order> createOrdersSample1() {
        return asList(new Order(20, new Date()),
                new Order(50, new Date())
        );
    }

    private List<Order> createOrdersSample2() {
        return asList(new Order(70, new Date()),
                new Order(100, new Date()));
    }

    private List<Customer> createCustomersList() {
        return asList(
                new Customer("Przemek", "Raczko", createOrdersSample1()),
                new Customer("Inny", "Gość", createOrdersSample2())
        );
    }

    private Vehicle createVehicleSample() {
        return new Vehicle("Vehicle");
    }

    private Vehicle createSuperCarSample() {
        return new SuperCar("Bugatti", 420);
    }

    private Vehicle createTwoWheelerSample() {
        return new TwoWheeler("Kross", 3);
    }

}
package com.raczkowski;

import com.raczkowski.entity.onetomany.Customer;
import com.raczkowski.entity.onetomany.Order;
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
//            realEstateRepository.save(new RealEstate("Hilton",
//                    new Address("5th Avenue", 1256),
//                    new Address("34th Street", 12313)));
//
//            realEstateEnhancedRepository.save(new RealEstateEnhanced(new PropertyName("Hilton", "Trump Estates"),
//                    new Address("5th Avenue", 1256)));
//
//            userRepository.save(new User("Przemek", "Raczko",
//                    asList(new Address("5th Avenue", 1256),
//                            new Address("34th Street", 12313))));
//
//            Company codecool = new Company("Codecool");
//            companyRepository.save(codecool);
//
//            Employee employee = new Employee("Przemyslaw Raczkowski", codecool);
//            employeeRepository.save(employee);
//
//            Order order1 = new Order(20, new Date());
//            Order order2 = new Order(50, new Date());
//            Order order3 = new Order(70, new Date());
//            Order order4 = new Order(100, new Date());
//
//            List<Order> orders1 = asList(order1, order2);
//            List<Order> orders2 = asList(order3, order4);
//
//            orderRepository.saveAll(orders1);
//            orderRepository.saveAll(orders2);
//
//            Customer customer1 = new Customer("Przemek", "Raczko", orders1);
//            Customer customer2 = new Customer("Inny", "Gość", orders2);
//
//            order1.setCustomer(customer1);
//            order2.setCustomer(customer1);
//
//            order3.setCustomer(customer2);
//            order4.setCustomer(customer2);
//
//            customerRepository.save(customer1);
//            customerRepository.save(customer2);
//
//            orderRepository.saveAll(orders1);
//            orderRepository.saveAll(orders2);

//            Car volvo = new Car();
//            volvo.setName("Volvo");
//
//            Car audi = new Car();
//            audi.setName("Audi");
//
//            Car bmw = new Car();
//            bmw.setName("Bmw");
//
//            List<Car> przemekCars = Arrays.asList(volvo, audi);
//            List<Car> tomekCars = Arrays.asList(bmw, volvo);
//
//            carRepository.saveAll(przemekCars);
//            carRepository.saveAll(tomekCars);
//
//            Driver przemek = new Driver();
//            przemek.setName("Przemek");
//            przemek.setCars(przemekCars);
//
//            Driver tomek = new Driver();
//            tomek.setName("Tomek");
//            tomek.setCars(tomekCars);
//
//            driverRepository.save(przemek);
//            driverRepository.save(tomek);
//
//            List<Driver> volvoDrivers = Arrays.asList(przemek, tomek);
//            volvo.setDrivers(volvoDrivers);
//
//            audi.setDrivers(Collections.singletonList(przemek));
//            bmw.setDrivers(Collections.singletonList(tomek));
//
//            carRepository.saveAll(przemekCars);
//            carRepository.saveAll(tomekCars);


//            Vehicle vehicle = new Vehicle("Vehicle");
//            Vehicle bugatti = new SuperCar("Bugatti", 420);
//            Vehicle kross = new TwoWheeler("Kross", 3);
//
//            vehicleRepository.save(vehicle);
//            vehicleRepository.save(bugatti);
//            vehicleRepository.save(kross);

//            Order order1 = new Order(20, new Date());
//            Order order2 = new Order(50, new Date());
//            Order order3 = new Order(70, new Date());
//            Order order4 = new Order(100, new Date());
//
//            List<Order> orders1 = asList(order1, order2);
//            List<Order> orders2 = asList(order3, order4);
//
//            Customer customer1 = new Customer("Przemek", "Raczko", orders1);
//            Customer customer2 = new Customer("Inny", "Gość", orders2);
//
//            customerRepository.save(customer1);
//            customerRepository.save(customer2);

        };
    }
}
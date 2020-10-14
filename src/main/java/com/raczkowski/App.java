package com.raczkowski;

import com.raczkowski.entity.cascadetypes.all.Brand;
import com.raczkowski.entity.cascadetypes.all.Client;
import com.raczkowski.entity.cascadetypes.all.Product;
import com.raczkowski.repository.BrandRepository;
import com.raczkowski.repository.ClientRepository;
import com.raczkowski.repository.ProductRepository;
import org.hibernate.SessionFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@SpringBootApplication
public class App {

    private final ClientRepository clientRepository;
    private final ProductRepository productRepository;
    private final BrandRepository brandRepository;

    private final SamplesProvider samplesProvider;

    private EntityManagerFactory entityManagerFactory;

    public App(ClientRepository clientRepository,
               ProductRepository productRepository,
               BrandRepository brandRepository,
               SamplesProvider samplesProvider,
               EntityManagerFactory entityManagerFactory) {
        this.clientRepository = clientRepository;
        this.productRepository = productRepository;
        this.brandRepository = brandRepository;
        this.samplesProvider = samplesProvider;
        this.entityManagerFactory = entityManagerFactory;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {

            saveBrandUsingEntityManager();

        };
    }

    private Client saveCascadeAllSamples() {
        List<Product> products = samplesProvider.createProductSamples();
        Client przemek = new Client("Przemyslaw", "Raczkowski", products);


        return clientRepository.save(przemek);
    }

    private Client saveClientManually() {
        Brand nEstle = new Brand("NEstle");
        Brand tiger = new Brand("Tiger");

        brandRepository.save(nEstle);
        brandRepository.save(tiger);

        List<Product> products = samplesProvider.createProductSamples(nEstle, tiger);
        productRepository.saveAll(products);

        Client przemek = new Client("Przemyslaw", "Raczkowski", products);
        return clientRepository.save(przemek);
    }

    private void saveBrandUsingEntityManager(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(new Brand("Brand"));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
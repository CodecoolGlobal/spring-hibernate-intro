package com.raczkowski;

import com.raczkowski.entity.cascadetypes.all.Brand;
import com.raczkowski.entity.cascadetypes.all.Client;
import com.raczkowski.entity.cascadetypes.all.Product;
import com.raczkowski.repository.BrandRepository;
import com.raczkowski.repository.ClientRepository;
import com.raczkowski.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class App {

    private final ClientRepository clientRepository;
    private final ProductRepository productRepository;
    private final BrandRepository brandRepository;

    private final SamplesProvider samplesProvider;

    public App(ClientRepository clientRepository,
               ProductRepository productRepository,
               BrandRepository brandRepository,
               SamplesProvider samplesProvider) {
        this.clientRepository = clientRepository;
        this.productRepository = productRepository;
        this.brandRepository = brandRepository;
        this.samplesProvider = samplesProvider;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {
            Client client = saveClientManually();

            clientRepository.delete(client);
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
}
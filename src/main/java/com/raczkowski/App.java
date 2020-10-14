package com.raczkowski;

import com.raczkowski.entity.cascadetypes.Client;
import com.raczkowski.entity.cascadetypes.Product;
import com.raczkowski.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class App {

    private final ClientRepository clientRepository;

    private final SamplesProvider samplesProvider;

    public App(ClientRepository clientRepository,
               SamplesProvider samplesProvider) {
        this.clientRepository = clientRepository;
        this.samplesProvider = samplesProvider;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {
            List<Product> products = samplesProvider.createProductSamples();
            Client przemek = new Client("Przemyslaw", "Raczkowski", products);

            clientRepository.save(przemek);
        };
    }

}
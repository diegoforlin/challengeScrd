package com.diegoforlin.challenge.config;

import com.diegoforlin.challenge.address.Address;
import com.diegoforlin.challenge.entities.User;
import com.diegoforlin.challenge.repositories.AddressRepository;
import com.diegoforlin.challenge.repositories.UserRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
@Transactional
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {
        Address a1 = new Address("Silly Street", 21, "123129321321", "Clown Avenue", "São Paulo", "SP");

        Address a2 = new Address("Maple Avenue", 42, "11994-911", "Celeiro de Ases", "Novo Hamburgo", "RS");

        Address a3 = new Address("Baker Street", 21, "99940-400", "Serra Gaúcha", "Passo Fundo", "RS");

        addressRepository.saveAll(Arrays.asList(a1, a2, a3));

        User u1 = new User("Dani Vaz", "55512313132", a1, "11/02/1991", "11424124211");


        User u2 = new User("Ivan Mees", "213123132313", a2,"21/12/1998", "51912391231");


        User u3 = new User("Luiza Canabarro", "9998882220001", a3, "15/07/1998", "512414124124412");

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        }
    }

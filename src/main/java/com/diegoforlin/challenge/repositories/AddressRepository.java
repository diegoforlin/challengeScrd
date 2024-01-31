package com.diegoforlin.challenge.repositories;

import com.diegoforlin.challenge.address.Address;
import com.diegoforlin.challenge.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}

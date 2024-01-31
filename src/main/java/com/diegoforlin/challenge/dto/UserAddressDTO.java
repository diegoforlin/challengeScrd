package com.diegoforlin.challenge.dto;

import com.diegoforlin.challenge.address.Address;
import com.diegoforlin.challenge.entities.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.web.bind.annotation.RequestBody;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserAddressDTO {

    private User user;
    private Address address;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public UserAddressDTO(@RequestBody User user, Address address) {
        this.user = user;
        this.address = address;

    }
}

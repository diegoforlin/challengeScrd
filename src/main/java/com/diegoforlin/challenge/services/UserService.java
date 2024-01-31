package com.diegoforlin.challenge.services;

import com.diegoforlin.challenge.dto.UserAddressDTO;
import com.diegoforlin.challenge.entities.User;
import com.diegoforlin.challenge.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<UserAddressDTO> findAll() {
        List<User> users = repository.findAll();
        List<UserAddressDTO> userAddressDTOList = users.stream()
                .map(user -> new UserAddressDTO(user, user.getAddress()))
                .collect(Collectors.toList());

        return userAddressDTOList;
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public User update(Long id, User obj) {
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setCpf(obj.getCpf());
        entity.setPhoneNumber(obj.getPhoneNumber());
        entity.setDate(obj.getDate());
        entity.setAddress(obj.getAddress());
    }

    public UserAddressDTO findById(long id) {
        User user = repository.findById(id).orElse(null);
        if (user != null) {
            return new UserAddressDTO(user, user.getAddress());
        }
        return null;
    }
}



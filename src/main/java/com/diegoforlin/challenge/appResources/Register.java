//package com.diegoforlin.challenge.appResources;
//
//import com.diegoforlin.challenge.address.Address;
//import com.diegoforlin.challenge.entities.User;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@RestController
//@RequestMapping(value = "/users")
//public class Register {
//
//    @GetMapping
//    public ResponseEntity<List<User>> findAll() {
//        List<User> userList = new ArrayList<User>();
//
//        User u1 = new User("Dani Vaz", "55512313132", new Address("Silly Street", 21, "123129321321", "Clown Avenue", "São Paulo", "SP"), "11/02/1991", "11424124211");
//
//        User u2 = new User("Ivan Mees", "213123132313", new Address("Maple Avenue", 42, "123112331213", "Celeiro de Ases", "Novo Hamburgo", "RS"), "21/12/1998", "51912391231");
//        User u3 = new User("Luiza Canabarro", "9998882220001", new Address("Baker Street", 21, "123213123321", "Serra Gaúcha", "Passo Fundo", "RS"), "15/07/1998", "512414124124412");
//
//        userList.add(u1);
//        userList.add(u2);
//        userList.add(u3);
//
//        return ResponseEntity.ok().body(userList);
//    }
//}

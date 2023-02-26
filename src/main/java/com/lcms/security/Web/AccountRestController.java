package com.lcms.security.Web;
import com.lcms.security.Model.User;
import com.lcms.security.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Account")
@RequiredArgsConstructor
public class AccountRestController {

private final AccountService accountService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> listUser() {
        return  ResponseEntity.ok(accountService.listUsers());
    }
    @PostMapping("/users")
    public ResponseEntity<User> AddUser(@RequestBody User user)
    {
        return  ResponseEntity.ok(accountService.addNewUser(user));

    }


    //find user by id
    //upadate user info
    //delet user from database
    //add user role
    //reset password
    //mail authentification


}

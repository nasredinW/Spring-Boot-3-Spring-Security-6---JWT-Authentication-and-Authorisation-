package com.lcms.security.service;

import com.lcms.security.Model.User;
import com.lcms.security.Model.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;




    @Override
    public User addNewUser(User appUser) {
        String pw = appUser.getPassword();
        appUser.setPassword(passwordEncoder.encode(pw));
        return userRepository.save(appUser);
    }







    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }
}

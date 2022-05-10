package com.saygili.issuemanagement2.service.impl;

import com.saygili.issuemanagement2.entity.User;
import com.saygili.issuemanagement2.repository.UserRepository;
import com.saygili.issuemanagement2.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        if (user.getEmail().isEmpty()) {
            throw new IllegalArgumentException("User email cannot be empty");
        }

        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(User user) {
        userRepository.delete(user);
        return Boolean.TRUE;
    }

    @Override
    public User getByUserName(String username) {
        return userRepository.findByUsername(username);
    }
}

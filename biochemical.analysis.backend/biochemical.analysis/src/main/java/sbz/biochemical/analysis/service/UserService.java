package sbz.biochemical.analysis.service;

import sbz.biochemical.analysis.model.user.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
}

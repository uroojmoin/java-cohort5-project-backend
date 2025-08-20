package service;

import dto.UserDTO;
import model.User;

import java.util.Optional;

public interface UserService {
    User registerUser(UserDTO userDTO);
    Optional<User> loginUser(String email, String rawPassword);
    Optional<User> getUserByEmail(String email);
    UserDTO getUserProfile(String email);
    String changePassword(String email, String newPassword);
}
package ru.netology.nosqlproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.nosqlproject.models.User;
import ru.netology.nosqlproject.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //вывод всех пользователей
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    //вывод пользователей по id
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }
    //вывод пользователей по имени
    public List<User> getUserByName(String nameToFind) {
        return getUsers().stream().filter((x) -> x.getName().equals(nameToFind)).collect(Collectors.toUnmodifiableList());
    }

    //вывод пользователей по возрасту
    public List<User> getUserByAge(int ageToFind) {
        return getUsers().stream().filter((x) -> x.getAge() == ageToFind).collect(Collectors.toUnmodifiableList());
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}

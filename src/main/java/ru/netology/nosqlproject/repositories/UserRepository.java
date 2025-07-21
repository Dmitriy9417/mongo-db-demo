package ru.netology.nosqlproject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.netology.nosqlproject.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

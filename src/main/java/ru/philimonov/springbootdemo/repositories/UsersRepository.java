package ru.philimonov.springbootdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.philimonov.springbootdemo.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {
}

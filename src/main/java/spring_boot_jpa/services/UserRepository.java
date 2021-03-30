package spring_boot_jpa.services;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_boot_jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

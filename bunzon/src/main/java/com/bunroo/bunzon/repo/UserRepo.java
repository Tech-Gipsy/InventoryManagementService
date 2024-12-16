package com.bunroo.bunzon.repo;

import com.bunroo.bunzon.entities.user;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<user, Long> {

}

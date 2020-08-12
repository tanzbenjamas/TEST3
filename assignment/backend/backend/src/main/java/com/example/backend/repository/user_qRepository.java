package com.example.backend.repository;

import com.example.backend.entity.user_q;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface user_qRepository extends JpaRepository<user_q, Long> {
    user_q findByuser_qId(String user_q);
    user_q findByuser_qId(Long user_Id);
}

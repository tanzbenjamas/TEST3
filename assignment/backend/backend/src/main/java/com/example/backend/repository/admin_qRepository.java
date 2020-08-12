package com.example.backend.repository;

import com.example.backend.entity.admin_q;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface admin_qRepository extends JpaRepository<admin_q, Long> {
    admin_q findByadmin_qId(String admin_q);
    admin_q findByadmin_qId(Long admin_qId);
}

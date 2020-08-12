package com.example.backend.repository;

import com.example.backend.entity.list_q;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface list_qRepository extends JpaRepository<list_q, Long> {
    list_q findBylist_qId(String list_q);
    list_q findBylist_qId(Long list_Id);
}

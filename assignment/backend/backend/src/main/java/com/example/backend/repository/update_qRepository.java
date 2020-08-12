package com.example.backend.repository;

import com.example.backend.entity.update_q;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface update_qRepository extends JpaRepository<update_q, Long> {
    update_q findByupdate_qId(String update_q);
    update_q findByupdate_qId(Long update_Id);
}

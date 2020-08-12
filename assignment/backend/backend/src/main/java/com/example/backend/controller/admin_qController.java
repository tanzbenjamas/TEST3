package com.example.backend.controller;
import com.example.backend.entity.*;
import com.example.backend.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class admin_qController{
    @Autowired
    private admin_qRepository admin_qRepository;
    @Autowired
    private list_qRepository list_qRepository;
    @Autowired
    private update_qRepository update_qRepository;
    @Autowired
    private user_qRepository user_qRepository;

    public admin_qController(admin_qRepository admin_qRepository,
    list_qRepository list_qRepository,
    update_qRepository update_qRepository,
    user_qRepository user_qRepository)
    {
        this.admin_qRepository = admin_qRepository;
        this.list_qRepository = list_qRepository;
        this.update_qRepository = update_qRepository;
        this.user_qRepository = user_qRepository;
}

    @GetMapping(path = "/Admin_q",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<admin_q> getAdmin_qs(){
        return admin_qRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping(path = "/Admin_q/{admin_qId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public admin_q getOneaAdmin_q(@PathVariable Long admin_qId){
        return admin_qRepository.findById(admin_qId).get();
    }

    @PostMapping(path ="/Admin_q/{admin}/{update}/{list}/{user}")
    public admin_q newadmin_q(
                              @PathVariable String adminq,
                              @PathVariable Long update,
                              @PathVariable Long list,
                              @PathVariable Long user
    ) 
    {
        admin_q a = new admin_q();
        a.setAdminq(adminq);
        admin_qRepository.save(a);
        return a;
    }

}
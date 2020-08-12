package com.example.backend.entity;
import lombok.*;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Optional;

import javax.xml.validation.*;
// import javax.validation.constraints.NotNull;
// import javax.validation.constraints.Pattern;
// import javax.validation.constraints.Size;

@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "admin_q")

public class admin_q{
    @Id
    @SequenceGenerator(name="admin_q_seq",sequenceName="admin_q_seq")               
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="admin_q_seq")  
    @Column(name="admin_qId",unique = true, nullable = false)
    
    private Long admin_qId;
    String adminq;
}
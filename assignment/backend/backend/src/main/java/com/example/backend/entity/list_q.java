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
@Table(name = "list_q")

public class list_q{
    @Id
    @SequenceGenerator(name="list_q_seq",sequenceName="list_q_seq")               
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="list_q_seq")  
    @Column(name="list_qId",unique = true, nullable = false)
    
    private Long list_qId;
    String list_q;
}
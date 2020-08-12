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
@Table(name = "update_q")

public class update_q{
    @Id
    @SequenceGenerator(name="update_q_seq",sequenceName="update_q_seq")               
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="update_q_seq")  
    @Column(name="update_qId",unique = true, nullable = false)
    
    private Long update_qId;
    String update_q;
}
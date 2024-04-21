package com.example.msuser.entities;
import com.example.msuser.model.server;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "vm")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class virtual_machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vm;
    @Embedded
    private configuration config;
    private Long id_server;
    @Transient
    private server server;
    @ManyToOne
    private user user;

}

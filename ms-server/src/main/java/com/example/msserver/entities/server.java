package com.example.msserver.entities;

import com.example.msserver.model.virtual_machine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="svr")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class server {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_server;
    @Embedded
    private configuration config;
    private String data_center;

    @Transient
    private List<virtual_machine> vms;
}

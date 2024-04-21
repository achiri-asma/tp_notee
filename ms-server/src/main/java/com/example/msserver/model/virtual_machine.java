package com.example.msserver.model;

import com.example.msserver.entities.configuration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class virtual_machine {
    private Long id_vm;
    private configuration config;

}

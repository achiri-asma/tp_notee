package com.example.msuser.model;

import com.example.msuser.entities.configuration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class server {
    private Long id_server;
    private configuration config;
    private String data_center;
}

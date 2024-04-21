package com.example.msuser.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class configuration implements Serializable {
    private Long cpu;
    private Long ram;
    private Long disk_size;
}

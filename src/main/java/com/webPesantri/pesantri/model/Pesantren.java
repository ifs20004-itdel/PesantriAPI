package com.webPesantri.pesantri.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pesantren")
public class Pesantren {
    @Id
    private Long id;

    private String nama;
    private String alamat;
}

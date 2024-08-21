package com.task.MakerSharks.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class SupplierEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String  companyName;

        @Column(nullable = false)
        private String website;

        @Column(nullable = false)
        private String location;

        @Column(nullable = false)
        private String natureOfBusiness;

        @Column(nullable = false)
        private String manufacturingProcesses;

}

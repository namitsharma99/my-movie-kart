package com.mymoviekart.theatrepartner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MMK_PARTNER")
public class PartnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PARTNER_NAME", nullable = false)
    private String partnerName;

    @Column(name = "EMAIL_ID", nullable = false)
    private String emailId;

    @Column(name = "CONTACT_NUMBER", nullable = false)
    private String contactNumber;

    @Column(name = "NATIONALITY", nullable = false)
    private String nationality;

    @Column(name = "NATIONAL_ID", nullable = false)
    private String nationalId;

    @Column(name = "APPROVED", nullable = false)
    private boolean approved;

    @CreationTimestamp
    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    private Date createdDate;

}

package com.bank.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "requests")
public class AccountRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User creator;

    @OneToOne
    @JoinColumn(name = "request_type_id", referencedColumnName = "id")
    private AccountRequestType accountRequestType;
}

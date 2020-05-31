package com.bank.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "transfers")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "amount")
    private BigInteger amount;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "sender_id",referencedColumnName = "id")
    private Account sender;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "receiver_id",referencedColumnName = "id")
    private Account receiver;
}

package com.easyreserve.reserve.model;

import com.easyreserve.reserve.enums.ReserveStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@jakarta.persistence.Table(name = "reserves")
@Getter
@Setter
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "table_id")
    private Table table;

    @NotNull
    private LocalDateTime reserveDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ReserveStatus reserveStatus = ReserveStatus.ACTIVE;

}

package com.easyreserve.reserve.model;

import com.easyreserve.reserve.enums.TableStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@jakarta.persistence.Table(name = "restaurant_tables")
@Getter
@Setter
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(unique = true)
    private Integer number;

    @NotNull
    private Integer capacity;

    @Enumerated(EnumType.STRING)
    private TableStatus status;
}

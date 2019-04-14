package com.terminl.demo.database.entity.visit;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(uniqueConstraints =
@UniqueConstraint(columnNames={"user_id", "airport_code"}))
public class AirportVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JoinColumn(name="UserEntity", referencedColumnName = "id")
    @Column(name="user_id")
    @NotNull
    private Integer userId;

    @Column(name="airport_code")
    @NotNull
    private String airportCode;

    public AirportVisit() {
    }

    public AirportVisit(@NotNull Integer userId, @NotNull String airportCode) {
        this.userId = userId;
        this.airportCode = airportCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }
}

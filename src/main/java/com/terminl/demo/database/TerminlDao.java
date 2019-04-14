package com.terminl.demo.database;

import com.terminl.demo.database.entity.user.UserEntity;
import com.terminl.demo.database.entity.user.UserEntityRepository;
import com.terminl.demo.database.entity.visit.AirportVisit;
import com.terminl.demo.database.entity.visit.AirportVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TerminlDao {

    private AirportVisitRepository airportVisitRepository;
    private UserEntityRepository userEntityRepository;

    @Autowired
    public TerminlDao(AirportVisitRepository airportVisitRepository, UserEntityRepository userEntityRepository) {
        this.airportVisitRepository = airportVisitRepository;
        this.userEntityRepository = userEntityRepository;
    }

    public UserEntity addUser(UserEntity userEntity) {
        return userEntityRepository.save(userEntity);
    }

    public AirportVisit addVisit(AirportVisit airportVisit) {
        return airportVisitRepository.save(airportVisit);
    }

    public UserEntity getUser(int id) {
        return userEntityRepository.findById(id).orElse(null);
    }

    public List<AirportVisit> getAirportVisitsForUser(int id) {
        AirportVisit visit = new AirportVisit();
        visit.setId(null);
        visit.setUserId(id);
        Example<AirportVisit> visitExample = Example.of(visit);
        return airportVisitRepository.findAll(visitExample);
    }
}

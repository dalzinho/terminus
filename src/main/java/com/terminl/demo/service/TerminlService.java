package com.terminl.demo.service;

import com.terminl.demo.database.TerminlDao;
import com.terminl.demo.database.entity.user.UserEntity;
import com.terminl.demo.database.entity.visit.AirportVisit;
import com.terminl.demo.iata.IataClient;
import com.terminl.demo.iata.IataClientException;
import com.terminl.demo.iata.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TerminlService {

    private TerminlDao terminlDao;
    private IataClient iataClient;

    @Autowired
    public TerminlService(TerminlDao terminlDao, IataClient iataClient) {
        this.terminlDao = terminlDao;
        this.iataClient = iataClient;
    }

    public List<String> addVisits(Integer userId, List<String> airportsToAdd) {
        airportsToAdd.forEach(airport -> {
            terminlDao.addVisit(new AirportVisit(userId, airport));
        });

        return airportsToAdd;
    }

    public UserEntity addUser(String firstName, String lastName) {
        UserEntity entity = new UserEntity(firstName, lastName);
        return terminlDao.addUser(entity);
    }

    public UserModel getUser(int id) {
        UserEntity entity = terminlDao.getUser(id);

        List<AirportVisit> visits = terminlDao.getAirportVisitsForUser(id);

        List<Response> airportDetails = visits.stream()
                .map(visit -> getAirportByCode(visit.getAirportCode()))
                .collect(Collectors.toList());

        UserModel model = new UserModel();
        model.setId(id);
        model.setName(entity.getFirstName() + " " + entity.getLastName());
        model.setAirports(airportDetails);
        return model;
    }

    private Response getAirportByCode(String code) {
        try {
            return iataClient.getAirportByCode(code);
        } catch (IataClientException e) {
            e.printStackTrace();
            return null;
        }
    }
}

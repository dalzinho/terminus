package com.terminl.demo.iata;

import com.terminl.demo.iata.model.IataResponse;
import com.terminl.demo.iata.model.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class IataClient {

    @Value("${iata.remote.api.url}")
    private String remoteApiUri;

    public void getAirports() {
        makeRequest()
                .getResponse()
                .stream()
                .map(airport -> airport.getName() + " (" + airport.getCode() + ")")
                .forEach(System.out::println);
    }


    public Response getAirportByCode(String airportCode) throws IataClientException {

        List<Response> response = makeRequest("&code=" + airportCode).getResponse();

        if (response == null || response.isEmpty()) {
            throw new IataClientException();
        } else {
            return response.get(0);
        }

    }

    private IataResponse makeRequest() {
        return makeRequest("");
    }
    private IataResponse makeRequest(String queryParams) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(remoteApiUri + queryParams, IataResponse.class);
    }
}

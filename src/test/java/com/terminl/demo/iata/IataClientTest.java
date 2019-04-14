package com.terminl.demo.iata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=IataClientTest.class)
public class IataClientTest {

    @Autowired
    IataClient client;

    @Bean
    IataClient client() {
        return new IataClient();
    }

    @Test
    public void testclient() {
        client.getAirports();
    }
}

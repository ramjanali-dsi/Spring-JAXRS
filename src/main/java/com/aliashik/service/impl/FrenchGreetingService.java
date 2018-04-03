
package com.aliashik.service.impl;

import com.aliashik.service.GreetingService;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrenchGreetingService implements GreetingService {

    @Autowired
    private Logger logger;

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public String getGreeting(String name) {
        logger.info("service method is executing");
        return "Bonjour, " + name + "!";
    }  
}

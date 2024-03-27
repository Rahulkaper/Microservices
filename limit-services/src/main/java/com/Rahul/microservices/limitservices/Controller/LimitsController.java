package com.Rahul.microservices.limitservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Rahul.microservices.limitservices.beans.Limits;
import com.Rahul.microservices.limitservices.configuration.Configuration;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;

      
      @GetMapping("/Limits")
      public  Limits retrieveLimits(){
        return new Limits(configuration.getMaximum(), configuration.getMinimum() );
    }

}

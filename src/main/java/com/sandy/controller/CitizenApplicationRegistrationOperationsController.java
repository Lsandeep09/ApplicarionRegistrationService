package com.sandy.controller;


import com.sandy.DTO.CitizenAppRegistrationInputs;
import com.sandy.service.ICitizenApplicationRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/CitizenAR-api")
public class CitizenApplicationRegistrationOperationsController {

    @Autowired
    private ICitizenApplicationRegistrationService registrationService;

    /*@PostMapping("/save")
    public ResponseEntity<String> saveCitizenApplication(@RequestBody CitizenAppRegistrationInputs inputs) {
        try{
            //use service
            int appId = registrationService.registerCitizenApplication(inputs);
            if(appId>0)
                return new ResponseEntity<String>("Citizen Application is registred with the Id::"+appId, HttpStatus.CREATED);
            else
                return new ResponseEntity<String>("Invalid SSN or must belong to California state::",HttpStatus.OK);

        }//try
        catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }*/


    //webclient  code removing the try catch block

    /*@PostMapping("/save")
    public ResponseEntity<String> saveCitizenApplication(@RequestBody CitizenAppRegistrationInputs inputs)throws Exception {

            //use service
            int appId = registrationService.registerCitizenApplication(inputs);
                return new ResponseEntity<String>("Citizen Application is registred with the Id::"+appId, HttpStatus.CREATED);

    }*/
    @PostMapping("/save")
    public String saveCitizenApplication(@RequestBody CitizenAppRegistrationInputs inputs)throws Exception {
        int appId = registrationService.registerCitizenApplication(inputs);
        return "Citizen Application is registered with the Id::"+appId;
    }
}

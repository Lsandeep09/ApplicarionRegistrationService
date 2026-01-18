package com.sandy.service;

import com.sandy.DTO.CitizenAppRegistrationInputs;
import com.sandy.Exception.InvalidSSNException;

public interface ICitizenApplicationRegistrationService {
    public Integer registerCitizenApplication(CitizenAppRegistrationInputs inputs)throws InvalidSSNException;
}

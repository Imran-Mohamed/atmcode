package com.example.atmservice.dao;

import com.example.atmservice.entity.DenominationEntity;
import org.springframework.stereotype.Repository;

@Repository
public class DenominationImpl implements DenominationDAO{

    @Override
    public String uploadDenominations(DenominationEntity denominationEntity){
        //savedenominations
        return "Success";
    }
}

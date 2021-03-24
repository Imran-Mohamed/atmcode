package com.example.atmservice.service;

import com.example.atmservice.dao.DenominationDAO;
import com.example.atmservice.entity.DenominationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DenominationServiceImpl implements DenominationService{
    @Autowired
    private DenominationDAO denominationDAO;
    @Override
    public String uploadDenominations(DenominationEntity denominationEntity) {
        return denominationDAO.uploadDenominations(denominationEntity);
    }
}

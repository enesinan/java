package com.example.demo.service;

import com.example.demo.PC.CreatePC;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CreateServiceImpl implements CreateService {
    private final CreatePC createPC;

    public CreateServiceImpl(@Qualifier("createMACOS") CreatePC createPC) {
        this.createPC = createPC;
    }

    @Override
    public void create() {
        createPC.create();
    }
}

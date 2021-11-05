package com.example.demo.config;

import com.example.demo.PC.CreatePC;
import com.example.demo.PC.MacosPC;
import com.example.demo.PC.UbuntuPC;
import com.example.demo.PC.WindowsPC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CreatePC createUBUNTU() {
        return new UbuntuPC();
    }

    @Bean
    public CreatePC createWINDOWS() {
        return new WindowsPC();
    }

    @Bean
    public CreatePC createMACOS() {
        return new MacosPC();
    }
}

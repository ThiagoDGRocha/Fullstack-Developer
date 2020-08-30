package br.com.maximatech.freight.service;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class FreightService {

    public Double getFreight(Integer amount) {
        int min = 5, max = 10;
        return Double.valueOf(
                new DecimalFormat("#.00").format((Math.random() * (max - min + 1) + min) * amount));
    }
}

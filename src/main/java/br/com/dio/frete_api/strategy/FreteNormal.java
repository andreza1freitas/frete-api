package br.com.dio.frete_api.strategy;

import org.springframework.stereotype.Component;

@Component("normal")
public class FreteNormal implements FreteStrategy {

    @Override
    public Double calcular(Double peso) {
        return peso * 5;
    }
}

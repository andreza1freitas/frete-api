package br.com.dio.frete_api.strategy;

import org.springframework.stereotype.Component;

@Component("expresso")
public class FreteExpresso implements FreteStrategy {

    @Override
    public Double calcular(Double peso) {
        return peso * 10;
    }
}

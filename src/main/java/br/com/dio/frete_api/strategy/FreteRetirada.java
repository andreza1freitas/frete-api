package br.com.dio.frete_api.strategy;

import org.springframework.stereotype.Component;

@Component("retirada")
public class FreteRetirada implements FreteStrategy {

    @Override
    public Double calcular(Double peso) {
        return 0.0;
    }
}


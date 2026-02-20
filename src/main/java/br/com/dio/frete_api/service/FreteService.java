package br.com.dio.frete_api.service;

import org.springframework.stereotype.Service;
import br.com.dio.frete_api.entity.Frete;
import br.com.dio.frete_api.repository.FreteRepository;
import br.com.dio.frete_api.strategy.FreteStrategy;

import java.util.List;
import java.util.Map;

@Service
public class FreteService {

    private final Map<String, FreteStrategy> strategies;
    private final FreteRepository repository;

    public FreteService(Map<String, FreteStrategy> strategies,
                        FreteRepository repository) {

        this.strategies = strategies;
        this.repository = repository;
    }

    public Frete calcular(String tipo, Double peso) {

        FreteStrategy strategy = strategies.get(tipo);

        if (strategy == null) {
            throw new IllegalArgumentException("Tipo inválido");
        }

        Double valor = strategy.calcular(peso);

        Frete frete = new Frete(tipo, peso, valor);

        return repository.save(frete);
    }

    public List<Frete> listar() {
        return repository.findAll();
    }

    public Frete atualizar(Long id, String tipo, Double peso) {

        Frete frete = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Frete não encontrado")
                );

        FreteStrategy strategy = strategies.get(tipo);

        if (strategy == null) {
            throw new IllegalArgumentException("Tipo inválido");
        }

        Double valor = strategy.calcular(peso);

        frete.setTipo(tipo);
        frete.setPeso(peso);
        frete.setValor(valor);

        return repository.save(frete);
    }

    public void excluir(Long id) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("Frete não encontrado");
        }

        repository.deleteById(id);
    }
}

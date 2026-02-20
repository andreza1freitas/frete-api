package br.com.dio.frete_api.repository;

import br.com.dio.frete_api.entity.Frete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreteRepository extends JpaRepository<Frete, Long> {
}

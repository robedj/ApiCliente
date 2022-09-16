package br.com.tec.client.repository;

import br.com.tec.client.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}


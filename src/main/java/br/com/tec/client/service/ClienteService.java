package br.com.tec.client.service;

import br.com.tec.client.entity.Cliente;
import br.com.tec.client.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscaPorId(Long id){
        return clienteRepository.findById(id);
    }
    public void removerPorId(Long id){
        clienteRepository.deleteById(id);
    }
}

package api.dasa.dashboard.service;

import api.dasa.dashboard.model.entity.Cliente;
import api.dasa.dashboard.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente clienteById(Integer id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        Cliente c = cliente.get();
        return  c;
    }
}

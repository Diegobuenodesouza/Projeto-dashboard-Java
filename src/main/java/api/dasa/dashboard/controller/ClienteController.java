package api.dasa.dashboard.controller;

import api.dasa.dashboard.model.entity.Cliente;
import api.dasa.dashboard.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cliente>> listar(){
        List<Cliente> listaCliente = clienteService.listar();
        return ResponseEntity.ok(listaCliente);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> filtrarById(@PathVariable Integer id){
        Cliente c = clienteService.clienteById(id);
        return ResponseEntity.ok(c);
    }
}

package api.dasa.dashboard.controller;

import api.dasa.dashboard.model.entity.FaturaMensalCliente;
import api.dasa.dashboard.service.FaturaMensalClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "api/fatura")
public class FaturaMensalClienteController {

    @Autowired
    private FaturaMensalClienteService faturaMensalClienteService;

    @GetMapping
    public ResponseEntity<List<FaturaMensalCliente>> listar(){
        return ResponseEntity.ok(faturaMensalClienteService.listar());
    }

    @GetMapping(value = "/{id}" )
    public ResponseEntity<List<FaturaMensalCliente>> faturaById(
            @PathVariable Integer id,
            @RequestParam(value = "mindata", defaultValue = "01/01/2021") LocalDate minData,
            @RequestParam(value = "maxdata", defaultValue = "01/01/2022") LocalDate maxData
            ){
        return ResponseEntity.ok(faturaMensalClienteService.faturaById(id, minData, maxData));
    }

    @GetMapping(value = "/faturaHome")
    public Double faturahome(){
        return faturaMensalClienteService.faturaUltimoSeisMeses();
    }



}

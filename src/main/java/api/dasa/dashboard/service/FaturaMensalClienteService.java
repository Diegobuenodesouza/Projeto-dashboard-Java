package api.dasa.dashboard.service;

import api.dasa.dashboard.model.entity.FaturaMensalCliente;
import api.dasa.dashboard.repository.FaturaMensalClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FaturaMensalClienteService {

    @Autowired
    private FaturaMensalClienteRepository faturaMensalClienteRepository;

    public List<FaturaMensalCliente> listar(){
        return faturaMensalClienteRepository.findAll();
    }

    public FaturaMensalCliente salvar(FaturaMensalCliente faturaMensalCliente){
        return  faturaMensalClienteRepository.save(faturaMensalCliente);
    }

    public List<FaturaMensalCliente> faturaById(Integer id, LocalDate minData, LocalDate maxData) {

        return faturaMensalClienteRepository.faturaById(id, minData, maxData);
    }

    public Double faturaUltimoSeisMeses(){
        return faturaMensalClienteRepository.faturaSemestre();
    }

}

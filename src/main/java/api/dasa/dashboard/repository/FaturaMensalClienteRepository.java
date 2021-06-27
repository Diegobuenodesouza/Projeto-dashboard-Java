package api.dasa.dashboard.repository;

import api.dasa.dashboard.model.entity.FaturaMensalCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface FaturaMensalClienteRepository extends JpaRepository<FaturaMensalCliente, Integer> {

    @Query("SELECT fatura from FaturaMensalCliente fatura WHERE cliente_id = :id  AND " +
            "data >= :mixdata AND data <= :maxdata order by data" )
    List<FaturaMensalCliente> faturaById(Integer id, LocalDate mixdata, LocalDate maxdata);


    @Query("select sum(receita) from FaturaMensalCliente fatura where data = '2021-1-01'")
    Double faturaSemestre();
}

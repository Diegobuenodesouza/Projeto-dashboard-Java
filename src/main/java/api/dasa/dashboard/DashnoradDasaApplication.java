package api.dasa.dashboard;

import api.dasa.dashboard.controller.ClienteController;
import api.dasa.dashboard.model.entity.Cliente;
import api.dasa.dashboard.model.entity.FaturaMensalCliente;

import api.dasa.dashboard.service.ClienteService;
import api.dasa.dashboard.service.FaturaMensalClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;


@SpringBootApplication
public class DashnoradDasaApplication {


	@Autowired
	private ClienteService clienteService;

	@Autowired
	private FaturaMensalClienteService faturaMensalClienteService;


	public static void main(String[] args)  {

		SpringApplication.run(DashnoradDasaApplication.class, args);

	}

}

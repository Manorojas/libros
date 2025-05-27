package com.aluracursos.libros;

import com.aluracursos.libros.principal.Principal;
import com.aluracursos.libros.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrosApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(LibrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal =new Principal();
		principal.muestraElMenu();

	}
}



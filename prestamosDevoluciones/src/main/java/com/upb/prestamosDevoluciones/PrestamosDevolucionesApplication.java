package com.upb.prestamosDevoluciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient("/libros")
public class PrestamosDevolucionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrestamosDevolucionesApplication.class, args);
	}

}

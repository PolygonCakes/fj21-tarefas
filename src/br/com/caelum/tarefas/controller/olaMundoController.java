package br.com.caelum.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class olaMundoController {
	@RequestMapping("/olaMundoSpring")
	public String exxecute() {
		System.out.println("Executando a lógica com Spring MVC");
		return "ok";
	}
}

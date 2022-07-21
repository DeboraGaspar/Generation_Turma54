package com.generation.helloworld.controller;
//
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivo")

public class ObjetivosController {

	@GetMapping
	public String objetivoaprendizagem() {
		return "Meu objetivo de aprendizagem é:\n\n"
				+ "- Aprender Spring tool '-' ;\n\n"
				+ "- Colocar todas minhas habilidades aprendidas em prática;\n\n"
				+ "- Trabalhar a comunicação.\n\n"
				+ "- Ser mais objetiva e centrada para realizar meus estudos.";
	}

}

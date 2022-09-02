package com.halloworld.hallo.controller;

@RestController
@RequestMapping("/Hallo")
public class HalloController {

	@GetMapping("1")
	public String hello() {
		return "Hallo Generation";
	}

	@GetMapping("2")
	public String bsm() {
		return "lista de BMS's:"
				+ "/n Proatividade"
				+ "/n Trabalho em equipe"
				+ "/n Comunicação"
				+ "/n Orientação ao futuro"
				+ "/n Orientação ao detalhe"
				+ "/n Responsabilidade pessoal"
				+ "/n Mentalidade de crescimento"
				+ "/n Persistência";
	}

	@GetMapping("3")
	public String obj() {
		return "Objetivos da semana:"
				+ "/n POO"
				+ "/n Spring";
	}
}
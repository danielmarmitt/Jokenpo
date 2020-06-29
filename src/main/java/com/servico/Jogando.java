package com.servico;


@RestController
@RequestMapping("/jogando")
@CrossOrigin(origins = "*")
@SessionAttributes("jogadasrealizadas")
public class Jogando {
	
	@ModelAttribute("jogadasrealizadas")
	JogadasRealizadas jogadasrealizadas;
	
	
    @RequestMapping()
    public String adicionarJogadaLista(@ModelAttribute("jogadasrealizadas")JogadasRealizadas jogadas, JogadasRealizadas jog) {
        jogadasrealizadas.listaJogadas.add(jog);
        return "Jogada inclusa em memória";
    }
	

}

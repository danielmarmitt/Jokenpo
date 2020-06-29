package com.servico;

import java.util.List;

@RestController
@RequestMapping("/vencedor/")
@CrossOrigin(origins = "*")
public class ComparaJogadas {
	
	  public ComparaJogadas()
	  {
		  super();
	  }
	
	  public int compareJogadas(JogadasRealizadas movimentacaofeita, List<JogadasRealizadas> TodasJogadas) {
	        
		   int retorno = -1;
		   for(int i=0;i<TodasJogadas.size();i++){
			   
			switch (TodasJogadas.get(1).tipoJogada.getId()) {
			case 1://PEDRA
			{
				retorno = 1;
				break;
			}
			case 2: //PAPEL
			{
				retorno = 1;
				break;
			}
			case 3://TESOURA
			{
				retorno = 1;
				break;
			}	
			case 4://LAGARTO
			{
				retorno =1;
				break;
			}
			case 5://SPOCK
			{
				retorno = 1;
				break;
			}	

			default:
				//CONDIÇÃO ADICIONAL
			}
		   }
		   
		   return retorno;		   
	}	

}

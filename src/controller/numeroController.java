package controller;

public class numeroController {

	public numeroController() {
		// TODO Auto-generated constructor stub
	}

	public int compara(int numero1, int numero2) {
		int aux = 0;
		if (numero1 == 0) { //condicao de parada quando o prmeiro numero chegar a 0
			return 0;
		} else {
			if ((numero1 % 10) == numero2) { //condicao que verifica de o mod no numero por 10 � igual ao numero 2
				aux = +1; //auxiliar para contar quantas vezes o numero entrou na condicao
			}
			numero1 = numero1 / 10; //divido o numero por 10 pra remover o numero de unidade j� que int em java ignora o que ha depois da virgula
			// exemplo 1001/10 = 100,1 por�m por ser int retornar� apenas 100
			return aux + compara(numero1, numero2);  
		}

	}
}

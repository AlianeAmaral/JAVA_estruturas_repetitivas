package estudos_programacao;
import java.util.Scanner;

public class estrutura_repetitiva_apresentacao {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); //SC foi criado para permitir entrada de dados.
		
		System.out.println("O sistema lê números até que apareça um que é zero, depois a soma dos números digitados.");
		System.out.println("Digite um número inteiro: ");
		
		int x = sc.nextInt(); //variável X será inserida pelo usuário.
		
		int soma = 0; //a variável precisa começar com um valor, por isso zero.
		
		while (x != 0) { //enquanto X for diferente de 0, vou solicitar que leia o X novamente.
			soma = soma + x; //pode trocar por "soma += x" (atribuição cumulativa).
			x = sc.nextInt(); //se for só esse comando, o X vai ser substituído.
		}
		
		System.out.println("A soma dos números digitados é: " + soma + ".");
		
		sc.close(); //se o while for falso, vai pular fora para a linha 18.
	}
}

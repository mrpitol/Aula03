import java.util.Scanner;
public class ExercicioDrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles deve ser carregado pelo drone.*/
		//PRIMEIRA PARTE: PEDIR PARA O USUARIO DIGITAR OS DADOS
		Scanner leitor = new Scanner(System.in);
		double lixo1, lixo2, lixo3;
		System.out.println("digite o peso do primeiro lixo:");
		lixo1 = leitor.nextDouble();
		System.out.println("digite o peso do segundo lixo:");
		lixo2 = leitor.nextDouble();
		System.out.println("digite o peso do terceiro lixo:");
		lixo3 = leitor.nextDouble();
				
		//SEGUNDA PARTE: DESCOBRIR QUAL É O LIXO DE MENOR PESO
		// Para o primeiro lixo ser o menor, o que eu preciso fazer?
		//Ele precisa ser ao mesmo tempo, menor que o lixo 2 e menor que o lixo 3
		if ((lixo1<lixo2)&(lixo1<lixo3)) {
			System.out.println("Carregar Lixo1");
		}else if((lixo2<lixo3)&(lixo2<lixo1)) {
				System.out.println("Carregar Lixo2");
		}else { if((lixo3<lixo1)&(lixo3<lixo2)) 
				System.out.println("Carregar Lixo3");
		}
		leitor.close();
		}
	}



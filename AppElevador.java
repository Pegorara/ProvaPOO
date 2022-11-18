package prova;
import java.util.Scanner;

public class AppElevador {
	static Scanner lerTeclado = new Scanner(System.in);
	static Elevador elevador;
	
	public static void main(String[] args) {

		elevador = new Elevador(15, "Recife", 10, 100);
		mostrarElevador();

		do {
			elevador.embarque(lerTeclado.nextDouble());
			mostrarElevador();
			
			if (elevador.getNrAtualPessoas() >= elevador.getNrMaximoPessoas()
				|| elevador.getPesoAtualCarga() >= elevador.getPesoMaximoCarga()) {
				System.out.println("Capacidade de pessoas ou de carga esgotada");
			} else {
				continue;
			}
			break;
		} while (elevador.getNrAtualPessoas() <= elevador.getNrMaximoPessoas());
		
		
		elevador.desembarque(lerTeclado.nextDouble());
		mostrarElevador();
		
		do {
			elevador.desembarque(lerTeclado.nextDouble());
			mostrarElevador();
			
			if (elevador.getNrAtualPessoas() == 0) {
				
				System.out.println("Não tem pessoa para desembarcar");
			} else {
					continue;
			}
			break;
		} while(elevador.getNrAtualPessoas() == 0);
				
	}
	
	public static void mostrarElevador() {
		System.out.println("---------------------------");
		System.out.println("Código                   : " + elevador.getIdElevador());
		System.out.println("Localidade               : " + elevador.getLocalidade());
		System.out.println("Nº Máximo de Pessoas     : " + elevador.getNrMaximoPessoas());
		System.out.println("Peso Máximo da Carga     : " + elevador.getPesoMaximoCarga() + "Kg");
		System.out.println();
		System.out.println("Nº Atual de Pessoas      : " + elevador.getNrAtualPessoas());
		System.out.println("Peso Atual da Carga      : " + elevador.getPesoAtualCarga() + "Kg");
		System.out.println("Valor Seguro Acumulado      : " + elevador.getValorSeguroAcumulado());
		System.out.println("---------------------------");


		
	}
	
}



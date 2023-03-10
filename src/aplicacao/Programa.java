package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Empregado;
import entidades.EmpregadosTercerizados;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número de empregados: ");
		int numero = sc.nextInt();
		List<Empregado> lista = new ArrayList<>();
		for (int i=0; i < numero; i++) {
			System.out.println("Empregado #"+(i+1)+" dados:");
			System.out.println("Terceirizado (s/n)? ");
			sc.nextLine();
			char tercerizado = sc.nextLine().charAt(0);
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Horas: ");
			int horas = sc.nextInt();
			System.out.println("Valor por hora: ");
			double valor = sc.nextDouble();
			if ((tercerizado == 's') || (tercerizado == 'S')) {
				System.out.println("Valor adicional: ");
				Double bonus = sc.nextDouble();
				lista.add(new EmpregadosTercerizados(nome,horas,valor,bonus));
			}
			else {
				lista.add(new Empregado(nome,horas,valor));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Empregado emp : lista) {
			System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.pagamento()));
		}
		sc.close();
	}
}

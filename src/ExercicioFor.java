import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String name;
		int opcao, finalPlaca;

		System.out.println("Digite o seu nome:");
		name = leitor.next();
		System.out.println(name + " utiliza qual tipo de transporte?\n1 - �nibus\n2 - Carro");
		opcao = leitor.nextInt();

		switch (opcao) {
		case 1:
			System.out.println(name + ", infelizmente, o rod�zio n�o se aplica a esse caso.");
			break;
		case 2:
			System.out.println("Qual o d�gito final da placa do seu carro?");
			finalPlaca = leitor.nextInt();

			switch (finalPlaca) {
			case 1:
			case 2:
				System.out.println("O seu rod�zio � na segunda-feira");
				break;
			case 3:
			case 4:
				System.out.println("O seu rod�zio � na ter�a-feira");
				break;
			case 5:
			case 6:
				System.out.println("O seu rod�zio � na quarta-feira");
				break;
			case 7:
			case 8:
				System.out.println("O seu rod�zio � na quinta-feira");
				break;
			case 9:
			case 0:
				System.out.println("O seu rod�zio � na sexta-feira");
				break;
			}

			break;

		}

		leitor.close();

	}

}

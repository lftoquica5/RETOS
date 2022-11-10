package retos;

import java.util.Scanner;

public class reto2 {

	//* El centro de salud Famisalud,
	public static void main(String[] args) {
		Scanner Famisalud = new Scanner(System.in);
		int meses, kilos;

		System.out.println("Ingresar el peso del bebé en gramos");
		kilos = Integer.parseInt(Famisalud.nextLine());
		System.out.println("");

		System.out.println("Ingresar los meses del bebé");
		meses = Famisalud.nextInt();

		double dosis = (kilos + 10) / (meses * 10) * 8;
		System.out.printf(" el resultado es: " + dosis + "mm");

		Famisalud.close();
	}

}

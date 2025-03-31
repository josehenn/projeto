package projeto;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class Questao1 {
	public static void main(String[] args) {
		exibirData();
	}

	public static void exibirData() {
		Date data1 = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(data1);
		int hora = cal.get(Calendar.HOUR);
		int minuto = cal.get(Calendar.MINUTE);
		DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);

		// Hoje é quinta-feira, dia 04 de abril de 2024 e agora são 20 horas e 32
		// minutos.
		System.out.println("Hoje é " + dfFull.format(data1) + ", e agora são " + hora + " horas e " + minuto + " minutos.");
	}
}

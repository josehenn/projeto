package projeto;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class Questao2 {
	public static void main(String[] args) {
		contaTempo(04, 01, 2026);
	}

	private static void contaTempo(int dia, int mes, int ano) {
		Date data1 = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(data1);
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		int mesAtual = cal.get(Calendar.MONTH);
		int anoAtual = cal.get(Calendar.YEAR);
		int anosFaltam = ano - anoAtual;
		int mesesFaltam = mes - mesAtual;
		int diasFaltam = dia - diaAtual;
		if (diasFaltam < 0) {
			mesesFaltam--;
			cal.add(Calendar.MONTH, 1);
			diasFaltam += cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		if (mesesFaltam < 0) {
			anosFaltam--;
			mesesFaltam += 12;
		}
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.printf("Faltam %d ano(s), %d mes(es) e %d dia(s) para essa data em %d.\n", anosFaltam, mesesFaltam, diasFaltam, ano);
	}
}

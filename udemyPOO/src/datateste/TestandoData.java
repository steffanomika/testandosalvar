package datateste;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TestandoData {

	public static void main(String[] args) {

	
	// aula 111	
		LocalDate testandoData = LocalDate.now();
		System.out.println(testandoData);

		LocalDateTime testandoHoras = LocalDateTime.now();
		System.out.println(testandoHoras);
		
		// DateTimeFormatter formatando = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// System.out.println("Atualizando = " + formatando.format(testandoData));

		System.out.println("Formatando: " + testandoData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println();

		System.out.println("---------GLOBAL-----------");

		Instant global = Instant.now();
		System.out.println("Antes: " + global);

		DateTimeFormatter transformando = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
				.withZone(ZoneId.systemDefault());
		System.out.println("Novo: " + transformando.format(global));
	}

}

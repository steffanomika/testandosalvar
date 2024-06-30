package praticandoMetodos;

public class Aluno3 {

	String nome;
	double nota1, nota2, nota3;

	public double calculaMedia() {
		return nota1 + nota2 + nota3;
	}

	public double faltaPontos() {
		if (calculaMedia() < 60.0) {
			return 60.0 - calculaMedia();
		} else {
			return 0.0;
		}
	}

}

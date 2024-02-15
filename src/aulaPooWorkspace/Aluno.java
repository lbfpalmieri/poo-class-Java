package aulaPooWorkspace;

public class Aluno extends Pessoa{

	double teste, prova, media;
	
	public double getTeste() {
		return teste;
	}
	public void setTeste(double teste) {
		this.teste = teste;
	}
	public double getProva() {
		return prova;
	}
	public void setProva(double prova) {
		this.prova = prova;
	}
	public double getMedia() {
		return (teste + prova) / 2;
	}
	public void setMedia(double media) {
		this.media = media;
	}
}

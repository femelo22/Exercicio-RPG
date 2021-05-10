package br.com.exercicio;

public class Personagem {
	
	private String classe;

	public static String GUERREIRO = "Guerreiro";
	public static String MAGO = "Mago";
	public static String SACERDOTE = "Sacerdote";
	public static String PALADINO = "Paladino";
	public static String ATIRADOR = "Atirador";
	public static String BARBARO = "Barbaro";
	public static String MERCENARIO = "Mercenario";
	public static String ARCANO = "Arcano";
	public static String LUTADOR = "Lutador";
	public static String CEIFEIRO = "Ceifeiro";
	public static String ESPADACHIM = "Espadachim";
	
	public Personagem(String classe) {
		this.classe = classe;
	}

	public Personagem() {}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
}

package br.com.exercicio;

public class EstiloLuta {
	
	private Personagem personagem;
	
	public static String ARMA_GUERREIRO = "Espada e escudo";
	public static String ARMA_MAGO = "Cajado Mágico";
	public static String ARMA_SACERDOTE = "Cajado de cura";
	public static String ARMA_PALADINO = "Arco e Flecha";
	public static String ARMA_ATIRADOR = "Arma de fogo";
	public static String ARMA_BARBARO = "Machado";
	public static String ARMA_MERCENARIO = "Adagas";
	public static String ARMA_ARCANO = "Espada Duplas";
	public static String ARMA_LUTADOR = "Punho";
	public static String ARMA_CEIFEIRO = "Foice Mágica";
	public static String ARMA_ESPADACHIM = "Katanas";

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	
	
	public String armaPersonagem(Personagem personagem)  {
		
		if (personagem == null) {
			throw new IllegalArgumentException("Personagem não pode ser nulo!");
		}
		
		if(personagem.getClasse().equalsIgnoreCase(Personagem.GUERREIRO)) {
			return ARMA_GUERREIRO;
		} else if(personagem.getClasse().equalsIgnoreCase(Personagem.MAGO)) {
			return ARMA_MAGO;
		} else if(personagem.getClasse().equalsIgnoreCase(Personagem.SACERDOTE)) {
			return ARMA_SACERDOTE;
		} else if (personagem.getClasse().equalsIgnoreCase(Personagem.PALADINO)) {
			return ARMA_PALADINO;
		} else if (personagem.getClasse().equalsIgnoreCase(Personagem.ATIRADOR)) {
			return ARMA_ATIRADOR;
		} else if (personagem.getClasse().equalsIgnoreCase(Personagem.BARBARO)) {
			return ARMA_BARBARO;
		} else if (personagem.getClasse().equalsIgnoreCase(Personagem.MERCENARIO)) {
			return ARMA_MERCENARIO;
		} else if (personagem.getClasse().equalsIgnoreCase(Personagem.ARCANO)) {
			return ARMA_ARCANO;
		} else if (personagem.getClasse().equalsIgnoreCase(Personagem.LUTADOR)) {
			return ARMA_LUTADOR;
		} else if (personagem.getClasse().equalsIgnoreCase(Personagem.CEIFEIRO)) {
			return ARMA_CEIFEIRO;
		} else if (personagem.getClasse().equalsIgnoreCase(Personagem.ESPADACHIM)) {
			return ARMA_ESPADACHIM;
		} else {
			throw new IllegalArgumentException("Personagem inválido!");
		}
	
	}
}

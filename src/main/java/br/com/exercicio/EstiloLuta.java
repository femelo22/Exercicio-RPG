package br.com.exercicio;

public class EstiloLuta {
	
	private Personagem personagem;
	
	public static String ARMA_GUERREIRO = "Espada e escudo";
	public static String ARMA_MAGO = "Mago";
	public static String ARMA_SACERDOTE = "Sacerdote";
	public static String ARMA_PALADINO = "Paladino";
	public static String ARMA_ATIRADOR = "Atirador";
	public static String ARMA_BARBARO = "Barbaro";
	public static String ARMA_MERCENARIO = "Mercenario";
	public static String ARMA_ARCANO = "Arcano";
	public static String ARMA_LUTADOR = "Lutador";
	public static String ARMA_CEIFEIRO = "Ceifeiro";
	public static String ARMA_ESPADACHIM = "Espadachim";

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	
	
	public String armaPersonagem() throws Exception {
		
		if (personagem == null) {
			throw new Exception("Personagem não pode ser nulo!");
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

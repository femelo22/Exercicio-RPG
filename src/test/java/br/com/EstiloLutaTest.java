package br.com;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import br.com.exercicio.EstiloLuta;
import br.com.exercicio.Personagem;
import junit.framework.TestCase;


@SpringBootTest
public class EstiloLutaTest extends TestCase{
	
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
	public static String CLASSE_INVALIDA = "PANDA";

	private Personagem personagem = new Personagem();
	
	
	public void setUp() {
		personagem = new Personagem();
	}

	
	@Test
	public void testClasseGuerreiro() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(GUERREIRO);
        assertEquals(ARMA_GUERREIRO, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClasseMago() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(MAGO);
        assertEquals(ARMA_MAGO, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClasseSacerdote() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(SACERDOTE);
        assertEquals(ARMA_SACERDOTE, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClassePaladino() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(PALADINO);
        assertEquals(ARMA_PALADINO, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClasseAtirador() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(ATIRADOR);
        assertEquals(ARMA_ATIRADOR, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClasseBarbaro() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(BARBARO);
        assertEquals(ARMA_BARBARO, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClasseMercenario() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(MERCENARIO);
        assertEquals(ARMA_MERCENARIO, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClasseArcano() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(ARCANO);
        assertEquals(ARMA_ARCANO, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClasseLutador() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(LUTADOR);
        assertEquals(ARMA_LUTADOR, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClasseCeifeiro() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(CEIFEIRO);
        assertEquals(ARMA_CEIFEIRO, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClasseEspadachim() {
		
		EstiloLuta estiloLuta = new EstiloLuta();
		personagem.setClasse(ESPADACHIM);
        assertEquals(ARMA_ESPADACHIM, estiloLuta.armaPersonagem(personagem));
		
	}
	
	@Test
	public void testClasse_Nula() {
		
		try{
			EstiloLuta estiloLuta = new EstiloLuta();
			personagem = null;
			estiloLuta.armaPersonagem(personagem);
			fail();
	        
		} catch (IllegalArgumentException e) {
	        assertEquals("Personagem não pode ser nulo!", e.getMessage());
		}
		
	}
	
	@Test
	public void testClasse_Invalida() {
		
		try{
			EstiloLuta estiloLuta = new EstiloLuta();
			personagem.setClasse(CLASSE_INVALIDA);
			estiloLuta.armaPersonagem(personagem);
			fail();
	        
		} catch (IllegalArgumentException e) {
	        assertEquals("Personagem inválido!", e.getMessage());
		}
		
	}
	
	@Test
	public void testClasse_Vazia() {
		
		try{
			EstiloLuta estiloLuta = new EstiloLuta();
			personagem.setClasse("");
			estiloLuta.armaPersonagem(personagem);
			fail();
	        
		} catch (IllegalArgumentException e) {
	        assertEquals("Personagem inválido!", e.getMessage());
		}
		
	}
	
	

}

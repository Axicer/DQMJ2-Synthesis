package fr.axicer.dqmjsynthesis.model.monster;

import fr.axicer.dqmjsynthesis.model.Family;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.synthesis.ParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.Synthesis;

public enum Demons implements Monster{

	VAMPIVOL(Rank.F),
	BISEBAVE(Rank.F),
	CLINDOEIL(Rank.F),
	GLANCLAN(Rank.F),
	BIGLOEIL(Rank.F),
	
	GOUROU_BOUH(Rank.E),
	FACE_DE_CRAPAUD(Rank.E),
	CHASSEUR_DE_TETE(Rank.E),
	SORCIMOL(Rank.E),
	DIABLOTIN(Rank.E),
	
	DIABLE_DANSANT(Rank.D),
	DEMON_DU_DESSERT(Rank.D),
	DEMON_INFERIEUR(Rank.D),
	NAKUNOEIL(Rank.D),
	SILVAPITHEQUE(Rank.D),
	CYCLOMAGE(Rank.D),
	
	GLANCLAN_X(Rank.C),
	CHARPIRANHA(Rank.C),
	GRAND_VAMPIVOL(Rank.C),
	GARDE_OCTAVIEN(Rank.C),
	CHAPERONDE(Rank.C),
	CIMETUEUR(Rank.C),
	GRIFFON(Rank.C),
	
	ARMURE_FATALE(Rank.B),
	PRETRE_DAMNE(Rank.B),
	ARCHIDEMON(Rank.B),
	CHEF_TROLL(Rank.B),
	JAMIRUS(Rank.B),
	
	SHIVATTAK(Rank.A),
	DHURIAN(Rank.A),
	BATAGLAN(Rank.A),
	GRACOS(Rank.A),
	MORTELLA(Rank.A),
	GEMON(Rank.A),
	BELIAL(Rank.A),
	PAZUZU(Rank.A),
	
	CHAPERON_VERT(Rank.S),
	MEURTOR(Rank.S, new ParentSynthesis(Betes.NHE,Betes.BASTONNIER)),
	KAOS(Rank.S, new ParentSynthesis(Zombies.TARANTUEUR,Demons.DHURIAN)),
	BARAMOS(Rank.S, new ParentSynthesis(Demons.KAOS,Demons.GEMON)),
	MALROTH(Rank.S, new ParentSynthesis(Demons.KAOS,Naturels.KHALAMAR)),
	GLANCLAN_XY(Rank.S, new ParentSynthesis(Demons.GLANCLAN_X,Demons.GLANCLAN_X)),
	
	PRINCE_DE_VOLEURS(Rank.X),
	NOKTURNUS(Rank.X, new ParentSynthesis(Demons.DHURIAN,Zombies.DR_REBELOTE));
	
	private Rank rank;
	private Synthesis synthesis;
	
	private Demons(Rank rank) {
		this(rank, null);
	}
	
	private Demons(Rank rank, Synthesis synthesis) {
		this.rank = rank;
		this.synthesis = synthesis;
	}
	
	@Override
	public String getName() {
		return name();
	}

	@Override
	public Family getFamily() {
		return Family.DEMON;
	}

	@Override
	public Rank getRank() {
		return rank;
	}

	@Override
	public Synthesis getSynthesis() {
		return synthesis;
	}
	
	public static void init() {
		MEURTOR.synthesis = new ParentSynthesis(Betes.NHE,Betes.BASTONNIER);
		KAOS.synthesis = new ParentSynthesis(Zombies.TARANTUEUR,Demons.DHURIAN);
		BARAMOS.synthesis = new ParentSynthesis(Demons.KAOS,Demons.GEMON);
		MALROTH.synthesis = new ParentSynthesis(Demons.KAOS,Naturels.KHALAMAR);
		GLANCLAN_XY.synthesis = new ParentSynthesis(Demons.GLANCLAN_X,Demons.GLANCLAN_X);
		
		NOKTURNUS.synthesis = new ParentSynthesis(Demons.DHURIAN,Zombies.DR_REBELOTE);
	}
}

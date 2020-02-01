package fr.axicer.dqmjsynthesis.model.monster;

import fr.axicer.dqmjsynthesis.model.Family;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.synthesis.GrandParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.ParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.Synthesis;

public enum Incarnus implements Monster{
	
	NIMZO(Rank.X),
	ZOMA(Rank.X),
	MORTAMOR(Rank.X),
	ORGODEMIR(Rank.X),
	RAPHTORNE(Rank.X),
	RAPHTORNE_II(Rank.X),
	
	APIK(Rank.MAX),
	AKOEUR(Rank.MAX),
	ATREFLE(Rank.MAX),
	AKARO(Rank.MAX),
	ATOUPIK(Rank.MAX),
	ATOUKOEUR(Rank.MAX),
	ATOUTREFLE(Rank.MAX),
	ATOUKARO(Rank.MAX),
	AS_DE_PIQUE(Rank.MAX),
	JOKER(Rank.MAX),
	LIONYX(Rank.MAX),
	RIGOR_MORTEX(Rank.MAX);
	
	private Rank rank;
	private Synthesis synthesis;
	
	private Incarnus(Rank Rank) {
		this(Rank, null);
	}
	
	private Incarnus(Rank Rank, Synthesis synthesis) {
		this.rank = Rank;
		this.synthesis = synthesis;
	}
	
	@Override
	public String getName() {
		return name();
	}

	@Override
	public Family getFamily() {
		return Family.INCARNI;
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
		NIMZO.synthesis = new ParentSynthesis(Demons.BARAMOS,Naturels.KHALAMAR);
		ZOMA.synthesis = new ParentSynthesis(Demons.MALROTH,Zombies.CAPITAINE_CROW);
		MORTAMOR.synthesis = new ParentSynthesis(Incarnus.NIMZO,Matieres.ESTARK);
		ORGODEMIR.synthesis = new ParentSynthesis(Incarnus.MORTAMOR,Dragons.DRAGON_D_ALBATRE);
		RAPHTORNE.synthesis = new ParentSynthesis(Betes.DHOULMAGUS,Incarnus.NIMZO);
		RAPHTORNE_II.synthesis = new ParentSynthesis(Incarnus.RAPHTORNE,Incarnus.ZOMA);
		
		AS_DE_PIQUE.synthesis = new ParentSynthesis(Incarnus.ATOUPIK,Naturels.LEOPOLD);
		JOKER.synthesis = new ParentSynthesis(Incarnus.ATOUPIK,Naturels.GRAND_OISEAU_CELESTE);
		LIONYX.synthesis = new GrandParentSynthesis(Incarnus.JOKER,Dragons.HYDRAGON,Betes.MISTER_TAUPE,Betes.LORD_LIONEL);
		RIGOR_MORTEX.synthesis = new ParentSynthesis(Incarnus.LIONYX,Dragons.DRAGON_DU_ZENITH);
	}
}

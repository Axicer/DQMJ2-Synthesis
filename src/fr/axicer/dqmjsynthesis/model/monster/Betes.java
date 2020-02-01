package fr.axicer.dqmjsynthesis.model.monster;

import fr.axicer.dqmjsynthesis.model.Family;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.synthesis.GrandParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.ParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.Synthesis;

public enum Betes implements Monster{

	ORNITHOX(Rank.F),
	PATAUPE(Rank.F),
	FAUNE(Rank.F),
	MARTELEUR(Rank.F),
	
	ALTERAPACE(Rank.E),
	YETI_YETU(Rank.E),
	BELICORNE(Rank.E),
	RAPAGLACE(Rank.E),
	CANIDEMON(Rank.E),
	
	SANGUINI_VACHE(Rank.D),
	EMPEREUR_NOCTURNE(Rank.D),
	MOUSQUETUEUR(Rank.D),
	ORQUE(Rank.D),
	TIGRFF(Rank.D),
	MARTEBRUN(Rank.D),
	
	ARCHER_VERT(Rank.C),
	GARGOUILLE(Rank.C),
	SIRENIEN(Rank.C),
	CARNIGORE(Rank.C),
	MONSTRO_MASQUE(Rank.C),
	MENO_MACHO(Rank.C),
	AILEOPARD(Rank.C),
	
	SANGUINI_VACHE_X(Rank.B),
	AIGLEFEU(Rank.B),
	COCORICOQ(Rank.B),
	SANGUINI_ROSE(Rank.B),
	TAUPE_TOC(Rank.B),
	NHE(Rank.B),
	
	GEANT(Rank.A),
	ENCORNEUR(Rank.A),
	SANGLIOGRE(Rank.A),
	BELZEBIK(Rank.A),
	LORD_LIONEL(Rank.A),
	DORSALAM(Rank.A),
	
	ATLAS(Rank.S),
	BASTONNIER(Rank.S),
	MISTER_TAUPE(Rank.S),
	DHOULMAGUS(Rank.S),
	SANGUINI_VACHE_XY(Rank.S),
	
	DOUDOULEUR(Rank.X),
	ADVERSO(Rank.X);
	
	private Rank rank;
	private Synthesis synthesis;
	
	private Betes(Rank rank) {
		this.rank = rank;
	}
	
	@Override
	public String getName() {
		return name();
	}

	@Override
	public Family getFamily() {
		return Family.BETE;
	}

	@Override
	public Rank getRank() {
		return rank;
	}

	@Override
	public Synthesis getSynthesis() {
		return synthesis;
	}

	/**
	 * @param synthesis the synthesis to set
	 */
	public void setSynthesis(Synthesis synthesis) {
		this.synthesis = synthesis;
	}
	
	public static void init() {
		ATLAS.synthesis = new ParentSynthesis(Betes.GEANT,Betes.BELZEBIK);
		BASTONNIER.synthesis = new ParentSynthesis(Demons.CHEF_TROLL,Demons.PAZUZU);
		MISTER_TAUPE.synthesis = new GrandParentSynthesis(Betes.PATAUPE,Betes.PATAUPE,Betes.BASTONNIER,Betes.BASTONNIER);
		DHOULMAGUS.synthesis = new ParentSynthesis(Dragons.DRAGON_D_ALBATRE,Matieres.PSARO);
		SANGUINI_VACHE_XY.synthesis = new ParentSynthesis(Betes.SANGUINI_VACHE_X,Betes.SANGUINI_VACHE_X);
	}
}

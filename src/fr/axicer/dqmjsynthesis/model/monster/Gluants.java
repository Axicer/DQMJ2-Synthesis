package fr.axicer.dqmjsynthesis.model.monster;

import fr.axicer.dqmjsynthesis.model.Family;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.synthesis.GrandParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.ParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.Synthesis;

public enum Gluants implements Monster{
	
	GLUANT(Rank.F),
	GROEUF(Rank.F),
	FEUILLU(Rank.F),
	GLUAMBULLE(Rank.F),
	MEDIGLUANT(Rank.F),
	
	GLUANTE(Rank.E),
	GLUANCORNU(Rank.E),
	GLUANT_DE_CRIN(Rank.E),
	GLUANBULOT(Rank.E),
	GLUANT_MOUCHETE(Rank.E),
	
	ESCARGLUANT(Rank.D),
	DANGELEUX(Rank.D),
	MONTE_GLUANT(Rank.D),
	GLUANT_DE_METAL(Rank.D),
	SLURPIERRE(Rank.D),
	GLUANGELIQUE(Rank.D),
	GIGLUANT(Rank.D),
	MONTE_GLUANT_DE_METAL(Rank.D),
	GIGLUANTE(Rank.D),
	
	GLUANT_X(Rank.C),
	GLUANDRAGON(Rank.C),
	AGGLUANTIN(Rank.C),
	ROI_GLUANT(Rank.C),
	GUERIGLUANT(Rank.C),
	CYBERGLUANT(Rank.C),
	GLUANT_DE_MERCURE(Rank.C),
	
	SORCIGLU(Rank.B),
	VAMPIGLUANT(Rank.B),
	MONSTROEUF(Rank.B),
	MONTE_VAMPIGLUANT(Rank.B),
	FEUILLUBERLU(Rank.B),
	ROI_GUERIGLUANT(Rank.B),
	
	ROI_GLUANBULLE(Rank.A),
	GLUANPEREUR_DE_METAL(Rank.A),
	SUPERSLURP(Rank.A),
	
	ROI_GLUANT_DE_METAL(Rank.S),
	MONTE_GLUANCIEN(Rank.S),
	NEMESLURP(Rank.S),
	GLUANT_DE_TENERIUM(Rank.S),
	GLUANCIEN(Rank.S),
	GLUANT_XY(Rank.S),
	
	GLUANT_D_OR(Rank.X),

	CANZER(Rank.S);
	
	private Rank rank;
	private Synthesis synthesis;
	
	private Gluants(Rank rank) {
		this(rank, null);
	}
	private Gluants(Rank rank, Synthesis synthesis) {
		this.rank = rank;
		this.synthesis = synthesis;
	}

	@Override
	public String getName() {
		return name();
	}

	@Override
	public Family getFamily() {
		return Family.GLUANT;
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
		GLUANTE.synthesis = new ParentSynthesis(Gluants.MEDIGLUANT, Zombies.MAIN_DE_BOUE);
		GLUANCORNU.synthesis = new ParentSynthesis(Gluants.GLUANT, Dragons.KOMODOR);
		GLUANT_DE_CRIN.synthesis = new ParentSynthesis(Gluants.GLUANCORNU, Zombies.MALLUSQUE);
		GLUANBULOT.synthesis = new ParentSynthesis(Gluants.GLUANT_DE_CRIN, Zombies.MOMIGNON);
		GLUANT_MOUCHETE.synthesis = new ParentSynthesis(Gluants.GLUANBULOT, Demons.CHASSEUR_DE_TETE);
		
		ESCARGLUANT.synthesis = new ParentSynthesis(Gluants.GLUANT_MOUCHETE, Demons.SORCIMOL);
		DANGELEUX.synthesis = new ParentSynthesis(Gluants.ESCARGLUANT, Zombies.BOTTOEIL);
		MONTE_GLUANT.synthesis = new ParentSynthesis(Gluants.DANGELEUX, Zombies.CHIEN_DE_L_ENFER);
		SLURPIERRE.synthesis = new ParentSynthesis(Gluants.MONTE_GLUANT, Zombies.MOUCHOMME);
		GLUANGELIQUE.synthesis = new ParentSynthesis(Gluants.SLURPIERRE, Zombies.CERCOEIL);
		GIGLUANT.synthesis = new ParentSynthesis(Gluants.GLUANGELIQUE, Zombies.SQUELETTE);
		MONTE_GLUANT_DE_METAL.synthesis = new ParentSynthesis(Gluants.GIGLUANT, Zombies.ESCRIMEUR_FANTOME);
		GIGLUANTE.synthesis = new ParentSynthesis(Gluants.GIGLUANT, Gluants.GLUANTE);
		
		GLUANT_X.synthesis = new ParentSynthesis(Gluants.GLUANT, Gluants.GLUANT);
		GLUANDRAGON.synthesis = new ParentSynthesis(Gluants.MONTE_GLUANT_DE_METAL, Demons.CYCLOMAGE);
		AGGLUANTIN.synthesis = new ParentSynthesis(Gluants.GLUANDRAGON, Zombies.BOA_CONSTRICTOS);
		ROI_GLUANT.synthesis = new ParentSynthesis(Gluants.GIGLUANT, Gluants.GIGLUANT);
		GUERIGLUANT.synthesis = new ParentSynthesis(Gluants.MEDIGLUANT, Gluants.GIGLUANTE);
		CYBERGLUANT.synthesis = new ParentSynthesis(Gluants.GUERIGLUANT, Zombies.ECOEIL);
		GLUANT_DE_MERCURE.synthesis = new ParentSynthesis(Gluants.GLUANT_DE_METAL, Gluants.GLUANT_DE_METAL);
		
		SORCIGLU.synthesis = new ParentSynthesis(Gluants.CYBERGLUANT, Demons.CIMETUEUR);
		VAMPIGLUANT.synthesis = new ParentSynthesis(Gluants.SORCIGLU, Demons.GRIFFON);
		MONSTROEUF.synthesis = new ParentSynthesis(Gluants.VAMPIGLUANT, Zombies.SOLDAT_SQUELETTE);
		MONTE_VAMPIGLUANT.synthesis = new ParentSynthesis(Gluants.MONSTROEUF, Zombies.GROUILLAME);
		ROI_GUERIGLUANT.synthesis = new ParentSynthesis(Gluants.ROI_GLUANT, Gluants.ROI_GLUANT);
		
		ROI_GLUANBULLE.synthesis = new ParentSynthesis(Gluants.ROI_GUERIGLUANT, Zombies.SEIGNEUR_MALHEUR);
		GLUANPEREUR_DE_METAL.synthesis = new GrandParentSynthesis(Gluants.GLUANT_DE_MERCURE, Gluants.GLUANT_DE_METAL, Gluants.GLUANT_DE_METAL, Gluants.MONTE_GLUANT_DE_METAL);
		
		ROI_GLUANT_DE_METAL.synthesis = new GrandParentSynthesis(Gluants.GLUANT_DE_MERCURE, Gluants.GLUANT_DE_MERCURE, Gluants.GLUANT_DE_MERCURE, Gluants.GLUANT_DE_MERCURE);
		MONTE_GLUANCIEN.synthesis = new ParentSynthesis(Gluants.GLUANPEREUR_DE_METAL, Gluants.GLUANPEREUR_DE_METAL);
		GLUANT_DE_TENERIUM.synthesis = new GrandParentSynthesis(Gluants.GIGLUANTE, Gluants.GIGLUANTE, Gluants.ROI_GUERIGLUANT, Gluants.ROI_GLUANT_DE_METAL);
		GLUANCIEN.synthesis = new GrandParentSynthesis(Gluants.GLUANPEREUR_DE_METAL, Gluants.ROI_GLUANBULLE, Gluants.ROI_GLUANT, Gluants.ROI_GLUANT_DE_METAL);
		GLUANT_XY.synthesis = new ParentSynthesis(Gluants.GLUANT_X, Gluants.GLUANT_X);
		CANZER.synthesis = new GrandParentSynthesis(Gluants.GLUANT_D_OR, Gluants.GLUANT, Matieres.RUINE, Naturels.CRABARBARE);
		
		GLUANT_D_OR.synthesis = new GrandParentSynthesis(Matieres.PHIX, Matieres.PHIX, Gluants.GLUANCIEN, Gluants.GLUANCIEN);

	}
	
	@Override
	public String toString() {
		return name()+" ("+rank+")";
	}
}

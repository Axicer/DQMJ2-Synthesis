package fr.axicer.dqmjsynthesis.model.monster;

import fr.axicer.dqmjsynthesis.model.Family;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.synthesis.GrandParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.ParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.Synthesis;

public enum Zombies implements Monster{
	
	FANTOME(Rank.F),
	SOUCHE_LOUCHE(Rank.F),
	CHAMPIGOULE(Rank.F),
	MAIN_DE_BOUE(Rank.F),
	FEU_FOLLET(Rank.F),
	
	MALLUSQUE(Rank.E),
	MOMIGNON(Rank.E),
	CAVALE_DEMON(Rank.E),
	TRAUMALLUSQUE(Rank.E),
	BOTTOEIL(Rank.E),
	
	CHIEN_DE_L_ENFER(Rank.D),
	MOUCHOMME(Rank.D),
	CERCOEIL(Rank.D),
	SQUELETTE(Rank.D),
	ESCRIMEUR_FANTOME(Rank.D),
	
	BOA_CONSTRICTOS(Rank.C),
	MORT_VIVANT(Rank.C),
	ARMURE_ERRANTE(Rank.C),
	ECOEIL(Rank.C),
	
	SQUELETTE_X(Rank.B),
	EPEISTE_FANTOME(Rank.B),
	SOLDAT_SQUELETTE(Rank.B),
	CAVALIER_FANTOME(Rank.B),
	GROUILLAME(Rank.B),
	CAPITENACE(Rank.B),
	SEIGNEUR_MALHEUR(Rank.B),
	
	HURLHERBE(Rank.A),
	EXORSUS(Rank.A),
	SEIGNEUR_TERREUR(Rank.A),
	AME_EN_PEINE(Rank.A),
	ROSEGARDE(Rank.A),
	BARON_D_OS(Rank.A),
	TARANTUEUR(Rank.A),
	
	DECAPITETE(Rank.S),
	ROI_MAUDIT(Rank.S),
	CAPITAINE_CROW(Rank.S),
	SQUELETTE_XY(Rank.S),
	
	DR_REBELOTE(Rank.X);
	
	private Rank rank;
	private Synthesis synthesis;
	
	private Zombies(Rank rank) {
		this(rank, null);
	}
	
	private Zombies(Rank rank, Synthesis synthesis) {
		this.rank = rank;
		this.synthesis = synthesis;
	}
	
	@Override
	public String getName() {
		return name();
	}

	@Override
	public Family getFamily() {
		return Family.ZOMBIE;
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
		DECAPITETE.synthesis = new ParentSynthesis(Zombies.BARON_D_OS,Zombies.ESCRIMEUR_FANTOME);
		ROI_MAUDIT.synthesis = new ParentSynthesis(Zombies.AME_EN_PEINE,Gluants.ROI_GLUANT);
		SQUELETTE_XY.synthesis = new ParentSynthesis(Zombies.SQUELETTE_X,Zombies.SQUELETTE_X);
		
		DR_REBELOTE.synthesis = new GrandParentSynthesis(Gluants.GLUANT_DE_TENERIUM,Incarnus.RAPHTORNE_II,Incarnus.ORGODEMIR,Zombies.CAPITAINE_CROW);
	}
	
	@Override
	public String toString() {
		return name()+" ("+rank+")";
	}
}

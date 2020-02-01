package fr.axicer.dqmjsynthesis.model.monster;

import fr.axicer.dqmjsynthesis.model.Family;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.synthesis.GrandParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.ParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.Synthesis;

public enum Naturels implements Monster{

	AGRESSAIM(Rank.F),
	PIPERADUO(Rank.F),
	SCARAPINCE(Rank.F),
	FURIBOMBYX(Rank.F),
	FRELON_DE_L_ENFER(Rank.F),
	GOURDECHAINE(Rank.F),
	
	SMILODON_DE_LAIT(Rank.E),
	CHIMERE(Rank.E),
	TAURAPACE(Rank.E),
	SANGLIMER(Rank.E),
	CHAGRIFFEUR(Rank.E),
	LIEVRECORNE(Rank.E),
	
	PUCE_TULE(Rank.D),
	CRABARBARE(Rank.D),
	SCORPION(Rank.D),
	MALINCONGRE(Rank.D),
	KHALAMARMOT(Rank.D),
	VERCULE(Rank.D),
	
	CHIMERE_X(Rank.C),
	CONDOR_INFERNAL(Rank.C),
	SMILODON(Rank.C),
	TRONC_BINE(Rank.C),
	REQUINDRUPEDE(Rank.C),
	BARRACUDA(Rank.C),
	ECREVICIEUX(Rank.C),
	
	SCARABLINDE(Rank.B),
	PHALENE_GEANTE(Rank.B),
	GORERILLE(Rank.B),
	CORBARBAC(Rank.B),
	
	ALIGATUEUR(Rank.A),
	EPINEA(Rank.A),
	RASE_MAREE(Rank.A),
	FAUCONDOR(Rank.A),
	DANGEROSE(Rank.A),
	EMPYREA(Rank.A),
	
	SCARABRUTE(Rank.S),
	CALAMAROI(Rank.S),
	KHALAMAR(Rank.S),
	CHIMERE_XY(Rank.S),
	
	LEOPOLD(Rank.X),
	NUMEN(Rank.X),
	TRODE(Rank.X),
	GRAND_OISEAU_CELESTE(Rank.X);
	
	private Rank rank;
	private Synthesis synthesis;
	
	private Naturels(Rank rank) {
		this(rank, null);
	}
	
	private Naturels(Rank rank, Synthesis synthesis) {
		this.rank = rank;
		this.synthesis = synthesis;
	}
	
	@Override
	public String getName() {
		return name();
	}

	@Override
	public Family getFamily() {
		return Family.NATURE;
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
		SCARABRUTE.synthesis = new ParentSynthesis(Naturels.SCARABLINDE,Gluants.ROI_GLUANT_DE_METAL);
		CALAMAROI.synthesis = new ParentSynthesis(Naturels.KHALAMARMOT,Betes.BASTONNIER);
		KHALAMAR.synthesis = new GrandParentSynthesis(Naturels.KHALAMARMOT,Naturels.KHALAMARMOT,Naturels.CALAMAROI,Naturels.CALAMAROI);
		CHIMERE_XY.synthesis = new ParentSynthesis(Naturels.CHIMERE_X,Naturels.CHIMERE_X);
		
		LEOPOLD.synthesis = new GrandParentSynthesis(Betes.DHOULMAGUS,Dragons.XENLON,Incarnus.NIMZO,Betes.CANIDEMON);
		TRODE.synthesis = new GrandParentSynthesis(Demons.NOKTURNUS,Dragons.XENLON,Gluants.GLUANT_D_OR,Gluants.CANZER);
		GRAND_OISEAU_CELESTE.synthesis = new ParentSynthesis(Dragons.SEIGNEUR_DRAGOVIEN, Naturels.EMPYREA);
	}
}

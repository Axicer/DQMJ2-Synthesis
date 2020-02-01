package fr.axicer.dqmjsynthesis.model.monster;

import fr.axicer.dqmjsynthesis.model.Family;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.synthesis.GrandParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.ParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.Synthesis;

public enum Dragons implements Monster{

	KOMODOR(Rank.F),
	LEZARD_ARGON(Rank.F),
	FRI_FRI(Rank.F),
	DRAGRONCE(Rank.F),
	
	SAINT_BERNEUR(Rank.E),
	SERPOLAIRE(Rank.E),
	DRACORNE(Rank.E),
	EPIRONCE(Rank.E),
	
	DRAGON_VERT(Rank.D),
	DRAGOS(Rank.D),
	DRAGONFLE(Rank.D),
	BUTANOSAURE(Rank.D),
	AQUASAURE(Rank.D),
	DRAGON_ROUGE(Rank.D),
	
	HACHOSAURE(Rank.C),
	HIPPOCAMPIK(Rank.C),
	DRAGON_MARIN(Rank.C),
	GAZOSAURE(Rank.C),
	DRAGON_DE_METAL(Rank.C),
	
	DRAGON_VERT_X(Rank.B),
	GRAND_LEZARD_ARGON(Rank.B),
	ABYSSAURE(Rank.B),
	TYRANTOSAURE(Rank.B),
	SERPENLAIR(Rank.B),
	MEGALODON(Rank.B),
	FROU_FROU(Rank.B),
	DRACULARGE(Rank.B),
	
	GRAND_DRAGON(Rank.A),
	DUELLIS(Rank.A),
	MECADRAGON(Rank.A),
	
	DRAGON_NOIR(Rank.S),
	DRACULARD(Rank.S),
	DRAGON_D_ALBATRE(Rank.S),
	LORDRACO(Rank.S),
	DRAGON_VERT_XY(Rank.S),
	
	LORDRAGON(Rank.X),
	HYDRAGON(Rank.X),
	BARBARUS(Rank.X),
	XENLON(Rank.X),
	SEIGNEUR_DRAGOVIEN(Rank.X),
	GRIZIUS(Rank.X),
	
	DRAGON_DU_ZENITH(Rank.MAX);

	private Rank rank;
	private Synthesis synthesis;
	
	private Dragons(Rank rank) {
		this(rank, null);
	}
	
	private Dragons(Rank rank, Synthesis synthesis) {
		this.rank = rank;
		this.synthesis = synthesis;
	}
	
	@Override
	public String getName() {
		return name();
	}

	@Override
	public Family getFamily() {
		return Family.DRAGON;
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
		GRAND_LEZARD_ARGON.synthesis = new GrandParentSynthesis(Dragons.LEZARD_ARGON,Dragons.LEZARD_ARGON,Dragons.LEZARD_ARGON,Dragons.LEZARD_ARGON);
		FROU_FROU.synthesis = new GrandParentSynthesis(Dragons.FRI_FRI,Dragons.FRI_FRI,Dragons.FRI_FRI,Dragons.GRAND_LEZARD_ARGON);
		
		GRAND_DRAGON.synthesis = new ParentSynthesis(Dragons.DRACULARGE,Zombies.SEIGNEUR_MALHEUR);
		DUELLIS.synthesis = new ParentSynthesis(Naturels.RASE_MAREE,Betes.DORSALAM);
		MECADRAGON.synthesis = new ParentSynthesis(Dragons.DRAGON_DE_METAL,Dragons.GRAND_DRAGON);
		
		DRAGON_NOIR.synthesis = new ParentSynthesis(Dragons.GRAND_DRAGON,Zombies.BARON_D_OS);
		DRACULARD.synthesis = new ParentSynthesis(Dragons.DRACULARGE,Betes.ATLAS);
		DRAGON_D_ALBATRE.synthesis = new ParentSynthesis(Dragons.MECADRAGON,Dragons.DRACULARGE);
		LORDRACO.synthesis = new ParentSynthesis(Dragons.GRAND_DRAGON,Demons.SHIVATTAK);
		DRAGON_VERT_XY.synthesis = new ParentSynthesis(Dragons.DRAGON_VERT_X,Dragons.DRAGON_VERT_X);
		
		LORDRAGON.synthesis = new GrandParentSynthesis(Dragons.LORDRACO,Dragons.DRAGON_D_ALBATRE,Gluants.GLUANT_D_OR, Zombies.CAPITAINE_CROW);
		HYDRAGON.synthesis = new GrandParentSynthesis(Naturels.VERCULE,Betes.AILEOPARD,Betes.NHE,Naturels.EMPYREA);
		XENLON.synthesis = new GrandParentSynthesis(Dragons.SERPOLAIRE,Dragons.SERPENLAIR,Dragons.HYDRAGON,Dragons.DRAGON_D_ALBATRE);
		GRIZIUS.synthesis = new ParentSynthesis(Dragons.BARBARUS,Dragons.SEIGNEUR_DRAGOVIEN);
		
		DRAGON_DU_ZENITH.synthesis = new GrandParentSynthesis(Demons.NOKTURNUS,Dragons.XENLON,Dragons.LORDRACO,Matieres.SAGITAURE);
	}
	
	@Override
	public String toString() {
		return name()+" ("+rank+")";
	}
}

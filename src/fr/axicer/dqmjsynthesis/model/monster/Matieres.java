package fr.axicer.dqmjsynthesis.model.monster;

import fr.axicer.dqmjsynthesis.model.Family;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.synthesis.GrandParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.ParentSynthesis;
import fr.axicer.dqmjsynthesis.model.synthesis.Synthesis;

public enum Matieres implements Monster{

	MARANSAC(Rank.F),
	PANTIN_DE_BOUE(Rank.F),
	TRISTECIRE(Rank.F),
	BRULEGEL(Rank.F),
	SPITNIK(Rank.F),
	
	GRIMASQUE(Rank.E),
	ROCHEXPLOSIF(Rank.E),
	BRULEFLAMME(Rank.E),
	DINGO_DONG(Rank.E),
	SACATRESOR(Rank.E),
	
	CANNIBOITE(Rank.D),
	OMBRE(Rank.D),
	MUTANCRE(Rank.D),
	GOLEM_D_OR(Rank.D),
	ROUAGE_GORGE(Rank.D),
	GLAGLATOR(Rank.D),
	
	SACATRESOR_X(Rank.C),
	MARIONNETTISTE(Rank.C),
	ROYALGUE(Rank.C),
	LAMPFEROCE(Rank.C),
	MECACHASSEUR(Rank.C),
	GOLEM(Rank.C),
	
	MAGMASSE(Rank.B),
	GON(Rank.B),
	IMITAPEUR(Rank.B),
	
	STATUE_VIVANTE(Rank.A),
	MACHINE_A_TUER(Rank.A),
	PHIX(Rank.A),
	DIS(Rank.A),
	SAL(Rank.A),
	MI(Rank.A),
	TYPHONIA(Rank.A),
	
	BOITE_A_PIEGE(Rank.S),
	MACHINE_A_EXTERMINER(Rank.S),
	SALMIGONDIS(Rank.S),
	RUINE(Rank.S),
	SACATRESOR_XY(Rank.S),
	
	PSARO(Rank.X),
	TRAUMINATOR(Rank.X),
	SAGITAURE(Rank.X),
	ESTARK(Rank.X);
	
	private Rank rank;
	private Synthesis synthesis;
	
	private Matieres(Rank rank) {
		this(rank, null);
	}
	
	private Matieres(Rank rank, Synthesis synthesis) {
		this.rank = rank;
		this.synthesis = synthesis;
	}
	
	@Override
	public String getName() {
		return name();
	}

	@Override
	public Family getFamily() {
		return Family.MATERIEL;
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
		BOITE_A_PIEGE.synthesis = new GrandParentSynthesis(Matieres.IMITAPEUR,Matieres.IMITAPEUR,Matieres.CANNIBOITE,Gluants.GLUANPEREUR_DE_METAL);
		MACHINE_A_EXTERMINER.synthesis = new GrandParentSynthesis(Matieres.MACHINE_A_TUER,Matieres.MACHINE_A_TUER,Matieres.PHIX,Matieres.PHIX);
		SALMIGONDIS.synthesis = new GrandParentSynthesis(Matieres.SAL,Matieres.MI,Matieres.GON,Matieres.DIS);
		RUINE.synthesis = new ParentSynthesis(Matieres.SALMIGONDIS,Matieres.STATUE_VIVANTE);
		SACATRESOR_XY.synthesis = new ParentSynthesis(Matieres.SACATRESOR_X,Matieres.SACATRESOR_X);
		
		PSARO.synthesis = new ParentSynthesis(Zombies.ROSEGARDE,Matieres.RUINE);
		TRAUMINATOR.synthesis = new ParentSynthesis(Matieres.MACHINE_A_EXTERMINER,Matieres.RUINE);
		SAGITAURE.synthesis = new GrandParentSynthesis(Matieres.TRAUMINATOR,Matieres.BOITE_A_PIEGE,Matieres.MACHINE_A_TUER,Matieres.MACHINE_A_EXTERMINER);
		ESTARK.synthesis = new ParentSynthesis(Matieres.PSARO,Betes.LORD_LIONEL);
	}
}

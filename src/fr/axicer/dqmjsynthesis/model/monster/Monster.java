package fr.axicer.dqmjsynthesis.model.monster;

import fr.axicer.dqmjsynthesis.model.Family;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.synthesis.Synthesis;

public interface Monster {
	
	String getName();
	
	Family getFamily();
	
	Rank getRank();
	
	Synthesis getSynthesis();
}

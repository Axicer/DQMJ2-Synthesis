package fr.axicer.dqmjsynthesis.model.synthesis;

import java.util.List;

import fr.axicer.dqmjsynthesis.model.monster.Monster;

public interface Synthesis {

	/**
	 * @return {@link List} of {@link Monster} needed for the synthesis
	 */
	List<Monster> getMonsters();
	
	/**
	 * @return {@link SynthesisType}
	 */
	SynthesisType getSynthesisType();
	
}

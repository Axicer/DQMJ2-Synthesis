package fr.axicer.dqmjsynthesis.model.synthesis;

import java.util.Arrays;
import java.util.List;

import fr.axicer.dqmjsynthesis.model.monster.Monster;

public class ParentSynthesis implements Synthesis{

	private Monster a,b;
	
	public ParentSynthesis(Monster a, Monster b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public List<Monster> getMonsters() {
		return Arrays.asList(a,b);
	}
	
	@Override
	public SynthesisType getSynthesisType() {
		return SynthesisType.PARENT;
	}
	
}

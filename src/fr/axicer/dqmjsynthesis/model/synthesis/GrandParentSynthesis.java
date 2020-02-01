package fr.axicer.dqmjsynthesis.model.synthesis;

import java.util.Arrays;
import java.util.List;

import fr.axicer.dqmjsynthesis.model.monster.Monster;

public class GrandParentSynthesis implements Synthesis{

	private Monster a,b,c,d;
	
	public GrandParentSynthesis(Monster a, Monster b, Monster c, Monster d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	@Override
	public List<Monster> getMonsters() {
		return Arrays.asList(a,b,c,d);
	}

	@Override
	public SynthesisType getSynthesisType() {
		return SynthesisType.GRAND_PARENT;
	}

}

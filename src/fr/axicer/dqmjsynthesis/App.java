package fr.axicer.dqmjsynthesis;

import fr.axicer.dqmjsynthesis.controller.SynthesisCalculator;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.monster.Incarnus;
import fr.axicer.dqmjsynthesis.model.monster.Monsters;

public class App {

	public static void main(String[] args) {
		Monsters.init();
		SynthesisCalculator calc = new SynthesisCalculator(Incarnus.RIGOR_MORTEX, Rank.S);
		System.out.println(calc.countAll());
		System.out.println(calc.generatePath());
	}

}

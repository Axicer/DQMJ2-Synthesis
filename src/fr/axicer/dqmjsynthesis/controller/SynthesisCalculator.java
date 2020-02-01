package fr.axicer.dqmjsynthesis.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.monster.Monster;
import fr.axicer.dqmjsynthesis.model.synthesis.Synthesis;

public class SynthesisCalculator {

	private Monster target;
	private Rank rankTarget;
	
	public SynthesisCalculator(Monster target, Rank rankTarget) {
		this.target = target;
		this.rankTarget = rankTarget;
	}

	public String generatePath() {
		return recPath(target, 0);
	}
	
	private String recPath(Monster monster, int tabAmount) {
		StringBuilder builder = new StringBuilder();
		if(monster != null) {
			for(int i = 0 ; i < tabAmount ; i++) {
				builder.append("\t");
			}
			builder.append(monster.getName()+" ("+monster.getRank()+")\n");
			if(monster.getSynthesis() != null && monster.getRank().isHigherorEqualsThen(rankTarget)) {
				Synthesis s = monster.getSynthesis();
				for(Monster m : s.getMonsters()) {
					builder.append(recPath(m, tabAmount+1));
				}
			}
		}
		return builder.toString();
	}

	/**
	 * @return the target
	 */
	public Monster getTarget() {
		return target;
	}
	
	public Map<Monster, Long> countAll(){
		List<Monster> list = new ArrayList<Monster>();
		recFetchAll(list, target);
		return list.stream().collect(
				Collectors.groupingBy(
						Function.<Monster>identity(),
						Collectors.counting()
				)
		);
	}
	
	private void recFetchAll(List<Monster> list, Monster monster){
		if(monster != null) {
			if(monster.getSynthesis() != null && monster.getRank().isHigherorEqualsThen(rankTarget)) {
				Synthesis s = monster.getSynthesis();
				s.getMonsters().forEach(m -> {
						list.add(m);
						recFetchAll(list, m);
				});
			}
		}
	}
}

package fr.axicer.dqmjsynthesis;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import fr.axicer.dqmjsynthesis.controller.SynthesisCalculator;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.monster.Incarnus;
import fr.axicer.dqmjsynthesis.model.monster.Monsters;

public class App {

	public static void main(String[] args) {
		Monsters.init();
		SynthesisCalculator calc = new SynthesisCalculator(Incarnus.RIGOR_MORTEX, Rank.B);
//		System.out.println(calc.countAll());
//		System.out.println(calc.generatePath());
		
		JFrame frame = new JFrame("test");
		JTree tree = new JTree(calc.toTreeNode());
		frame.add(new JScrollPane(tree));
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

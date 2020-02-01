package fr.axicer.dqmjsynthesis;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import fr.axicer.dqmjsynthesis.controller.SynthesisCalculator;
import fr.axicer.dqmjsynthesis.model.Rank;
import fr.axicer.dqmjsynthesis.model.monster.Incarnus;
import fr.axicer.dqmjsynthesis.model.monster.Monsters;

public class App {

	public static void main(String[] args) {
		Monsters.init();
		SynthesisCalculator calc = new SynthesisCalculator(Incarnus.RIGOR_MORTEX, Rank.MAX);
//		System.out.println(calc.countAll());
//		System.out.println(calc.generatePath());

		JFrame frame = new JFrame("test");
		JTree tree = new JTree(calc.toTreeNode());
		setTreeExpandedState(tree, true);
		
		frame.add(new JScrollPane(tree));
		frame.setSize(400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void setTreeExpandedState(JTree tree, boolean expanded) {
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getModel().getRoot();
		setNodeExpandedState(tree, node, expanded);
	}

	@SuppressWarnings("unchecked")
	public static void setNodeExpandedState(JTree tree, DefaultMutableTreeNode node, boolean expanded) {
		ArrayList<DefaultMutableTreeNode> list = Collections.list(node.children());
		for (DefaultMutableTreeNode treeNode : list) {
			setNodeExpandedState(tree, treeNode, expanded);
		}
		if (!expanded && node.isRoot()) {
			return;
		}
		TreePath path = new TreePath(node.getPath());
		if (expanded) {
			tree.expandPath(path);
		} else {
			tree.collapsePath(path);
		}
	}
}

package fr.axicer.dqmjsynthesis.model;

public enum Rank {
	F(0),
	E(1),
	D(2),
	C(3),
	B(4),
	A(5),
	S(6),
	X(7),
	MAX(8);
	
	private int id;
	
	private Rank(int id) {
		this.id = id;
	}
	
	public boolean isHigherorEqualsThen(Rank rank) {
		return id >= rank.id;
	}
}

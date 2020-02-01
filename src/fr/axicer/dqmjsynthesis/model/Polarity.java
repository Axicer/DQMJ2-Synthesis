package fr.axicer.dqmjsynthesis.model;

public enum Polarity {
	PLUS,MOINS,NEUTRE;
	
	/**
	 * Check of the current polarity is compatible (as of synthesis system)
	 * @param other {@link Polarity} to check
	 * @return true if the polarity is compatible false either
	 */
	public boolean isCompatibleWith(Polarity other) {
		return !equals(other); 
	}
}

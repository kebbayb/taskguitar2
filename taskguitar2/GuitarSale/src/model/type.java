package model;

public enum type {
	ACOUSTIC, ELECTRIC;

	  public String toString() {
	    switch(this) {
	      case ACOUSTIC: return "ACOUSTIC";
	      case ELECTRIC: return "ELECTRIC";
	      default:       return "unspecified";
	    }
	  }
}

package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	
	private String bruker;
	private String dato;
	private int id;
	private int likes;
	
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		
		
		// TODO 
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		
		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		return bruker;
		
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		return dato;
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setDato(String dato) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public int getId() {
		return id;
		//throw new UnsupportedOperationException(TODO.method());

	}

	public int getLikes() {
		return likes;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public void doLike () {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean erLik(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

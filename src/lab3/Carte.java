package lab3;

public class Carte {
	String titlu;
	String cont;
	String autor;
	Carte(){}
	Carte(String titlu, String cont, String autor){
		this.titlu=titlu;
		this.cont=cont;
		this.autor=autor;
	}
	
	public void setTitlu(String titlu){
		this.titlu=titlu;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitlu() {
		return titlu;
	}
	

}

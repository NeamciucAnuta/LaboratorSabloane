package lab3;

import java.util.ArrayList;

public class Sectiune implements Element {
	private String titlu;
	private ArrayList<Element> continutSectiune= new ArrayList<>();
	
	public void add(Element e){
		continutSectiune.add(e);
	}
	
	public void move(Element e){
		
	}
	
	public Element getElement(int index){
		return continutSectiune.get(index);
	}
	
	public void print(){
		System.out.println(titlu);
	}

}

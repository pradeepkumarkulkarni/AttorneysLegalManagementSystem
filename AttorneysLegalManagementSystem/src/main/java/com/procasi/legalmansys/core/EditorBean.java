package com.procasi.legalmansys.core;

//import javax.faces.bean.ManagedBean;

//@ManagedBean(name = "editor")
public class EditorBean {
	private String value = "This editor is provided by PrimeFaces";
	private int numberPages = 35;
	

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int pNumberPages) {
		numberPages = pNumberPages;
	}
	
	
}

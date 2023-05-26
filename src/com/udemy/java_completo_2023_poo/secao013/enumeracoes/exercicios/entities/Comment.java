package com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities;

public class Comment {
	
	private String text;

	public Comment() {
		
	}
	
	public Comment(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Comment [text=" + text + "]";
	}
	
}

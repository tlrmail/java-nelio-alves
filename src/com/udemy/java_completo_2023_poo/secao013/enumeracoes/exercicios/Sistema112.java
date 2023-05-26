package com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities.Comment;
import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities.Post;

public class Sistema112 {

	public static void main(String[] args) throws ParseException {

		Comment comment01 = new Comment("Have a nice trip!");
		Comment comment02 = new Comment("Wow's that's some!");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Post post = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to new Zealand",
				"I'm going to visit this wonderful country!", 12);
		post.addComment(comment01);
		post.addComment(comment02);

		System.out.println(post);
		
		Comment comment03 = new Comment("Good Night");
		Comment comment04 = new Comment("May the Force be with you");
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow" , 5);
		post2.addComment(comment03);
		post2.addComment(comment04);
		System.out.println();
		System.out.println(post2);
	}

}

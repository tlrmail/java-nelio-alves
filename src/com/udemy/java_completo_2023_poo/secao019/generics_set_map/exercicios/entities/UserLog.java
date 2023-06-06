package com.udemy.java_completo_2023_poo.secao019.generics_set_map.exercicios.entities;

import java.util.Objects;

import com.udemy.java_completo_2023_poo.secao019.generics_set_map.exercicios.entities.enums.Curso;

public class UserLog implements Comparable<UserLog>{

	private String matricula;
	private Curso curso;
	
	public UserLog(String matricula, Curso curso) {
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	@Override
	public int hashCode() {
		return Objects.hash(curso, matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserLog other = (UserLog) obj;
		return curso == other.curso && Objects.equals(matricula, other.matricula);
	}

	@Override
	public int compareTo(UserLog o) {
		// TODO Auto-generated method stub
		return this.matricula.compareTo(o.getMatricula());
	}

	@Override
	public String toString() {
		return matricula + ", " + curso;
	}

	
	
	
}

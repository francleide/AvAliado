package dominio;

import java.util.Date;

public class AvaliacaoAlunoProfessor {
	int matriculaAluno;
	int matriculaProfessor;
	boolean didatica;
	boolean provas;
	boolean personalidade;
	Date data;

	public AvaliacaoAlunoProfessor(){
	}

	public int getMatriculaAluno(){
		return matriculaAluno;
	}
	
	public void setMatriculaAluno (int matriculaAluno){
		this.matriculaAluno = matriculaAluno;
	}

	public int getMatriculaProfessor(){
		return matriculaProfessor;
	}
	
	public void setMatriculaProfessor (int matriculaProfessor){
		this.matriculaProfessor = matriculaProfessor;
	}

	public boolean getDidatica(){
		return didatica;
	}
	
	public void setDidatica (boolean didatica){
		this.didatica = didatica;
	}

	public boolean getProvas(){
		return provas;
	}
	
	public void setProvas (boolean provas){
		this.provas = provas;
	}

	public boolean getPersonalidade(){
		return personalidade;
	}
	
	public void setPersonalidade (boolean personalidade){
		this.personalidade = personalidade;
	}

	public Date getData(){
		return data;
	}

	public void setData (Date data){
		this.data = data;
	}

	public String toString(){
		return "matriculaAluno = " + matriculaAluno + "matriculaProfessor = " + matriculaProfessor + "didatica = " + didatica + "provas = " + provas + "personalidade = " + personalidade + "data = " + data;
	}
}

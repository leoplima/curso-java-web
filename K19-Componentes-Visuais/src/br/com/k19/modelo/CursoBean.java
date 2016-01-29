package br.com.k19.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CursoBean {

	private List<Curso> cursos = new ArrayList<Curso>();
	private Curso curso = new Curso();

	public void adicionaCurso() {
		this.cursos.add(this.getCurso());
		this.setCurso(new Curso());
		System.out.println(this.cursos);

	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}

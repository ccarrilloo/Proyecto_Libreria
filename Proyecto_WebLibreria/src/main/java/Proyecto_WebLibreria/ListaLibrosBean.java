package Proyecto_WebLibreria;

import java.util.List;

import javax.annotation.PostConstruct;

import pe.lib.libreria.Libro;

public class ListaLibrosBean {

	private List<Libro> listaLibro;    
    private LibroServicio libroServicio;

    @PostConstruct
    public void init() {
    	listaLibro = libroServicio.obtenerTodos();
    	
    }

    public List<Libro> getListaLibro() {
        return listaLibro;
    }

    public void setListaLibro(List<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }
	
	
}

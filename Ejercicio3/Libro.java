/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Gianina
 */
public class Libro {
    
    private String titulo;
    private String ISBN;
    private Autor autor;         // asociación unidireccional
    private Editorial editorial; // agregación

    public Libro() {
    }

    public Libro(String titulo, String ISBN, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Libro(String titulo, String ISBN) {
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the autor
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * @return the editorial
     */
    public Editorial getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    
    
}

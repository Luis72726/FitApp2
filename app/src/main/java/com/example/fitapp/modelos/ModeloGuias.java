package com.example.fitapp.modelos;

public class ModeloGuias {
    private String titulo;
    private String descripcion;
    private int foto;

    public ModeloGuias() {
    }

    public ModeloGuias(String titulo, String descripcion, int foto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

package com.example.weswing.recyclers;

public class NewsFeedEntity {
    private String nomApellidos;

    private String title;

    private int numeroAsistencies;

    private String data;

    public NewsFeedEntity(String nomApellidos, String title, int numeroAsistencies, String data) {
        this.nomApellidos = nomApellidos;
        this.title = title;
        this.numeroAsistencies = numeroAsistencies;
        this.data = data;
    }

    public NewsFeedEntity(String nomApellidos , String data) {
        this.nomApellidos = nomApellidos;
        this.data = data;
    }

    public NewsFeedEntity(String nomApellidos) {
        this.nomApellidos = nomApellidos;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomApellidos() {
        return nomApellidos;
    }

    public void setNomApellidos(String nomApellidos) {
        this.nomApellidos = nomApellidos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumeroAsistencies() {
        return numeroAsistencies;
    }

    public void setNumeroAsistencies(int numeroAsistencies) {
        this.numeroAsistencies = numeroAsistencies;
    }
}

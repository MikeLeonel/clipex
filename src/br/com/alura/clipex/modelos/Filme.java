package br.com.alura.clipex.modelo;

public class Filme extends Titulo { // extends aplica herança a uma classe
    private String diritor;

    public String getDiritor() {
        return diritor;
    }

    public void setDiritor(String diritor) {
        this.diritor = diritor;
    }
}

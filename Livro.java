package org.example;

public class Livro {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private int numero_paginas;
    private String genero;
    private int pagAtual;
    private boolean livroAf;


    public Livro(String titulo, String autor, int ano_publicacao, int numero_paginas, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
        this.numero_paginas = numero_paginas;
        this.genero = genero;
        this.pagAtual = 0;
        this.livroAf = false;

    }

    public int getPaginaAtual() {
        return pagAtual;
    }

    public boolean isAberto() {
        return livroAf;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void abrir(){
        if(this.livroAf == true){
            throw new IllegalArgumentException(" O livro já esta aberto");
        }
        this.livroAf = true;
        System.out.println("O livro foi aberto");
    }



    public void fechar(){
        if(this.livroAf == false){
            throw new IllegalArgumentException(" O livro já esta fechado");
        }
        this.livroAf = false;
        this.pagAtual = 0;
        System.out.println("O livro foi fechado");
    }



    public void marcar_pagina(int pagina){
        if(livroAf && pagina >=1 && pagina<=numero_paginas){
            this.pagAtual = pagina;
            System.out.println("Pagina" + pagina + "marcada.");
        } else{
            throw new IllegalArgumentException("Nao foi possivel marcar a pagina");
        }
    }

    public void avancarPag() {
        if (livroAf && pagAtual < numero_paginas) {
            pagAtual++;
            System.out.println("Avançou para a página " + pagAtual + ".");
        } else {
            throw new IllegalArgumentException("Não foi possível avançar. Verifique se o livro está aberto ou se já está na última página.");
        }
    }

    public void retrocederPagina() {
        if (livroAf && pagAtual > 1) {
            pagAtual--;
            System.out.println("Retrocedeu para a página " + pagAtual + ".");
        } else {
            throw new IllegalArgumentException("Não foi possível retroceder. Verifique se o livro está aberto ou se já está na primeira página.");
        }
    }}
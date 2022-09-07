package com.ricardo.ecomercetdd.models;

public class Produto {

    private String codigo;
    private String nome;
    private String descricao;
    private String quantidade;
    private String valor;
   
  
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
        if(this.codigo == null || this.codigo.isEmpty()){
            this.codigo = this.nome.substring(0,3)+ "-"+this.nome.length();
        }
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getCodigo() {
        return codigo.toUpperCase();
    }
    public void setCodigo(String string) {
    }
    

    
}

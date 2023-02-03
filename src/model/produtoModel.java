/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class produtoModel {
   private int idProduto;
   private String nomeDoProduto;
   private String codigoDeBarras;
   private String fabricanteDoProduto;
   private int quantidadeDoProduto;
   private String categoriaDoProduto;
   private double valorTotalDoProduto;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nomeDoProduto
     */
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    /**
     * @param nomeDoProduto the nomeDoProduto to set
     */
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    /**
     * @return the codigoDeBarras
     */
    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    /**
     * @param codigoDeBarras the codigoDeBarras to set
     */
    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    /**
     * @return the fabricanteDoProduto
     */
    public String getFabricanteDoProduto() {
        return fabricanteDoProduto;
    }

    /**
     * @param fabricanteDoProduto the fabricanteDoProduto to set
     */
    public void setFabricanteDoProduto(String fabricanteDoProduto) {
        this.fabricanteDoProduto = fabricanteDoProduto;
    }

    /**
     * @return the quantidadeDoProduto
     */
    public int getQuantidadeDoProduto() {
        return quantidadeDoProduto;
    }

    /**
     * @param quantidadeDoProduto the quantidadeDoProduto to set
     */
    public void setQuantidadeDoProduto(int quantidadeDoProduto) {
        this.quantidadeDoProduto = quantidadeDoProduto;
    }

    /**
     * @return the categoriaDoProduto
     */
    public String getCategoriaDoProduto() {
        return categoriaDoProduto;
    }

    /**
     * @param categoriaDoProduto the categoriaDoProduto to set
     */
    public void setCategoriaDoProduto(String categoriaDoProduto) {
        this.categoriaDoProduto = categoriaDoProduto;
    }

    /**
     * @return the valorTotalDoProduto
     */
    public double getValorTotalDoProduto() {
        return valorTotalDoProduto;
    }

    /**
     * @param valorTotalDoProduto the valorTotalDoProduto to set
     */
    public void setValorTotalDoProduto(double valorTotalDoProduto) {
        this.valorTotalDoProduto = valorTotalDoProduto;
    }
   
}

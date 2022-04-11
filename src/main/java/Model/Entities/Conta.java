package Model.Entities;

import Model.Exceptions.BusinessExceptions;

public class Conta {
    public Integer numero;
    public String titular;
    public Double saldo;
    public Double limiteSaque;

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Conta(){

    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    //Depositar
    public void depositar(double quantidade){
        saldo += quantidade;

    }
    //Saque
    public void saque(double quantidade) throws BusinessExceptions{
        validacaoSaque(quantidade);
        saldo -= quantidade;
    }

    //Delegando a logica para classe de negocio
    private void validacaoSaque(double quantidade) throws BusinessExceptions {
        if(quantidade > getLimiteSaque()){
         throw new BusinessExceptions("Erro no saque: Quantida para saque exedeu o limite estabelecido !");
        }
        if(quantidade > saldo){
          throw new BusinessExceptions("Erro no saque: Saldo insuficiente! ");
        }
    }

}

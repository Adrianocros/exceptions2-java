package Model.Entities;

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
    public void saque(double quantidade){
        saldo -= quantidade;
    }

    //Delegando a logica para classe de negocio
    public String validacaoSaque(double quantidade){
        if(quantidade > getLimiteSaque()){
            return  "Erro no saque: Quantida para saque exedeu o limite estabelecido !";
        }
        if(quantidade > saldo){
            return "Erro no saque: Saldo insuficiente! " ;
        }
        return null;
    }

}

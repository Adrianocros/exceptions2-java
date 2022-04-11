package Model.Entities;

public class Conta {
    public Integer numero;
    public String correntista;
    public Double saldo;
    public Double limiteSaque;

    public Conta(Integer numero, String correntista, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public Double getSaldo() {
        return saldo;
    }

//    public void setSaldo(Double saldo) {
//        this.saldo = saldo;
//    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

//    public void setLimiteSaque(Double limiteSaque) {
//        this.limiteSaque = limiteSaque;
//    }
    
}

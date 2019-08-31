/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

/**
 *
 * @author Alexandre Lima
 */
public class Poupanca extends Conta {
    
    public void debito(double valor) {
        
        this.saldo = this.saldo - valor;
        
    }
    
    public String toString() {
        return "Conta Poupança:\nNúmero: " + Integer.toString(this.agencia) + 
                "\nConta: " + Integer.toString(this.numero) +
                "\nSaldo: " + Double.toString(this.saldo) + "\n-------------";
    }
    
}

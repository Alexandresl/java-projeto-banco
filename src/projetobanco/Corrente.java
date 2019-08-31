/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
 */
package projetobanco;

/**
 *
 * @author Alexandre Lima
 */
public class Corrente extends Conta{
        
    public void debito(double valor) {
        
        double cpmf = valor * 0.38 / 100;
        
        this.saldo = this.saldo - valor - cpmf;
        
    }
    
    
    
    public String toString() {
        return "Conta Corrente:\nNúmero: " + Integer.toString(this.agencia) + 
                "\nConta: " + Integer.toString(this.numero) +
                "\nSaldo: " + Double.toString(this.saldo) + "\n-------------\n";
    }
    
}

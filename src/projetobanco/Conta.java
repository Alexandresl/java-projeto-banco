/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

import java.util.Random;

/**
 *
 * @author Alexandre Lima
 */
public abstract class Conta {
    
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    

    public Conta() {
        this.numero = 0;
        this.agencia = 0;
        this.saldo = 0;
        this.cliente = null;
    }
   
    public void criarConta(Cliente cliente, double saldoInicial) {
        Random random = new Random();
        int numConta = random.nextInt(1000000);
        int numAgencia = random.nextInt(1000);
        this.cliente = cliente;
        this.numero = numConta;
        this.agencia = numAgencia;
        this.saldo = saldoInicial;
    }
    
    public void credito(double valor) {
        this.saldo = this.saldo + valor;
    }
    
    public void transferirParaAConta(double valor, Conta conta){
        
        this.debito(valor);
        conta.credito(valor);
        
    }
    
    public abstract void debito(double valor);
    
        
}

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
public class ProjetoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instancia o cliente
        Cliente cliente1 = new Cliente("Alexandre", "93580843087");
        // Instancia uma conta do tipo corrente
        Corrente corrente1 = new Corrente();
        // Cria a conta
        corrente1.criarConta(cliente1, 0);
        // Imprime o objeto corrente após criado a conta
        System.out.println(corrente1);
        // realiza um depósito de 500
        corrente1.credito(500);
        // Imprime o objeto corrente após depósito
        System.out.println(corrente1);
        // Realiza um débito de 100
        corrente1.debito(100);
        // Imprime o objeto corrente após saque
        System.out.println(corrente1);
               
        // Instancia uma conta do tipo poupanca
        Poupanca poupanca1 = new Poupanca();
        // Imprime a conta poupanca
        System.out.println(poupanca1);
        // Cria a conta poupanca
        poupanca1.criarConta(cliente1, 0);
        // Imprime a conta poupanca
        System.out.println(poupanca1);
        // realiza um deposito de 500
        poupanca1.credito(500);
        // Imprime a conta poupanca
        System.out.println(poupanca1);
        // realiza um debito de 100
        poupanca1.debito(100);
        // Imprime a conta poupanca
        System.out.println(poupanca1);
        // transferencia de poupanca para corrente
        poupanca1.transferirParaAConta(100, corrente1);
        // Imprime as duas contas
        System.out.println(corrente1);
        System.out.println(poupanca1);
        // Transferir de corrente para poupança
        corrente1.transferirParaAConta(100, poupanca1);
        // Imprime as duas contas
        System.out.println(corrente1);
        System.out.println(poupanca1);
    }
    
}

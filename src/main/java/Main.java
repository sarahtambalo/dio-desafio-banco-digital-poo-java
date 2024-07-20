package main.java;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao seu banco digital!");
        Cliente cliente1 = new Cliente();
        cliente1.setNome(JOptionPane.showInputDialog("Nome do cliente: "));
        cliente1.setCpf(Integer.valueOf(JOptionPane.showInputDialog("Digite seu CPF: ")));

        Conta cc = new ContaCorrente(cliente1) {
            @Override
            public void transferir(double valor, InterfaceConta contaDestino) {
                System.out.println();
            }
        };
        Conta poupanca = new ContaPoupanca(cliente1) {
            @Override
            public void transferir(double valor, InterfaceConta contaDestino) {
                System.out.println();
            }
        };

        //Testando todas as funções
        cc.depositar(100);
        cc.sacar(25);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
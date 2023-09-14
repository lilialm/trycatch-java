package interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaCliente {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
            System.out.print("Digite o nome da pessoa física 1: ");
            String nomePessoaFisica1 = scanner.nextLine();
            if (nomePessoaFisica1.isEmpty()) {
                throw new IllegalArgumentException("Nome não pode ser vazio.");
            }
            System.out.print("Digite o endereço da pessoa física 1: ");
            String enderecoPessoaFisica1 = scanner.nextLine();
            if (enderecoPessoaFisica1.isEmpty()) {
                throw new IllegalArgumentException("Endereço não pode ser vazio.");
            }
            System.out.print("Digite o email da pessoa física 1: ");
            String emailPessoaFisica1 = scanner.nextLine();
            if (emailPessoaFisica1.isEmpty()) {
                throw new IllegalArgumentException("Email não pode ser vazio.");
            }
            System.out.print("Digite o telefone da pessoa física 1: ");
            String telefonePessoaFisica1 = scanner.nextLine();
            if (telefonePessoaFisica1.isEmpty()) {
                throw new IllegalArgumentException("Telefone não pode ser vazio.");
            }
            System.out.print("Digite o CPF da pessoa física 1: ");
            String cpfPessoaFisica1 = scanner.nextLine();
            if (cpfPessoaFisica1.isEmpty()) {
                throw new IllegalArgumentException("CPF não pode ser vazio.");
            }
            System.out.print("Digite o RG da pessoa física 1: ");
            String rgPessoaFisica1 = scanner.nextLine();
            if (rgPessoaFisica1.isEmpty()) {
                throw new IllegalArgumentException("RG não pode ser vazio.");
            }
            
            
            ClienteInterface pessoaFisica1 = new PessoaFisica(nomePessoaFisica1, enderecoPessoaFisica1, emailPessoaFisica1, telefonePessoaFisica1, cpfPessoaFisica1, rgPessoaFisica1);
            
            
            
            pessoaFisica1.visualizar();
            System.out.println();
            
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar cliente: " + e);
        } finally {
            scanner.close();
        }
		 

	}
}

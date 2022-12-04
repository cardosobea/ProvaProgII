package tela;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import acoes.Atualiza;
import acoes.Busca;
import acoes.BuscaLetra;
import acoes.Insere;
import acoes.Lista;
import acoes.Remove;
import modelo.Aluno;

public class Tela {
	private static void clearBuffer(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
	}		
	public static void main(String[] args) {	
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		List<Aluno> lista;
		Scanner s = new Scanner(System.in); 
		int opcao = 0;
		do {
			Aluno aluno = new Aluno();
			System.out.println("Opcoes:");
			System.out.println("\n1- Inserir");
			System.out.println("\n2- Pesquisar");
			System.out.println("\n3- Deletar");
			System.out.println("\n4- Listar");
			System.out.println("\n5- Pesquisar Primeira Letra");
			System.out.println("\n6- Atualizar");
			System.out.println("\n7- Sair");
			System.out.println("\nDigite o numero: ");
			opcao = s.nextInt();
			clearBuffer(s);
			switch(opcao) {
				case 1:
					System.out.println("Nome: ");
					aluno.setNome(s.nextLine());
					System.out.println("Cpf: ");
					aluno.setCpf(s.nextLine());
					System.out.println("Email: ");
					aluno.setEmail(s.nextLine());
					System.out.println("Endereco: ");
					aluno.setEndereco(s.nextLine());
					System.out.println("Naturalidade: ");
					aluno.setNaturalidade(s.nextLine());
					System.out.println("Data de Nascimento: ");
					try {
					aluno.setNascimento(format.parse(s.nextLine()));
					 } catch (ParseException e) {
						 e.printStackTrace();
				       }
					Insere.insercao(aluno);
					break;
				case 2:
					System.out.println("Digite o Id do registro para pesquisar: ");
					aluno.setId(s.nextLong());
					clearBuffer(s);
					aluno = Busca.busca(aluno);
					System.out.println("Nome: "+ aluno.getNome());
					System.out.println("Cpf: " + aluno.getCpf());
					System.out.println("Email: " + aluno.getEmail() );
					System.out.println("Naturalidade: " + aluno.getNaturalidade());
					System.out.println("Endereço: " + aluno.getEndereco());
					System.out.println("Data de nascimento: " + aluno.getNascimento());
					break;
				case 3:
					System.out.println("Digite o Id para remocao: ");
					aluno.setId(s.nextLong());
					clearBuffer(s);
					Remove.remocao(aluno);
					break;
				case 4:
					lista = Lista.lista();
					for (Aluno a : lista){
						System.out.println("Nome: " + a.getNome());
						System.out.println("Cpf: " + a.getCpf());
						System.out.println("Email: " + a.getEmail());
						System.out.println("Endereco: " + a.getEndereco());
						System.out.println("Naturalidade: " + a.getNaturalidade());
						System.out.println("Data de Nascimento: " + a.getNascimento());
						System.out.println("\n\n");
					}
					break;
				case 5:
					System.out.println("Digite primeira letra do nome que busca: ");
					String letra = s.nextLine();
					lista = BuscaLetra.buscaLetra(letra);
					for(Aluno a : lista) {
						System.out.println("Nome: " + a.getNome());
						System.out.println("Email: " + a.getEmail());
						System.out.println("Endereco: " + a.getEndereco());
						System.out.println("Data de Nascimento: " + a.getNascimento());
						System.out.println("CPF: " + a.getCpf());
						System.out.println("Naturalidade: " + a.getNaturalidade());
						System.out.println("\n\n");
					}
					break;
				case 6:
					System.out.println("Digite o Id para atualizar: ");
					aluno.setId(s.nextLong());
					clearBuffer(s);
					aluno = Busca.busca(aluno);
					System.out.println("Nome: ");
					aluno.setNome(s.nextLine());
					System.out.println("Email: ");
					aluno.setEmail(s.nextLine());
					System.out.println("Endereco: ");
					aluno.setEndereco(s.nextLine());
					System.out.println("Naturalidade: ");
					aluno.setNaturalidade(s.nextLine());
					System.out.println("Cpf: ");
					aluno.setCpf(s.nextLine());
					System.out.println("Data de nascimento: ");
					try {
						aluno.setNascimento(format.parse(s.nextLine()));
					} catch (ParseException e) {
					e.printStackTrace();
					}
					Atualiza.alteracao(aluno);
					break;
				case 7:
					System.out.println("Finalizando!");
					break;
			}
		}while(opcao!=7);	
	}
}

package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import entidade.Acessos;

public class Programa3 {

	public static void main(String[] args) {

		String arq = "C:\\Users\\Nayron\\Downloads\\set.txt";

		try (BufferedReader bf = new BufferedReader(new FileReader(arq))) {
			Set<Acessos> set = new HashSet<Acessos>();
			String linha = bf.readLine();

			while (linha != null) {
				String[] objeto = linha.split(" ");
				String nome = objeto[0];
				Date momento = Date.from(Instant.parse((objeto[1])));

				set.add(new Acessos(nome, momento));
				linha = bf.readLine();

			}
			System.out.println("Quantidade de usuários diferentes que acessaram o site: " + set.size());
			
			for(Acessos e:set) {	
			System.out.println(e);
			
			}
		} catch (IOException x) {
			System.out.println("Erro: " + x.getMessage());
		}

	}

}

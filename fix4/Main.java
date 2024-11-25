package fix4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Projeto> projetos = new ArrayList<Projeto>();

        // Projeto 1
        projetos.add(new Projeto("Projeto 1", "Alberto Carvalho", 100, 10));
        projetos.get(0).adicionarTarefa("configuracoes iniciais", "Cintia Cruz", 2, "delegada");
        projetos.get(0).adicionarTarefa("incorporar metodos");
        projetos.get(0).delegarTarefa(1, "Paulo Oliveira");
        projetos.get(0).finalizarTarefa(0, 3);
        projetos.get(0).finalizarTarefa(1, 5);

        // Projeto 2
        projetos.add(new Projeto("Projeto 2", "Roberta Andrade", 150, "configuracoes iniciais", 5));
        projetos.get(1).adicionarTarefa("incorporar metodos", "Cintia Cruz", 2, "delegada");
        projetos.get(1).delegarTarefa(1, "Paulo Oliveira");
        projetos.get(1).finalizarTarefa(0, 3);

        mostrarProjetosFinalizados(projetos);
    }

    public static void mostrarProjetosFinalizados(ArrayList<Projeto> projetos) {
        for (Projeto projeto : projetos) {
            if (projeto.verificarConclusao()) {
                System.out.println(String.format("Projeto %s do cliente %s finalizado.", projeto.getNome(), projeto.getNomeCliente()));
            }
        }

    }
}

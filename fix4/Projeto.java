package fix4;

import java.util.ArrayList;

public class Projeto {
    private String nome;
    private String nomeCliente;
    private ArrayList<Tarefa> tarefas;
    private int qtdTarefa;
    private int qtdMaxTarefa;
    private float horaDeTrabalho;

    public Projeto(String nome, String nomeCliente, float horaDeTrabalho, int qtdMaxTarefa) {
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.tarefas = new ArrayList<Tarefa>();
        this.qtdTarefa = 0;
        this.qtdMaxTarefa = qtdMaxTarefa;
        this.horaDeTrabalho = horaDeTrabalho;
    }

    public Projeto(String nome, String nomeCliente, float horaDeTrabalho, String descricaoTarefaInicial, int qtdMaxTarefa) {
        this(nome, nomeCliente, horaDeTrabalho, qtdMaxTarefa);
        adicionarTarefa(descricaoTarefaInicial);
    }

    public Projeto(String nome, String nomeCliente, float horaDeTrabalho, String descricaoTarefaInicial) {
        this(nome, nomeCliente, horaDeTrabalho, descricaoTarefaInicial, 100);
    }

    public String getNome() {
        return this.nome;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void adicionarTarefa(String descricao, String executor, float tempoGasto, String status) {
        this.tarefas.add(new Tarefa(descricao, executor, tempoGasto, status));
        this.qtdTarefa++;
    }

    public void adicionarTarefa(String descricao) {
        this.adicionarTarefa(descricao, null, 0, "iniciada");
    }

    public void delegarTarefa(int indice, String executor) {
        this.tarefas.get(indice).delegarTarefa(executor);
    }

    public void finalizarTarefa(int indice, float tempoGasto) {
        this.tarefas.get(indice).finalizarTarefa(tempoGasto);
    }

    public boolean verificarConclusao() {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getStatus().equals("iniciada") || tarefa.getStatus().equals("delegada")) {
                return false;
            }
        }
        return true;
    }

    public float calcularCusto() {
        float custo = 0;
        for (Tarefa tarefa : this.tarefas) {
            custo += tarefa.getHorasGastas() * this.horaDeTrabalho;
        }
        return custo;
    }
}

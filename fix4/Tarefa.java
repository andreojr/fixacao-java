package fix4;

public class Tarefa {
    private String descricao;
    private String executor;
    private float horasGastas;
    private String status;

    public Tarefa(String descricao, String executor, float horasGastas, String status) {
        this.descricao = descricao;
        this.executor = executor;
        this.horasGastas = horasGastas;
        this.status = status;
    }

    public Tarefa(String descricao) {
        this(descricao, null, 0, "iniciada");
    }

    public Tarefa(String descricao, String executor) {
        this(descricao, executor, 0, "delegada");
    }

    public String getDescricao() {
        return descricao;
    }

    public String getExecutor() {
        return executor;
    }

    public float getHorasGastas() {
        return horasGastas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setHorasGastas(float horasGastas) {
        this.horasGastas = horasGastas;
    }

    public void delegarTarefa(String executor) {
        this.executor = executor;
        this.status = "delegada";
    }

    public void finalizarTarefa(float horasGastas) {
        this.horasGastas = horasGastas;
        this.status = "finalizada";
    }
}

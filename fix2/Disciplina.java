class Disciplina {
  private String codigo;
  private String nome;
  private int ch;
  private int creditos;
  private TipoDisciplina tipo;

  // Cadastro de Optativa (Requer a declaração de forma explícita, confirmando que é uma optativa)
  public Disciplina(String codigo, String nome, int ch, int creditos, TipoDisciplina tipo) {
    this.codigo = codigo;
    this.nome = nome;
    this.ch = ch;
    this.creditos = creditos;
    this.tipo = tipo;
  }

  // Cadastro de Obrigatória (DEFAULT)
  public Disciplina(String codigo, String nome, int ch, int creditos) {
    this(codigo, nome, ch, creditos, TipoDisciplina.OBRIGATORIA);
  }

  // Cadastro de Eletiva
  public Disciplina(String codigo, String nome) {
    this(codigo, nome, 2, 30, TipoDisciplina.ELETIVA);
  }

  public void setCH(int ch) {
    if (this.tipo == TipoDisciplina.ELETIVA) {
      System.out.println("Não foi possível realizar a alteração");
    } else if (ch > 0) {
      this.ch = ch;
      System.out.println("Disciplina alterada");
    }
  }

  public void setCHeCreditos(int ch, int creditos) {
    if (this.tipo == TipoDisciplina.ELETIVA) {
      System.out.println("Não foi possível realizar a alteração");
    } else if (ch > 0 && creditos >= 0) {
      this.ch = ch;
      this.creditos = creditos;
      System.out.println("Disciplina alterada");
    }
  }

  public void obterInformacoes() {
    System.out.println("Código: " + this.codigo);
    System.out.println("Nome: " + this.nome);
    System.out.println("Carga horária: " + this.ch);
    System.out.println("Créditos: " + this.creditos);
    System.out.println("Tipo: " + this.tipo);
  }
}
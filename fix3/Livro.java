class Livro {
    private String titulo;
    private Capa capa;
    private Autor autor;

    public Livro(String titulo, String cor, String material, Autor autor) {
        this.titulo = titulo;
        this.capa = new Capa(cor, material);
        this.autor = autor;
    }

    public Livro(String titulo, String cor, String material) {
        this(titulo, cor, material, null);
    }

    public Livro(String titulo, String cor, String material, String nomeAutor, String cpfAutor) {
        this(titulo, cor, material, new Autor(nomeAutor, cpfAutor));
    }

    public void obterInformacoes() {
        System.out.println("LIVRO");
        System.out.println(titulo);
        System.out.println("CAPA");
        System.out.println("cor: " + capa.getCor());
        System.out.println("material: " + capa.getMaterial());
        System.out.println("AUTOR");
        System.out.println(autor);
        System.out.println("nome: " + autor.getNome());
        System.out.println("cpf: " + autor.getCpf());
    }
}
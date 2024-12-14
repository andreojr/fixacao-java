public class Automovel {
    public static final byte movidoAGasolina = 1;
    public static final byte movidoAAlcool = 2;
    public static final byte movidoADiesel = 3;
    public static final byte eletrico = 4;
    
    private String modelo;
    private String cor;
    private byte combustivel;
    private byte numeroMaximoDePrestacoes = 24;

    public Automovel(String modelo, String cor, byte combustivel) {
        this.cor = cor;
        this.modelo = modelo;
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public byte getCombustivel() {
        return combustivel;
    }

    public byte quantasPrestacoes() {
        return numeroMaximoDePrestacoes;
    }

    protected void setPrestacoes(byte prestacoes) {
        numeroMaximoDePrestacoes = prestacoes;
    }

    public float quantoCusta() {
        float preco = 0;
        switch (getCombustivel()){
            case movidoAGasolina: preco = 12000; break;
            case movidoAAlcool: preco = 10500; break;
            case movidoADiesel: preco = 11000; break;
            case eletrico: preco = 18000; break;
        }
        return preco;
    }

    public String toString(){
        String resultado;
        resultado = getModelo() + " " + getCor() + "\n";
        switch(getCombustivel()) {
            case movidoAGasolina: resultado += "Gasolina \n"; break;
            case movidoAAlcool: resultado += "Álcool \n"; break;
            case movidoADiesel: resultado += "Diesel \n"; break;
            case eletrico: resultado += "Elétrico \n"; break;
        }
        return resultado;
    }
}
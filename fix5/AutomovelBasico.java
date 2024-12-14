public class AutomovelBasico extends Automovel {
    private boolean quintaMarcha;
    private boolean limpadorVidroTraseiro;
    private boolean multimidia;

    public AutomovelBasico(String m, String c, byte comb, boolean qm, boolean lvt, boolean multimidia) {
        super(m,c,comb);
        this.quintaMarcha = qm;
        this.limpadorVidroTraseiro = lvt;
        this.multimidia = multimidia;
    }

    public AutomovelBasico(String m, String c, byte comb) {
        super(m,c,comb);
        this.quintaMarcha = true;
        this.multimidia = true;
        this.limpadorVidroTraseiro = true;
    }

    public boolean getQuintaMarcha() {
        return quintaMarcha;
    }

    public boolean getLimpadorDoVidroTraseiro() {
        return limpadorVidroTraseiro;
    }

    public boolean getMultimidia() {
        return multimidia;
    }

    public float quantoCusta() {
        float preco = super.quantoCusta();
        if (getQuintaMarcha())
            preco += 2800;
        if (getLimpadorDoVidroTraseiro())
            preco += 650;
        if (getMultimidia())
            preco += 3000;
        return preco;
    }

    public String toString() {
        String resultado = super.toString();
        if (getQuintaMarcha())
            resultado += "Com cinco marchas \n";
        if (getLimpadorDoVidroTraseiro())
            resultado += "Com limpador traseiro \n";
        if (getMultimidia())
            resultado += "Com kit multimidia \n";
        return resultado;
    }
}
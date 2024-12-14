public class AutomovelLuxo extends AutomovelBasico {
    private boolean direcaoHidraulica;
    private boolean cambioAutomatico;
    private boolean vidrosEletricos;
    
    public AutomovelLuxo(String m, String c, byte comb, boolean direcaoHidraulica, boolean cambioAutomatico, boolean vidrosEletricos) {
        super(m,c,comb);
        this.direcaoHidraulica = direcaoHidraulica;
        this.cambioAutomatico = cambioAutomatico;
        this.vidrosEletricos = vidrosEletricos;
        setPrestacoes((byte)36);
    }

    public AutomovelLuxo(String m, String c, byte comb) {
        super(m,c,comb);
        direcaoHidraulica = true;
        cambioAutomatico = true;
        vidrosEletricos = true;
        setPrestacoes((byte)36);
    }

    public boolean getDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public boolean getCambioAutomatico() {
        return cambioAutomatico;
    }

    public boolean getVidrosEletricos() {
        return vidrosEletricos;
    }

    @Override
    public float quantoCusta() {
        float preco = super.quantoCusta();
        if (getDirecaoHidraulica())
            preco += 5340;
        if (getCambioAutomatico())
            preco += 7500;
        if (getVidrosEletricos())
            preco += 3000;
        return preco;
    }

    @Override
    public String toString() {
        String resultado = super.toString();
        if (getDirecaoHidraulica())
            resultado += "Com direção hidráulica \n";
        if (getCambioAutomatico())
            resultado += "Com câmbio automático \n";
        if (getVidrosEletricos())
            resultado += "Com vidros elétricos \n";
        return resultado;
    }
}

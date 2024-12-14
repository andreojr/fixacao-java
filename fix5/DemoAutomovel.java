public class DemoAutomovel {
    public static void main(String arg[]) {
        Automovel a = new Automovel("Fusca","verde", Automovel.movidoAAlcool);
        System.out.println(a.toString());
        System.out.println(a.quantoCusta());
        System.out.println(a.quantasPrestacoes());

        AutomovelBasico ab = new AutomovelBasico("Corsa","cinza",
        Automovel.movidoAGasolina,true,true,false);
        System.out.println(ab.toString());
        System.out.println(ab.quantoCusta());
        System.out.println(ab.quantasPrestacoes());

        AutomovelLuxo al = new AutomovelLuxo("Dolphin","branco", Automovel.eletrico, false, true, true);
        System.out.println(al.toString());
        System.out.println(al.quantoCusta());
        System.out.println(al.quantasPrestacoes());

        AutomovelLuxo al2 = new AutomovelLuxo("Compass","preto", Automovel.movidoADiesel);
        System.out.println(al2.toString());
        System.out.println(al2.quantoCusta());
        System.out.println(al2.quantasPrestacoes());
    }
}
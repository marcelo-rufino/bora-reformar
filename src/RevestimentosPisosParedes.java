public class RevestimentosPisosParedes {
    private double largura;
    private double altura;
    private double lado1;
    private double lado2;
    public double areaPiso;
    public double areaParede;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAreaPiso() {
        return areaPiso;
    }

    public void setAreaPiso(double areaPiso) {
        this.areaPiso = areaPiso;
    }

    public double getAreaParede() {
        return areaParede;
    }

    public void setAreaParede(double areaParede) {
        this.areaParede = areaParede;
    }

    public double calculaAreaPiso() {

        areaPiso = lado1 * lado2;
        return areaPiso;
    }

    public double calculaAreaParede() {
        areaParede = largura * altura;
        return areaParede;
    }
}

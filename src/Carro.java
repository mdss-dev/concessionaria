class Carro {
    String motor;
    int numerosDeRodas;
    int aroRodas;
    int anoDeFabricacao;
    String cor;
    String marca;
    String modelo;
    String tipoCombustivel;
    double preco;

    @Override
    public String toString() {
        return "Carro{" +
                "motor='" + motor + '\'' +
                ", numerosDeRodas=" + numerosDeRodas +
                ", aroRodas=" + aroRodas +
                ", anoDeFabricacao=" + anoDeFabricacao +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustivel='" + tipoCombustivel + '\'' +
                ", preco=" + preco +
                '}';
    }
}

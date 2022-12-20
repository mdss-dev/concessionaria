class Moto {
        String marca;
        String modelo;
        String cor;
        int anoDeFabricacao;
        String motor;
        String tipoCombustivel;
        double preco;

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", anoDeFabricacao=" + anoDeFabricacao +
                ", motor='" + motor + '\'' +
                ", tipoCombustivel='" + tipoCombustivel + '\'' +
                ", preco=" + preco +
                '}';
    }
}

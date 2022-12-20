public class TesteConscessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Mercedes";
        carro1.modelo = "Sedam";
        carro1.cor = "Prata";
        carro1.numerosDeRodas = 5;
        carro1.aroRodas = 18;
        carro1.anoDeFabricacao = 2022;
        carro1.motor = "Mercedes Bens 204 cavalos";
        carro1.tipoCombustivel = "Flex";
        carro1.preco = 195_200.00;

        System.out.println(carro1.toString());

        Carro carro2 = new Carro();
        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.cor = "Azul";
        carro2.numerosDeRodas = 5;
        carro2.aroRodas = 18;
        carro2.anoDeFabricacao = 1995;
        carro2.motor = "8 válvulas";
        carro2.tipoCombustivel = "Gasolina";
        carro2.preco = 5_000;

        System.out.println(carro1.toString());

        Moto moto1 = new Moto();
        moto1.marca = "Ducatti";
        moto1.modelo = "Monster";
        moto1.cor = "vermelha";
        moto1.anoDeFabricacao = 2022;
        moto1.motor = "1200c";
        moto1.tipoCombustivel = "gasolina";
        moto1.preco = 95_000.00;

        System.out.println(moto1.toString());

        Moto moto2 = new Moto();
        moto2.marca = "Yamaha";
        moto2.modelo = "XJ6";
        moto2.cor = "preta";
        moto2.anoDeFabricacao = 2022;
        moto2.motor = "600c";
        moto2.tipoCombustivel = "gasolina";
        moto2.preco = 55_000.00;

        System.out.println(moto2);

    }
}

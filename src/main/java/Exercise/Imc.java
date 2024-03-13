package Exercise;

public class Imc {

    double altura;
    double peso;
    public Double CalcularImc(double heigth,double weight){
        return weight/ Math.pow(heigth,2);

    };
}

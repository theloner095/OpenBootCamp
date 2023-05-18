package sinInterfaces;

public class empleado {

    //Atributos

    int age;
    String name;
    float salario;
    boolean estadealta;
    //Constructores
    public empleado(){}

    public empleado(int age, String name, float salario, boolean estadealta) {
        this.age = age;
        this.name = name;
        this.salario = salario;
        this.estadealta = estadealta;
    }
//Metodos

    @Override
    public String toString() {
        return "empleado{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salario=" + salario +
                ", estadealta=" + estadealta +
                '}';
    }
}

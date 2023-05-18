package refactorizar.consolidatedconditional;

public class main {
    //Atributos
    private    int seniority;
    private    int education;
    private boolean certification;
    private int incidents;

    double calcularExtraSalario() {
        double result = 3;
        if(!esCandidatoExtraSalary()){
            return result;

        }
    return result;

    }
        public boolean esCandidatoExtraSalary(){
        boolean estudios = education<1 || seniority<1;
        boolean antiguedad = incidents > 10 && certification;

        return estudios || antiguedad;






    }
}

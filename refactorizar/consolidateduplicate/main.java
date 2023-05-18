package refactorizar.consolidateduplicate;


public class main {
    //Atributos
    private    int seniority;
    private    int education;
    private boolean certification;
    private int incidents;

    double calcularExtraSalario() {
        double result = 0;
      if(esCandidatoExtraSalary()){
          result = 500;

      }
        else {
            result = 0;
      }
        sendMessage();
        return result;
    }

    public void sendMessage(){
        // Send email
        //Conect smtp

        System.out.println("Enviando...");


    }

    public boolean esCandidatoExtraSalary(){
        boolean estudios = education<1 || seniority<1;
        boolean antiguedad = incidents > 10 && certification;

        return estudios || antiguedad;






    }
}


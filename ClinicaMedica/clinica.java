package ClinicaMedica;

public class clinica {
    public static void main(String[] args) {
        paciente paciente1 = new paciente("000-1", "Italo", "09/04/2001",
         "M","A+");
        
        //paciente1.ImprimeAtributos();
        
        paciente1.ModificaAtributos("000-2", "José", "27/08/1973",
         "M", "poeira", "SulAmérica", "A-");

        //System.out.println("---------------------");

        //paciente1.ImprimeAtributos();

        //System.out.println("---------------------");

        endereco enderecoMedico = new endereco("Coronel Freire", 10,
         "Rio Doce", "53150698","Recife", "PE", "Próximo ao mercadinho");
        
        medico Jorge = new medico(0001,"Jorge Pessoa","M",
         "Neurocirurgia");

        //enderecoMedico.ImprimeEndereco();

        //System.out.println("---------------------");
        enderecoMedico.setBairro("Jardim Atlântico");
        enderecoMedico.setCidade("Olinda");
        Jorge.setEspecialidade("Ortopedista"); 
        Jorge.setEndereco(enderecoMedico);

        Jorge.ImprimeAtributosMedico();


    }

    
}

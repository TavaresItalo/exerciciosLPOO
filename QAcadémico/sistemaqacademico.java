package QAcadémico;

public class sistemaqacademico {
    public static void main(String[] args) {
        alunos Wellington = new alunos("Wellington Nem",
         "000100862", "001-2023.2");
        
        professor Bruno = new professor("Bruno Cartaxo", "00015268", "LPOO");

        Bruno.LançarNotas(Wellington);
        Bruno.CalculaMedia(Wellington);

        Wellington.ExibeNotas();
        Wellington.ExibeMedia(Wellington, Bruno);

    }
    
}

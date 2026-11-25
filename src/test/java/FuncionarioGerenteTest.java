import org.example.FuncionarioGerente;

public class FuncionarioGerenteTest {
    public static void main(String[] args) {
        FuncionarioGerente gerente = new FuncionarioGerente("Alessandro", "123456789", 4000.00);
        gerente.calcularSalario();
        gerente.exibirDados();
    }
}

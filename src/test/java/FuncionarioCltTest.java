import org.example.Funcionario;
import org.example.FuncionarioClt;

public class FuncionarioCltTest {
    public static void main(String[] args) {
        FuncionarioClt funcionario = new FuncionarioClt("AlessandroClt", "1234567890", 2000.00);
        funcionario.calcularSalario();
        funcionario.exibirDados();
    }
}

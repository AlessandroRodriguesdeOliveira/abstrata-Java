import org.example.FuncionarioPj;

public class FuncionarioPjTest {
    public static void main(String[] args) {
        FuncionarioPj funcionario = new FuncionarioPj("AlessandroPj", "123456789", 3000.00);
        funcionario.calcularSalario();
        funcionario.exibirDados();
    }
}

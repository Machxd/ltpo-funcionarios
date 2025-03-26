class Funcionario {
    private String nome;
    private double salarioBase;
    private int horasTrabalhadas;

    // Construtor
    public Funcionario(String nome, double salarioBase, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Método para calcular o salário final
    public double calcularSalarioFinal() {
        int horasNormais = 160;
        double valorHora = salarioBase / horasNormais;

        if (horasTrabalhadas > horasNormais) {
            int horasExtras = horasTrabalhadas - horasNormais;
            return salarioBase + (horasExtras * valorHora * 1.5);
        }

        return salarioBase;
    }

    // Método para exibir os dados do funcionário
    public void exibirDados() {
        System.out.printf("Funcionário: %s%n", nome);
        System.out.printf("Salário Base: R$%.2f%n", salarioBase);
        System.out.printf("Horas Trabalhadas: %dh%n", horasTrabalhadas);
        System.out.printf("Salário Final: R$%.2f%n", calcularSalarioFinal());
        System.out.println("------------------------------");
    }
}

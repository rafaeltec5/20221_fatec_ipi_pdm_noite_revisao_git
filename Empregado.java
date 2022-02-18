public class Empregado{

    private int tipo;
    private double salario;
    private double bonus;
    private double comissao;
    
   
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario () {
        if (tipo == 1){
            return salario;
        }
        else if (tipo == 2){
            return salario + salario * comissao;
        }
        else if (tipo == 3){
            return salario + bonus;
        }
        return 0;
    }
}
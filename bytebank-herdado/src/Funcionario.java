
public abstract class Funcionario {
		private String nome;
		private String cpf;
		private double salario;
		
		
		public abstract double getBonificacao();
			//return this.salario * 0.05;		
		
		
		public String getNome(){
			return this.nome;
		}
		
		public void setNome(String nNome){
			this.nome = nNome;
		}
		
		public String getCpf(){
			return this.cpf;
		}
		
		public void setCpf(String nCpf){
			this.cpf=nCpf;
		}
		
		public double getSalario(){
			return this.salario;
		}
		
		public void setSalario(double nSalario){
			this.salario = nSalario;
		}
		
		 
}

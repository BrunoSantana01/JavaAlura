
public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		
// invalido pois se tornou abstract Funcionario f = new Funcionario();
//		f.setNome("João");
//		f.setSalario(2000.0); 
		
		EditorDeVideo ev = new EditorDeVideo();
		ev.setSalario(2500.0);
				
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		
		
		
		System.out.println(controle.getSoma());
	}

}

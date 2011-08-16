package Academia;

public class AcademiaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Academia acd = new Academia("Strong");
		Cliente c;

		c = new Cliente("Paulo Eduardo Tortorelli","99999999", 65);
		acd.cadastrarCliente(c);

		c = new Cliente("Caroline Borba", "66666666", 50);
		acd.cadastrarCliente(c);
		
		System.out.println(acd.getMediaPeso());
		System.out.println(acd);
		
	}

}

class PropagacionExcepciones {
	public static void  main(String[] args){ 
		try{
			throw new Exception();
		} catch(Exception e) {
			try{
				throw new Exception();
			} catch(Exception e2) {
				System.out.println("Excepción interna");
			}
			System.out.println("Excepción media");
		}
		System.out.println("Excepción externa");
	}
}

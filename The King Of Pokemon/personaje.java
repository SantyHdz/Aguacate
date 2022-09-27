public abstract class personaje {
     int salud;
	 String nombre;
	 int fuerza;
	 int defen;
	 int velocidad;
	 int habilidad;
	 int regeneracion;

	 public void estado(){
		System.out.println("Gengar tiene: ");
		System.out.println("Salud: "+salud);
		System.out.println("Fuerza: "+fuerza);
		System.out.println("Defensa: "+defen);
		System.out.println("Regeneracion: "+regeneracion);
	 }
}

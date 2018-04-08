public static void solicitarDatos()
	{
		
		Scanner tecla = new Scanner(System.in); 

		System.out.println("Estos son los libros diponibles en el momento");
		System.out.println("1. Ángeles y demonios");
		System.out.println("2. El codigo Da vinci");
		System.out.println("3. El simbolo perdido");
		System.out.println("4. Infierno");
		System.out.println("5. Origen");
		System.out.print("Digite el número del libro que desea leer: ");
		int libroElegido = tecla.nextInt();
		
		System.out.print("Cuantas paginas leera por día: ");
		int paginasDía = tecla.nextInt();
		System.out.println();
		double tiempo = calcularLectura(libroElegido, paginasDía);
		
		System.out.println("El tiempo de lectura estimado será de: "+tiempo+" días.");
		System.out.println("Presupueste el tiempo y difrite la lectura. :)");
	}
package miPrincipal;

// Principal.java
// Programa de prueba de la clase Matriz

public class Principal
{
	public static void main( String[] args )
	{
		// Crear la Matriz A
		System.out.println( "Leyendo matriz A..." );
		Matriz A = new Matriz( "m1.mat" );

		// Crear la Matriz B
		System.out.println( "Leyendo matriz B..." );
		Matriz B = new Matriz( "m2.mat" );

		System.out.println();

		// Sumar las matrices
		System.out.println( "Sumando matrices:" );
		System.out.println( A );
		System.out.println( "+" );
		System.out.println( B );
		System.out.println( "=" );
		System.out.println( A.suma(B) );

		// Multiplicar las matrices

	}
}
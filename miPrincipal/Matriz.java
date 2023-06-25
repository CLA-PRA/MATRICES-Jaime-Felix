package miPrincipal;

// Matriz.java
// Clase para implementar una Matriz y elaborar funciones simples

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class Matriz
{
	// Atributos
	private	int	renglones;
	private	int	columnas;
	private	int[][]	datos;

	// Constructor
	public Matriz( String archivo )
	{
		// Los atributos de la matriz se leen desde un archivo de texto
		// en la forma: renglonesXcolumnas y datos
		
		Scanner entrada = null;

		try
		{
			entrada = new Scanner( new File( archivo ) );
		}
		catch ( FileNotFoundException fnfe )
		{
			System.err.println( fnfe.getMessage() );
		}

		// Leer la primer linea: renglonesxcolumnas
		String temporal = entrada.nextLine();
		StringTokenizer st = new StringTokenizer( temporal, "x" );

		// Leer renglones
		renglones = Integer.parseInt( st.nextToken() );

		// Leer las columnas
		columnas = Integer.parseInt( st.nextToken() );

		// Crear la matriz de datos
		datos = new int[ renglones ][ columnas ];

		// Ciclo para leer los siguientes datos
		for ( int i = 0; i < renglones; i++ )
			for ( int j = 0; j < columnas; j++ )
				datos[ i ][ j ] = entrada.nextInt();

		// Cerrar entrada
		entrada.close();
		
	}

	public Matriz( int renglones, int columnas, int[][] datos )
	{
		this.renglones = renglones;
		this.columnas = columnas;
		this.datos = datos;
	}

	// Métodos get (No hay métodos set)
	public int getRenglones()
	{
		return 0;
	}

	public int getColumnas()
	{
		return 0;
	}

	public Matriz suma( Matriz otra )
	{
		// Se supone que las matrices son del mismo tamaño
		int[][] temporal = new int[ renglones ][ columnas ];

		// Ciclo anidado para la suma de matrices

		return new Matriz( renglones, columnas, temporal );
	}

	public Matriz multiplica( Matriz otra )
	{
		// Se supone que el número de columnas de this es igual al número de renglones de otra
		// La matriz resultante tiene el número de renglones de this y el número de columnas de otra
		int[][] temporal = new int[ this.renglones ][ otra.columnas ];

		// Ciclo triple anidado para multiplicación de matrices

		return new Matriz( this.renglones, otra.columnas, temporal );
	}

	public boolean esIgualA( Matriz otra )
	{
		// Si son el mismo objeto son iguales
		if ( this == otra )
			return true;

		// Si los renglones o las columnas son diferentes, las matrices son diferentes
		if ( this.renglones != otra.renglones )
			return false;

		if ( this.columnas != otra.columnas )
			return false;

		// Mismos renglones y columnas.
		// Validar los datos

		boolean iguales = true;

		for ( int i = 0; i < renglones; i ++ )
			for ( int j = 0; j < columnas; j ++ )
				if ( this.datos[ i ][ j ] != otra.datos[ i ][ j ] )
					iguales = false;

		return iguales;
	}

	public String toString()
	{
		String resultado = "";

		for ( int i = 0; i < renglones; i ++ )
		{
			for ( int j = 0; j < columnas; j ++ )
				resultado += String.format( ( j + 1 != columnas ) ? "%d " : "%d", datos[ i ][ j ] );

			if ( i + 1 != renglones )
				resultado += "\n";
		}

		return resultado;
	}
}
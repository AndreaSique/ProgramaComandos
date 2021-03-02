import java.util.Scanner;
public class Inicio {
	public static void main(String[] args) {
		
		//INSTANCIA
		String comando [] = new String[17];
		comando [0]="ls";
		comando [1]="cd";
		comando [2]="pwd";
		comando [3]="cat";
		comando [4]="exit";
		comando [5]="clear";
		comando [6]="chmod";
		comando [7]="head";
		comando [8]="tail";
		comando [9]="su";
		comando [10]="sudo";
		comando [11]="cp";
		comando [12]="dd";
		comando [13]="mv";
		comando [14]="rm";
		comando [15]="grep";
		comando [16]="chown";
		
		String descripcion [] = new String [17];
		descripcion [0]="muestra una lista de informacion sobre archivos contenidos en el directorio actual";
		descripcion [1]="permite cambiar de directorio y navegar por la estructura del sistema de archivos.";
		descripcion [2]="imprime el directorio de trabajo, su ubicación actual dentro del sistema de archivos.";
		descripcion [3]="es utilizado para ver el contenido de archivos pequeños.";
		descripcion [4]="permite volver a la cuenta y cierra la sesión.";
		descripcion [5]="limpia la terminal.";
		descripcion [6]="se utiliza para cambiar los permisos de un archivo o directorio.";
		descripcion [7]="muestra las primeras lineas del archivo.";
		descripcion [8]="se utilizan para ver las ultimas lineas del archivo.";
		descripcion [9]="permite actuar temporalmente como un usuario diferente.";
		descripcion [10]="permite a un usuario ejecutar un comando como otro usuario.";
		descripcion [11]="se utiliza para copiar archivos.";
		descripcion [12]="es utilizado para copiar archivos o particiones enteras al nivel de bits.";
		descripcion [13]="se utiliza para mover un archivo de una ubicación en el sistema de archivos a otra.";
		descripcion [14]="se utiliza para eliminar archivos y directorios.";
		descripcion [15]="es un filtro de texto que busca líneas en una entrada y devolverá aquellas que coincidan con un patrón determinado.";
		descripcion [16]="se utiliza para cambiar el propietario de los archivos y directorios.";
		
		String opciones [] = new String[17];
		opciones [0]="ls -l, ls -r, ls -t, ls -s, ls -a, ls -la ";
		opciones [1]="no tiene opciones";
		opciones [2]="no tiene opciones";
		opciones [3]="no tiene opciones";
		opciones [4]="no tiene opciones";
		opciones [5]="no tiene opciones";
		opciones [6]="no tiene opciones";
		opciones [7]="head -n";
		opciones [8]="tail -n";
		opciones [9]="no tiene opciones";
		opciones [10]="no tiene opciones";
		opciones [11]="no tiene opciones";
		opciones [12]="if, of, bs, count";
		opciones [13]="no tiene opciones";
		opciones [14]="rm -r";
		opciones [15]="no tiene opciones";
		opciones [16]="no tiene opciones";
		
		
		
		String descripcionDeOpciones1 [] = new String[9];
		descripcionDeOpciones1[0]="ls -l";
		descripcionDeOpciones1[1]="ls -r";
		descripcionDeOpciones1[2]="ls -t";
		descripcionDeOpciones1[3]="ls -s";
		descripcionDeOpciones1[4]="ls -a";
		descripcionDeOpciones1[5]="ls -la";
		descripcionDeOpciones1[6]="head -n";
		descripcionDeOpciones1[7]="tail -n";
		descripcionDeOpciones1[8]="rm -r";
		
		String descripcionDeOpciones [] = new String[9];
		descripcionDeOpciones [0]="muestra mas informacion sobre cada uno de los archivos enumerados.";
		descripcionDeOpciones [1]="imprime los resultados en orden alfabético inverso.";
		descripcionDeOpciones [2]="ordena los archivos por su sello de tiempo.";
		descripcionDeOpciones [3]="ordena los archivos por tamaño de archivo.";
		descripcionDeOpciones [4]="muestra los archivos en orden alfabetico";
		descripcionDeOpciones [5]="muestra los archivos en lista de orden alfabetico.";
		descripcionDeOpciones [6]="permite ver cierta cantidad de las primeras lineas de un archivo";
		descripcionDeOpciones [7]="permite ver cierta cantidad de las ultimas lineas de un archivo";
		descripcionDeOpciones [8]="borra todos los orchivos o directorio de forma permanente.";
		
		String cancelar = "salir";
		String noExiste ="Comando no encontrado";
		boolean programaOn = true;
		
		
		
		System.out.println("         BUSQUEDA DE COMANDOS");
		System.out.println("-------------------------------------");
		System.out.println("Bienvenido, puedes ingresar el nombre del comando y si quieres saber mas sobre las opciones del comando ingresa una de ellas");
		System.out.println("");
		
		do {
			Scanner pregunta = new Scanner(System.in);
			System.out.println("COMANDO: ");
			String respuesta = pregunta.nextLine();
			
			int correcto = 0;	
			
			for(int i=0;i<=16;i++) {
				
			if (respuesta.equalsIgnoreCase(comando[i])) {
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("COMANDO: "+comando[i]);
				System.out.println("DESCRIPCIÓN: "+descripcion[i]);
				System.out.println("OPCIONES: "+opciones[i]);
				System.out.println("");
				correcto=1;
				
			}else if (respuesta.equals("cancelar")) {
				programaOn = false;
				correcto =1;
				
			} else {
				for(int a=0;a<=8;a++) {
					
					if(respuesta.equalsIgnoreCase(descripcionDeOpciones1 [a])) {
					System.out.println("--------------------------------------------------------");
					System.out.println("OPCION: "+descripcionDeOpciones1[a]);
					System.out.println("DESCRIPCION: "+descripcionDeOpciones[a]);
					System.out.println("");
					correcto=1;
					i=16;
					
				    }
				 }
			   }
			
			}
			
			
			if (correcto==0) {
				System.out.println("----------------------");
				System.out.println("Comando no encontrado");
				System.out.println("");
			}
			
		} while (programaOn);
			
			
	}

}
		
		
		
	
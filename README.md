# Java

## Fundamentos de Java

## Contenido
- [Ambientes](#ambientes).
- [Versiones](#versiones).
- [Instalación JDK y Netbeans](#instalacion-jdk-y-netbeans).
- [Mi primer programa en Java](#mi-primer-programa-en-java).
- [Comentar el codigo](#comentar-el-codigo).
- [Salida de datos](#salida-de-datos).
- [Entrada de datos](#entrada-de-datos).
- [Tipos de datos](#tipos-de-datos).
- [Variables](#variables).
  - [Primitivos](#1-variables-de-tipo-primitivos).
  - [Inferencia de tipos](#2-inferencia-de-tipos-de-datos).
  - [Referencias](#3-variables-de-tipo-referencias).
  - [Tipos de nombres asignados a una variable](#tipos-de-nombres-asignados-a-una-variable).
- [Operadores aritméticos](#operadores-aritmeticos).
  - [Operador modulo](#operador-modulo).
  - [Operadores de asignación](#operadores-de-asignacion).
  - [Operadores de incremento y decremento](#operadores-de-incremento-y-decremento).
  - [Operadores relacionales](#operadores-relacionales).
  - [Operadores lógicos](#operadores-logicos).
  - [Precedencia de operadores](#precedencia-de-operadores).
- [Promoción de datos o casting](#promocion-de-datos-o-casting).
- [Caracteres UNICODE](#caracteres-unicode).
- [Estructuras de decisión](#estructura-de-decision).
  - [Estructura del if](#estructura-del-if).
  - [Estructura del if-else](#estructura-del-if-else).
  - [Estructura del if-else-if-else](#estructura-del-if-else-if-else).
  - [Estructura del switch](#estructura-del-switch).
- [Estructuras de repetición](#estructuras-de-repeticion).
  - [Estructura for](#estructura-for).
  - [Estructura for each](#estructura-for-each).
  - [Estructura while](#estructura-while).
  - [Estructura-do-while](#estructura-do-while).
- [Arreglos](#arreglos).
  - [Arreglos unidimensionales](#arreglos-unidimensionales).
  - [Arreglos bidimensionales](#arreglos-bidimensionales).
  - [Usos habituales en los arreglos](#usos-habituales-en-los-arreglos).
    - [Busqueda lineal](#busqueda-lineal).
    - [Busqueda binaria](#busqueda-binaria).
    - [Conteos](#Conteos).
    - [Mayor y menor](#mayor-y-menor).
- [Métodos (funciones)](#métodos-funciones).
- [Programación orientado a objetos](#programacion-orientado-a-objetos).
  - [Evolución](#evolucion).
- [Clases](#clases).
  - [Clase DecimalFormat](#clase-decimalformat).
- [Objetos](#objetos).
  - [Características](#caracteristicas).
  - [Instanciar un objeto](#instanciar-un-objeto).
- [Atributos](#atributos).
- [Métodos](#metodos).
  - [Setter y getter](#setter-y-getter).
  - [toString](#tostring).
  - [printf](#printf).
- [Constructores](#constructores).
- [Ordenamiento de datos](#ordenamiento-de-datos).
  - [Método Burbuja](#metodo-burbuja).
  - [Selección](#seleccion).
  - [Inserción](#insercion).
  - [QuickSort](#quicksort).
  - ShellSort.
  - [MergeSort](#mergesort).
- [Sobrecarga de métodos](#sobrecarga-de-metodos).
- [Sobrecarga de constructores](#sobrecarga-de-constructores).
- [Apuntador this](#apuntador-this).
- [Ambitos de variables](#ambitos-de-variables).
- [Paquetes](#paquetes).
- [Modificadores de acceso](#modificadores-de-acceso).
  - [public](#public).
  - [private](#private).
  - [protected](#protected).
  - [static](#static).
  - [final](#final).
- [Herencia](#herencia).
  - [Sobreescritura de métodos](#sobreescritura-de-metodos).
  - [Apuntador super](#apuntador-super).
- [Abstracción](#abstraccion).
- [Clases abstractas](#clases-abstractas).
- [Polimorfismo](#polimorfismo).
- [Interfaces](#interfaces).
- [Manejo de excepciones](#manejo-de-excepciones).
  - [Clases de excepciones](#clases-de-excepciones).
  - [Atrapar excepciones con try, catch y finally](#atrapar-excepciones-con-try-catch-y-finally).
  - [Excepciones comunes](#excepciones-comunes).
  - [Atrapar excepciones con throws y throw](#atrapar-excepciones-con-throws-y-throw).
- [Recursividad](#recursividad).
  - [Recursividad por pila](#recursividad-por-pila).
  - [Recursividad por cola](#recursividad-por-cola).
- [Notación Big O](#notacion-big-o).
  - [Tiempos de ejecucion](#tiempos-de-ejecucion).
- [Coleccion de datos genericos](#coleccion-de-datos-genericos).
  - [Autoboxing and Auto-Unboxing](#autoboxing-and-auto-unboxing).
  - [Colecciones de interfaces y de clases](#colecciones-de-interfaces-y-de-clases).
    - [Listas](#list).
    - [ArraList](#arraylist).
    - [LinkedList](#linkedlist).
    - [Pilas](#pilas).
    - [Colas](#colas).
    - [Sets](#sets).
    - [Mapas](#mapas).
- [Clases y métodos genéricos](#clases-y-metodos-genericos).
  - [Interfaz Comparable](#interfaz-comparable).
  - [Clases genericas](#clases-genericas).
  - [Wildcards](#wildcards).
- [Lambda y flujos en Java SE 8](#Lambda-y-flujos-en-Java-SE-8).
  - [Expresiones lambda](#Expresiones-lambda).
  - [Interfaces funcionales](#Interfaces-funcionales).
  - [Flujos](#Flujos).
    - [Operaciones intermedias de flujo con y sin estado](#Operaciones-intermedias-de-flujo-con-y-sin-estado).
    - [Operaciones intermedias de asignación](#Operaciones-intermedias-de-asignación).
    - [Métodos de referencias](#Métodos-de-referencias).
  - [Referencias](#Referencias).

## Ambientes

Existe dos ambientes que se viven en la práctica en Java:

1. Donde se diseña y desarrolla el programa: Conocido como **JDK** (Java Development kit): Este sería el ambiente del programador, donde escribe su código, compila y hace las pruebas respectivas.

2. El usuario final: Conocido como **JRE** (Java Runtime Enviroment): Esto se le conoce como máquina virtual de java, que es un plugin en el cual se instala en las máquinas para que permita correr el programa creado en el lenguaje de programación java. Hoy en día este plugin viene instalado ya por defecto en la mayoría de exploradores de internet y sistemas operativos.

>Si el programa en java no corre en su equipo, es probable que deba descargar e instalar manualmente el plugin o complemento JRE, que está disponible en la página oficial de Oracle.

La máquina virtual de Java (JRE) se utiliza por seguridad, para proteger tu código fuente contra personas inescrupulosas. De esta seguridad se encarga el equipo de desarrolladores Java y por eso este lenguaje es tan usado en el entorno empresarial, por su gran confiabilidad, aunque, como todos ya debemos de saber que no hay nada 100% seguro en lo que respecta a seguridad.

## Versiones

Java ofrece una versión gratuita para su descargar llamada J2SE (Estandar Edition) y que permite probar la plataforma de manera limitada. Cuando usted va a descargar java, no puede ser otra diferente a la J2SE, porque las otras versiones son comerciales y al descargarla le pedirá una licencia.

La versión comercial de Java se le conoce como J2EE (Enterprise Edition), es una versión costosa que tiene una cantidad de herramientas que complementa la J2SE. De todas formas, la versión J2SE le servirá a cualquier persona para aprender y solucionar muchos problemas con este lenguaje de programación.

También, existe una versión para trabajos enfocados en plataformas móviles, llamada la J2ME (Micro o Mobile Edition), que permite crear plataformas que se adapten bien a las diferentes resoluciones que hoy en día se ve en los dispositivos móviles.

No sobra decir que, todas estas versiones es de propiedad de la empresa Oracle.

## Instalacion JDK y Netbeans

Para empezar a programar en Java, debemos de descargar el kit de desarrollador de Java (JDK) y por comodidad un entorno de programación como Netbeans (aunque usted puede programar en un bloc de notas como en windows).

[Descargar el paquete de JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

[Descargar Netbeans](https://netbeans.apache.org/front/main/download/).

Al descargar, ejecutar el archivo y dar siguiente, siguiente... hasta que salga la opción terminar y listo! Ya puede correr programas en Java.

## Mi primer programa en Java

Un programa que imprima en pantalla el clásico ejemplo de **Hola Mundo!** desde Java.

>Este es un simple ejemplo de la sintaxis de java

1. Abrir Netbeans.
2. Sigue la siguiente ruta en Netbeans: Archivo - Nuevo proyecto - Categoría [java] - proyecto [Aplicación java] - Clic en siguiente - Coloque nombre al proyecto como "MiprimeraAppEnJava" - Clic en terminar.


![Configuración de mi primera app en java](images/primeraapp1.png)

![Configuración de mi primera app en java](images/primeraapp2.png)

```java

package miprimeraappenjava; //Crea una carpeta con el nombre de la clase
import javax.swing.*; //Importo toda las libreria swing.

public class MiPrimeraAppEnJava {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Hola Mundo!"); //Muestro en pantalla el mensaje "Hola Mundo!"
    }
}

```

Los resultados en pantalla:

![Hola Mundo en java](images/primeraapp3.png)


## Comentar el codigo

Existe dos formas de comentar el código en Java:

**Para comentar una sola línea de código**

```java

// Esto es un comentario en java.

```

**Para comentar más de una línea de código**

```java

/*

Esto es

un comentario

de más de una linea

*/

```

>Es una buena práctica de la programación comentar nuestro código para recordar con mayor facilidad lo que se hizo en el momento.

## Salida de datos 

### Impresión de mensajes por pantalla. Uso de print y println

La salida de datos en Java, es bastante sencilla pues basta con usar una línea de código para hacerlo. Para mostrar datos por pantalla en nuestros programas Java. Para mostrar texto por pantalla en Java no es necesario hacer uso de librerías importadas ni similares, pues éstas y están incluidas en la librería java.lang que siempre es importada por defecto. Para imprimir por pantalla, se usa la clase System, el atributo out, y su método println() o print() así: 

```java

System.out.println("Hola mundo!") //Después de escribir el texto hace salto de línea 
System.out.print("Hola amigo!")   //No realiza salto de línea

```

>System es una clase y siempre debe ir con la "S" mayúscula.

## Entrada de datos

### Clase Scanner

La clase Scanner se usa para obtener entrada de datos del usuario y se encuentra en el package java.util.

Para usar la clase Scanner, se crea un objeto de la clase y se usa cualquiera de los métodos disponibles que se encuentran en la documentación de la clase. En este ejemplo, se usara el método nextLine(), que sirve para leer cadenas de carácteres:

```java

import java.util.Scanner;  // Importa la clase Scanner

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Crea un objeto Scanner
    System.out.println("Enter username");

    String userName = sc.nextLine();  // Lee la entrada del usuario 
    System.out.println("Username is: " + userName);  // Salida de la entrada del usuario
  }
}

```

#### Tipos de entrada

En el ejemplo anterior, usamos el método nextLine(), que se usa para leer cadenas. Para leer otros tipos, consulte la siguiente tabla:

| Method | Description |
| --- | --- |
| nextBoolean() | Reads a boolean value from the user |
| nextByte() | Reads a byte value from the user |
| nextDouble() | Reads a double value from the user |
| nextFloat() | Reads a float value from the user |
| nextInt() | Reads a int value from the user |
| nextLine() | Reads a String value from the user |
| nextLong() | Reads a long value from the user |
| nextShort() | Reads a short value from the user |

En el siguiente ejemplo, usamos diferentes métodos para leer datos de varios tipos:

```java

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}

```
> Nota: Si ingresa una entrada incorrecta (por ejemplo, texto en una entrada numérica), obtendrá un mensaje de excepción/error (como "InputMismatchException").

## Tipos de datos

También llamados Tipos de variable. Se llaman Tipos primitivos de variable de Java, a aquellas variables sencillas que contienen información habitual: valores boolean, caracteres y números enteros o de punto flotante.

**Java dispone de ocho tipos primitivos de variables:**

- boolean: sirve para almacenar valores true y false.
- char: para almacenar caracteres.
- byte, short, int y long: para almacenar números enteros.
- Float y double: para almacenar valores reales de punto flotante, es decir, números con decimales.

La siguiente tabla muestra la cantidad de valores que puede almacenar cada tipo de variable:

![Tipos de datos primitivos en java](images/tipos_datos_primitivos_java.png)



## Variables
Una variable es un nombre que contiene un valor que puede cambiar a lo largo del programa. De acuerdo con el tipo de información que contienen, en Java hay dos tipos principales de variable:

### 1. Variables de tipo primitivos:

Están definidas mediante un valor único que puede ser entero, de punto flotante, carácter o booleano. Java permite distinta precisión y distintos rangos de valores para estos tipos de variables (char, byte, short, int, long, float, double, boolean). Ejemplos de variables de tipo primitivo podrían ser: 123, 3456754, 3.1416, 12e-09, 'A', TRUE, etc...

### 2. Inferencia de tipos de datos: 

#### Palabra reservada var

La palabra reservada **var** se introdujo en Java 10. La inferencia de tipo usa la palabra reservada (keyword) **var** con la que detecta automáticamente el tipo de datos de una variable en función del contexto circundante. Los siguientes ejemplos explican dónde se usa var: 

```java
class Demo1 {
  
    public static void main(String[] args)
    {
  
        // int
        var x = 100;
  
        // double
        var y = 1.90;
  
        // char
        var z = 'a';
  
        // string
        var p = "tanu";
  
        // boolean
        var q = false;
  
        // type inference is used in var keyword in which it
        // automatically detects the datatype of a variable
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);
    }
}

```
> La palabra reservada **var** se debe usar al declarar variables en un método de clase y requieren ser iniclaizadas en la misma sentencia para poder inferir el tipo. En otros contextos puede generar error.

### 3. Variables de tipo referencias:

Son objetos en java de una determinada clase y no hacen parte del sistema operativo, como por ejemplo: arrays (arreglos), String (cadenas), etc... Una forma de indentificarlos es cuando los declaran en el tipo de la variable:

```java

	String cadena; // variable que hace referencia a la clase String en java.
	Object obj; // variable que hace referencia a la clase Object en java.

```
### Tipos de nombres asignados a una variable:

Los nombres de variables en Java se pueden crear con mucha libertad. Pueden ser cualquier conjunto de caracteres numéricos y alfanuméricos, sin algunos caracteres especiales utilizados por Java como operadores o separadores (, . + - * / etc...), tampoco podrán ser nombradas con palabras reservadas por la aplicación (main, if, for, while, break, etc...). Estas son las palabras reservadas por el sistema y que no pueden usarse como nombre de variables:

![Palabras reservadas en java](images/palabras_reservadas_java.png)

## Operadores aritmeticos

Son operadores binarios (requieren siempre de dos operando) que realizan las operaciones aritméticas habituales: suma (+), resta (-), multiplicación (*), división (/), y resto de la división o modulo (%).

Ejemplo:

```java

int a, b, suma, resta, div, res; // declaracion de variables
a = 9;
b = 4;
suma = a+b;
resta = a-b;
div = a/b;
res = a%b;

```
### Operador modulo

Operador que devuelve el residuo de la división entre dos operando cualquiera de tipo entero. Ejemplo:

```java
int a, b, res;
a = 9;
b = 3;
res = a % b;
```

### Operadores de asignacion

Los operadores de asignación permiten asignar un valor a una variable. El operador de asignación por excelencia es el operador igual (=). La forma general de las sentencias de asignación con este operador es:

*variable = expresión matemática;*

Java dispone de otros operadores de asignación. Se trata de versiones abreviadas del operador (=) que realizan operaciones "acumulativas" sobre una variable.

**Tabla de operadores de asignación**

![Operadores de asignación](images/operadores_asignacion_java.png)

### Operadores de incremento y decremento

Java dispone del operador incremento (++) y decremento (--). El operador (++) incrementa en una unidad la variable a la que se aplica, mientras que (--) la reduce en una unidad. Estos operadores se pueden utilizar de dos formas:

1. Precedido a la variable (por ej; ++i). En este caso primero se incrementa la variable y luego se utiliza (ya incrementada) en la expresión en la que aparece.


2. Siguiendo a la variable (por ej: i++). En este caso primero se utiliza la variable en la expresión (con el valor anterior) y luego se incrementa.

## Operadores relacionales

Los operadores relacionales sirven para realizar comparaciones de igualdad, desigualdad y relación de menor o mayor. El resultado de estos operadores es siempre un valor boolean (true o false) según se cumpla o no la relación considerada. Estos operadores se utilizan con mucha frecuencia en las estructuras de decisión (bifurcaciones) y en las estructuras repetitivas (bucles).

** Tabla de operadores relacionales **

![Tabla de operadores relacionales](images/tabla_operadores_relacionales_java.png)

### Operadores logicos

Los operadores lógicos se utilizan para construir expresiones lógicas, combinando los valores lógicos (true/false) o los resultados de los operadores relacionales.

** Tabla de operadores lógicos **

![Tabla de peradores logicos en java](images/operadores_logicos_java.png)


### Precedencia de operadores

El orden en que se realizan las operaciones es fundamental para determinar el resultado de una expresión. Por ejemplo, el resultado de x/y*z depende de qué operación (la división o el producto) se realice primero. Java aplica los operadores en expresiones aritméticas en una secuencia precisa, determinada por las siguientes reglas de precedencia de operadores, que generalmente son las mismas que las que se utilizan en álgebra. La siguiente imagen muestra el orden en que se ejecutan los distintos operadores en una sentencia de mayor o menor precedencia:


** Tabla precedencia de operadores **

![Tabla precedencia de operadores](images/precedencia_operadores_java.png)


## Promocion de datos o casting

En muchas ocasiones hay que transformar una variable de un tipo a otro, por ejemplo de int a double, o de float a long. En Java se realizan de modo automático conversiones implícitas de un tipo a otro de más precisión, por ejemplo de int a long, de float a double, etc. Las conversiones de un tipo de mayor a otro de menor precisión requieren una orden explícita del programador, pues son convenciones inseguras que pueden dar lugar a errores (por ejemplo, para pasar a short un número almacenado como int, hay que estar seguro de que puede ser representado con el número de cifras binarias de short). A estas conversiones explícitas de tipo se les llama cast. El cast se hace poniendo el tipo al que se desea transformar entre paréntesis, como por ejemplo:

```java
int a=3, b=5, c=7
double result;
result = (double) a / (double)(b+c) ;
```

>En Java no se puede convertir un tipo numérico a boolean.

## Caracteres UNICODE

Unicode es un estándar de codificación de caracteres diseñado para facilitar el tratamiento informático, transmisión y visualización de textos de múltiples lenguajes y disciplinas técnicas, además de textos clásicos de lenguas muertas. El término Unicode proviene de los tres objetivos perseguidos: universalidad, uniformidad y unicidad. Fuente: [wikipedia](https://es.wikipedia.org/wiki/Unicode).

¿Que es UNICODE? Desde el sitio oficial: http://www.unicode.org/standard/translations/spanish.html

Para evitar problemas por la codificación de caracteres (encoding), es recomendable colocar el código UNICODE de los caracteres latinos cuando programemos en Java. En la siguiente tabla se encuentran los códigos UNICODE de los caracteres latinos más usados:

| Caracter | Codigo UNICODE |
| ----- | ---- |
| á | \u00E1 |
| é | \u00E9 |
| í | \u00ED |
| ó | \u00F3 |
| ú | \u00FA |
| ñ | \u00F1 |
| Á | \u00C1 |
| É | \u00C9 |
| Í | \u00CD |
| Ó | \u00D3 |
| Ú | \u00DA |
| Ñ | \u00D1 |

Ejemplo sintáxis:

```java

public class TestUNICODE {
 
	public static void main(String[] args) {

		System.out.println("\u00E1");
		System.out.println("\u00E9");
		System.out.println("\u00ED");
		System.out.println("\u00F3");
		System.out.println("\u00FA");
		System.out.println("\u00F1");

		System.out.println("\u00C1");
		System.out.println("\u00C9");
		System.out.println("\u00CD");
		System.out.println("\u00D3");
		System.out.println("\u00DA");
		System.out.println("\u00D1");

		String mensaje = "Aqu\u00ED est\u00E1 mi prueba!!!";
		System.out.println(mensaje);        
 
	}
}

```

Fuente: http://ingmmurillo.blogspot.com.co/2012/05/tabla-de-caracteres-latinos-en-unicode.html

## Estructura de decision

Las estructuras de decisión o bifurcaciones (como se les llama en Java), permiten ejecutar una entre varias acciones en función del valor de una expresión lógica o relacional. Se tratan de estructuras muy importantes ya que son las encargadas de controlar el flujo de ejecución de un programa.

Existen dos sentencias de decisión diferentes:

- if.
 - if-else.
 - if-else-if-else.
- switch.

### Estructura del if

Esta estructura permite ejecutar un conjunto de instrucciones en función del valor que tenga la expresión de comparación (se ejecuta si la expresión de comparación tiene valor true).

Sintaxis:

```plain
if (Expresión lógica) {

	[bloque de instrucciones]

}
```

Ejemplo:


```java

x=5;
y=10;

if (x < y) {

	JOptionPane.showMessageDialog(null, x + " es menor que " + y); // Muestra en pantalla el resultado que "5 es menor que 10"

}

```

### Estructura del if-else

Funciona de la misma forma que la anterior, de la cual es una ampliación. Las sentencias incluidas en el else
se ejecutan en el caso de no cumplirse la expresión lógica if (expresión de comparación); es decir, si el
resultado de la expresión lógica if es igual a false.

Sintaxis:

```plain

if (Expresión lógica) {

	[bloque de instrucciones 1]

	}else{

		[bloque de instrucciones 2]
}

```
### Estructura del if-else-if-else

Permite introducir más de una expresión de comparación. Si la primera condición no se cumple, se compara la segunda y así sucesivamente. En el caso de que no se cumpla ninguna de las comparaciones se ejecuta las instrucciones correspondientes al else.

Sintaxis:

```plain

if (Expresión lógica 1) {

	[bloque de instrucciones 1]

}else if(Expresión lógica 2){

		[bloque de instrucciones 2]

	}else if(Expresión lógica 3){

			[bloque de instrucciones 3]

			}else{

				[bloque de instrucciones 4]
}

```

### Estructura del switch

Se trata de una alternativa a la sentencia if else if else cuándo se compara la misma expresión con distintos valores.

Sintaxis:

```plain

switch (Variable a evaluar o Expresión) {
	case valor1: [bloque de instrucciones 1]
	break;
	case valor2: [bloque de instrucciones 2]
	break;
	case valor3: [bloque de instrucciones 3]
	break;
	.
	.
	default: [bloque de instrucciones 3]
}

```

#### Caracteristicas del switch

1. La sentencia case se corresponde con un único valor de expresión. No se pueden establecer rangos o condiciones sino que se debe comparar con valores concretos.

2. Los valores no comprendidos en ninguna sentencia case se pueden gestionar en default, que es opcional.

3. En ausencia de break, cuándo se ejecuta una sentencia case se ejecutan también todas las case que van a
continuación, hasta que se llega a un break o hasta que se termina el switch.

Ejemplo:

```java

// Escriba un algoritmo que permita mostrar la equivalencia en número decimal de los números romanos (I,V,X,L,C,D,M).

import javax.swing.*;

public class EjemploEstructuraDecision {

    public static void main(String args[]) {

        char x;

        x = JOptionPane.showInputDialog("Digite algunos de los siguientes números romanos [I,V,X,L,C,D,M]: ").charAt(0);
        //Al final se le pone .charAt(0) para tomar el primer valor que digite el usuario en teclado.

        x -= 32; //Esto convierte la letra en mayuscula (por si el usuario lo escribe en minuscula...). De mayuscula a minuscula se suma 32.

        switch (x) {
            case 'I':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 1");
                break;
            case 'V':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 5");

                break;
            case 'X':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 10");

                break;
            case 'L':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 50");

                break;
            case 'C':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 50");

                break;
            case 'D':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 500");

                break;
            case 'M':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 1000");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Error: Digite I,V,X,L,C,D,M ");

        }//Fin del switch
    }
}//Fin del programa

```
## Estructuras de repeticion

Un bucle se utiliza un proceso repetidas veces. El código entre las llaves {} (opcionales si el proceso repetitivo consta de una sola línea), se ejecutará mientras se cumpla unas determinadas condiciones. Hay que prestar especial atención a los bucles infinitos, hecho que ocurre cuando la condición de finalizar el bucle (expresión lógica) no se llega a cumplir nunca. Se trata de un fallo muy típico, habitual entre programadores con poca experiencia.

Existen tres (3) bucles o ciclos a saber:

1. for
2. while
3. do – while

### Estructura for

Sintaxis:

```plain
for (inicialización de variable; expresión lógica; incremento){
[Bloque de instrucciones]
}
```
La sentencia(s) de Inicialización de variable(s) se ejecuta(n) al comienzo del for, e incremento después de que se ejecute el bloque de Instrucciones. La expresión lógica se evalúa al comienzo de cada iteración; el bucle termina cuándo la expresión de comparación toma el valor de false. NOTA: Cualquiera de las tres partes puede estar vacía. La inicialización y el incremento pueden tener varias expresiones separadas por comas.

Ejemplo:

```java
for(int i=1, j=i+10; i<5; i++, j=2*i){
	System.out.println("i= " + i + "j= " + j);
}
/*El siguiente bloque de ejemplo imprimirá los siguientes datos:
i= 1	j= 11
i= 2	j= 4
i= 3	j= 6
i= 4	j= 8
*/
```

### Estructura for each

Es una versión mejorada de la estructura del `for` tradicional y sirve especialmente para recorrer colecciones de datos (Listas, Arrays, etc...).

Sintaxis:

```plain
for (<Tipo> elemento : Collection){
      //TODO: Bock code here...
      // la variable temporal elemento, contiene cada dato de la colección a iterar.
    }
```

Ejemplo:

```java
    String[] arreglo = new String[3];
    arreglo[0] = "Victor";
    arreglo[1] = "Jaime";
    arreglo[2] = "Harry";

    for (String elemento : arreglo){
      System.out.println(elemento);	// Imprime cada elemento del arreglo.
    }
```
### Estructura while

En el ciclo while se ejecutan todas las instrucciones contenidas en el bloque mientras la expresión lógica sea verdadera (true); estas se ejecutan n veces, hasta cuándo la expresión lógica dé como resultado falso (false) lo cual hace que finalice el ciclo.

Sintaxis:

```plain
while (Expresión lógica) {
[bloque de instrucciones]
}
```

Ejemplo:

```java
// Escriba un algoritmo que dados los valores X y N, permita calcular X^N. [Hacer con estructura WHILE]
import javax.swing.*;
public class EstructuraWhile {
    public static void main (String args[]){
        double x, p=1;
        int n, i;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite la base: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el exponente: "));
        if (n>=0){
            i=1; //Debo darle valor a la variable que va a servir como contador antes de entrar al bucle.
            while(i<=n){
                p*=x;
                i++; //Aquí modifico el contador porque sino entonces me quedaría un bucle infinito.
            }
        }
        else{
            i=-1;
            while(i>=n){
                p*=1/x;
                i--;
            }
        }
        System.out.println("La potencia es = " + p);

        /*Supongamos que el usuario digite como base x=5 y como exponente n=2, entonces el resultado que debe mostrar en pantalla es: La potencia es = 25
         * Supongamos que el usuario digite como base x=5 y como exponente n=-2, entonces el resultado que debe mostrar en pantalla es: La potencia es 0.04
         */
    }
} //fin del programa
```

### Estructura do-while

Es similar al bucle While pero con la particularidad de que el control está al final del bucle (lo que hace que el bucle se ejecute al menos una vez, independientemente de que la condición se cumpla o no). Una vez ejecutado el bloque de instrucciones, se evalúa la condición: si resulta verdadera (true) se vuelven a ejecutar las sentencias y/o instrucciones contenidas en el "bloque de instrucciones del do-while", mientras que si la condición se evalúa a Falso (false) finaliza el bucle.

Sintaxis:

```plain
do {
[bloque de instrucciones]
} while (Expresión lógica);
```
Ejemplo:

```java
// Ejemplo: Escriba un algoritmo que dados los valores X y N, permita calcular X^N. [Hacer con estructura DO WHILE]
import javax.swing.*;
public class Do_whileee {
   public static void main (String args[]){
       double x, p=1;
       int n, i=1;
       x = Double.parseDouble(JOptionPane.showInputDialog("Digite la base: "));
       n = Integer.parseInt(JOptionPane.showInputDialog("Digite el exponente: "));

       if(n>=0){
           do{
               p*=x;
               i++;
           }while(i<=n);
       }
       else{
           do{
               p*=1/x;
               i--;
           }while(i>=n);
       }
       System.out.println("La pontencia es: " + p);
        /*Supongamos que el usuario digite como base x=5 y como exponente n=2, entonces el resultado que debe mostrar en pantalla es: La potencia es = 25
        * Supongamos que el usuario digite como base x=5 y como exponente n=-2, entonces el resultado que debe mostrar en pantalla es: La potencia es 0.04
        */
    }
}
```
## Cómo generar un número aleatorio en un rango de valores en Java

Hay varias formas de generar un número aleatorio. En este primer caso vamos a usar la librería Math para Java. Dentro de esta librería vamos a disponer del método random, como no podía ser de otra manera, claro.
En Java, el siguiente código genera un número aleatorio entre dos valores, un mínimo y un máximo:
```plain
int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;
```
Por ejemplo, si queremos elegir un número aleatorio entre los valores 18 y 65, ambos inclusive, sería así:
```java
int n = (int) (Math.random() * (66 - 18)) + 18;
```
Otra forma de hacerlo es también:
```java
Random r = new Random();
int n = r.nextInt(6-4)+4;
```
## Arreglos

En Java, un arreglo es un grupo de variables (llamadas elementos o componentes) que contienen valores, todos del mismo tipo. Recuerde que los tipos en Java se dividen en dos categorías: tipos primitivos y tipos de referencia. Los arreglos son objetos, por lo que se consideran como tipos de referencia. Los
elementos de un arreglo pueden ser tipos primitivos o de referencia (incluyendo arreglos). Para hacer referencia a un elemento específico en un arreglo, debemos especificar el nombre de la referencia al arreglo y el número de la posición del elemento en el arreglo. El número de la posición del elemento se conoce formalmente como el índice o subíndice del elemento.

![Imagen representando a un arreglo unidimensional en java](images/arreglos_java.png)


### Arreglos unidimensionales

Los arreglos unidimensionales son los tipos de datos que nos permite almacenar una cantidad finita de datos u objetos y a su vez, los datos se guardan con un valor de referencia llamado "subíndice", el cual, nos permitirá consultar cualquier dato dentro del arreglo con dicho número de subíndice.

#### Características de un arreglo unidimensional:

- Estructura de almacenamiento estática (No puede cambiar su longitud después de haberla creado), que permite referenciar datos u objetos con un mismo nombre, que es posible distinguir entre sí, por un subíndice.
- Es homogénea es decir, contiene solo un tipo de dato.
- Su aplicación se enmarca al uso masivo de datos, mediante la ayuda de los ciclos.
- Para consultar la longitud del arreglo, se utiliza el atributo nombre_arreglo.length

Sintaxis:

>Se puede declarar un arreglo con o sin el tamaño de longitud, pero es importante tener claro que el arreglo deberá tener especificado dicha longitud, antes de ser usado.

```java

double notas [] = new double[10];

// Definir arreglos de forma directa:

int edades [] = {16, 15};

char vocals []= {'a','e','i','o','u'};

String dias[]={"lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};

```
También es muy común llenar los arreglos con el uso de ciclos:
```java
String nombres[] = new String [40];
for (int i=0 ; i < nombres.length ; i++){
	nombres[i] =JoptionPane.showInputDialog("Ingrese nombre "+ (i + 1)+":" );
}
```
Como también, el uso de ciclos para imprimir los datos que están almacenados en el arreglo:
```java
String nombres[] = new String [40];
for (int i=0 ; i < nombres.length ; i++){
	JOptionPane.showMessageDialog(null, nombres[i]);
}
```

### Arreglos bidimensionales

Los arreglos multidimensionales de dos dimensiones se utilizan con frecuencia para representar tablas de valores, las cuales consisten en información ordenada en filas y columnas. Para identificar un elemento específico de una tabla, debemos especificar dos subíndices. Por convención, el primero identifica la fila del elemento y el segundo su columna. Los arreglos que requieren dos subíndices para identificar un elemento específico se llaman arreglos bidimensionales (los arreglos multidimensionales pueden tener más de dos dimensiones). Java no soporta los arreglos multidimensionales directamente, pero permite al programador especificar arreglos unidimensionales, cuyos elementos sean también arreglos unidimensionales, con lo cual se obtiene el mismo efecto.

![Imagen ilustrativa de un arreglo bidimensional](images/arreglo_bidimensional_java.png)

Ejemplos de declaracion de arreglos [sitanxis]:

![Ejemplos de arreglos 1](images/ejemplos_arreglos_1.png)


![Ejemplos de arreglos 2](images/ejemplos_arreglos_2.png)

>Se permite que dentro de cada fila se tenga diferente número de columnas

#### Acceso a un dato

Para acceder a los diferentes elementos del arreglo, se realiza mediante el nombre del arreglo y su posición correspondiente escrita en dos corchetes, donde primero van las filas y luego la columna:

![Ejemplos de arreglos 3](images/ejemplos_arreglos_3.png)

#### Recorrido

Si se desea recorrer todo el arreglo para consultar los datos, se debe hacer dos ciclos aninados, uno que recorra las filas y el otro las columnas.

Sintaxis:

```java

for(int i=0; i < biarreglo.length; i++){

	for(int j=0; j < biarreglo[i].length; j++){

		// Bloque de instrucciones
	}
}

```

#### Ordenamiento de  arrays en Java. Método Arrays.sort()
Para ordenar arrays de cualquier tipo Java dispone del método sort de la clase Arrays. Para utilizarlo es necesario incluir el **import java.util.Arrays;**
El siguiente  ejemplo ordena de forma ascendente un  array de Strings:
```java
	String[] nombres = {"juan", "pedro", "ana", "maria", "felipe", "luis", "eduardo"};
        Arrays.sort(nombres);
        for (String s : nombres) {
            System.out.println(s);
        }
```
**Arrays.sort** ordena de forma ascendente (de menor a mayor). Para ordenar un array de forma descendente (de mayor a menor) hay que indicarlo utilizando el método reverseOrder() de la clase Collections.
Para utilizar reverseOrder es necesario incluir el **import java.util.Collections;**
Por ejemplo, para ordenar el array nombres de forma descendente escribimos la instrucción Arrays.sort de la siguiente forma:
```java
	Arrays.sort(nombres, Collections.reverseOrder());
```
También tenemos la opción de ordenar solo una parte del array, indicando la posición del elemento inicial y la del elemento final (que no se incluye en la ordenación).
Por ejemplo, para ordenar solo los elementos 1, 2 y 3 ("pedro", "ana", "maria") del array nombres escribimos la instrucción de esta forma:
```java
	Arrays.sort(nombres, 1, 4);
```
El 1 indica la posición del elemento donde comienza la ordenación y el 4 indica la posición del primer elemento que no entra en la ordenación.
El contenido del array después de esta ordenación es el siguiente:
```
juan
ana
maria
pedro
felipe
luis
eduardo
```
Vemos que solo se han ordenado los elementos 1, 2 y 3. El resto quedan igual. 

También podemos ordenar solo una parte del array en orden inverso. Por ejemplo, para ordenar solo los elementos 1, 2 y 3 en orden inverso:
```java
	Arrays.sort(nombres, 1,4, Collections.reverseOrder());
```

El contenido del array es ahora:
```
juan
pedro
maria
ana
felipe
luis
eduardo
```
Con Arrays.sort podemos ordenar arrays de cualquier tipo de datos. Por ejemplo, para ordenar un array de enteros:
```java
	int [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
	Arrays.sort(numeros);                                                                                             
	//mostrarlo ordenado
	for (int n : numeros) {
     		System.out.println(n);                                                                                       
	}
```
Collections.reverOrder() solo funciona para arrays de objetos. Por este motivo si queremos ordenar de forma descendente arrays de tipos de datos simples debemos utilizar la clase envolvente equivalente al tipo de dato básico. Puedes ver las clases envolventes que corresponden a cada tipo de dato en esta entrada.
Por ejemplo, para ordenar un array de enteros forma descendente hay que declararlo de tipo Integer en lugar de int.
```java
	Integer [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
	Arrays.sort(numeros, Collections.reverseOrder());                                                                 
	for (int n : numeros) {
       		System.out.println(n);                                                                                     
	}
```


#### Números aleatorios - Math random
En el desarrollo de aplicaciones, suele ser necesario generar números aleatorios. Para hacer esto, Java proporciona las clases **java.lang.Math** y **java.util.Random**.

##### Clase java.lang.Math en Java
La clase Math, se encuentra en paquete java.lang. Esta clase contiene un método estático Math.random() que genera números aleatorios de tipo double.

Math.random()  proporciona un número positivo mayor o igual que 0,0 y menor que 1,0. 

Si se usa Math.random() se puede optar por utilizarlo con o sin parámetros. Los parámetros se utilizan para indicar el intervalo o rango de números dentro del cual se generarán los valores aleatorios.

###### Sintaxis del Método Math.random() en Java

A continuación se puede ver la sintaxis necesaria para poder usar el método Math.random() en el siguiente ejemplo:  

- Genera un numero aleatorio double entre 1 y 30
```java
	//Math.random()*numeroMaximo+numeroMinimo;
        double resultado = Math.random()*30+1;
```

##### Clase java.util.Random en Java
La clase Random en el paquete java.util.Random permite generar números aleatorios, pero a diferencia del método Math.random() es necesario instanciarla. Para instanciar se puede emplear un constructor sin parámetros o bien introducir una semilla.

La clase java.util.Random  tiene varios métodos como nextInt(), nextFloat(), nextDouble(), nextLong(), etc. nextInt() devuelve un pseudoaleatorio de tipo int con valores entre 0 y 232 producidos con aproximadamente la misma probabilidad, mientras que los métodos nextFloat() y nextDouble() permiten obtener números de coma flotante entre valores de tipo double entre 0,0 y 1,0. En el caso de nextLong, éste devuelve un valor pseudoaleatorio largo, uniformemente distribuido de la secuencia del generador de números aleatorios.

###### Sintaxis del Método Random() en Java
La sintaxis que se debe usar para generar números aleatorios con el método Random() puede verse en el siguiente ejemplo:
```java
import java.util.Random;
    public class Programa {
        public static void main(String arg[ ]) {
              //Generación de número aleatorio e impresión en pantalla con System.out.println.
              Random random = new Random();
              System.out.println("Número aleatorio entre [0,5[ : "+rnd.nextDouble());
         }
     }
```

### Usos habituales en los arreglos

#### Busqueda lineal

Se trata de recorrer todo el arreglo, comparando dato por dato, hasta encontrar el dato buscado.

```java

// Verificar si en el arreglo denominado "carreras" se ha almacenado la carrera "Ingeniería Informática".

for (int i=0 ; i< carreras.length ; i++){

	if (carreras[i].equals (“Ingeniería Informática”){
    	    JOptionPane.showMessageDialog (null, “La carrera buscada se encontró en la posición”+i);
	}
}


```

>Si en el arreglo hay datos repetidos, entonces la búsqueda devuelve el primero que encuentre.


#### Busqueda binaria

El algoritmo de búsqueda binaria es más eficiente que el algoritmo de búsqueda lineal, pero requiere que el arreglo se ordene primero antes de realizar una búsqueda.

El método simplemente lo que va a hacer es reducir la búsqueda a la mitad, partiendo desde la mitad del arreglo y comparar si el valor de la mitad es igual al buscado. Si no son iguales, entonces valida si el valor a buscar es menor que el de la mitad. Si es menor, entonces descarta el resto de datos que se encuentre desde la mitad en adelante del arreglo. Si el valor a buscar es mayor que el de la mitad, entonces descarta el resto de datos que esté desde la mitad al inicio del arreglo. Este proceso lo seguirá haciendo hasta que el valor de la mitad sea el mismo que el valor buscado.

Método:

```java
  // realiza una búsqueda binaria en los datos
  public int busquedaBinaria(int elementoBusqueda) {
    int inferior = 0; // extremo inferior del área de búsqueda
    int superior = datos.length - 1; // extremo superior del área de búsqueda
    int medio = (inferior + superior + 1) / 2; // elemento medio
    int ubicacion = -1; // devuelve el valor; -1 si no lo encontró

    do // ciclo para buscar un elemento
    {
      // si el elemento se encuentra en medio
      if (elementoBusqueda == datos[medio]) {
        ubicacion = medio; // la ubicación es el elemento medio actual
      } else if (elementoBusqueda < datos[medio]) { // el elemento medio es demasiado alto
        superior = medio - 1; // elimina la mitad superior
      } else // el elemento medio es demasiado bajo
      {
        inferior = medio + 1; // elimina la mitad inferior
      }
      medio = (inferior + superior + 1) / 2; // recalcula el elemento medio
    } while ((inferior <= superior) && (ubicacion == -1));

    return ubicacion; // devuelve la ubicación de la clave de búsqueda
  } // fin del método busquedaBinaria
```
Método recursivo:
```java
// Método privado que implementa recursivamente la búsqueda binaria.
// El vetor au DEBE estar ordenado ascendentemente !!!
// Si el valor x está en el vector, entonces retorna su posición (ó índice)
// en el arreglo. De lo contrario, retorna -1.
private int busquedaBinariaRecursiva(int x, int izq, int der, int[] au) {

        int mitad = (izq + der) / 2; // obtengo el indice que da la mitad de la posición del arreglo

        //caso base
        if (izq > der) {
            return -1;
        } else if (x < au[mitad]) { // caso recursivo
            return busquedaBinariaRecursiva(x, izq, der - 1, au);
        } else if (x > au[mitad]) {
            return busquedaBinariaRecursiva(x, izq + 1, der, au);
        } else {
            return mitad;
        }

    }

```
Otro método de forma iterativa:

```java

    // El vetor v1 DEBE estar ordenado ascendentemente !!!
    // Si el valor x está en el vector, entonces retorna su posición (ó índice)
    // en el arreglo. De lo contrario, retorna -1.
    public int busquedaBinaria_NO_Recursiva(double x) {
        int[] v1 = ordenarAscendente();  // El arreglo v1 está ordenado.
        int izq = 0, der = v1.length - 1, mitad = 0;
        while (izq <= der) {
            mitad = (izq + der) / 2;
            if (x < v1[mitad]) {
                der = mitad - 1;
            } else if (x > v1[mitad]) {
                izq = mitad + 1;
            } else {
                return mitad;
            }
        }
        return -1;    // Significa que x no está en el arreglo.
    }

```

En tiempos de ejecución ([Big O](#notacion-big-o)), la búsqueda binaria se comporta de manera logarítmica, O(log n), a diferencia de la búsqueda linea que sería O(n), lo que significa que, para un arreglo de mil millones de elementos, ésta es una diferencia entre un promedio de 500 millones de comparaciones para la búsqueda lineal, ¡y un máximo de sólo 30 comparaciones para la búsqueda binaria!

#### Conteos

```java

// Cuantos estudiantes del curso de Java, aprobaron y cuantos reprobaron.

int aprobaron=0, reprobaron=0; // Contadores

for (int i=0 ; i< notas.length ; i++){

        if (notas[i] >= 3){
                aprobaron ++;
        }else{
                reprobaron++;
    }
}

JOptionPane.showMessageDialog (null,
      “Número de estudiantes que aprobaron: “ + aprobaron +
		“ \n Número de estudiantes que reprobaron: ” + reprobaron);
}

```

#### Mayor y menor

Aquí se puede presentar dos casos:

- Si se conoce el dominio de los datos. Por ejemplo: Las notas son entre 0 y 5.
- No se conoce el dominio de los datos. Por ejemplo: el mayor y menor de un conjunto de números reales
dados.

Si se conoce el dominio de los datos, entonces esta serían las recomendaciones:

- La variable que almacenará el mayor debe iniciar en el valor más bajo posible.
- La variable que almacenará el menor debe iniciar en el valor más alto posible.
- De allí en adelante se compara el dato a procesar con lo que se lleva como mayor o como menor.
- Estas variables (mayor y menor se deben reasignar si se encuentra un nuevo mayor o menor).

Ejemplo:

```java

//Encuentre la nota mas alta y la mas baja del curso de Java.

double mayor=0, menor=5;

for (int i=0 ; i< notas.length ; i++){

        if (notas[i] > mayor)
                mayor = notas[i];

        if (notas[i] < menor)
                menor = notas[i];
}

JOptionPane.showMessageDialog (null, “La nota más alta fue: “ + mayor +
									“\nLa nota mas baja fue: ” + menor);

```

Recomendaciones para cuando no se conoce el dominio de los datos:

- La variable que almacenará el mayor y el menor se deben iniciar en el primer valor conocido.
- De allí en adelante se compara el dato a procesar con lo que se lleva como mayor o como menor.
- Estas variables (mayor y menor se deben reasignar si se encuentra un nuevo mayor o menor).

Ejemplo:

```java

// Encuentre el mayor y el menor de un grupo de números reales cualquiera.

double mayor=numeros[0], menor=numeros[0];

for (int i=0 ; i< numeros.length ; i++){

        if (numeros[i] > mayor)
                mayor = numeros[i];

        if (numeros[i] < menor)
                menor = numeros [i];
}

JOptionPane.showMessageDialog (null, “El número mayor es: “ + mayor +
										“\nEl número menor es: ” + menor);

```

## Métodos (funciones)
Si en un programa tenemos una serie de instrucciones que repiten varias veces, ¿por qué no agruparlas y aislarlas, darles un nombre, y llamarlas para que se realicen cuando se las necesite, en vez de escribirlas varias veces?
También, a veces, se desea dividir el código en trozos aislados, bien sea por separar e identificar mejor las diferentes actividades, bien porque alguno de los trozos se desee individualizar para reutilizarse en el futuro.
Esto se consigue mediante métodos.

Un método es un miniprograma, un conjunto de instrucciones agrupadas, dentro de una clase, a las que se da un nombre, y que realizan una determinada tarea. A este conjunto de instrucciones se le puede llamar luego mediante su nombre.
Cuando se llama a un método, la ejecución del programa pasa al método y cuando éste acaba, la ejecución continúa a partir del punto donde se produjo la llamada.

Los métodos permiten, entre otras ventajas:
- separar las operaciones en módulos, aislados y más fáciles de comprender
- reutilizar código, pues si unas operativas son repetitivas, se repitan varias veces, puedo escribirlas solo una vez y llamarlas tantas veces como quiera

### Creación de métodos

Este ejemplo ilustra el caso de una serie de instrucciones que, inicialmente, se repiten varias veces, pero que se han agrupado, y aislado en un método (llamado pedir) , al que se llama cuando se necesita.

![Crear métodos](images/metodos1.png)

Los métodos deben escribirse dentro de una clase. Su contenido está delimitado entre llaves ( { } ), con lo que queda claro dónde están sus límites.

El subprograma main que se ha usado hasta ahora es, en realidad, un método, uno que escribimos dentro de nuestra clase. Es un método especial porque es el punto de entrada al programa, eso es, cuando se manda ejecutar un programa Java busca un método llamado main, y por ahí empieza a leer instrucciones.

Nuestros métodos, pues, se escribirán dentro la clase, fuera del main, y al mismo nivel que éste.

Al crear un método, éste es el formato que hay que usar (el contenido entre [ ] es opcional):

![Crear métodos](images/metodos2.png)

Este es nuestro primer método, consiste en algo muy simple que pide un texto por teclado y lo imprime en mayúsculas:

```java
void saludar() {
	System.out.println("Dame tu nombre y yo te lo imprimo en mayusculas...");
	Scanner sc = new Scanner(System.in);
	String texto = sc.nextLine();
	System.out.println(texto.toUpperCase());
}
```

### Llamada (invocación) a métodos 

Desde un método main, u cualquier otro método, se puede llamar al método creado simplemente con el nombre y los paréntesis (en nuestro caso, aun estarán vacíos).

Leer atentamente este ejemplo, ejecutarlo y evaluar los resultados:

```java
public class Inicio {
	public static void main(String[] args) {
		System.out.println("Primera linea del programa");
		System.out.println("Estas lineas se ejecutan antes de llamar al método");
		saludar();
		System.out.println("Estas lineas se ejecutan despues de llamar al método");
	System.out.println("Ultima linea del programa");
	}
	public static void saludar() {
		System.out.println("-- Esta es la primera linea del método que se ejecuta");
		System.out.println("Dame tu nombre y yo te lo imprimo en mayusculas...");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		System.out.println(texto.toUpperCase());
		System.out.println("-- Esta es la ultima linea del método que se ejecuta");
	}
}
```

### Métodos con parámetros

A los métodos, además de decirles **"Haz lo que dice aquí ", se les puede decir también: "Haz lo que dice aquí, pero cuidado que además te paso esta información por si la quieres usar”.** 

Esto es lo que se llama parámetros de entrada

**"Haz lo que dice aquí, pero cuidado que cuando acabes, me voy a quedar esperando que me des un resultado, alguna información a mí”.** 

Esto es el llamado valor de resultado (o de retorno), y se dice que el método da como resultado un valor, un valor de retorno

Se pueden combinar ambos casos, de modo que un método puede "recibir información adicional (parámetros) para usarla si lo desea, y a la vez, dar como resultado un valor al sitio desde donde se le llamó inicialmente"

![Crear métodos](images/metodos3.png)

#### Crear método con parámetros

Cuando un método necesita información, y no puede acceder a ella, puede pedir que se le envíe dicha información por medio de los parámetros de entrada.

¿Cómo se definen los parámetros? En el método, cuando se escribe en la clase se debe especificar (entre los paréntesis) para cada parámetro:

**tipo de dato** que se espera recibir en el futuro

**nombre interno** con el que vamos a llamar a lo que venga

Ejemplo:

![Crear métodos](images/metodos4.png)

Se pueden poner **varios parámetros separados por coma**, y pueden ser de diferente tipo:

Ejemplo:

![Crear métodos](images/metodos5.png)

El tipo de dato puede ser un tipo **primitivo**, o una **clase** Java o propia (depende de lo que se desee recibir)

Ejemplo:

![Crear métodos](images/metodos6.png)

Ejemplo: Imaginemos que al método que se vio antes que leía un String por teclado, le vamos a añadir que antes de hacer esta petición, muestre un mensaje, pero no siempre el mismo, sino el texto que se le pase como parámetro:

```java
// Método que recibe un string como parámetro, lo imprime y luego pide
// por teclado una cadena, que tambien imprime
public static void leerCadena(String mensaje) {
	System.out.println(mensaje);
	Scanner sc = new Scanner(System.in);
	String texto = sc.nextLine();
	System.out.println(texto);
}
```

![Crear métodos](images/metodos7.png)

Cuando se usa un método con argumentos, al indicar el argumento, se puede escribir un valor explícito (un número, una cadena) o escribir una variable (que contiene el valor a pasar).

![Crear métodos](images/metodos8.png)

### Métodos con más de un parámetro

Vamos a coger el método de ejercicios anteriores, que elida una cadena por consola, y vamos a hacer que reciba dos parámetros, además del mensaje que ya tenía, un int que usaremos para validar que la cadena que se lea por teclado no sea muy larga (el int será el número máximo de caracteres que se puedan leer). El nuevo método se llamara
leerCadenaAcotada:

```java
public static void leerCadenaAcotada(String mensaje, int max) {
	System.out.println(mensaje);
	Scanner sc = new Scanner(System.in);
	String texto = sc.nextLine();
	if (texto.length() > max) {
		System.out.println("Cadena muy larga, maximo : "+ max);
	} else {
		System.out.println(texto);
	}
}
```

En este caso, cuando se llama desde el programa principal:

```java
leerCadenaAcotada("Incluya un texto...",20);
```

**Los parámetros siempre en el orden correcto, con el tipo correcto, y el número correcto de ellos**

el programa principal dice: “Llamar a un método llamado leerCadenaAcotada y ADEMÁS, le envió esta información: “Introduzca un texto” y 20 (UN STRING, Y UN INT)” y luego buscará si realmente existe un método que se llame así y que:

• tenga esos parámetros, solo dos, y

• con esos tipos de datos, y

• en ese orden

### Métodos con valor de resultado

**CREAR el método con valor de resultado**

![Crear métodos](images/metodos9.png)

Para llamar a un método que tiene un valor de resultado, hay que considerar que el método, tras ejecutarse, se convierte en una información, la que el método da como respuesta. Este resultado se puede asignar a otra variable que debe ser capaz de recibir el tipo de dato que retorna el método.

Si un método ha de dar como resultado un valor, y no tiene orden return, falla. También falla si el compilador prevé que puede que no se llegue nunca a una orden return. Por ejemplo, este método falla al compilar.

¿Por qué? porque si se llama al método y se le pasa un parámetro que no sea “Amarillo”, no se cumple la condición del if, con lo que el return no se ejecuta, y no hay otro return

## Programacion orientado a objetos

La programación orientada a objetos es un paradigma surgido en los años 70, que utiliza objetos como elementos fundamentales en la construcción de la solución. Un objeto es una abstracción de algún hecho o ente del mundo real, con atributos que representan sus características o propiedades, y métodos que emulan su comportamiento o actividad. Todas las propiedades y métodos comunes a los objetos se encapsulan o agrupan en clases. Una clase es una plantilla, un prototipo para crear objetos; en general, se dice que cada objeto es una instancia o ejemplar de una clase. la POO está basado en varias técnicas, incluyendo herencia, cohesión, abstracción, polimorfismo, acoplamiento y encapsulamiento. Su uso se popularizó a principios de la década de los años 1990. En la actualidad, existe una gran variedad de lenguajes de programación que soportan la orientación a objetos.


### Evolucion

![Imagen de la evolución en los paradigmas de la programación](images/evolucion_poo.png)

## Clases

Para definir una clase en JAVA, se emplea la palabra clave `class` seguida por el nombre de la clase, el cual se recomienda que esté escrito en singular e iniciando con letra mayúscula; este nombre debe ser representativo de los elementos que contiene la clase.

Ejemplo:

class Circulo
class Pago
class Caja
class Televisor
class Empleado
class Rectangulo
class Cliente
class Libro

**Forma de una clase:**

![Forma de una clase de manera grafica](images/forma_clase.png)

## Clase DecimalFormat

Creando un objeto de la clase DecimalFormat, podemos darle un formato a un número con los separadores de millares o de unidades. Ejemplo:

```java

String valor = "1000";
Int v = 1000000

// le enviamos al constructor el patrón que deseamos seguir para separar las unidades.
DecimalFormat formatea = new DecimalFormat("###,###.##"); 
 
System.outprintln(formatea.format(valor));
//Nos devuelve 1.000
System.out.println(formate.format(v));
//Nos devuelve 1.000.000

```

Fuente: http://www.yoelprogramador.com/puntos-decimales-y-separador-de-miles-en-java/
Oracle: https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html

## Objetos

Es un ejemplar concreto de una clase. Las clases son como tipos de variables, mientras que los objetos son como variables concretas de un tipo determinado.

Sintaxis:

`«Nombre de la Clase» NombreDeObjeto;`

Ejemplo:

```java

Persona p1; p1 = new Persona();
Circulo cl; cl = new Circulo();

```

Cada objeto es una copia de una clase, se dice entonces que cada objeto de una clase dada contiene la estructura y el comportamiento definidos por la clase. A la creación de un objeto se le llama instancia de una clase. La clase es una construcción lógica, el objeto tiene la realidad física.

### Caracteristicas

- Estado (atributos o características).
- Comportamiento (métodos asociados).
- Identidad (ocupa un lugar en memoria).
- Ciclo de vida.
- Visibilidad.
- Relación y colaboración con otros objetos.

### Instanciar un objeto

Los objetos se crean en dos pasos:

- Declaración, donde se proporciona un nombre al objeto y se determina a que clase pertenece.

`NombreClase obj;`

- Se obtiene una copia física del objeto y se asigna a la variable, esto se hace con el operador `new`.

`obj = new NombreClase();`

Los dos pasos pueden llevarse a cabo en una sola instrucción así:

`NombreClase obj = new NombreClase();`

Representación gráfica:

![Representación gráfica de un objeto creado](images/objeto_java.png)


## Atributos

Los atributos corresponden a las características (o datos) necesarios para describir una clase.
Los atributos pueden corresponder a cualquier tipo de dato (int, long, double, char, String, …, etc).

Ejemplo:

La clase “Persona” probablemente deberá tener definido los siguientes atributos:

```java

String codigo;
String nombre;
double salario_basico;
int edad;
char sexo;

```

** Consideraciones para la definición de Atributos: **

- El nombre debe cumplir con las reglas de los identificadores.
- El nombre debe orientar sobre el significado del dato que`almacena.
- Visibilidad - Tiene asociado un modificador de acceso: públicos, privados, package (default) ó protected.

## Metodos

Sintáxis:

```plain

«acceso» «tipo» «nombre del método» («parámetros») {
// cuerpo del método
}

```
Tipo: Corresponde al tipo de dato que retornará dicho método (int, long, float, double,`String, char,…, etc) a una clase definida previamente, o void si el método no retorna ningún dato. Todo método debe tener una clausula return a menos que éste sea de tipo void.

Parámetros: corresponde a un listado de declaración de variables separados por coma, que corresponde a los datos que el método requiere para realizar su función.

Ilustración gráfica de posibles métodos:

![Representación gráfica sobre tipos de métodos](images/tipos_metodos.png)

**Consideraciones para la definición de Métodos:**

- Tienen un nombre: debe cumplir las reglas de los identificadores.
- Por estándar inician en minúscula y si tienen palabras compuestas estas inician con mayúscula.
- Pueden retornar algo como resultado: un dato, un objeto o un arreglo.
- Pueden requerir de argumentos para hacer sus cálculos.
- Visibilidad - Tiene modificador de acceso asociado: públicos(public), privados(private), package (default) ó protegidos(protected).

## Setter y getter

Los setter y getters, son métodos de acceso en una clase, estos sirven para establecer y obtener datos de los atributos de nuestra clase, estos dos métodos deben ser públicos.

setter : para cambiar el valor de los atributos.
getter : para consultar o recuperar el valor de los atributos.

Ejemplo:

```java

public class Circulo {

public double radio; // declaración de atributo

public void setRadio ( double r ) { // cambia el valor del atributo radio por el valor

	radio = r;

	}

public double getRadio () { // Devuelve el valor del atributo radio

	return radio;

	}
}

```

>El uso del set y get es más de una buena practica de la programación, porque igual, funcionaria sin ponerle set y get al principio del nombre del método, pero al utilizarlo, el código será mas claro a la hora de realizarle alguna actualización.

## toString

El método toString de un objeto, retorna la representación de un objeto en formato cadena, pero este método hace parte de la clase padre Object, la cual, se llama en forma **implícita** cuando el objeto se utiliza en donde se espera un objeto String (por ejemplo, cuando printf imprime en pantalla el objeto como un String, usando el especificador de formato %s, o cuando el objeto se concatena con un objeto String mediante el operador +). Pero además, el método toString se puede llamar de manera **explícita**,  sobreescribir dicho método de la clase Object, en otra clase cualquiera y así darle el formato deseado a la representación del objeto de dicha clase.

Ejemplo utilizando los atributos comunes de una clase llamada Persona:

```java


public class Persona {

  private String nombre;
  private int edad;
  private String id;

  public Persona(String nombre, int edad, String id) {
    this.nombre = nombre;
    this.edad = edad;
    this.id = id;
  }


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override // Esto indica que una declaración de método está destinado a anular una declaración de método en una superclase.
  public String toString(){
    return "Nombre: " + nombre + "\nEdad: " + edad + "\nId: " + id;
  }

}

```

## Printf

El método System.out.printf (“f” significa “formato”) muestra datos en la consola con formato.

Sintaxis:

```java
System.out.printf(receptáculo y/o texto fijo, parametros...);
```

Ejemplo:

```java
System.out.printf("%s\n%s\n", "Bienvenido al", "repositorio de java!");
```

Los receptáculos son los simbolos % y hace referencia a cada parámetro del método a imprimir, en este caso a "Bienvenido al" y "repositorio de java". El caracter siguiente, representa el tipo de dato a imprimir, en este caso, la "s" equivale a una cadena y todo su conjunto "%s" se le llama especificador de formato.

La siguiente tabla resume los especificadores de formato de java:

**Impresión de enterios**

| Carácter de conversión | Descripción|
|------------------------|------------|
| d                      | Muestra un entero decimal (base 10)|
| o                      | Muestra un entero octal (base 8)|
| x o X                  | Muestra un entero hexadecimal (base 16).|

**Impresión de números de punto flotante**

| Carácter de conversión | Descripción|
|------------------------|------------|
| e o E                  | Muestra un valor de punto flotante en notación exponencial. El carácter de conversión E muestra la salida en letras mayúsculas.|
| f                      | Muestra un valor de punto flotante en formato decimal.|
| g o G                  | Muestra un valor de punto flotante en el formato de punto flotante f o en el formato exponencial e, con base en la magnitud del valor. Si la magnitud es menor que 10 a la menos 3,o si es mayor o igual que 10 a la 7, el valor de punto flotante se imprime en el formato f. Cuando se utiliza el carácter de conversión G, la salida se muestra en mayúscula. |
| a o A                  | Muestra un número de punto flotante en  formato hexadecimal. El carácter de conversión  A muestra la salida en letras mayúsculas.|

**Impresión de cadenas y caracteres**

| Carácter de conversión | Descripción|
|------------------------|------------|
| c o C                  | Muestra un carácter de tipo char (se requiere que el argumento sea de ese tipo).|
| s o S                  | Muestra una cadena. Puede recibir un objeto String o cualquier objeto Object como argumento.|


**Impresión de fechas y horas**

El carácter de conversión t o T, se utiliza para imprimir fechas y horas en diversos formatos. Siempre va seguido de un carácter de sufijo de conversión que especifica el formato de fecha y/o de hora. Cuando se utiliza el carácter de conversión T, las salidas se muestran en mayúsculas.

El carácter de conversión t requiere que su correspondiente argumento sea una fecha u hora de tipo long, Long, Calendar (paquete java.util) o Date (paquete java.util); los objetos de cada una de estas clases pueden representar fechas y horas. La Calendar es la más recomendada, ya que ciertos constructores y métodos de la clase Date se sustituyen por la clase Calendar.

| Carácter de sufijo de conversión | Descripción|
|------------------------|------------|
| c                | Muestra la fecha y hora con el formato dia mes fecha hora:minuto:segundo zona-horaria año|
| F                     | Muestra la fecha con el formato año-mes-dia con cuatro dígitos para el año y dos dígitos para el mes y la fecha (por ejemplo , 2016-07-16)|
| D                     | Muestra la fecha con el formato mes/dia/año, con dos dígitos para el mes, día y año (por ejemplo, 06/07/16)|
| r                     | Muestra la hora en formato de 12 horas como hora:minuto:segundo AM|PM, con dos dígitos para la hora, minuto y segundo (por ejemplo, 06:30:25 PM).|
| R                     | Muestra la hora con el formato hora:minuto, con dos dígitos para la hora y minuto (por ejemplo, 16:50). Se utiliza el reloj 24 horas.|
| T                     | Muestra la hora con el formato hora:minuto:segundo, con dos dígitos para la hora, minuto y segundo (por ejemplo, 16:30:25). Se utiliza el reloj de 24 horas.|
| A                     | Muestra el nombre completo del día de la semana.|
| a                     | Muestra el nombre corto de tres caracteres del día de la semana.|
| B                     | Muestra el nombre completo del mes|
| b                     | Muestra el nombre corto de tres caracteres del mes.|
| d                     | Muestra el día del mes con dos dígitos, rellenando con ceros a la izquierda si es necesario.|
| m                     | Muestra el mes con dos dígitos, rellenando con ceros a la izquierda si es necesario|
| H                     | Muestra la hora en el reloj de 24 horas, con un cero a la izquierda si es necesario|
| I                     | Muestra la hora en el reloj de 12 horas, con un cero a la izquierda si es necesario|
| k                     | Muestra la hora en el reloj de 24 horas sin ceros a la izquierda|
| l                     | Muestra la hora en el reloj de 12 horas sin ceros a la izquierda|
| M                     | Muestra los minutos con un cero a la izquierda, si es necesario|
| S                     | Muestra los segundos con un cero a la izquierda, si es necesario|
| Z                     | Muestra la abreviación para la zona horaria|
| p                     | Muestra el marcador de mañana o tarde en minúscula (pm)|
| P                     | Muestra el marcador de mañana o tarde en mayúscula (PM)|


Ejemplo de impresión con fechas y horas:

```java

import java.util.Calendar;

public class PruebaFechaHora
{
   public static void main( String[] args )
   {
      // obtiene la fecha y hora actuales
      Calendar fechaHora = Calendar.getInstance();

      // impresión con caracteres de conversión para composiciones de fecha/hora
      System.out.printf( "%tc\n", fechaHora );
      System.out.printf( "%tF\n", fechaHora );
      System.out.printf( "%tD\n", fechaHora );
      System.out.printf( "%tr\n", fechaHora );
      System.out.printf( "%tT\n", fechaHora );

      // impresión con caracteres de conversión para fechas
      System.out.printf( "%1$tA, %1$tB %1$td, %1$tY\n", fechaHora );
      System.out.printf( "%1$TA, %1$TB %1$Td, %1$TY\n", fechaHora );
      System.out.printf( "%1$ta, %1$tb %1$te, %1$ty\n", fechaHora );

      // impresión con caracteres de conversión para horas
      System.out.printf( "%1$tH:%1$tM:%1$tS\n", fechaHora );
      System.out.printf( "%1$tZ %1$tI:%1$tM:%1$tS %Tp", fechaHora );
   } // fin de main
} // fin de la clase PruebaFechaHora

```

**Otros caracteres de conversión**

| Carácter de conversión | Descripción|
|------------------------|------------|
| b o B                  | Imprime true o false para el valor de un boolean o Boolean. Estos caracteres de conversión también pueden aplicar formato al valor de cualquier referencia. |
| h o H                  | Imprime la representación de cadena del valor de código hash de un objeto en formato hexadecimal. Si el correspondiente argumento es null, se imprime "null". |
| %                      | Imprime el carácter de por ciento. |
| n                      | Imprime el separador de línea específico de la plataforma (por ejemplo, \r\n en Windows o \n en UNIX/LINUX) |

**Impresión con anchuras de campo y precisiones**

Se puede especificar el tamaño de un campo, implementando la anchura de campo, que consiste en insertar un entero entre el % y el carácter de conversión en el especificador de formato (ejemplo, %4d). Si el valor a mostrar es menor que la anchura de campo especificada, entonces el contenido se **justificarán a la derecha**. Si el valor a mostrar es mayor que la anchura de campo, entonces la anchura de campo se incrementa automáticamente para dar cavidad al valor.

Ejemplo:

```java


public class Main {

  public static void main(String[] args) {
    int dato = 123;
    System.out.printf("%5d\n", dato);
  }

}

```

> Para justificar a la derecha, solo de colocar un signo menos "-" después del % y antes del especificador de formato (por ejemplo, %-10d).

Podemos especificar la precisión con la que se muestra valores de puntos flotantes y cadenas. Cuando se utiliza con los caracteres de conversión de punto flotante e y f, la precisión es el número de dígitos que aparecen después del punto decimal. Cuando se utiliza con los caracteres de conversión g, a o A, la precisión es el número máximo de dígitos significativos a imprimir. Cuando se utiliza con el carácter de conversión s, la precisión es el número máximo de caracteres a escribir de la cadena. Para utilizar la precisión, se debe colocar entre el signo de porcentaje y el especificador de conversión un punto decimal (.), seguido de un entero que representa la precisión.

Ejemplo:

```java

System.out.printf("%.3f\n", 123.458763);
System.out.printf("%10.3f\n", 123.458763); // con anchura de campo 10.

```
**Impresión con índices como argumentos**

Sirve par darle un orden a los argumentos a mostrar. Es un entero opcional seguido del signo $, esto con el fin de darle una posición fija al argumento en la lista de argumentos.

Ejemplo:

```java

public class Main {

  public static void main(String[] args) {
      System.out.printf(
         "Lista de parametros sin reordenar: %s %s %s %s\n",
         "1er", "2do", "3er", "4to" );

         // imprime: 1er 2do 3er 4to

      System.out.printf(
         "Lista de parametros despues de reordenar: %4$s %3$s %2$s %1$s\n",
         "1er", "2do", "3er", "4to" );
        // imprime: 4to 3er 2do 1er
  }

}


```

**Impresión de literales y secuencias de escape**

| Carácter de conversión | Descripción|
|------------------------|------------|
| \'                     | Imprime el carácter de comilla sencilla |
| \"			 | Imprime el carácter de comilla doble |
| \\			 | Imprime el carácter barra diagonal inversa |
| \b			 | Desplaza el cursor una posición hacia atrás en la línea atual |
| \f			 | Desplaza el cursor al principio de la siguiente página lógica |
| \n			 | Desplaza el cursor al principio de la siguiente línea |
| \r			 | Desplaza el cursor al principio de la línea actual |
| \t			 | Desplazar el cursor hacia la siguiente posición del tabulador horizontal |

## Constructores

Un constructor es un método especial que sirve para darle valores inciales a los atributos cuando se crea un objeto de la clase correspondiente. Dicho método, se llama igual al nombre de la clase, no lleva ningún valor de retorno, ni tipo pero puede tener parámetros de entrada o no tenerlos.

Ejemplo:

```java

public class Circulo{

	private double radio;		// atributo.

	Circulo(){					// El constructor puede tener parámetros.
		radio = 3;
	}

}

```

## Ordenamiento de datos

Se considera ordenar al proceso de reorganizar un conjunto dado de objetos (arreglo) en una secuencia determinada, de forma ascendente o descendente según criterio dado.

Cuándo se analiza un método de ordenamiento, se debe determinar cuántas comparaciones e intercambios se realizan.

Métodos de ordenamiento más conocidos:

- Burbuja.
- Selección.
- Inserción.
- QuickSort.
- ShellSort.
- MergeSort.

### Metodo burbuja

El ordenamiento por burbuja (Bubble sort), es conocido como “método de intercambio directo”. Funciona comparando elementos de dos en dos en un ciclo, intercambiándolos según sea el caso (lo que la convierte en un método poco eficiente para una base grande de datos).

>Es necesario revisar i veces toda la lista hasta no necesitar más intercambios.

Descripción gráfica de como funciona el método burbuja:

![Imagén método burbuja](images/ejemplo_metodo_burbuja.png)

Sintaxis:

```java

static int [] ordenarBurbuja ( int a[] ) {

int tmp;

for ( int i = 0; i < a.length; i++) {
	for ( int j = 0; j < a.length - 1; j++) {

		if (a [ j ] > a [ j+1 ] ) {
			tmp = a [ j ];
			a [ j ] = a [ j+1 ];
			a [ j+1 ] = tmp;
			}
		}
	}

return a;

}

```

Gráficamente:

![Imagén método burbuja](images/ejemplo_metodo_burbuja2.png)

### Seleccion

El ordenamiento por selección es un algoritmo de ordenamiento simple, pero ineficiente. En la primera iteración del algoritmo se selecciona el elemento más pequeño en el arreglo, y se intercambia con el primer elemento. En la segunda iteración se selecciona el segundo elemento más pequeño (que viene siendo el elemento más pequeño de los elementos restantes) y se intercambia con el segundo elemento. El algoritmo continúa hasta que en la última iteración se selecciona el segundo elemento más grande y se intercambia con el índice del segundo al último, dejando el elemento más grande en el último índice. Después de la i-ésima iteración, los i elementos más pequeños del arreglo se ordenarán en forma ascendente, en los primeros i elementos del arreglo.

Método:

```java

   // ordena el arreglo usando el ordenamiento por selección
   public void ordenar()
   {
      int masPequenio; // índice del elemento más pequeño

      // itera a través de datos.length - 1 elementos
      for ( int i = 0; i < datos.length - 1; i++ ) {
         masPequenio = i; // primer índice del resto del arreglo

         // itera para buscar el índice del elemento más pequeño
         for ( int indice = i + 1; indice < datos.length; indice++ ) {
            if ( datos[ indice ] < datos[ masPequenio ] ) {
               masPequenio = indice;
            }
         } // fin for interno

         intercambiar( i, masPequenio ); // intercambia el elemento más pequeño en la posición

      } // fin de for exterior
   } // fin del método ordenar

   // método ayudante para intercambiar los valores de dos elementos
   public void intercambiar( int primero, int segundo ) {
      int temporal = datos[ primero ]; // almacena primero en temporal
      datos[ primero ] = datos[ segundo ]; // sustituye primero con segundo
      datos[ segundo ] = temporal; // coloca temporal en segundo
   } // fin del método intercambiar


```

>El algoritmo de ordenamiento por selección se ejecuta en un tiempo igual a O(n^2).


### Insercion

El ordenamiento por inserción es otro algoritmo de ordenamiento simple, pero ineficiente. En la primera iteración de este algoritmo se toma el segundo elemento en el arreglo y, si es menor que el primero, se intercambian. En la segunda iteración se analiza el tercer elemento y se inserta en la posición correcta, con respecto a los primeros dos elementos, de manera que los tres elementos estén ordenados. En la i-ésima iteración de este algoritmo, los primeros i elementos en el arreglo original estarán ordenados.

Método:

```java

   // ordena el arreglo usando el ordenamiento por inserción
   public void sort()
   {
      int insercion; // variable temporal para contener el elemento a insertar

      // itera a través de datos.length - 1 elementos
      for ( int siguiente = 1; siguiente < datos.length; siguiente++ )
      {
         // almacena el valor en el elemento actual
         insercion = datos[ siguiente ];

         // inicializa ubicación para colocar el elemento
         int moverElemento = siguiente;

         // busca un lugar para colocar el elemento actual
         while ( moverElemento > 0 && datos[ moverElemento - 1 ] > insercion )
         {
            // desplaza el elemento una posición a la derecha
            datos[ moverElemento ] = datos[ moverElemento - 1 ];
            moverElemento--;
         } // fin de while

         datos[ moverElemento ] = insercion; // coloca el elemento insertado
      } // fin de for
   } // fin del método ordenar

```

>El algoritmo de ordenamiento por inserción también se ejecuta en un tiempo igual a O(n^2).

Cada ciclo individual se ejecuta en un tiempo O(n). En notación Big O, los ciclos anidados indican que debemos multiplicar el número de comparaciones. Para cada iteración de un ciclo exterior, habrá cierto número de iteraciones en el ciclo interior. En este algoritmo, para cada O(n) iteraciones del ciclo exterior, habrá O(n) iteraciones del ciclo interior. Al multiplicar estos valores se produce un valor Big O de O(n^2).

### QuickSort

Basado en la técnica de divide y vencerás, que permite, en promedio, ordenar n elementos en un tiempo proporcional a O(nlogn).

Pasos para realizar el algoritmo:
1. Seleccionar el valor que está en la mitad del arreglo, como su pivote.
2. Resituar los demás elementos de la lista a cada lado del pivote, de manera que a un lado queden todos los menores que él, y al otro los mayores. Los elementos iguales al pivote pueden ser colocados tanto a su derecha como a su izquierda, dependiendo de la implementación deseada. En este momento, el pivote ocupa exactamente el lugar que le corresponderá en la lista ordenada.
3. La lista queda separada en dos sublistas, una formada por los elementos a la izquierda del pivote, y otra por los elementos a su derecha.
4. Repetir este proceso de forma recursiva para cada sublista mientras éstas contengan más de un elemento. Una vez terminado este proceso todos los elementos estarán ordenados.


Implementación para un orden ascendente:

```java
// Método que recibe una lista enlazada de enteros y los ordena 
// ascendentemente, usando el algoritmo de ordenamiento QuickSort
// (Ordenamiento Rápido).
public static void ordenamientoQS_Ascendente(List<Integer> elementos) {
        if(elementos.size() > 1) {
            // Crea 3 listas enlazadas vacías:
            List<Integer> izquierda = new LinkedList<>();
            List<Integer> iguales = new LinkedList<>();
            List<Integer> derecha = new LinkedList<>();
            // Que el elemento ubicado en la mitad sea el pivote:
            Integer pivote = elementos.get(elementos.size()/2);
            for(Integer i: elementos) {
                if(i < pivote) {
                    izquierda.add(i);
                }
                else if(i > pivote) {
                    derecha.add(i);
                }
                else {
                    iguales.add(i);
                }
            }   // Fin for
            
            ordenamientoQS_Ascendente(izquierda);    // Llamada recursiva.
            ordenamientoQS_Ascendente(derecha);    // Llamada recursiva.
            
            elementos.clear();  // Removes all of the elements from this list.
            
            // Appends all of the elements in the specified collection to the
            // end of this list:
            elementos.addAll(izquierda); 
            elementos.addAll(iguales);
            elementos.addAll(derecha);
            
        }   // Fin if
        
    }   // Fin método ordenamientoQS_Ascendente(...)

```

Implementación para un orden descendente:

```java

    // Método que recibe una lista enlazada de enteros y los ordena 
    // descendentemente, usando el algoritmo de ordenamiento QuickSort
    // (Ordenamiento Rápido).
    public static void ordenamientoQS_Descendente(List<Integer> elementos) {
        if(elementos.size() > 1) {
            // Crea 3 listas enlazadas vacías:
            List<Integer> izquierda = new LinkedList<>();
            List<Integer> iguales = new LinkedList<>();
            List<Integer> derecha = new LinkedList<>();
            // Que el elemento ubicado en la mitad sea el pivote:
            Integer pivote = elementos.get(elementos.size()/2);
            for(Integer i: elementos) {
                if(i > pivote) {
                    izquierda.add(i);
                }
                else if(i < pivote) {
                    derecha.add(i);
                }
                else {
                    iguales.add(i);
                }
            }   // Fin for
            
            ordenamientoQS_Descendente(izquierda);    // Llamada recursiva.
            ordenamientoQS_Descendente(derecha);    // Llamada recursiva.
            
            elementos.clear();  // Removes all of the elements from this list.
                            // The list will be empty after this call returns.
            
            // Appends all of the elements in the specified collection to the
            // end of this list:
            elementos.addAll(izquierda); 
            elementos.addAll(iguales);
            elementos.addAll(derecha);
            
        }   // Fin if
        
    }   // Fin método ordenamientoQS_Descendente(...)

```


### MergeSort

El método de ordenamiento por combinación o MergeSort (en inglés), es un algoritmo eficiente en comparación con los métodos de selección e inserción.

Para ordenar un arreglo, el algoritmo de ordenamiento por combinación lo divide en dos subarreglos de igual tamaño, ordena cada subarreglo y después los combina en un arreglo más grande. Con un número impar de elementos, el algoritmo crea los dos subarreglos de tal forma que uno tenga más elementos que el otro. La implementación del ordenamiento por combinación en este ejemplo es recursiva. El caso base es un arreglo con un elemento que, desde luego, está ordenado, por lo que el ordenamiento por combinación regresa de inmediato en este caso. El paso recursivo divide el arreglo en dos piezas de un tamaño aproximadamente igual, las ordena en forma recursiva y después combina los dos arreglos ordenados en un arreglo ordenado de mayor tamaño. Puntalmente, estos son los pasos:

1. Si la longitud de la lista es 0 ó 1, entonces ya está ordenada. En otro caso:
2. Dividir la lista desordenada en dos sublistas de aproximadamente la mitad del tamaño.
3. Ordenar cada sublista recursivamente aplicando el ordenamiento por combinación.
4. Combinar las dos sublistas en una sola lista ordenada.

Método:


```java

   // llama al método de división recursiva para comenzar el ordenamiento por combinación
   public void ordenar()
   {
      ordenarArreglo( 0, datos.length - 1 ); // divide todo el arreglo
   } // fin del método ordenar

   // divide el arreglo, ordena los subarreglos y los combina en un arreglo ordenado
   private void ordenarArreglo( int inferior, int superior )
   {
      // evalúa el caso base; el tamaño del arreglo es igual a 1
      if ( ( superior - inferior ) >= 1 ) // si no es el caso base
      {
         int medio1 = ( inferior + superior ) / 2; // calcula el elemento medio del arreglo
         int medio2 = medio1 + 1; // calcula el siguiente elemento arriba

         // divide el arreglo a la mitad; ordena cada mitad (llamadas recursivas)
         ordenarArreglo( inferior, medio1 ); // primera mitad del arreglo
         ordenarArreglo( medio2, superior ); // segunda mitad del arreglo

         // combina dos arreglos ordenados después de que regresan las llamadas de división
         combinar ( inferior, medio1, medio2, superior );
      } // fin de if
   } // fin del método ordenarArreglo

   // combina dos subarreglos ordenados en un subarreglo ordenado
   private void combinar( int izquierdo, int medio1, int medio2, int derecho )
   {
      int indiceIzq = izquierdo; // índice en subarreglo izquierdo
      int indiceDer = medio2; // índice en subarreglo derecho
      int indiceCombinado = izquierdo; // índice en arreglo de trabajo temporal
      int[] combinado = new int[ datos.length ]; // arreglo de trabajo

      // combina los arreglos hasta llegar al final de uno de ellos
      while ( indiceIzq <= medio1 && indiceDer <= derecho )
      {
         // coloca el menor de dos elementos actuales en el resultado
         // y lo mueve al siguiente espacio en los arreglos
         if ( datos[ indiceIzq ] <= datos[ indiceDer ] )
            combinado[ indiceCombinado++ ] = datos[ indiceIzq++ ];
         else
            combinado[ indiceCombinado++ ] = datos[ indiceDer++ ];
      } // fin de while

      // si el arreglo izquierdo está vacío
      if ( indiceIzq == medio2 )
         // copia el resto del arreglo derecho
         while ( indiceDer <= derecho )
            combinado[ indiceCombinado++ ] = datos[ indiceDer++ ];
      else // el arreglo derecho está vacío
         // copia el resto del arreglo izquierdo
         while ( indiceIzq <= medio1 )
            combinado[ indiceCombinado++ ] = datos[ indiceIzq++ ];      

      // copia los valores de vuelta al arreglo original
      for ( int i = izquierdo; i <= derecho; i++ )
         datos[ i ] = combinado[ i ];

   } // fin del método combinar


```

> El método mergesort tiene un tiempo de ejecución de O(nlogn), lo que resulta más eficiente en comparación con los métodos de selección e inserción.


![Valores cómunes Big O](images/valores-big-o-para-funciones-comunes.png)

## Sobrecarga de metodos

Sirve para reutilizar el nombre de un método, pero recibiendo número y/o tipos de parámetros diferentes al inicial, esto con el fin de no crear otros métodos que sirven para hacer una misma operación pero con distintos resultados.

Ejemplo:

```java

class Empleado{

	double calcular_salario(){	// no recibe parámetros.

		return salario_mensual;

	}

	double calcular_salario(int dias_trab){		// Recibe un parámetro entero.

		return (salario_mensual/30) * dias_trab;

	}


	double calcular_salario(double descuento){	// Recibe un parámetro pero de tipo double.

		return salario_mensual * (1-descuento);

	}

}

```
## Sobrecarga de constructores

Al igual que cualquier método, el constructor también se puede sobrecargar, teniendo en cuenta las mismas restricciones que un metodo sobrecargado (mismo nombre, parámetros distintos):

Ejemplo:

```java

public class Circulo{

	private double radio;		// atributo.

	Circulo(){					// Constructor sin parámetros de entrada.
		radio = 3;
	}

	Circulo(double x){			// Constructor con parámetros de entrada.
		radio = x;
	}

}

```

## Apuntador this

Si un objeto de una clase en particular quisiera hacer referencia a uno de sus miembros (atributos o metodos) sin equivocación alguna, puede emplear el apuntador this, el cual se puede entender como una variable que apunta hacia el mismo.

Ejemplo:

![Ejemplo gráfico del apuntador this](images/apuntador_this.png)


## Ambitos de variables

**Variables de clases**: Definidas y disponibles duarante la ejecución del programa.

**Variables de instancia**: Definidas durante la existencia del objeto o instancia.

**Variables locales**: Definidas durante la existencia del método. Tienen prioridad sobre las variables globales.

**Apuntador this**: Se utiliza dentro de cualquier método para referirse al objeto actual.

Gráficamente:

![Imágen ambitos de variables](images/ambito_variables.png)


## Paquetes

Sirve para ubicar todas las clases relacionadas en un mismo directorio (o carpeta) en el disco duro o donde esté guardado el programa. De esta forma, nos ayuda tener una buena organización de las clases creadas en java.

Sintaxis:

`package NombreCarpeta;`

>Se pone al principio de cada clase.

Ejemplo:

![Imagen paquetes en java](images/paquetes_java.png)

## Modificadores de acceso

Es el control de acceso que le damos a las clases, métodos o atributos, con el fin de lograr un buen nivel de encapsulamiento y proteger los datos que no deberían de ser accesible por cualquiera.

Sintaxis:

```java

public / protect / private / static / final class NombreClase        // Control de acceso a las clases.

public / protect / private / static / final /*tipo de variable de retorno*/ nombreDelMetodo     //Control de acceso para métodos

public / protect / private / static / final nombreVariable        //Control de acceso a variables.

```

### public

Cualquier clase desde cualquier lugar, podrá tener acceso a las variables y métodos públicos.

### private

Son las variables y métodos que solo podrán ser accesados por medio de la misma clase donde están creados. Ni siquiera podrán ser empleados por subclases.

### protected

Cuando un miembre (atributo o método) de clase se declara protected, puede ser accesado por miembros de la misma clase o de subclases de esta.

Un miembro protected puede ser accesado  desde otra clase que se encuentre en el mismo paquete o no.

### static

Normalmente los miembros definidos dentro una clase se denomina miembros de instancia,  ya que al crear instancias (objetos) de la clase se crea una copia de cada miembro para esa instancia.

En algunas formas es aconsejable o necesario declarar miembros de tal forma que existan una copia única para todas las instancias de las clases, a estos miembros se denominan miembros de clase.

Para declarar un atributo o método como miembro de la clase, se antepone la palabra `static`, indicando que será compartido por todos los objetos.

Los miembros de clases ayudan ahorrar espacio en memoria, debido a que guardan datos constantes a todas las clases como por ejemplo el valor PI.

Cuando se declara un atributo static puede ser variado, leído o utilizado por cualquier objeto de clase, pero todos los cambios que se realicen afectarán al mismo atributo para todos los objetos.

Cuando se declara métodos static solamente puede emplear variables static y llamar métodos static.

Ejemplo:

![Imagen gráfica de acceso static](images/ejemplo_static.png)

### final


Una clase y sus miembros (atributos o métodos) pueden ser declarados como final.

- A un atributo final no se le puede cambiar su valor.
- Un método final no puede ser sobreescrito por las clases hijas.
- Una clase final no podrá tener subclases asociadas a ella, significa que no podrá ser una super clase.

## Herencia

La herencia es una de las características básicas de la programación orientada a objetos, mediante ella se pueden pasar atributos y métodos de una clase a otra de manera automática, por ello es un punto de apoyo importante para la reutilización de código y por ende ayuda a disminuir el tiempo de programación.

La herencia debe utilizarse en casos precisos donde exista una relación de clasificación entre las clases en mención, es decir, que se pueda indicar que la clase X es una subclase de Y. Por ejemplo, un Cuadrado es una Figura_2D, una Figura_2D es una Figura_Geometrica, un Empleado es una Persona, un Perro es un Animal. Esto es, porque se supone que si una clase es un caso especial (tipo) de otra, tendrán cosas en común; y esas “cosas” se representan a través de sus atributos y/o métodos.

La herencia se estructura a través de clases, y se refleja en los objetos. Una clase hija puede agregar atributos o métodos que le pertenezcan únicamente a ella y no a la clase padre. Un objeto instanciado a partir de una clase hija, tendrá de manera adicional métodos y atributos relacionados en la clase padre.

**Conceptos**:

- Proceso mediante el cual una clase, y como consecuencia su objeto adquiere las propiedades de otro. Permite una clasificación jerárquica establecida mediante superclases y subclases.
- Una subclase aumenta o redefine la estructura y el comportamiento de sus superclases.
- Las superclases representan abstracciones generalizadas, y las subclases representan especializaciones (es un tipo de …).
- Se pueden pasar atributos y métodos a otra clase de forma automática, a excepción de los métodos constructores (estos no se heredan).
- Superclase: Clase padre o clase base, que contiene atributos y métodos en común.
- Subclase: Clase que hereda, clase hija o clase derivada. Clase que recibe la herencia, a la cual se le copian los atributos y métodos especificados en la superclase.

Ejemplo:

![ejemplo gráfico de herencia](images/ejemplo_herencia.png)

En Java, se admite únicamente la herencia simple; es decir que, cada clase puede heredar a lo sumo de otra clase, y se hace mediante la cláusula extends al momento de declarar la clase.

Ejemplo:

![Ejemplo de herencia](images/ejemplo_herencia2.png)

### Sobreescritura de metodos

Cuando una clase hereda un método de otra (porque tiene herencia de dicha clase) puede requerir cambiar parte o la
totalidad del método heredado, en este caso se puede sobrescribir. La sobreescritura implica volver a escribir la implementación del método conservando la misma signatura (tipo de retorno, nombre, cantidad y tipo de parámetros).

Ejemplo:

![Ejemplo sobreescritura de metodos](images/ejemplo_sobreescritura_metodos.png)

### Apuntador super

Si dentro de una clase se requiere llamar a un método existente en el padre se puede hacer referencia al padre con
la palabra super, la cual puede entenderse como una variable que apunta a la clase Padre.

NOTA: Si dentro de un método en la clase hija, se desea invocar el método de la clase padre, la referencia super debe ser la primera instrucción del método.

Al definir constructores con parámetros, tanto en la subclase como en la superclase. El apuntador super, permite que el
constructor de la subclase, invoque de manera explícita el constructor de la superclase:

```java

public ConstructorNombre (lista parámetros){
  super(lista parámetros);
  // cuerpo de constructor subclase
}

```
Cuando el constructor de la subclase invoca el constructor de su superclase, esta línea tiene que ser la primera.

Ejemplo:

![Ejemplo apuntador super](images/ejemplo_apuntador_super.png)

Ejemplo 2:

![Ejemplo 2 apuntador super](images/ejemplo_apuntador_super2.png)


## Abstraccion

La abstracción sirve para la gestión de clases complejas, en el sentido de que, existe una herencia la cual dicha clase padre puede ser tan amplia, tan compleja en sus clases hijas, que sería imposible tratar esa clase padre como una sola. Un ejemplo, para entender esto sería el reino Animal. Si tenemos una clase padre llamada Animal y un correspondiente de clases hijas como Ave, Pez, Perro, Gato, etc... Pues pensar que la clase Animal tenga implementado métodos acerca de cómo nacen, crecen, se reproducen o mueren cada especie animal, sería imposible contemplar dicha idea porque cada espécimen tiene una forma de vida distinta, pero si hay características en común, como por ejemplo, todos los animales tienen un nombre o una edad, la cual se pueden declarar desde la clase padre abstracta, pero sin implementarlo, esto con el fin de hacer uso del polimorfismo en la POO.

Las clases y los métodos se pueden declarar como abstracto.


### Clases abstractas

En Java, una clase abstracta es aquella que tiene al menos un método abstracto. Un método abstracto es un método para el que solamente se ha definido el encabezado (signatura) pero no se ha implementado.

Debido a que una clase abstracta no ha sido definida completamente, no es posible instanciar objetos de ella, sin embargo si puede heredar. Las subclases de las clases abstractas deben implementar (sobreescribir) todos los métodos abstractos.

Ejemplo:

![Ejemplo clase abstracta](images/ejemplo_clases_abstractas.png)


## Polimorfismo

El polimorfismo nos permite programar de forma general, en vez de programar en forma especifica. En particular, nos permite escribir programas que procesen objetos que compartan la misma superclase (ya sea de manera directa o indirecta) como si todos fueran objetos de la superclase; esto puede simplificar la programación.

Con el polimorfismo podemos diseñar e implementar sistemas que puedan extenderse con facilidad; pueden agregarse nuevas clases con sólo modificar un poco (o nada) las porciones generales del programa siempre y cuando las nuevas clases sean parte de la jerarquía de herencia que el programa procesa en forma genérica.

**Ejemplo de polimorfismo**:

Suponga que tenemos 3 clases. La clase Animal, que es una superclase abstracta con un método abstracto llamado mover y dos clases hijas de Animal, que son Perro y Ave. No podríamos implementar el método mover de la superclase, porque un perro no se mueve igual que un Ave, por lo tanto cada clase hija deberá implementar su propio método mover, que heredan de la clase padre.

Cuando queramos crear un objeto de cada clase, lo normal sería crear e instanciar un para cada tipo de clase, en este caso, Perro y Ave:

```java
Perro obj = new Perro(); // hemos creado e instanciado un objeto de tipo Perro.
Ave obj2 = new Ave();  // hemos creado e instanciado un objeto de tipo Ave.
obj.mover(); // hacemos uso del método mover de la clase Perro, que hereda de Animal.
obj2.mover(); // hacemos uso del método mover de la clase Ave, que hereda de Animal.
```

Ahora, usando el polimorfismo no tendríamos necesidad de crear un objeto por cada clase, sino que, con un objeto que sea de tipo de la superclase se crea de un tipo de una clase hija, podría hacer uso de los métodos de dicha clase hija, ya que un objeto de una subclase es un objeto de su superclase (pero no viceversa).

```java
Animal obj3 = new Perro(); // creo un objeto Perro pero de tipo Animal.
obj3.mover(); // Llama al método de la clase Perro y no al de la superclase, a pesar de que es un objeto tipo Animal.
```

En conclusión, el polimorfismo es la habilidad de procesar objetos que comparten la misma superclase en una jerarquía de clases, como si todos fueran objetos de la superclase y además, esto facilita la extensibilidad y el mantenimiento de los sistemas.


## Interfaces

En Java, una interfaz es aquella que tiene todos sus métodos sin implementación (pueden ser o no abstractos). Un método
abstracto es un método para el que solamente se ha definido el encabezado (signatura) pero no se ha implementado. Las interfaces
sólo pueden tener atributos definidos como public final static. Una Interfaz se crea de forma similar a una clase, cambiado la palabra reservada class por interface . Debido a que una interface no ha sido definida completamente, no es posible instanciar objetos de ella; puede ser heredada por otra interface, o implementada por una clase. La ventaja de usar interfaces, es que una clase puede implementar varias interfaces, con lo cual Java simula herencia múltiple.

Ejemplo:

![Ejemplo de interface](images/ejemplo_interfaces.png)

## Manejo de excepciones

Una excepción es un evento que ocurre durante la ejecución de un programa y que interrumpe el flujo normal de instrucciones. Sirve capturar y controlar posibles errores que puedan presentarse en tiempo de ejecución de una aplicación, como por ejemplo: validar una entrada numérica cuándo se solicite el salario de un empleado. ¿Qué sucedería si el aplicativo al solicitar el salario se le digita un nombre?

### Clases de excepciones

- Checked: Condiciones que ocurren en el programa y es posible preveer. Clase **Exception**.
- Unchecked: Situaciones fatales, no se capturan por que no hay nada que hacer. Clase **Error**.

### Atrapar excepciones con try, catch y finally

Palabras reservadas:

**try**: Bloque de código sobre el que se captura la excepción.
**catch**: Bloque de código que se ejecuta si se presenta una excepción (se evalúa bloque de código try).
**finally**: Bloque de código que se ejecuta siempre, exista o no una excepción.

Sintaxis:

```java

//código
try
{
  //código
}
catch (Clase1 nombre) {
  //Que se hace si la excepción de la Clase1 se presenta
}
catch (Clase2 nombre) {
  //Que se hace si la excepción de la Clase2 se presenta
}

//... tantos catch como requiera. catch

finally
{
  //Este bloque de código finally es opcional, y se ejecutará se den o no excepciones
}

//código

```

Ejemplo:

Con relación al siguiente código, que excepción se presentará al usuario si digita un nombre cuándo se le solicita la edad? o si escribe un número real? R// NumberFormatException

Solución:

```java

//Bolque de código

try
{
  int edad;
  edad = Integer.parseInt (
  JOptionPane.showInputDialog("Ingrese edad: ") );
  System.out.println ("Edad = " + edad);
}
catch (NumberFormatException ex) {
  System.out.println ("ERR: Dato Incorrecto! " +
  "\nExcepción presentada: " + ex.toString() );
}

```

A partir de la versión java SE 7 en adelante, se puede crear un bloque catch con varias excepciones. Ejemplo:

```java

try {

} catch (IOException | SQLException ex e) {
    System.err.println("IndexOutOfBoundsException: " + e.getMessage());
}

```

### Excepciones comunes

- ArithmeticException.
- NullPointerException.
- NumberFormatException.
- NegativeArraySizeException.
- ArrayIndexOutOfBoundsException.
- SecutiryException.
 – Accesar a archivos locales.

### Atrapar excepciones con throws y throw

Con las palabras claves `throws` y `throw`.

throws sirve para indicar que en caso de que se produzca una excepción, el método en el que se produce la misma, no la  manejará, sino que la excepcion sera manejada por un método  invocante o superior. En otras palabras, sirve para decirle al que lo invoque que este método puede lanzar una excepción del tipo especificado (pueden especificar varias excepciones separandolas con comas).

Se puede utilizar en conjunto junto con la palabra clave throw, para lanzar de manera explícita, una excepción.

Ejemplo:

El constructor de la clase Alumno no puede ser ni cero ni negativo. Podemos usar la palabra clave throws para indicar que
no  se manejará dicha excepcion en la creación del objeto Alumno, sino en un método superior:

```java

public class Alumno
{
    private String nombre;
    private String apellido;
    private Integer edad;

    public Alumno(String nombre, String apellido, Integer edad) throws Exception
    {
       this.nombre = nombre;
       this.apellido = apellido;
        if (edad <= 0){
            throw new Exception("La debe edad ser mayor a cero");
        }else{
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }
}

```

En la clase donde esta el main se podría manejar la excepcion producida al crear un Alumno, de la siguiente manera:


```java

public class Test {
    public static void main (String []arguments){
        try {
            Alumno alu1 = new Alumno("Victor", "tabla_operadores_relacionales_java", -2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

```

>También podemos crear nuestras propias excepciones...

## Recursividad

Es la forma de como un método se llama así mismo, con el fin de dividir un problema complejo (llamado caso general) en dos problemas más pequeños, hasta el punto de que pueda resolver uno de ellos (llamado caso base) y así empezar a devolverse hasta llegar al problema inicial y tener ya la solución (concepto de divide y vencerás).

Se puede hacer la recursividad de dos formas.

**Forma directa**

El método se llama así mismo dentro de su mismo cuerpo.

Ejemplo:

```java


public class Main {

  public static int potenciaFormaRecursiva(int b, int e) { // b: base, e: exponente

  	// caso base
    if (e == 0) {

      return 1;

    //caso general
    } else {

      // se llama a si mismo dentro de su mismo cuerpo de instrucciones (recursividad directa):
      return potenciaFormaRecursiva(b, --e) * b;

    }

  } // fin método recursivo

  public static void main(String[] args) {

    System.out.printf("Valor de la potencia para base 2: %d\n ", potenciaFormaRecursiva(2, 5));

  } // fin método main


} // fin class Main

```

**Forma indirecta**

La recursividad indirecta se manifiesta cundo un método llama a otro y dentro del segundo se manda llamar al primero.


Ejemplo:

```java


public class Main {

  public static void main(String[] args) {

    System.out.printf("Valor de la potencia para base 2: %d\n ", potenciaFormaRecursiva(2, 5));

  } // fin método main

  public static int potenciaFormaRecursiva(int b, int e) { // b: base, e: exponente
    if (e == 0) {
      return 1;
    } else {
      return metodoIndirecto(b, --e);
    }
  } // fin método recursivo

  private static int metodoIndirecto(int b, int e){

    return potenciaFormaRecursiva(b, e) * b; // llama de manera indirecta la recursión de la potencia.

  } // fin metodo Indirecto

} // fin class Main

```
>Si omitimos el caso base o escribimos el paso recursivo en forma incorrecta, de manera que no converja en el caso base, se puede producir un error lógico conocido como recursividad infinita, en donde se realizan llamadas recursivas en forma continua, hasta que se agota la memoria.

**Pasos para escribir una función recursiva**

1. Se identifica el caso base.
2. Se identifica el problema más pequeño (divide y venceras).
3. Se identifica el caso general.

Ejemplo: Realizar un método recursivo para el factorial de un entero positivo n.

>El factorial de un número es el producto de todos los números enteros positivos desde 0 hasta n (para este caso, n es el número que digitará el usuario).

Análisis del problema:

Teniendo claro lo que es un factorial, ahora debemos pensar cual es el caso base que detiene la recursión y la que permite que se empiece a devolver para resolver todas las operaciones que quedaron pendientes en las llamadas recursivas. Ya con ese análisis, podremos identificar el problema como se divide de manera más pequeña y su caso general, que viene siendo la forma en como se llamará recursivamente:

![Imagen donde se identifica el caso base y general de un factorial](images/analisis-factorial-recursivo.png)

En el análisis se puede observar que el factorial de un número es el anterior por el mismo, lo cual nos indica el caso general. La parte donde el problema se divide en uno más pequeño es (n-1)!, donde acá se resta un 1 a n para llegar al caso base, donde se sabe que el factorial de 0, es 1. Al llegar al caso base, la recursividad se detiene y se empieza a devolver para reemplazar las partes que quedaron pendientes en las llamadas recursivas (n-1)! y empezar a realizar las operaciones respectivas

Código:

```java

  public int factorial(int n) {

    if (n == 0) {

      return 1;

    } else {

      return fact(n - 1) * n;

    }

  } // fin del método

```

Suponga que el método factorial recibe 3 y como 3 no es igual a 0, entonces llama recursivamente el método, pero ahora n será 2 en vez de 3 y queda una operación pendiente por 3. factorial ahora recibe 2 y como 2 no es igual a cero, entonces llama recursivamente el método pero ahora n será 1 en vez de 2 y queda una operación pendiente por 2. factorial ahora recibe 1 y como 1 no es igual a cero, entonces llama recursivamente el método, pero ahora n será 0 en vez de 1 y queda una operación pendiente por 1. factorial recibe 0 y como 0 es igual a 0, entonces retorna el valor de 1 a la última llamada recursiva que hubo y reemplaza todo el (n-1) por 1 y lo múltiplica por la operación que había pendiente, que era por 1, lo que da como resultado 1. Ahora ese 1 reemplaza todo el método recursivo anterior y lo multiplica por 2. Este proceso sigue devolviendose hasta la primera llamada recursiva que tuvo y realiza la última operación que había pendiente y ahora si el método devuelve el valor total de factorial de 3, que es 6.

### Recursividad por pila

Las llamadas recursivas que dejan operaciones pendientes por ejecutar, tiene un comportamiento interno de una **PILA**, la cual va apilando operaciones pendientes y al momento de llegar al caso base, va desapilando las operaciones pendientes que ya ha realizado hasta llegar a la inicial. Este tipo de recursividad tiene un alto costo en procesamiento de memoria. Para una recursividad más eficiente en el uso de la memoría, se usa un comportamiento de **COLA**.

### Recursividad por cola

Se logra cuando una función recursiva no deja pendiente operaciones, por eso retorna directamente la invocación a la función. El valor que se retorna en la última recursión (en el caso base), es el valor calculado de todo el proceso. El secreto es no dejar cálculos para resolver al terminar la última recursión y se pasan los resultados como parámetros del método recursivo.

Ejemplo con el caso factorial:

```java

 public static int factorial(int n) {

    return factorialCola(n, 1);

  }

  private static int factorialCola(int n, int r) {
    if (n == 0) {
      return r; // cuando llegue al caso base, retorna el total del factorial, sin necesidad de devolverse al inicio de la recursión.
    } else {
      return factorialCola(n - 1, n * r); // no deja operaciones pendientes...
    }
  }

```

## Notacion Big O:

Es una forma de describir la cantidad de esfuerzo que requiere un algoritmo para realizar una tarea (por ejemplo, una búsqueda de datos), la cual indica el tiempo de ejecución para el peor caso de un algoritmo.

Para los casos de búsqueda y ordenamiento, esto depende especificamente de cúantos elementos de datos haya en una colección de datos.

**Algoritmos O(1)**

Significa que el algoritmo tiene un tiempo de ejecución constante, en el sentido de que, el algoritmo requiere hacer una comparación y dicha comparación es constante (no crece a medida de que aumenta el tamaño del arreglo o la colección de datos) y es completamente independiente del número de elementos que tenga el arreglo o la colección de datos.

Ejemplo: comparar si el primer elemento de un arreglo es igual al segundo elemento (no importa si el arreglo tiene 1000 elementos, sigue siendo constante la forma en que compara).

**Algoritmo O(n)**

Un algoritmo que evalúa si el primer elemento de un arreglo es igual a cualquiera de los demás elementos del arreglo requerirá cuando menos de n – 1 comparaciones, en donde n es el número de elementos en el arreglo. Si el arreglo tiene 10 elementos, este algoritmo requiere hasta nueve comparaciones. Si el arreglo tiene 1000 elementos, requiere hasta 999 comparaciones. A medida que n aumenta en tamaño, la parte de la expresión correspondiente a la n “domina”, y si le restamos uno no hay consecuencias. Big O está diseñado para resaltar estos términos dominantes, e ignorar los términos que pierden importancia a medida que n crece. Por esta razón, se dice que un algoritmo que requiere un total de n – 1 comparaciones (como el que describimos antes) es O(n). Se considera que un algoritmo O(n) tiene un tiempo de ejecución lineal. A menudo, O(n) significa “en el orden de n”, o dicho en forma más simple, “orden n”.

Otro ejemplo es validar que en un arreglo o colección de datos, está un valor dado. En el peor de los casos la sentencia if se ejecutará n veces:

```java

public boolean buscarArreglo(int datos[], int buscado){

  for (int i = 0; i < datos.length; i++){

    if (datos[i] == buscado) {

      return true;

    } // fin if

  } // fin for

  return false;

} // fin metodo buscarArreglo

```

**Algoritmos O(n^2)**

Big O se enfoca en la forma en que aumenta el tiempo de ejecución de un algoritmo, en relación con el número de elementos procesados. Suponga que un algoritmo requiere n^2 comparaciones. Con cuatro elementos, el algoritmo requiere 16 comparaciones; con ocho elementos, 64 comparaciones. Con este algoritmo, al duplicar el número de elementos se cuadruplica el número de comparaciones. Cuando n es pequeña, los algoritmos O(n^2) (que se ejecutan en las computadoras personales de la actualidad) no afectan el rendimiento en forma considerable. Pero a medida que n aumenta, se empieza a notar la reducción en el rendimiento. Un algoritmo O(n^2) que se ejecute en un arreglo de un
millón de elementos requeriría un billón de “operaciones” (en donde cada una requeriría en realidad 804 Capítulo 19 Búsqueda, ordenamiento y Big O varias instrucciones de máquina para ejecutarse). Esto podría tardar varias horas.

Ejemplo: Determinar si cada elemento de un arreglo es único.

>La instrucción if del ciclo j, se ejecuta (n-1), (n-2), ..., 3, 2, 1

```java

public boolean validarElementoUnico(int datos[]){

  for (int i = 0; i < datos.length; i++){

    for (int j = i + 1; j < datos.length; j++){

      if (datos[i] == datos[j]) {

        return true;

      } // fin if

    } // fin for j

  } // fin for i

  return false;

} // fin metodo validarElementoUnico


```

**Estudio de una función de entrada, según el valor de entrada n sea 10**

![Valores funcionales para n cuando vale 10](images/estudio-funcion-entrada.png)

**Comportamiento de las funciones de orden más comúnes**

![Gráfica de las funciones O más comunes](images/grafica-funciones-o.png)

**Crecimiento logarítmico y polinómico**

![Gráfica de crecimiento logárítmico y polinómico](images/crecimiento-logaritmico-polinomico.png)

**Crecimiento exponencial o factorial**

![Gráfica de crecimiento exponencial o factorial](images/crecimiento-exponencial-factorial.png)

**Fuentes de notación Big O**
- Como programar en Java, edición 9. Capítulo 19.
- [Estructura de Datos - Análisis de Algoritmos, Complejidad](https://www.youtube.com/watch?v=BfUm9wBiu8E).


### Tiempos de ejecucion

Por medio de cálculos matemáticos simples, se puede conocer la eficiencia de un algoritmo y su tiempo computacional que se espera que consuma dicho algoritmo, escrito como una función T(n), donde `n` es el número de datos que procesará el algoritmo.

>Al hallar T(n) se considerará siempre el peor de los casos en el procesamiento de datos.

Para conocer el número de iteraciones que realizará el ciclo de un algoritmo, se calcula como:

![Formula para hallar número de iteraciones de ciclo](images/formula-iteraciones.png)

- Vfinal, es el valor mínimo para que no se cumpla la condición.
- Vincial, es el valor inicial con que inicia el ciclo.
- Incremento, es el valor con que incrementa el iterador en cada vuelta del ciclo.

Ejemplo 1:

![Ejemplo 1: calcular el número de iteraciones](images/ejemplo1-tiempo-ejecucion.png)

Luego, para determinar el tiempo de ejecución del algoritmo completo, se calcula linea por linea para saber cuantas veces se ejecuta. Nota: se ignoran las llaves {} del cuerpo del código y siempre considerar el peor de los casos:

Ejemplo 2:

![Ejemplo 2: Calcular el tiempo de ejecución](images/ejemplo2-tiempo-ejecucion.png)

Ejercicios de ejemplo:

Ejercicio 1:

![Ejercicio 1 sobre tiempos de ejecución](images/ejercicio1-tiempo-ejecucion.png)

Ejercicio 2:

![Ejercicio 2 sobre tiempos de ejecución](images/ejercicio2-tiempo-ejecucion.png)

Ejercicio 3:

![Ejercicio 3 sobre tiempos de ejecución](images/ejercicio3_tiempo-ejecucion.png)


## Coleccion de datos genericos

Una colección es una estructura de datos, un objeto que, puede contener referencias a otros objetos. Por lo general, las colecciones contienen referencias a los objetos que son todos del mismo tipo. Java dispone de una colección pre-construida de estructura de datos genéricos (por ejemplo, los ArrayList), la cual, poseen intefaces y una seríe de métodos para su respectiva manipulación. Algunas de ellas, son:

![Interfaces de colecciones de datos en java](images/coleccion-interfaces.png)

Las colecciones genéricas proporcionan seguridad en los tiempos de compilación, ya que se asegura de que el dato que se va a almacenar, sea el mismo tipo que el de la colección. Por ejemplo, no se puede almacenar Integers en una colección de Strings.

### Autoboxing and Auto-Unboxing

Versiones anteriores a Java SE 5, si querías insertar un dato de tipo primitivo en una colección, se necesitaba crear el nuevo objeto correspondiente al tipo de envuelto por la clase (Byte, Short, Integer, Long, Float y Double). Ejemplo:

```java

Integer[] integerArray = new Integer[ 5 ]; // create integerArray
// assign Integer 10 to integerArray[ 0 ]
integerArray[ 0 ] = new Integer( 10 );
// get int value of Integer
int value = integerArray[ 0 ].intValue();

```

Desde la versión Java SE 5, se introducieron dos nuevas conversiones: boxing conversion y unboxing conversion. Boxing conversion convierte un valor de tipo primitivo en un objeto correspondiente de su clase. Unboxing conversion convierte un objeto del tipo envuelto de su clase a su tipo primitivo. Estas conversiones son automáticas, lo que vuelve más legíble el código, así:

```java
Integer[] integerArray = new Integer[ 5 ]; // create integerArray
integerArray[ 0 ] = 10; // assign Integer 10 to integerArray[ 0 ]
int value = integerArray[ 0 ]; // get int value of Integer

```

### Colecciones de interfaces y de clases

La interfaz **Collection** es la raíz de las interfaces en la jerarquía de colecciones, de la cual se derivan las interfaces **Set**, **Queue** y **List**. La interfaz Collection ofrece un método que retorna un Iterator para poder recorrer fácilmente una colección y poder remover datos durante la iteración y también, ofrece otros métodos como: size (conocer el tamaño de la colección), empty (saber si está vacío) y muchos más...

### List

Una lista es una colección ordenada que puede contener elementos duplicados. Al igual que los índices del array, el índices de la lista comienza en cero (es decir, el índice del primer elemento es cero). Además de los métodos heredados de Collection, List proporciona métodos para elementos a través de sus índices de manipulación, la manipulación de un rango especificado de elementos, la búsqueda de elementos, y la obtención de un ListIterator para acceder a los elementos.

La interfaz List es implementada por varias clases, incluyendo los ArrayList, LinkedList y Vector. Algo interesante es que, la clase LinkedList se utiliza para crear **pilas**, **colas** y **colas doblemente enlazadas**.

Demostración de una interfaz de colección de datos genéricos con ArrayList:

```java


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Main {

  public static void main(String[] args) {

  	// crea un array de nombres de colores
    String[] colors = {"MAGNETA", "RED", "WHITE", "BLUE", "CYAN"};
    List<String> list = new ArrayList<>(); //crea una lista de tipo String.

    for (String color : colors) {
      list.add(color); // agrego cada valor del arreglo en la lista.
    }

    // array de colores a borrar de list
    String[] removeColors = {"RED", "WHITE", "BLUE"};
    List<String> removeList = new ArrayList<>(); // crea otra lista de tipo String

    for (String color : removeColors) {
      removeList.add(color); // agrego los colores a borrar en la lista removeList
    }

    // imprimo list
    System.out.println("ArrayList: ");

    for (int count = 0; count < list.size(); count++) {
      System.out.printf("%s ", list.get(count));
    }

    // llamo el método para removerColors y le envío las dos listas.
    removeColors(list, removeList);


    // Imprime la lista después de haber borrado los colores seleccionados
    System.out.println("\n\nArrayList despues de llamar removeColors:");

    for(String color: list) {
      System.out.printf("%s ", color);
    }

  } // fin main

  // metodo para borrar los colores con dos listas
  private static void removeColors(Collection<String> list, Collection<String> removeList) {
    Iterator<String> iterator = list.iterator(); // llama el método iterator, el cual me devuelve un iterador para recorrer la lista.

    while (iterator.hasNext()) { // mientras que existan elementos en el iterador.

      if (removeList.contains(iterator.next())) { // busca los valores de removeList en el iterador, el cual tiene los valores de la lista list.
        iterator.remove(); // metodo para remover el elemento actual del iterador.
      }

    } // fin while

  } // fin removeColors

} // fin class

```

#### ArrayList

La clase de colección ArrayList<T> (del paquete java.util) provee una solución conveniente al problema de los tamaños fijos en los arreglos: puede cambiar su tamaño en forma dinámica para dar cabida a más elementos. La T (por convención) es un receptáculo: al declarar un nuevo objeto ArrayList, hay que reemplazarlo con el tipo de elementos que deseamos que contenga el objeto ArrayList. Esto es similar a especificar el tipo cuando declaramos un arreglo, pero sólo se pueden usar tipos no primitivos con estas clases de colecciones. Por ejemplo:


`ArrayList<String> lista;`

Algunos métodos útiles en los ArrayList:

![tabla de métodos útiles en los ArrayList](images/metodos-arraylist.png)

Ejemplo:


```java


import java.util.ArrayList;

public class ColeccionArrayList
{
   public static void main( String[] args )
   {
      // crea un nuevo objeto ArrayList de objetos String
      ArrayList< String > elementos = new ArrayList< String >();

      elementos.add("rojo" ); // adjunta un elemento a la lista          
      elementos.add( 0, "amarillo" ); // inserta el valor en el subíndice 0

      // encabezado
      System.out.print(
         "Mostrar contenido de lista con ciclo controlado por contador:" );

      // muestra los colores en la lista
      for ( int i = 0; i < elementos.size(); i++ )
         System.out.printf( " %s", elementos.get( i ) );

      // muestra los colores usando foreach en el método mostrar
      mostrar( elementos,
         "\nMostrar contenido de lista con instruccion for mejorada:" );

      elementos.add(0, "verde" ); // agrega "verde" al final de la lista
      elementos.add(0, "amarillo" ); // agrega "amarillo" al final de la lista
      mostrar( elementos, "Lista con dos nuevos elementos:" );

      elementos.remove( "amarillo" ); // elimina el primer "amarillo"
      mostrar( elementos, "Eliminar primera instancia de amarillo:" );

      elementos.remove( 1 ); // elimina elemento en subíndice 1
      mostrar( elementos, "Eliminar segundo elemento de la lista (verde):" );

      // verifica si hay un valor en la lista
      System.out.printf( "\"rojo\" %sesta en la lista\n",
         elementos.contains( "rojo" ) ? "": "no " );

      // muestra el número de elementos en la lista
      System.out.printf( "Tamanio: %s\n", elementos.size() );
   } // fin de main

   // muestra los elementos de ArrayList en la consola
   public static void mostrar( ArrayList< String > elementos, String encabezado )
   {
      System.out.print( encabezado ); // mostrar encabezado

      // muestra cada elemento en elementos
      for ( String elemento : elementos )
         System.out.printf( " %s", elemento );

      System.out.println(); // muestra fin de línea
   } // fin del método mostrar
} // fin de la clase ColeccionArrayList


```

>ArrayList es una elección poco adecuada si la inserción no se hace al final, porque entonces nos veremos obligados a desplazar los elementos para hacer sitio a los elementos nuevos.



#### LinkedList

En una lista enlazada o linked list, los elementos se almacenan de forma no contigua, en lugar de emplearse la matriz contigua usual. Para hacer esto, almacenamos cada objeto en un nodo que contiene el objeto y una referencia al siguiente nodo de la lista, en otras palabras, lo que hacemos es tener referencias al primer y último nodo de la lista:

![lista enlazada simple](images/lista-enlazada-simple.png)

Los LinkedList de Java, tiene un comportamiento de una **lista doblemente enlazada**, lo que significa que, un nodo tiene una referencia del nodo anterior y del siguiente:

![imagen de una lista doblemente enlazada](images/lista-doblemente-enlazada.png)

Con una lista enlazada ya no se podrá acceder a un único elemento arbitrario como se hacía con los arreglos. En vez de eso, se necesita recorrer toda la lista, pero la ventaja ante el ArrayList es que, al insertar un valor en la mitad de la lista, no requiere desplazar los otros elementos para darle espacio al nuevo elemento, sino que, solo se actualiza el enlace al nodo siguiente. Los mismo sucede con los borrados en la mitad, con LinkedList sería más eficiente este proceso.

**Costes de cada una de las operaciones sencillas para ArrayList y LinkedList**

![Imagen comparativa de notación big O para ArrayList y LinkedList](images/costes-arraylist-linkedlist.png)

Ejemplo: Implementación de List.

```java

// Prueba de List, LinkedList e Iterator.

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;


public class ListTest {

  public static void main(String[] args) {

    // arreglo de estudiantes
    String[] estudiantes = {"Harry", "Jaime", "Victor", "Katherine"};
    // Creo el objeto de tipo linkedList
    List<String> lista = new LinkedList<>();

    //agrego los estudiantes a la lista
    for(String elemento: estudiantes){
      lista.add(elemento);
    }

    // arreglo de más estudiantes
    String[] estudiantes2 = {"Carlos", "Beto", "Juanita", "Mercedes"};
    List<String> lista2 = new LinkedList<>();

    for(String elemento: estudiantes2){
      lista2.add(elemento);
    }

    // metodo para concatenar listas
    lista.addAll(lista2);
    lista2 = null;

    //metodo para imprimir listas
    imprimirLista(lista);

    //metodo para convertir los elementos de la lista en MAYUS
    convertirListaMayus(lista);
    imprimirLista(lista);

    System.out.print("\nBorrando elementos desde 4 a 6...");
    removerItem(lista, 4, 7);
    imprimirLista(lista);
    imprimirListaRevertida(lista);


  }

  private static void imprimirLista(List<String> lista) {
    System.out.println("\nLista: ");

    for(String elemento: lista){
      System.out.printf("%s ", elemento);
    }
    System.out.println();
  } // fin metodo imprimir lista

  private static void convertirListaMayus(List<String> lista) {
    ListIterator<String> iterador = lista.listIterator();

    while(iterador.hasNext()){
      String nombre = iterador.next(); // toma el valor del iterador, que sería el nombre de la lista
      iterador.set(nombre.toUpperCase()); // convierte el nombre en MAYUS y lo reemplaza en el valor del iterador.
    } // fin while
  } // fin metodo convertirListaMayus

  private static void removerItem(List<String> lista, int inicio, int fin) {
    lista.subList(inicio, fin).clear(); // extrae una sublista y los elimina.
  }

  private static void imprimirListaRevertida(List<String> lista) {
    ListIterator<String> iterator = lista.listIterator(lista.size()); //devuelve el iterador con los elementos de la lista, colocandose en la posición final.
    System.out.println("\nLista revertida: ");

    while(iterator.hasPrevious()){
      System.out.printf("%s ", iterator.previous());
    }
  }


}


```

### Pilas

Las pilas son una estructura de datos, en la que el acceso está restringido al elemento más recientemente insertado. Se comporta en buena medida como una pila común de papeles, platos o periódicos. El último elemento añadido a la pila se coloca en la parte superior y es fácilmente accesible, mientras que resulta más difícil acceder a los elementos que han estado más tiempo en la pila. Por lo tanto, la pila es apropiada si esperamos acceder solo al elemento superior; todos los restantes elementos son innaccesibles.

Las tres operaciones naturales en una pila son:

1. push (insertar elemento).
2. pop (remover elemento).
3. top (encontrar elemento).

Java dispone de una clase llamada **Stack**, para crear una estructura de datos en pila. Ejemplo:

```java


import java.util.Stack;
import java.util.EmptyStackException;

public class StackTest {

  public static void main(String[] args) {

    Stack<Number> stack = new Stack<>(); // crea la pila

    //usar el método push para agregar elementos a la pila.
    stack.push(1);
    System.out.println("Agregado el 1");
    imprimirStack(stack);
    stack.push(2);
    System.out.println("Agregado el 2");
    imprimirStack(stack);
    stack.push(3);
    System.out.println("Agregado el 3");
    imprimirStack(stack);
    stack.push(4);
    System.out.println("Agregado el 4");
    imprimirStack(stack);
    stack.push(5);
    System.out.println("Agregado el 5");
    imprimirStack(stack);

    //remover elementos de la pila
    try {
      Number removerObjeto = null;

      while(true){
        removerObjeto = stack.pop(); //retira el elemento que está en la cima de la pila.
        System.out.printf("Retirado el %s\n", removerObjeto);
        imprimirStack(stack);
      } // fin while
    } catch (EmptyStackException ex){
      System.out.println("Error de tipo: " + ex);
    }


  }

  // imprimir la pila
  private static void imprimirStack(Stack<Number> stack) {
    if (stack.isEmpty()){
      System.out.println("La pila está vacía...");
    } else {
      System.out.printf("La pila contiene: %s (top)\n", stack);
    }
  }

}


```

>La clase Stack extiende de la clase Vector, para implementar la estructura de datos en pila.


### Colas

La Cola es otra estructura de datos que representa una linea de espera, donde los elementos que se van insertando iran al final de la estructura, como una cola de personas esperando un turno para ser atendidos. Para consultar la cola, se debe hacer por el inicio de ella, donde el primer elemento a consultar es el primero en la cola y se debe eliminar de ella para conocer el siguiente. Esto se le conoce como el término del "Pimero que entra, es el primero que sale" FIFO (First in, first out) a diferencia de la pila que es "El último que entra, es el último que sale" LIFO (Last in, first out).

Java tiene dos interfaces disponibles para la construcción de esta estructura: **Queue** y **PriorityQueue**.

**Queue**

La interfaz Queue extiende de la interfaz Collection y provee operaciones adiconales para la insertar, remover e inspeccionar los elementos de la cola.

**PriorityQueue**

Implementa de la interfaz Queue y lo que hace es ordenar los elementos en la cola por su orden natural especificado con la clase Comparable, por medio de su método compareTo o por medio de un objeto Comparator que es suministrado por el constructor.

Las operaciones naturales en una cola, son:

1. offer (insertar elemento en orden de llegada).
2. poll (remueve el elemento con mayor prioridad en la cola).
3. peek (obtener una referencia del elemento con mayor prioridad, sin removerlo).
4. clear (remueve todos los elementos de la cola, por prioridad).
5. size (el número de elementos en la cola).

```java

import java.util.PriorityQueue;

public class QueueTest {

  public static void main(String[] args) {

    PriorityQueue<Double> cola = new PriorityQueue<>(); // crea la cola

    // insertar elementos a la cola con prioridad y en orden de tamaño.
    cola.offer(1.5);
    cola.offer(2.5);
    cola.offer(5.0);
    cola.offer(4.0);

    while(cola.size()>0){
      System.out.printf("%.1f ", cola.peek()); // mira cual es el elemento con mayor prioridad en la cola y lo imprime en consola.
      cola.poll(); // remueve elemento en orden de prioridad.
    }

  }

}

```

### Sets

Es una colección de datos desordenados, la cual no permite los elementos duplicados. Existe una amplia colección en la libreria de Java para su implementación, algunos de ellos son los **HashSet** y **TreeSet**. Los hashSet almacena los elementos en una tabla hash. Una tabla Hash es un contenedor asociativo (tipo Diccionario) que permite un almacenamiento y posterior recuperación eficientes de elementos (denominados valores) a partir de otros objetos, llamados claves. La implementación TreeSet, almacena los datos en una estructura de arbol.

Ejemplo: Imprimir la lista de colores que no están repetidos en la colección.

```java


import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest {

  public static void main(String[] args) {

    // crear y mostrar la lista de colores
    String[] colors = {"red", "white", "blue", "green", "gray",
                      "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
    List<String> list = Arrays.asList(colors);
    System.out.printf("Lista de colores %s\n", list);


    // eliminar duplicados
    mostrarNoDuplicados(list);

  }

  private static void mostrarNoDuplicados(List<String> list) {
    Set<String> set = new HashSet<>(list);
    System.out.print("\nColores no duplicados: ");

    for(String elemento: set){
      System.out.printf("%s ", elemento);
    }

    System.out.println();
  }

}

```

### Mapas

Los mapas son una asociación de clave - valor. La clave en un mapa debe ser único, pero el valor asociado a ella no es necesario que sea único en el mapa. Si un mapa contiene dos claves únicas y valores únicos, se dice que el mapeo está implementado en **uno a uno**. Si sólo las claves son únicas, entonces se dice que el mapeo está implementado en **uno a muchos** (muchas claves pueden asignar un valor).

Los Maps se diferencia de los Sets, porque en los Maps contiene claves y valores, en los Sets contiene sólo valores. Existen cantidades de interfaces para implementar un Map en Java, algunos de ellos son: **HashTable**, **HashMap** y **TreeMap**.

Ejemplo: En una cadena de texto, realizar un conteo de cuantas veces se repite cualquier palabra de la cadena.

```java


import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;



public class MapTest {

  public static void main(String[] args) {

    //Mapa creado para guardar las claves en String y los valores en Integer.
    Map<String, Integer> myMap = new HashMap<>();

    createMap(myMap);
    displayMap(myMap);

  }

  private static void createMap(Map<String, Integer> map) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese una cadena:");
    String input = scanner.nextLine();

    // toma la cadena ingresada y guarda las palabras en un array
    String[] arrayWords = input.split(" ");

    for(String elemento: arrayWords){
      String word = elemento.toLowerCase(); //Convierte cada palabra en Minuscúla.

      //si en el mapa contiene la palabra
      if(map.containsKey(word)){
        int count = map.get(word);
        map.put(word, count + 1); // Actualiza la cantidad de veces que aparece la palabra.
      } else {
        map.put(word, 1); // agrega la clave y el valor.
      } // fin if
    } // fin for

  } // fin método createMap

  private static void displayMap(Map<String, Integer> map) {

    Set<String> keys = map.keySet(); //trae todas las llaves y las guarda en un tipo Set.

    //Ordenar las llaves
    TreeSet<String> sortedKeys = new TreeSet<>(keys);

    System.out.println("\nEl mapa contiene:\nLlave\t\tValor");

    //Mostrar en consola cada llave del mapa
    for(String elemento: sortedKeys){
      System.out.printf("%-10s%10s\n", elemento, map.get(elemento));
    }

    System.out.printf("\ntamaño: %d\nEstá vacío: %b\n", map.size(), map.isEmpty());
  }

}


```

## Clases y metodos genericos

Los métodos genéricos permiten especificar, con una sóla declaración de método, un conjunto de métodos relacionados. Las clases genéricas (e interfaces) le permiten especificar, con una declaración de una sóla clase (o interfaz), un conjunto de tipos relacionados, respectivamente. En otras palabras, los genéricos sirven para permitir que métodos o clases puedan operar con distintos tipos de objetos, proporcionando seguridad en tiempo de compilación, lo que nos permite crear código más legible y mucho más robusto.

>Los métodos y clases genéricas se encuentran entre una de la más poderosas capacidades de Java para la reutilización del software con la seguridad de tipos en tiempo de compilación.

Ejemplo: Imprimiendo los elementos de distintos arrays con métodos sobrecargados. Al final, en vez de utilizar métodos sobrecargados, vamos a usar un método genérico que reemplace el código del método printArray.

```java


public class MetodosSobreCargados {

  public static void main(String[] args) {

    //Crear disntitos tipos de arrays de tipo referencia
    Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
    Character[] characterArray = {'H', 'E', 'L', 'L', 'O', 'W', 'O', 'R', 'L', 'D'};

    //Imprimir los arrays
    System.out.println("Array de Integer contiene:");
    printArray(integerArray);
    System.out.println("Array de Double contiene:");
    printArray(doubleArray);
    System.out.println("Array de Character contiene:");
    printArray(characterArray);

  }

  private static void printArray(Integer[] integerArray) {

    //mostrar contenido del array
    for(Integer elemento: integerArray){
      System.out.printf("%s ", elemento);
    }
    System.out.println();
  }

  private static void printArray(Double[] doubleArray) {
    //mostrar contenido del array
    for(Double elemento: doubleArray){
      System.out.printf("%s ", elemento);
    }
    System.out.println();
  }

  private static void printArray(Character[] characterArray) {
    //mostrar contenido del array
    for(Character elemento: characterArray){
      System.out.printf("%s ", elemento);
    }
    System.out.println();
  }

}


```

El método sobrecargado printArray() se puede reemplazar por uno genérico, que reciba cualquier tipo de objeto y de esta forma, con un sólo método se podrá imprimir cualquier tipo de array:

```java

	// por convención, los métodos y las clases genéricas les llaman de tipo T
  private static <T> void printArray(T[] array) {

    //mostrar los elementos del array
    for(T elemento: array){
      System.out.printf("%s ", elemento);
    }
    System.out.println();
  }

```

Un método genérico, tiene la siguiente sintaxis:

```txt

<<ModificadorAcceso>> <<Type>> <<TipoRetorno>> <<NombreMetodo>>(<Type> parametros...) {
	// cuerpo del método.
}

```

Donde <Type>, por convención, le llaman <T>.



### Interfaz Comparable

Sirve para comparar dos variables de tipo referencia, ya que dos objetos no se pueden comparar con operadores relacionales. La clase debe implementar la interfaz Comparable<T>, para hacer uso del método compareTo.

Sintaxis:

`objeto1.compareTo(objeto2)`

Es responsabilidad del desarrollador, el de sobreescribir el método compareTo y adaptar los resultados según su necesidad. Lo básico a tener en cuenta es:

- compareTo debe retornar el valor entero cero, si los objetos son iguales.
- compareTo debe retornar un valor entero negativo, si el objeto1 es menor que el objeto2.
- compareTo debe retornar un valor entero positivo, si el objeto1 es mayor que el objeto2.

Ejemplo: El siguiente método genérico devuelve el mayor de los tres objetos.

```java



public class MaximumTest {

  public static void main(String[] args) {

    System.out.printf("Maxímo de %d, %d y %d es %d\n", 3, 4, 5, maximum(3, 4, 5));

  }

  // Determina cual de los tres objetos es más grande
  private static< T extends Comparable< T > > T maximum(T x, T y, T z) {
    T max = x; //asumimos que x es el mayor por el momento.

    if(y.compareTo(max) > 0){
      max = y;
    }

    if(z.compareTo(max) > 0){
      max = z;
    }

    return max;
  }

}

```

### Clases genericas

Las clases genéricas encapsulan operaciones que no son específicas de un tipo de datos concreto. En otras palabras, las clases genericas nos permiten tener tipos de objetos especificos, por ejemplo: Una pila de empleados, una pila de String, una pila de Double (sólo con tipos de referencia). Las clases genéricas se utilizan frecuentemente con colecciones como listas vinculadas, tablas hash, pilas, colas, árboles, etc. Las operaciones de agregar y quitar elementos de la colección se realizan básicamente de la misma forma, independientemente del tipo de datos que se van a almacenar.

Sintaxis:

```Java

public Class NombreClase< T > {

  // Atributos de la clase...
  // métodos de la clase...

}

```

El nombre de la clase va acompañado de un receptáculo, el cual, en Java se usa por convención, los siguientes receptáculos:

- E – Element (usado bastante por Java Collections Framework)
- K – Key (Llave, usado en mapas)
- N – Number (para números)
- T – Type (Representa un tipo, es decir, una clase)
- V – Value (representa el valor, también se usa en mapas)
- S,U,V etc. – usado para representar otros tipos.

>Una clase puede tener varios tipos de datos separados por coma ( por ejemplo, MiClase< K, V > ).

Ejemplo: Implementación de una clase Stack genérica.

```java

/*
* Clase donde se construye la pila
*/

import java.util.ArrayList;
import java.util.EmptyStackException;

//import java.util.EmptyStackException;

public class Stack< T > {

    private ArrayList< T > elements; // Un atributo de tipo ArrayList que guarda elementos de tipo T.


    public Stack(){ // Constructor para crear una Pila con un tamaño definido.
        this(10);
    }

    public Stack(int capacity){ // Constructor sobrecargado
        int initCapacity = capacity > 0 ? capacity : 10 ; // valida si el tamaño que va a tener el arraylist es mayor a cero.
        elements = new ArrayList<>(initCapacity); // Crea el ArrayList con tamaño de 10.
    }

    // Método para agregar elementos a la Pila
    public void push( T value ) {
        elements.add(value);
    } // fin método push

    public T pop(){

        if(elements.isEmpty()){ // si la pila está vacía
            throw new EmptyStackException();
        }

        return elements.remove(elements.size()-1); // retira el últmo elemento de la pila.
    } // fin método pop

} // fin class Stack< T >


```

```Java

/*
* Clase con el método main para probar la pila genérica.
*/
import java.util.EmptyStackException;


public class StackTest {

    public static void main(String[] args) {

        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5};

        Stack< Double> doubleStack = new Stack<>(5);
        Stack< Integer> integerStack = new Stack<>();

        testPushDouble(doubleStack, doubleElements);
        testPopDouble(doubleStack);

        testPushInteger(integerStack, integerElements);
        testPopInteger(integerStack);

    } // fin del main

    private static void testPushDouble(Stack<Double> doubleStack, double[] doubleElements) {
        System.out.println("\nColocando elementos en doubleStack:");

        for(double elemento: doubleElements){
            System.out.printf("%.1f ", elemento);
            doubleStack.push(elemento);
        }
    }

    private static void testPopDouble(Stack<Double> doubleStack) {
        try{
            System.out.println("\nRetirando elementos de la pila de doubles");
            double popValue;

            while(true){
                popValue = doubleStack.pop();
                System.out.printf("%.1f ", popValue);
            }
        } catch ( EmptyStackException e){
            System.err.println();
            e.printStackTrace();
        }
    }

    private static void testPushInteger(Stack<Integer> integerStack, int[] integerElements) {
                System.out.println("\nColocando elementos en integerStack:");

        for(int elemento: integerElements){
            System.out.printf("%d ", elemento);
            integerStack.push(elemento);
        }
    }

    private static void testPopInteger(Stack<Integer> integerStack) {
                try{
            System.out.println("\nRetirando elementos de la pila de enteros");
            int popValue;

            while(true){
                popValue = integerStack.pop();
                System.out.printf("%d ", popValue);
            }
        } catch ( EmptyStackException e){
            System.err.println();
            e.printStackTrace();
        }
    }


}

```
Como los métodos testPushDouble y testPushInteger, al igual que, los métodos testPopDouble y testPopInteger, tienen el mismo funcionamiento pero solo varía el tipo de parámetro, entonces existe la oportunidad de convertir estos cuatros métodos en solo dos métodos (testPush y testPop), usando los métodos genéricos:

```java


import java.util.EmptyStackException;


public class StackTest {

    public static void main(String[] args) {

        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5};

        Stack< Double> doubleStack = new Stack<>(5);
        Stack< Integer> integerStack = new Stack<>();

        testPush("DoubleStack", doubleStack, doubleElements);
        testPop("Double", doubleStack);

        testPush("integerStack", integerStack, integerElements);
        testPop("Integer", integerStack);

    } // fin del main

    public static < T > void testPush(String nombrePila, Stack< T > stack, T[] elements){
        System.out.println("\nColocando elementos en " + nombrePila);
        
        for(T elemento: elements){
            System.out.printf("%s ", elemento);
            stack.push(elemento);
        }
    }
    
    public static < T > void testPop(String nombre, Stack< T > stack){
        try{
            System.out.println("\nRetirando elementos de la pila de " + nombre);
            T popValue;
            
            while(true){
                popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }
        }catch(EmptyStackException e){
            System.err.println();
            e.printStackTrace();
        }
    }

}


```

### Wildcards

Los wildcards o comodines en Java, es la forma de denotar un tipo de dato que aún no se conoce de que tipo será. Denotado por medio del simbolo de interrogación `?` y encerrado entre `< >`, como si fuera un receptáculo: `<?>`.

Ejemplo: Un método que recibe como parámetro diferentes tipos de arreglo (Integer, Double, Number).

```java

Number [] numbers =  {1, 2, 3, 4, 5};
ArrayList< Number > numberList = new ArrayList<>();

for (Number elemento: numbers) {
  numberList.add(elemento); // agrega cada número del arreglo en el ArrayList.
}

Integer [] integers =  {1, 2, 3, 4, 5};
ArrayList< Integer > intergerList = new ArrayList<>();

for (Integer elemento: integers) {
  intergerList.add(elemento); // agrega cada número del arreglo en el ArrayList.
}

Double [] doubles =  {1.1, 2.1, 3.1, 4.1, 5.1};
ArrayList< Double > doubleList = new ArrayList<>();

for (Double elemento: doubles) {
  doubleList.add(elemento); // agrega cada número del arreglo en el ArrayList.
}

suma(numberList);
suma(intergerList);
suma(doubleList);

// Método para calcular la suma del total de los valores en cada ArrayList. Recibe cualquier tipo de subclase de la superclase Number, por medio del comodin.
public static double suma(ArrayList< ? extends Number > lista) {
  double total = 0;

  for (Number elemento: list) {
    total += elemento.doubleValue();
  }

  return total;
}

```

[Leer más sobre Wildcards en Java](https://www.geeksforgeeks.org/wildcards-in-java/).

## Lambda y flujos en Java SE 8

### Expresiones lambda

La programación funcional, es un paradigma de programación, el cual fue incluido a partir de la versión 8 de Java y se logra con las expresiones lambda. Una expresión lambda representa a un método anónimo; es decir, una notación abreviada para implementar una [interfaz funcional](#Interfaces-funcionales) de Java, similar a una clase interna anónima. El tipo de una expresión lambda es el tipo de la interfaz funcional que implementa esa expresión lambda. Las expresiones lambda pueden usarse en cualquier parte en donde se esperan interfaces funcionales.

**Sintaxis**

`(listaParámetros) -> {instrucciones}`

Ejemplo:

```java

// Recibe dos enteros y retorna la suma de ellos:
(int x, int y) -> {return x + y;}

```

Se pueden omitir los tipos de datos en los parámetros:

```java

(x, y) -> {return x + y;}

```

Cuando el cuerpo solo tiene una expresión, se puede omitir las llaves y la palabra clave return:

```java

(int x, int y) -> x + y

```

Cuando es un sólo parámetros, se puede omitir los paréntesis:

```java

valor -> System.out.printf("%d ", valor)

```

Cuando no hay parámetros:

```java

() -> System.out.println("Hello world from Lambda!")

```
### Interfaces funcionales

En Java SE 8, implementaron las interfaces funcionales. Son las que solo contiene un método abstracto y puede tener uno o más métodos estáticos o default. Las interfaces funcionales son utilizadas en la programación funcional, para definir expresiones lambda que implemente el método abstracto de dicha interfaz funcional. Se pueden identificar por la anotación `@FunctionalInterface`, aunque no es obligatorio ponerlo porque, si la interfaz solo tiene un método abstracto, automáticamente será una interfaz funcional. Por ejemplo:

```java

// Se define la interfaz funcional con un método abstracto y otro método por default:
@FunctionalInterface
public interface IStrategy {
    
    public String sayHelloTo(String name);
    
    public default String sayHelloWorld(){
        return "Hello world";
    }

}

```

```java

// Se ejecuta una prueba de una expresión lambda que implemente el método abstracto de la interfaz funcional:
public class Main {
    
    public static void main(String[] args) {
        IStrategy strategy = (name) -> "Hello " + name;
        
        System.out.println(strategy.sayHelloTo("John Doe"));
        System.out.println(strategy.sayHelloWord());
    }

}
```
6 Interfaces funcionales básicas del paquete java.util.function:

**BinaryOperator<T>**

Contiene el método apply que recibe dos argumentos, realiza una operación sobre ellos (como un cálculo) y devuelve un valor de tipo T. Ejemplo:

```java

BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
System.out.println(binaryOperator.apply(5, 5));

// 10

```
**Consumer<T>**

Contiene el método accept que recibe un argumento T y devuelve void. Realiza una tarea con su argumento T, como mostrar el objeto en pantalla, invocar a un método del objeto, etc. Ejemplo:

```java

Consumer<String> consumer = valor -> System.out.println(valor);
consumer.accept("Hello world");

// Hello world

```

**Function<T,R>**

Contiene el método apply que recibe un argumento T y devuelve el resultado de ese método. Ejemplo:

```java

Function<String, String> myFunction = valor -> "Hello " + valor;
System.out.println(myFunction.apply("John Doe"));

// Hello John Doe

```    
**Predicate<T>**

Contiene el método test que recibe un argumento T y devuelve un boolean. Ejemplo:

```java

Predicate<Integer> myPredicate = valor -> valor % 2 == 0?true:false;
if (myPredicate.test(4)) {
  System.out.println("Es par.");
}else {
  System.out.println("Es impar.");
}

// Es par.

```

**Supplier<T>**

Contiene el método get que no recibe argumentos y produce un valor de tipo T. A menudo se usa para crear un objeto colección en donde se colocan los resultados de la operación de un flujo.

```java

Integer[] arrNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
Supplier<List<Integer>> supplier = () -> Arrays.asList(arrNumbers);
supplier.get().stream().forEach(System.out::print);

// 12345678910

```
**UnaryOperator<T>**  

Contiene el método get que no recibe argumentos y devuelve un valor de tipo T.

### Flujos

Java SE 8 introduce el concepto de flujos. Los flujos son objetos de clases que implementan a la interfaz Stream (del paquete java.util.stream) o una de las interfaces de flujo especializadas para procesar colecciones de valores int, long o double. En conjunto con las lambdas, los flujos le permiten realizar tareas sobre colecciones de elementos, a menudo de un objeto arreglo o colección.

**Técnicas de iteración**

Como se piensa en POO en comparación con la programación funcional:
- Iteración externa: Para una tarea en particular, se debe definir como se va a realizar. Esto es común en el paradigma de POO.
- Iteración interna. Para una tarea en particular, se utilizan bibliotecas de Java SE 8, el cual le decimos que queremos, más no como lo debe hacer, ya que el cómo se encargará la biblioteca. Esto funciona así en la programación funcional.

**Canalización de flujos**

Por medio de una colección de datos, se puede originar un origen de datos que forme una canalización de flujos. Dicha canalización, permite aplicar operaciones intermedias y terminales sobre el origen de datos por medio del encadenamiento de llamadas a métodos. Una vez producido el flujo, no puede reutilizarse, ya que no queda en memoria como una colección de datos definido en una instancia.

**Operaciones intermedias y terminal**

Una **operación intermedia** especifica las tareas a realizar sobre los elementos del flujo y siempre produce un nuevo flujo. Las operaciones intermedias son perezosas; es decir, no se ejecutan sino hasta que se invoque a una operación terminal.

Una **operación terminal** inicia el procesamiento de las operaciones intermedias de una canalización de flujo y produce un resultado. Las operaciones terminales son ansiosas, ya que realizan la operación solicitada cuando se les invoca.

![Operaciones intermedias y terminales en Java 8](./images/operaciones_intermedias_terminales_java_8.png)

### Operaciones intermedias de flujo con y sin estado

Sin estado: No requiere información de los otros flujos para satisfacer un predicado. Por ejemplo, el método filter es una operación intermedia de flujo sin estado.

Con estado: Requiere información de todos los flujos para ser ejecutado. Por ejemplo, el método sorted es una operación intermedia con estado, porque requiere información sobre todos los demás flujos para poder ordenarlos.

### Operaciones intermedias de asignación

Permite modificar el valor de los datos del flujo. Es una operación intermedia sin estado. Por ejemplo, el método map, recibe cada objeto del flujo y podría cambiar el valor de cada objeto procesado.

**Ejemplos de operaciones intermedias y terminales con la interfaz IntStream**

```java

import java.util.stream.IntStream;

public class OperacionesIntStream {
	public static void main(String[] args) {

		int[] valores = { 3, 10, 6, 1, 4, 8, 2, 5, 9, 7 };

		// muestra los valores originales
		System.out.print("Valores originales: ");
		IntStream.of(valores).forEach(valor -> System.out.printf("%d ", valor));
		System.out.println();

		// cuenta, min, max, suma y promedio de los valores
		System.out.printf("%nCuenta: %d%n", IntStream.of(valores).count());
		System.out.printf("Min: %d%n", IntStream.of(valores).min().getAsInt());
		System.out.printf("Max: %d%n", IntStream.of(valores).max().getAsInt());
		System.out.printf("Suma: %d%n", IntStream.of(valores).sum());
		System.out.printf("Promedio: %.2f%n", IntStream.of(valores).average().getAsDouble());

		// suma de valores con el método reduce
		System.out.printf("%nSuma mediante el metodo reduce: %d%n", IntStream.of(valores).reduce(0, (x, y) -> x + y));

		// suma de cuadrados de los valores con el método reduce
		System.out.printf("Suma de cuadrados mediante el metodo reduce: %d%n",
				IntStream.of(valores).reduce(0, (x, y) -> x + y * y));

		// producto de los valores con el método reduce
		System.out.printf("Producto mediante el metodo reduce: %d%n", IntStream.of(valores).reduce(1, (x, y) -> x * y));

		// valores pares mostrados en orden
		System.out.printf("%nValores pares mostrados en orden: ");
		IntStream.of(valores).filter(valor -> valor % 2 == 0)
        .sorted()
				.forEach(valor -> System.out.printf("%d ", valor));
		System.out.println();

		// valores impares multiplicados por 10 y mostrados en orden
		System.out.printf("Valores impares multiplicados por 10 y mostrados en orden: ");
		IntStream.of(valores).filter(valor -> valor % 2 != 0)
        .map(valor -> valor * 10)
        .sorted()
				.forEach(valor -> System.out.printf("%d ", valor));
		System.out.println();

		// suma el rango de enteros del 1 al 10, exclusivo
		System.out.printf("%nSuma de enteros del 1 al 9: %d%n", IntStream.range(1, 10).sum());

		// suma el rango de enteros del 1 al 10, inclusivo
		System.out.printf("Suma de enteros del 1 al 10: %d%n", IntStream.rangeClosed(1, 10).sum());

    Integer[] valoresRef = { 3, 10, 6, 1, 4, 8, 2, 5, 9, 7 };  
		
		// Genera otra colección de datos de números pares ordenados:
		List<Integer> pares = Arrays.stream(valoresRef)
						.filter(valor -> valor % 2 == 0)
						.sorted()
						.collect(Collectors.toList());

	}
} // fin de la clase OperacionesIntStream

```
**Generación de objeto Stream con la clase Array**

El método stream de la clase Array puede usarse para crear un objeto Stream a partir de un arreglo de objetos. Por ejemplo:

```java

Integer[] valoresObj = { 3, 10, 6, 1, 4, 8, 2, 5, 9, 7 };  
		
// Genera otra colección de datos de números pares ordenados:
List<Integer> pares = Arrays.stream(valoresObj)
						                .filter(valor -> valor % 2 == 0)
						                .sorted()
						                .collect(Collectors.toList());


```
### Métodos de referencias

Los métodos de referencia, es una anotación abreviada de escribir expresiones lambda, para dar mayor claridad en casos donde dicha expresión hace únicamente llamado a un método. A continuación, los tipos de referencia a métodos:

| Expresión lambda| Sentencia abreviada | Tipo de método de referencia |
| ----- | ---- | ---- |
| (String s) -> {return s.toUpperCase();} | String::toUpperCase | Referencia a método para un **método de instancia de una clase**. Crea una lambda de un parámetro que invoca al método de instancia con el argumento de la lambda y devuelve el resultado del método. |
| valor -> System.out.println(valor) | System.out::println | Referencia a método para un **método de instancia que debe invocarse sobre un objeto específico**. Crea una lambda de un parámetro que invoca al método de instancia sobre el objeto especificado (pasa el argumento de la lambda al método de instancia) y devuelve el resultado del método. |
| valor -> Math.sqrt(valor) | Math::sqrt | Referencia a método para un **método static de una clase**. Crea una lambda de un parámetro en donde el argumento de la lambda se pasa al método static especificado y la lambda devuelve el resultado del método. |
| () -> new Person() | Person::new | **Referencia a un constructor**. Crea una lambda que invoca el constructor sin argumentos de la clase especificada para crear e inicializar un nuevo objeto de esa clase. |

## Referencias

- Libro: Como programar en Java ed.10 - Deitel.

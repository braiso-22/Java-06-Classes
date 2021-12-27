# Java-06-Classes
Java course part 6

<ol>
  <li>
    A partir de la clase MovilPrepago que te proporcionará el profesor, haz un programa
    en el que se cree un teléfono con unas características determinadas y luego ejecute una
    serie de actividades como recargar 10 euros, llamar 30 seguntos, navegar 10MB, etc.
    Viendo cómo se va modificando el saldo.
    Las propiedades de un móvil prepago son:
  </li>
  <ul>
    <li>int numeroMovil (13 digitos)</li>
    <li> float costeEstablecLlamada (euros, con dos decimales)</li>
    <li> float costeMinutoLlamada (euros, con dos decimales)</li>
    <li> float costeConsumoMB (euros, con dos decimales) </li> 
    <li> float saldo (euros, con dos decimales) </li>
  </ul>
  Los métodos son:
  <ul>
    <li>
      void efectuarLlamada (int segundos): reduce el saldo. Si el saldo no es suficiente, se corta
      la llamada
    </li> 
    <li>
      void navegar(int MB) análogo a efectuar una llamada
    </li>
    <li>
      boolean recargar (int importe): aumenta el saldo, debe ser múltiplo de 5 euros, sino
      devuelve false
    </li>
    <li>
      float consultarSaldo ()
    </li>
  </ul><br>
  <li>
    A partir de la clase MovilPrepago del ejercicio anterior, crea un programa en el que el
    usuario dé de alta un teléfono con unas características determinadas y luego le permita
    mediante un menú hacer operaciones como consultar saldo, recarga, hacer llamada,
    navegar. Se proporciona un modelo (modeloMenu) a modo de esqueleto, con el menú y las
    funciones necesarias, en las que solo tienes rellenar los huecos.
  </li><br>
  <li>
    A partir de la clase CuentaCorriente que te proporcionará el profesor, crea un
    programa en el que se creen una cuenta corriente (siempre se crean con saldo inicial cero)
    y mediante un menú le permita al usuario hacer operaciones como ingresar, retirar y
    consultar saldo en la cuenta. El único atributo público de la cuenta es el IBAN (String de 24
    dígitos/letras). Otros atributos privados son saldo, contadorIngresos, porcentajeComision y
    minimoComision, pero como son privados, no tenemos acceso a ellos. Los métodos son:
  </li><br>
  <ul>
    <li>
      Constructor (String Iban): se le pasa el nombre de la cuenta y fija saldo inicial a cero.
    </li>
    <li>
      Void ingresar (float importe): aumenta el saldo. Si se hacen 3 ingresos consecutivos, sin
      ninguna retirada en medio, se regala 0,7 euros al usuario.
    </li>
    <li>
      boolean retirar (float importe): reduce el saldo si es posible, no puede quedar negativo
      (devuelve si se ha efectuado la retirada o no). Cada retirada tiene una comisión asociada.
    </li>
    <li>
      float getSaldo (): devuelve el saldo actual en la cuenta.
    </li>
    <li>
      setComision (float porcentaje, float impMinimo). Fija la comisión de retirada, para todas las cuentas.
    </li>
    <li>
      getPorcentajeComision() devuelve un float con el porcentaje de comisión a aplicar en retiradas.
    </li>
    <li>
      getMinimoComision() devuelve un float con el importe mínimo de comisión a aplicar en retiradas.
    </li>
  </ul><br>
  <li>
    Haz un programa como el anterior, pero creando dos cuentas en vez de una. Habrá
    una opción de menú nueva que será “Cambiar cuenta activa” para pasar de una cuenta a
    otra. Tendremos una variable de tipo CuentaCorriente que le puedes llamar cuentaActiva
    que unas veces apuntará a una cuenta y otras veces a la otra
    Recuerda que las variables de tipo Objeto, a diferencia de los tipos primitivos, son
    apuntadores a los objetos, si tenemos los objetos ‘cuenta1’ y ‘cuenta2’ creados con su
    constructor, podemos hacer luego una tercera variable ‘cuentaActiva’ sin constructor y
    hacer ‘cuentaActiva=cuenta1’ o bien ‘cuentaActiva=cuenta2’ cuando nos interese.
  </li><br>
  <li>
    A partir de la clase Ahorcado que te proporcionará el profesor, crea un programa que
    permita al usuario jugar al ahorcado. Desconocemos los atributos de la clase Ahorcado ya
    que son privados, pero sus métodos públicos son:
  </li><br>
  <ul>
    <li>
      Constructor(String txtAdivinar, String txtPista). Crea el juego con la frase a adivinar y con un texto de pista para el jugador.
    </li>
    <li>
      Constructor(String txtAdivinar). Crea el juego con la frase a adivinar, sin pistas.
    </li>
    <li>
      boolean probarLetra (char x). Comprueba si la letra pasada como parámetro está en la frase a adivinar, en caso afirmativo, devuelve true ̧ sino false.
    </li>
    <li>
      boolean adivinada(). Devuelve true si se ha adivinado la frase, false en caso contrario.
    </li>
    <li>
      boolean perdio(). Devuelve true si se ha llegado al número máximo de intentos sin adivinar la frase, false en caso contrario.
    </li>
    <li>
      char leerLetra (). Pide al usuario por consola una letra y devuelve dicha letra.
    </li>
    <li>
      void pintar (). Dibuja un “tablero” en la consola, con el estado del juego.
    </li>
  </ul><br>
  <li>
    A partir de las clases Nim y Consola, crea un programa que juegue al NIM contra la
    máquina. Se trata de un tablero con 3 filas de palillos, con 3, 5 y 7 palillos respectivamente.
    Dos jugadores por turnos alternos (el usuario y la máquina) han de retirar palillos del
    tablero perdiendo el que se quede el último palillo. Se pueden retirar el número de palillos
    que quieras, pero solo de una misma fila.
    Por lo tanto, la estructura del programa será la siguiente: primero se crea el juego. Luego
    habrá un bucle mientras no gane ninguno de los dos y, dentro del bucle, primero piensa la
    máquina, luego hace su jugada, y si no ha ganado, introduces tu jugada (fila y cantidad de
    palillos) y compruebas si has ganado. Así sucesivamente hasta que gane uno de los dos.
    Si empieza la máquina, siempre gana. Desconocemos los atributos de la clase Nim ya que
    son privados, pero sus métodos públicos son:
  </li>
  <ul>
    <li>
      Constructor () por defecto. Se crea una instancia del juego.
    </li>
    <li>
      boolean Juega (int fila, int cant). Valida los datos y retira la cantidad de palillos indicada de la
      fila indicada devolviendo true. Devuelve false si los parámetros no son válidos. Las filas van
      de 0 a 2.
    </li>
    <li>
      boolean Fin() devuelve true si se alcanzó el final del juego (un solo palillo en el tablero).
    </li>
    <li>
      int piensa (). Se invoca para que la máquina piensa su jugada y devuelve un entero cuyas
      decenas son la fila (0,1,2) y las unidades son los palillos que retira (entre 1 y 7), pero no
      implica que haga dicha jugada. Lo normal será llamar luego al método juega con los
      parámetros obtenidos con piensa().
    </li>
  </ul><br>
  La clase Consola, tiene los siguientes métodos públicos estáticos:
  <ul>
    <li>
      Int leerEntero(texto). Pide un valor por consola y valida que sea un entero de forma que si
      mete letras o valores incorrectos no “casca” y vuelve a pedir que se introduzcan
      correctamente. El texto que se pasa como parámetro es el que le dice al usuario lo que tiene
      que introducir, así no hace falta meter antes un System.out.println. Ejemplo:
      x=leerEntero(“introduzca fila”);
    </li>
    <li>
      PintarTablero (Nim tablero). Se le pasa un tablero de Nim y lo pinta por consola.
    </li>
  </ul><br>
  Hay que tener en cuenta que los usuarios hablamos de filas 1,2 y 3 mientras que la clase
  Nim habla de filas 0,1 y 2.
  Haz un programa que empiece siempre la máquina (ganará siempre) y, si quieres, haz otro
  en que empieces tú, a ver si eres capaz de ganarle.  
  <li>
    Implementar una clase llamada Circulo, que tiene solo la propiedad radio y los
    métodos setRadio, getRadio, calcularCircunferencia, calcularSuperficie, calcularDiametro
    además de un constructor. Crea un programa que use esta clase creando un par de círculos
    y usando los métodos creados. ¿El atributo radio puede ser privado?
  </li>
  <li>
    Implementar una clase llamada EjemplarLibro que se va a usar en una biblioteca y
    que tiene los siguientes atributos:
  </li>
  <ul>
    <li>
      Título de libro (se le pone en el momento del alta)
    </li>
    <li>
      Fecha de adquisición (es la fecha del sistema en el momento del alta)
    </li>
    <li>
      Número de ejemplar: 1, 2, 3, etc. (de un mismo libro, la biblioteca tiene varios ejemplares)
    </li>
    <li>
      Prestado (sí /no). Inicialmente no está prestado.
    </li>
  </ul>
  Además, tiene los siguientes métodos:
  <ul>
    <li>
      Constructor 1: cuando es el primer ejemplar de un determinado título, se le pasa como parámetro solo el título del libro. El resto de datos los puede calcular él.
    </li>
    <li>
      Constructor 2: se le pasa como parámetro un libro y copia todos sus atributos salvo el número de ejemplar que será 1 más el del libro pasado.
    </li>
    <li>
      Prestar (): si no está prestado lo marca como prestado y devuelve true ̧ si está prestado no hace nada y devuelve false.
    </li>
    <li>
      Devolver (): si está prestado lo marca como no prestado y devuelve true ̧ si no está prestado no hace nada y devuelve false.
    </li>
    <li>
      toString (): Genera un String con el nombre, la fecha entre paréntesis y el número de
      ejemplar entre corchetes. Este método se usará para sacar por pantalla de forma cómoda los
      datos de un libro.
    </li>
  </ul>
  Haz un main() que cree 4 libros (probando ambos constructores), que realice algúnpréstamo y devolución, y finalmente muestre los libros -con toString()-.
  <li>
    Ejercicios de fechas. Usando las clases de Java para el manejo de fechas, realiza programas con la siguiente funcionalidad:
  </li>
  <ol>
    <li>
      Introducir tu fecha de nacimiento y muestre cuantos días han pasado hasta ahora mismo.
    </li>
    <li>
      Introducir una fecha y un número de días y calcule la fecha que se obtiene al incrementar dichos días a la fecha.
    </li>
    <li>
      Introducir dos horas de reloj y nos dé la diferencia entre ambas en segundos.
    </li>
    <li>
      ¿Cuántos años bisiestos ha habido desde el año 1 dC?
    </li>
    <li>
      Introducir una fecha y mostrar el día de la semana que le corresponde.
    </li>
    <li>
      Introducir un tipo de producto (1- perecedero, 2-electrónica, 3-ropa) y la fecha de
      compra, y que informe si se puede devolver a día de hoy o no (los plazos de
      devolución, son respectivamente 5 horas, 6 meses, 15 días)
    </li>
    <li>
      Introducir un año y decir cuántos domingos tiene.
    </li>
    <li>
      Indica el día de la semana (en texto, en gallego) del 31 de diciembre de los últimos 5 años.
    </li>
  </ol>
  <li>
    Desarrolla la clase MovilPrepago que te proporcionó el profesor para ejercicios anteriores y compárala con la proporcionada.
  </li>
  <li>
    Desarrolla la clase CuentaCorriente que te proporcionó el profesor para ejercicios anteriores y compárala con la proporcionada.
  </li>
  <li>
    Diseña una clase llamada Alumno para gestionar los alumnos de una escuela.
    Contiene los atributos: nombre completo, DNI, fecha de nacimiento y nombre de la escuela
    (común para todos los alumnos). Además del constructor, los métodos set y get para cada
    atributo, tendrá los siguientes métodos:
  </li>
  <ul>
    <li>
      Método que nos dice si es mayor de edad o no.
    </li>
    <li>
      Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno pasado es menor que él mismo. False en caso contrario.
    </li>
    <li>
      Método al que se le pase como parámetro otro alumno y nos devuelva true si el
      alumno pasado es exactamente igual en todos los campos (un duplicado). False en
      caso contrario.
    </li>
  </ul>
  Realiza a continuación un programa sencillo que use la clase definida.
  <li>
    Realiza un juego de la ruleta rusa para dos jugadores. La pistola tiene 6 huecos en la
    recámara pero solo una bala. Al empezar la partida se genera una posición al azar de la
    recámara para la bala de forma que puede salir en el primer disparo, en el segundo, etc.
    hasta el sexto. Los jugadores irán disparando sucesivamente hasta que uno de los dos se
    muera. Crea una clase Pistola con los atributos y métodos que la definen.
  </li>
  <li>
    Diseña una clase llamada Ruleta y un programa que la use, con la siguiente
funcionalidad.
  </li>
  <ul>
    <li>
      El jugador puede apostar lo que quiera a par o a impar .
    </li>
    <li>
      En cada juego obtiene un número al azar entre 0 y 36
    </li>
    <li>
      Si sale 0 pierde tanto par como impar, y en caso contrario si el jugador acierta (par o impar) gana tanto como lo apostado.
    </li>
  </ul>
  Define los métodos necesarios para que los usuarios puedan apostar a par o impar. Hacer
  un programa en el que un jugador lleve 10.000 euros y juegue 10.000 veces 1 euro cada
  vez siempre apostando a par ¿Con cuánto dinero acaba? El resultado final puede ir entre 0
  y 20.000 euros. Ejecútalo varias veces.
  <li>
    Un profesor ha desarrollado un examen tipo test de 20 preguntas y cada una de ellas
    tiene cuatro opciones: a), b), c) ó d), siendo solo una de ellas la correcta. Cada pregunta
    correcta suma 0.5 puntos y cada una incorrecta resta 0.2 puntos, no pudiendo llevar un
    alumno ninguna nota inferior a cero. Desarrolla una clase llamada Examen que almacene
    las respuestas correctas de las 20 preguntas. La clase debe disponer de algún mecanismo
    mediante el que se le pase las respuestas de un alumno para las 20 preguntas (a,b,c,d o
    bien z, siendo respuesta en blanco) y nos informe de la puntuación en el examen. Hacer un
    programa que permita primero informar de las respuestas correctas a un examen y
    después introducir las respuestas de los alumnos, mostrándonos la nota obtenida por los mismos.
  </li>
</ol>

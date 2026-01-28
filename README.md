# DOSW_LAB1_KJL
Desarrollo primer laboratorio DOSW
# NOMBRES:
-	Laura Nicol Castillo Forero
-	Kevin Arturo Cuitiva Pardo 
-	Juan David Silva Camacho
 
# FORMA DE TRABAJO:
Como equipo de trabajo, se acordó aprovechar de manera eficiente el tiempo asignado durante el horario de clase para adelantar la mayor parte del desarrollo del laboratorio. Durante estas sesiones presenciales se realizará el análisis general del laboratorio, la revisión de los requerimientos y la planificación de las actividades necesarias para su correcta implementación.

La parte restante del laboratorio será desarrollada durante la semana y el fin de semana mediante una reunión virtual a través de Microsoft Teams, cuyo objetivo principal será completar el desarrollo del laboratorio, resolver dudas pendientes y realizar el envío final del trabajo.

Para garantizar un desarrollo organizado y colaborativo, se establecieron las siguientes actividades y asignaciones:

- Lectura y análisis del laboratorio y los retos:
  Todos los integrantes del equipo realizarán la lectura completa del laboratorio y de los retos propuestos, con el fin de comprender claramente los objetivos, requerimientos y posibles dificultades.
 
-Asignación de retos individuales:
  Cada integrante del equipo tendrá asignado uno o varios retos específicos, los cuales deberá intentar desarrollar de manera individual. Este trabajo permitirá identificar posibles errores, dudas o alternativas    de solución.

- Socialización de resultados y resolución de dudas:
  Durante la reunión del fin de semana, cada integrante presentará los avances obtenidos, las dificultades encontradas y las soluciones propuestas. A partir de esta socialización, el equipo resolverá las dudas y   unificará criterios para asegurar un desarrollo correcto y coherente del laboratorio.

- Control de versiones y trabajo colaborativo:
  Se crearán ramas individuales en el repositorio para cada una de las soluciones desarrolladas. Posteriormente, una vez validadas y corregidas, se realizará el proceso de merge hacia la rama principal (main),      integrando de manera ordenada todos los puntos requeridos en el laboratorio.

## RETOS COMPLETADOS

### Reto #1: La Bienvenida 
**Desarrollado por:** Kevin Cuitiva  
**Descripción:** Implementación de una expresión lambda para imprimir un saludo de bienvenida utilizando streams, map() y collect(). Los estudiantes están almacenados en una estructura de datos List.
### Evidencia del reto 
<img width="1908" height="948" alt="image" src="https://github.com/user-attachments/assets/679c70ab-fbc9-4bee-8c83-d1acc8982762" />

### RETO 2: La carrera paralela

Se crearon dos ramas una para cada estudiante

![Imagen 1](laboratorio1/imagenes/1.png)

Después de crear las ramas cada estudiante agrega su parte correspondiente (la primera el StringBuilder y la segunda el StringBuffer) y se procede a hacer el commit de cada una al final queda así.

![Imagen 2](laboratorio1/imagenes/2.png)
![Imagen 3](laboratorio1/imagenes/3.png)

Esto era cada commit correspondiente a cada estudiante y en la rama principal del reto se hace el merge de las dos ramas, una la del Carril 1 con el StringBuilder y otra la del Carril 2 con el StringBuffer y se soluciona los conflictos que se presentan y así queda el código final.

![Imagen 4](laboratorio1/imagenes/4.png)

Después en el Carril 1, se hace el commit correspondiente y luego se hace un merge con la rama principal (Carril 1) y se hace push de todo.

![Imagen 5](laboratorio1/imagenes/5.png)

Hacemos lo mismo con el Carril 2, y hacemos un merge con la rama principal (Carril 2) y se hace push de todo.

![Imagen 6](laboratorio1/imagenes/6.png)

Después con el código final funcional, se hace un commit final y queda el grafo así.

![Imagen 7](laboratorio1/imagenes/7.png)

# RETO 3

Se crearon dos ramas, una para cada estudiante.

![Imagen 1](laboratorio1/imagenes/imagenes%20reto%203/1.png)

Después de crear las ramas cada estudiante agrega su parte correspondiente (la primera el StringBuilder y la segunda el StringBuffer) y se procede a hacer el commit de cada una, al final queda así.

![Imagen 2](laboratorio1/imagenes/imagenes%20reto%203/2.png)
![Imagen 3](laboratorio1/imagenes/imagenes%20reto%203/3.png)

Esto era cada commit correspondiente a cada estudiante y en la rama principal del reto se hace el merge de las dos ramas, una la del Builder con el StringBuilder y otra la del Buffer con el StringBuffer y se solucionan los conflictos que se presentan y así queda el código final.

![Imagen 4](laboratorio1/imagenes/imagenes%20reto%203/4.png)

Después en el Builder, se hace el commit correspondiente y luego se hace un merge con la rama principal (Builder) y se hace push de todo.

![Imagen 5](laboratorio1/imagenes/imagenes%20reto%203/5.png)

Hacemos lo mismo con el Buffer, y hacemos un merge con la rama principal (Buffer) y se hace push de todo.

![Imagen 6](laboratorio1/imagenes/imagenes%20reto%203/6.png)

### RETO 4: El tesoro de las llaves duplicadas

**Desarrollado por:** Laura Nicol Castillo Forero

**Descripción:**
En este reto se implementó la combinación de dos estructuras de datos (HashMap y Hashtable) desarrolladas en ramas separadas del repositorio, aplicando buenas prácticas de control de versiones con Git.

Inicialmente, se desarrolló una solución utilizando HashMap, la cual almacena pares clave-valor ignorando claves duplicadas y conservando el primer valor ingresado. Posteriormente, se implementó una versión alternativa usando Hashtable, asegurando sincronización y permitiendo la sobrescritura de valores en caso de claves repetidas.

Finalmente, se realizó el proceso de merge en la rama principal del reto, resolviendo los conflictos generados y unificando ambas implementaciones en una única solución final que:

- Prioriza los valores provenientes del Hashtable en caso de conflicto
- Convierte todas las claves a mayúsculas antes de imprimir
- Ordena los resultados de forma ascendente
- Utiliza stream(), map(), sorted() y Collectors.toMap() con expresiones lambda
- Permite el ingreso de datos por parte del usuario desde consola

**Evidencia del reto:**

Rama con implementación usando HashMap
<img width="1900" height="900" src="image-2.png" />

Rama con implementación usando Hashtable
<img width="1900" height="900" src="image-3.png" />

Rama principal con integración final y resolución de conflictos
<img width="1900" height="900" src="image-4.png" />

### Reto #5: Batalla de Conjuntos 
**Desarrollado por:** Kevin Cuitiva  
**Descripción:** Simulación de una batalla donde dos equipos (HashSet y TreeSet) almacenan números. HashSet elimina múltiplos de 3 sin orden, mientras TreeSet elimina múltiplos de 5 manteniendo orden ascendente. Al final, ambas colecciones se unen eliminando duplicados. Utiliza stream().filter() con lambdas para el filtrado y forEach() con lambdas para la impresión de resultados.
### Evidencia del reto 
<img width="1907" height="1110" alt="image" src="https://github.com/user-attachments/assets/fb061c53-4cbe-471c-94c2-1af206a895d6" />

### RETO 6: Máquina de decisiones

**Desarrollado por:** Laura Nicol Castillo Forero

**Descripción:**
En este reto se desarrolló una máquina de decisiones interactiva en Java, cuyo objetivo principal fue implementar un sistema capaz de ejecutar distintas acciones a partir de comandos ingresados por el usuario desde la consola.

La solución se basa en el uso de un Map<String, Runnable>, donde cada clave representa un comando y cada valor corresponde a una acción específica que la máquina puede ejecutar. Este enfoque permitió evitar estructuras condicionales extensas (if-else o switch), logrando un diseño más limpio, flexible y escalable.

El desarrollo del reto se realizó dividiendo la inicialización de los comandos en dos fragmentos lógicos, los cuales fueron integrados posteriormente en una única solución funcional.

La versión final del programa cumple con las siguientes características:

- Permite al usuario ingresar comandos dinámicamente desde la consola.
- Ejecuta acciones asociadas a cada comando utilizando expresiones lambda.
- Convierte los comandos ingresados a mayúsculas para evitar errores por diferencias de formato.
- Maneja correctamente los comandos desconocidos mostrando un mensaje informativo.
- Incluye un comando especial (SALIR) que finaliza la ejecución del programa de forma controlada.
- Facilita la extensión del sistema mediante la adición de nuevos comandos sin modificar la lógica principal.

Este reto permitió reforzar conceptos relacionados con programación funcional en Java, uso de colecciones, lambdas, y diseño modular, además de fomentar buenas prácticas de legibilidad y mantenimiento del código.

**Evidencia del reto:**

Implementación de la máquina de decisiones con comandos interactivos y ejecución del programa solicitando comandos al usuario y mostrando las respuestas correspondientes
<img width="1900" height="900" src="image-5.png" />

# PREGUNTAS 

Pregunta 1: 
¿Cuál es la diferencia entre git merge y git rebase?

Respondida por: Laura Nicol Castillo Forero

Respuesta:
git merge y git rebase son dos comandos utilizados para integrar cambios entre ramas, pero funcionan de manera diferente.

El comando git merge combina dos ramas creando un commit de merge, el cual conserva el historial completo de ambas ramas. Este método es seguro y mantiene una representación fiel del trabajo colaborativo, ya que permite identificar claramente cuándo y desde qué ramas se realizaron las integraciones.

En resumen, git merge preserva el historial tal como ocurrió, mientras que git rebase lo reorganiza para hacerlo más lineal.

Pregunta 2: 
Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?

Respondida por: Laura Nicol Castillo Forero 

Respuesta:
Cuando dos ramas modifican la misma línea de un archivo y se intenta realizar un git merge, Git no puede decidir automáticamente cuál cambio conservar. En este caso, se produce un conflicto de merge.

Pregunta 3: 
¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

Respondida por: Laura Nicol Castillo Forero

Respuesta:
Para visualizar gráficamente el historial de commits, ramas y merges desde la consola, se puede utilizar el siguiente comando:

git log --oneline --graph --all

Este comando muestra una representación visual del historial del repositorio, donde se pueden observar las bifurcaciones de ramas, los commits realizados y los puntos en los que se realizaron merges. Esta visualización facilita la comprensión del flujo de trabajo y la relación entre las diferentes ramas del proyecto.

Pregunta 4: 
Explica la diferencia entre un commit y un push.

Respondida por: Laura Nicol Castillo Forero

Respuesta:
Un commit es una acción local que guarda los cambios realizados en el repositorio del desarrollador. Al hacer un commit, los cambios quedan registrados en el historial del proyecto en la máquina local, pero aún no se comparten con otros colaboradores.

Un push, en cambio, se utiliza para enviar los commits locales a un repositorio remoto, como GitHub. Solo después de realizar un push, los cambios se hacen visibles y accesibles para los demás integrantes del equipo.

En resumen, el commit guarda cambios localmente, mientras que el push los publica en el repositorio remoto.

Pregunta 5:
¿Para qué sirven git stash y git pop?

Respondida por: Kevin Arturo Cuitiva Pardo

Respuesta:
git stash permite guardar cambios no confirmados de manera temporal sin hacer un commit. Esto es útil cuando necesitas cambiar de rama sin perder tu trabajo. git pop recupera los cambios guardados y los aplica a la rama actual. Es similar a guardar cambios en un "almacén temporal".

Pregunta 6:
¿Qué diferencia hay entre HashMap y Hashtable?

Respondida por: Kevin Arturo Cuitiva Pardo

Respuesta:
HashMap no es sincronizado (no es thread-safe) y permite una clave null, siendo más rápido y eficiente para uso de un solo hilo. Hashtable es sincronizado (thread-safe) y no permite claves null, siendo más seguro para entornos multihilo pero más lento.

Pregunta 7:
¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un map?

Respondida por: Juan David Silva Camacho

Respuesta:
Collectors.toMap() es más conciso, legible y permite aplicar transformaciones funcionales durante la creación del map. Un bucle tradicional requiere más líneas de código y es menos flexible para operaciones complejas. Además, toMap() es más eficiente con streams y permite definir el comportamiento en caso de colisiones de claves.

Pregunta 8:
Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?

Respondida por: Juan David Silva Camacho

Respuesta:
stream().map() es una operación de transformación que convierte cada elemento de la lista en otro tipo de dato. Por ejemplo, de una List<Persona> puedes extraer solo los nombres con map(Persona::getNombre), resultando en un stream de String. Es una operación intermedia que crea un nuevo stream con los elementos transformados.

Pregunta 9:
¿Qué hace el método stream().filter() y qué retorna?

Respondida por: Juan David Silva Camacho

Respuesta:
stream().filter() es una operación intermedia que recibe un predicado (condición) y retorna un nuevo stream con solo los elementos que cumplen esa condición. Por ejemplo, stream().filter(x -> x > 10) devuelve un stream con números mayores a 10. No consume el stream, solo lo modifica.

Pregunta 10:
Describe el paso a paso de cómo crear una rama develop si es una funcionalidad nueva.

Respondida por: Laura Nicol Castillo Forero

Respuesta:
1. Posicionarse en la rama main: git checkout main
2. Crear la rama develop: git branch develop
3. Cambiar a la rama: git checkout develop (o git switch develop)
4. Hacer cambios y commits en develop
5. Una vez lista, hacer merge a main: git checkout main; git merge develop

Pregunta 11:
¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?

Respondida por: Laura Nicol Castillo Forero

Respuesta:
git branch solo crea la rama pero no la activa. git checkout -b crea la rama y automáticamente cambia a ella en un solo comando. Entonces, git branch nombre seguido de git checkout nombre es equivalente a git checkout -b nombre.

Pregunta 12:
¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?

Respondida por: Laura Nicol Castillo Forero

Respuesta:
Usar ramas feature/ sigue el patrón Git Flow, manteniendo main estable y funcional. Las ramas feature/ permiten desarrollar de forma aislada, evitando romper el código principal. Facilita la revisión de código (pull requests), permite trabajo colaborativo y mantiene un historial claro de cambios. Si algo sale mal, solo afecta la rama feature, no la rama principal.

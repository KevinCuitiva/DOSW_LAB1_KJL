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

# Estructura de paquetes creada:

<img width="396" height="537" alt="image" src="https://github.com/user-attachments/assets/a14fa4b2-576a-4c30-9050-50d3e221fb82" />


# Retos Hackethon Express 

# PREGUNTAS 
Pregunta 1
¿Cuál es la diferencia entre git merge y git rebase?

Respondida por: Laura Nicol Castillo Forero

Respuesta:
git merge y git rebase son dos comandos utilizados para integrar cambios entre ramas, pero funcionan de manera diferente.

El comando git merge combina dos ramas creando un commit de merge, el cual conserva el historial completo de ambas ramas. Este método es seguro y mantiene una representación fiel del trabajo colaborativo, ya que permite identificar claramente cuándo y desde qué ramas se realizaron las integraciones.

En resumen, git merge preserva el historial tal como ocurrió, mientras que git rebase lo reorganiza para hacerlo más lineal.

Pregunta 2
Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?

Respondida por: Laura Nicol Castillo Forero 

Respuesta:
Cuando dos ramas modifican la misma línea de un archivo y se intenta realizar un git merge, Git no puede decidir automáticamente cuál cambio conservar. En este caso, se produce un conflicto de merge.

Pregunta 3
¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

Respondida por:  Laura Nicol Castillo Forero

Respuesta:
Para visualizar gráficamente el historial de commits, ramas y merges desde la consola, se puede utilizar el siguiente comando:

git log --oneline --graph --all


Este comando muestra una representación visual del historial del repositorio, donde se pueden observar las bifurcaciones de ramas, los commits realizados y los puntos en los que se realizaron merges. Esta visualización facilita la comprensión del flujo de trabajo y la relación entre las diferentes ramas del proyecto.

Pregunta 4
Explica la diferencia entre un commit y un push.

Respondida por: Laura Nicol Castillo Forero

Respuesta:
Un commit es una acción local que guarda los cambios realizados en el repositorio del desarrollador. Al hacer un commit, los cambios quedan registrados en el historial del proyecto en la máquina local, pero aún no se comparten con otros colaboradores.

Un push, en cambio, se utiliza para enviar los commits locales a un repositorio remoto, como GitHub. Solo después de realizar un push, los cambios se hacen visibles y accesibles para los demás integrantes del equipo.

En resumen, el commit guarda cambios localmente, mientras que el push los publica en el repositorio remoto.



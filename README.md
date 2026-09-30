## Laboratorio de Arquitectura de Software

> **Asignatura:** IS-488 Arquitectura de Software  
> **Semestre:** 2025-I  
> **Docente:** Ing. Luis Adderlin Ruiz Huaman

## Sesión: 02 – Diseño inicial en 3 capas y N capas

### 1. PROPOSITO DEL LABORATORIO

En esta práctica se realizará el diseño inicial de la arquitectura de un sistema,
identificando sus módulos, responsabilidades y dependencias.
El diseño se realizará mediante dos propuestas:

- Arquitectura de 3 capas.
- Arquitectura de N capas.

El objetivo no es desarrollar todavía todo el sistema, sino construir el esqueleto arquitectónico
de la solución.

### 2. OBJETIVOS
   Al finalizar la práctica, debo ser capaz de:
1. Identificar las principales responsabilidades de un sistema.
2. Organizar los componentes de una aplicación mediante capas.
3. Diseñar una arquitectura de 3 capas.
4. Diseñar una arquitectura de N capas.
5. Identificar las dependencias entre módulos.
6. Representar gráficamente la arquitectura utilizando Draw.io.
7. Relacionar la estructura arquitectónica con la organización del código fuente.

### 3. METODOLOGÍA Y ACTIVIDADES
#### 3.1 FASE 1 Concepto teórico

- Arquitectura de 3 capas.
Se hace en tres niveles principales.
- Arquitectura de 3 capas. Se hace en tres niveles principales:
  - **Capa de presentación:** Para la interacción con el usuario.
  - **Capa de lógica de negocio:** Para manejar las reglas y procesos propios del sistema.
  - **Capa de acceso a datos:** Maneja la comunicación con la fuente de datos.
- Arquitectura de N capas.
  Ayuda en la separaciond de separacion de responsabilidades.
  Pero esto depende de la complejidad del proyecto.


- Dependencias entre capas.
  Esto ayudara en el manejo de responsabilidades de varias componentes y un manejo adecuado de las responsabilidades separadas.


#### 3.2 FASE 2 Diseño práctico

- Diseño una arquitectura inicial de 3 capas.
 Es el caso propuesto de Sistema de Gestión Academica donde el sistema debe permitir registrar estudiantes, registrar cursos, docentes, matricular estudiantes, consultar cursos, etc. Aparte de identificar los modulos, se debe identificar las respomsabilidades de cada componente y determinar que información requiere almacenarse en la BD.


### 4. DISEÑO DE LA ARQUITECTURA DE 3 CAPAS

El diseño refleja la división en Capa de Presentación, Capa de Lógica de Negocio y Capa de Acceso a Datos.
- Capa de Presentación: Encargada de las interfaces (estudiantes y cursos)
- Capa de Lógica de Negocio: Contiene los servicios que aplican las reglas a los módulos del sistema.
- Capa de Acceso a Datos: Encargada de los repositorios que se comunican con la fuente de datos.

### 5. DISEÑO DE LA ARQUITECTURA N CAPAS

- Capa de Presentación: Muestra las interfaces, formularios y recibe las solicitudes del usuario.
- Capa de Controladores: Intercepta las peticiones de la vista y decide a qué servicio enviarlas.
- Capa de Servicios / Lógica de Negocio: Contiene las reglas del negocio y el procesamiento de la información.
- Capa de Repositorios: Abstrae las consultas y actúa como intermediario para insertar, modificar o eliminar registros.
- Capa de Acceso a Datos: Maneja la conexión directa hacia la base de datos.
- Base de Datos: Realiza la persistencia física de la información.

### 6. IDENTIFICACION DE DEPENDENCIAS

En el diagrama se puede observar:

<img width="1010" height="667" alt="Captura de pantalla 2026-09-29 225450" src="https://github.com/user-attachments/assets/4b391ede-10c3-4c6b-b28d-e274d87e6d9b" />

- Dependencias entre capas: Se observa un flujo unidireccional indicado por flechas: la Capa de Presentación depende de la Capa de Lógica de Negocio, esta a su vez depende de la Capa de Acceso a Datos, y finalmente esta última se conecta a la Base de datos.
- Componentes que solicitan servicios: La "Interfaz de Estudiantes" y la "Interfaz de Cursos", ubicadas en la Capa de Presentación.
- Componentes que procesan información: El "Servicio de Estudiantes" y "Servicio de Cursos", ubicados en la Capa de Lógica de Negocio.
- Componentes que acceden a los datos: El "Repositorio de Estudiantes" y el "Repositorio de Curso", ubicados en la Capa de Acceso a Datos.

### 7. COMPARACION DE LAS ARQUITECTURAS

| Criterio | Arquitectura de 3 capas | Arquitectura de N capas |
|---|---|---|
| **Número de capas** | Organiza el sistema en presentación, lógica de negocio y acceso a datos. | Permite dividir las responsabilidades en un número mayor de capas especializadas. |
| **Separación de responsabilidades** | Estructura sencilla y apropiada para sistemas de menor complejidad. | Permite una separación más detallada de responsabilidades. |
| **Complejidad** | Presenta una estructura más simple y directa. | Mayor complejidad al añadir más intermediarios funcionales. |
| **Mantenimiento** | Fácil mantenimiento en sistemas con módulos definidos. | Facilita el mantenimiento de sistemas muy grandes y complejos a largo plazo. |
| **Organización de componentes** | Agrupa interfaces, servicios y repositorios en sus respectivos tres bloques principales. | Desglosa aún más los servicios, controladores y repositorios en distintos niveles. |
| **Aplicabilidad al caso** | Ideal para la construcción del esqueleto arquitectónico inicial de la solución propuesta. | Recomendada si a futuro el sistema académico crece integrando múltiples plataformas. |

### 8. DOCUMENTACION DEL DISEÑO

La documentacion se encuentra en un archivo PDF.

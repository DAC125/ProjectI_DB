**Instituto Tecnológico de Costa Rica (ITCR)
Bases de datos II
II Semestre 2020
Profesora: María Auxiliadora Mora
Proyecto #
Aplicación Web con persistencia en Oracle y un base de datos no relacional**

**Resumen:**

El proyecto consiste en desarrollar una aplicación web que utilice bases de datos como
mecanismo de persistencia. La aplicación a desarrollar será definida por el grupo de
estudiantes y presentada por medio de un ante-proyecto que será evaluado,
realimentado y aprobado antes de su implementación.

El proyecto permitirá a los estudiantes poner en práctica metodologías de análisis y
diseño de aplicaciones en un ejemplo asociado a un tema de su interés e implementar
este ejemplo utilizando tecnología que forma parte de las tendencias actuales en bases
de datos. La aplicación deberá persistir los datos en dos instancias de base de datos,
una Oracle y otra en una base de datos no relacional de su elección (ej. MongoDB).

El objetivo del proyecto es diseñar e implementar una aplicación web que solvente
requerimientos de un sistema de información de la vida real utilizando Java, Apache
Tomcat, Oracle y MongoDB. Este objetivo está estrechamente relacionado con el
objetivo específico del curso de utilizar y evaluar las tendencias actuales en el campo
de la tecnología de base de datos.

**Instrucciones** :

1. Forma de trabajo : El proyecto se puede realizar de forma individual o en grupos
de máximo dos personas.

2.  Anteproyecto (15 puntos) : El sistema a desarrollar será propuesto por el grupo
estudiante y aprobado por el asistente antes de su implementación. El
anteproyecto se debe entregar a más tardar el 11 de setiembre. Contenido del
documento:

* Descripción del sistema.

* Casos de uso a implementar (especificación completa de cada caso de
uso que incluya: nombre del caso de uso, actores, precondiciones, postcondiciones, pasos de ejecución flujo básico y flujos alternos,
resultado, entre otras secciones).

* Modelo de objetos en UML.

* Diagrama entidad-relación (al menos en cuarta forma normal).

* Diccionario de datos.

* Definición de las entidades que van a estar almacenadas en Oracle y las
que serán almacenadas en la base de datos no relacional.

* El proyecto debe incluir el uso de una función almacenada en la base de
datos. Proponga qué realizará esta función o procedimiento almacenado
en la base de datos Oracle.

3.  **Tecnología** que se debe utilizar: Java, Apache Tomcat, Oracle y una base de
datos no relacional (ej. MongoDB).

4. **Interfaz: (30 puntos)** El sistema debe contar con una **interfaz web** y estar
organizado utilizando el patrón de arquitectura **modelo-vista-controlador**
(MVC). La aplicación debe realizar operaciones CRUD (incluir, consultar,
modificar y borrar) en la base de datos Oracle y en la base de datos no
relacional.

5.  En la **base de datos Oracle:**


o (5 puntos) El esquema de la base de datos debe tener un nombre
representativo (ej. inventario, contabilidad, rechumanos) es decir no se
pueden almacenar los objetos (ie. tablas, funciones, índices) de la base
de datos en un esquema que tenga el nombre de un usuario. El esquema
con nombre representativo debe contener todas las tablas con las
restricciones que apliquen, ejemplo llaves primarias, foráneas,
restricciones de nulidad, secuencias automáticas para las llaves
numéricas y otras restricciones. Los nombres de todos los objetos deben
ser representativos.

o (20 puntos) El esquema debe incluir un trigger, un procedimiento y
una función.

* El trigger debe respaldar todos los cambios realizados en el
contenido de las tablas de la base de datos. Es decir si se inserta, actualiza o borra un registro en una relación eso debe quedar
reflejado. Se debe guardar la operación (insert, update o delete)
que se realiza, la fecha y hora, el usuario, el nombre de la relación
(o tabla), el ID del registro, los datos anteriores del registro
(concatenados en una hilera) y los datos nuevos (concatenados en
una hilera).

* Un procedimiento almacenado que tome un conjunto de registros
no normalizados y los inserte en las tablas de su modelo. Se debe
utilizar al menos un cursor dentro del procedimiento almacenado.

* Una función propuesta por los estudiantes, esta debe tener un nivel
de complejidad alto para estudiantes de bases de datos II.

o (5 puntos) Se deben definir los índices requeridos para que el acceso a
los datos sea eficiente.
```
6.  **(20 puntos)** Integrar funcionalidad para realizar funciones CRUD desde la
aplicación a la base de datos no relacional.

7. **Documentación final: (5 puntos)** Se debe entregar **documentación** del
sistema en formato electrónico que incluya las secciones del anteproyecto
actualizadas, más una descripción de la arquitectura del sistema.

8. Cada grupo de estudiantes deberá estar preparado para demostrar y explicar el
trabajo realizado.

9.  Fecha de entrega: semana del 12 de octubre con cita y además se debe subir el
proyecto completo y documentación en el TecDigital a más tardar el 12 de
octubre.

10.  El grupo de estudiantes que no presente el proyecto en esa fecha podrá
realizarlo hasta una semana después con nota máxima de 70%.
100
```


🔍 Descripción del Proyecto
---------------------------

Este proyecto utiliza **JESS (Java Expert System Shell)** para construir un sistema experto basado en lógica difusa. El sistema fue desarrollado como parte de un curso de Sistemas Basados en Conocimiento en Cenfotec y tiene como objetivo demostrar cómo integrar lógica difusa y reglas en un entorno basado en JESS.

JESS permite crear reglas declarativas en formato CLIPS, que este proyecto aprovecha para tomar decisiones a partir de valores borrosos y condiciones que imitan el razonamiento humano.

* * * * *

✨ Características
-----------------

-   ✅ Implementación de un sistema experto con lógica difusa usando JESS.

-   📄 Conjunto de reglas definidas en archivos `.clp` que modelan conocimiento experto.

-   🔁 Capacidad para inferir resultados a partir de hechos y reglas cargadas dinámicamente.

-   🧠 Incluye motor de inferencia para procesamiento encadenado hacia adelante (forward chaining).

-   🎛️ Utiliza valores lingüísticos y funciones de pertenencia para representar incertidumbre.

* * * * *

🎯 Alcance
----------

Este sistema está diseñado como una **prueba de concepto educativa**. El enfoque es demostrar cómo se puede construir un sistema basado en reglas con JESS para simular razonamiento humano con incertidumbre, mediante lógica difusa.

El dominio específico puede adaptarse según el conjunto de reglas cargadas; por ejemplo, puede utilizarse para clasificación, evaluación o toma de decisiones simples en diferentes contextos.

# Fuzzy Logic Jess App

Este proyecto simula un sistema que controla la velocidad de un ventilador basado en temperatura y humedad utilizando el motor de reglas JESS.

## Requisitos

- Java 8 o superior
- Maven 3.6.0 o superior

## Instrucciones para ejecutar el proyecto

1. Clona el repositorio:

    ```sh
    git clone <URL_DEL_REPOSITORIO>
    cd <NOMBRE_DEL_REPOSITORIO>
    ```

2. Compila el proyecto usando Maven:

    ```sh
    mvn clean install
    ```

3. Ejecuta la aplicación:

    ```sh
    mvn exec:java -Dexec.mainClass="org.JESSFuzzySBCCenfotec.FuzzyLogicJessApp"
    ```

## Estructura del proyecto

- `src/main/java/org/JESSFuzzySBCCenfotec/FuzzyLogicJessApp.java`: Clase principal que ejecuta la lógica difusa.
- `src/main/java/org/JESSFuzzySBCCenfotec/rules/fuzzy-temperature.clp`: Archivo de reglas JESS que define la lógica difusa basada en temperatura y humedad.
- `pumps-fromjava.clp`: Ejemplo de control de bombas y tanques.
- `MANIFEST.MF`: Archivo de manifiesto del proyecto.

## Ejemplos de ejecución

La aplicación ejecuta tres experimentos con diferentes combinaciones de temperatura y humedad:

1. **Experimento 1**: Temperatura alta (35), Humedad media (60)
2. **Experimento 2**: Temperatura media (25), Humedad media (55)
3. **Experimento 3**: Temperatura baja (15), Humedad baja (40)

Cada experimento imprime la velocidad del ventilador basada en las reglas definidas en `fuzzy-temperature.clp`.
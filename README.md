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
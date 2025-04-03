package org.JESSFuzzySBCCenfotec;

import jess.*;
import java.util.Iterator;

/**
 * FuzzyLogicJessApp - Similar to fuzzy-logic repo pero usando el motor de reglas JESS.
 * Simula un sistema que controla la velocidad de un ventilador basado en temperatura y humedad.
 */
public class FuzzyLogicJessApp {
    public static void main(String[] args) {
        try {
            // Iniciar el motor Jess
            Rete engine = new Rete();

            // Cargar las reglas difusas desde el archivo .clp
            engine.executeCommand("(batch src/main/java/org/JESSFuzzySBCCenfotec/rules/fuzzy-temperature.clp)");
            engine.executeCommand("(reset)");

            // =======================
            // 🔬 Experimento 1: Alta temperatura, humedad media
            // =======================
            System.out.println("\n🧪 Experimento 1: temperatura = 35, humedad = 60");

            Fact tempFact1 = new Fact("temperature", engine);
            tempFact1.setSlotValue("value", new Value(35, RU.INTEGER));
            engine.assertFact(tempFact1);

            Fact humidityFact1 = new Fact("humidity", engine);
            humidityFact1.setSlotValue("value", new Value(60, RU.INTEGER));
            engine.assertFact(humidityFact1);

            engine.run();
            imprimirResultado(engine);

            engine.reset();

            // =======================
            // 🔬 Experimento 2: Temperatura media, humedad media
            // =======================
            System.out.println("\n🧪 Experimento 2: temperatura = 25, humedad = 55");

            Fact tempFact2 = new Fact("temperature", engine);
            tempFact2.setSlotValue("value", new Value(25, RU.INTEGER));
            engine.assertFact(tempFact2);

            Fact humidityFact2 = new Fact("humidity", engine);
            humidityFact2.setSlotValue("value", new Value(55, RU.INTEGER));
            engine.assertFact(humidityFact2);

            engine.run();
            imprimirResultado(engine);

            engine.reset();

            // =======================
            // 🔬 Experimento 3: Temperatura baja, humedad baja
            // =======================
            System.out.println("\n🧪 Experimento 3: temperatura = 15, humedad = 40");

            Fact tempFact3 = new Fact("temperature", engine);
            tempFact3.setSlotValue("value", new Value(15, RU.INTEGER));
            engine.assertFact(tempFact3);

            Fact humidityFact3 = new Fact("humidity", engine);
            humidityFact3.setSlotValue("value", new Value(40, RU.INTEGER));
            engine.assertFact(humidityFact3);

            engine.run();
            imprimirResultado(engine);

        } catch (JessException e) {
            e.printStackTrace();
        }
    }

    private static void imprimirResultado(Rete engine) throws JessException {
        Iterator<?> facts = engine.listFacts();
        while (facts.hasNext()) {
            Fact fact = (Fact) facts.next();
            if (fact.getName().contains("fan-output")) {
                System.out.println("➡️ Velocidad del ventilador: " + fact.getSlotValue("speed"));
                return;
            }
        }
        System.out.println("⚠️ No se encontró el hecho fan-output.");
    }
}
package generador.core.domain.relationship;


import generador.core.domain.classifier.UmlClassifier;

import java.util.Optional;

public final class UmlGeneralization implements UmlRelationship {

    private final UmlClassifier specific;
    private final UmlClassifier general;
    private final boolean isInterfaceImplementation;

    // Constructor completo («Create»)
    public UmlGeneralization(
            UmlClassifier specific,
            UmlClassifier general,
            Optional<String> stereotype,
            Optional<String> note,
            boolean isInterfaceImplementation) {

        this.specific = specific;
        this.general = general;
        this.isInterfaceImplementation = isInterfaceImplementation;
    }

    // Constructor sobrecargado («Create») con isInterfaceImplementation por defecto en false
    public UmlGeneralization(
            UmlClassifier specific,
            UmlClassifier general,
            Optional<String> stereotype,
            Optional<String> note) {

        this(specific, general, stereotype, note, false);
    }

    // Métodos consultores (Getters)
    public UmlClassifier specific() {
        return specific;
    }

    public UmlClassifier general() {
        return general;
    }

    public boolean isInterfaceImplementation() {
        return isInterfaceImplementation;
    }

    // Métodos de origen y destino de la relación
    public UmlClassifier source() {
        return specific;
    }

    public UmlClassifier target() {
        return general;
    }

    // Método de peso semántico («use» RelationshipStrength)
    public RelationshipStrength semanticWeight() {
        return RelationshipStrength.STRONG;
    }
}
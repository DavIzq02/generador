package generador.core.domain.relationship;

import generador.core.domain.classifier.UmlClassifier;
import generador.core.domain.spec.AggregationKind;
import java.util.Optional;

public final class UmlAssociation implements UmlRelationship {

    private final UmlClassifier source;
    private final String sourceMultiplicity;
    private final UmlClassifier target;
    private final String targetMultiplicity;
    private final AggregationKind aggregationKind;

    // Constructor public («Create»)
    public UmlAssociation(
            UmlClassifier source,
            String sourceMultiplicity,
            UmlClassifier target,
            String targetMultiplicity,
            AggregationKind aggregationKind,
            Optional<String> stereotype,
            Optional<String> note) {

        this.source = source;
        this.sourceMultiplicity = sourceMultiplicity;
        this.target = target;
        this.targetMultiplicity = targetMultiplicity;
        this.aggregationKind = aggregationKind;
    }

    // Métodos consultores (Getters)
    public UmlClassifier source() {
        return source;
    }

    public String sourceMultiplicity() {
        return sourceMultiplicity;
    }

    public UmlClassifier target() {
        return target;
    }

    public String targetMultiplicity() {
        return targetMultiplicity;
    }

    public AggregationKind aggregationKind() {
        return aggregationKind;
    }

    // Método que utiliza la enumeración RelationshipStrength («use»)
    public RelationshipStrength semanticWeight() {
        if (aggregationKind == AggregationKind.COMPOSITE) {
            return RelationshipStrength.STRONG;
        } else if (aggregationKind == AggregationKind.SHARED) { // Agregación simple
            return RelationshipStrength.MEDIUM;
        }
        return RelationshipStrength.WEAK;
    }
}
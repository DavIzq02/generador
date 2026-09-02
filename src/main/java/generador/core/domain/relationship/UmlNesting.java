package generador.core.domain.relationship;


import generador.core.domain.classifier.UmlClassifier;

import java.util.Optional;

public final class UmlNesting implements UmlRelationship {

    private final UmlClassifier outerClassifier;
    private final UmlClassifier innerClassifier;
    private final boolean isStatic;

    public UmlNesting(
            UmlClassifier outerClassifier,
            UmlClassifier innerClassifier,
            boolean isStatic,
            Optional<String> stereotype,
            Optional<String> note) {


        this.outerClassifier = outerClassifier;
        this.innerClassifier = innerClassifier;
        this.isStatic = isStatic;
    }

    public RelationshipStrength semanticWeight() {
        return RelationshipStrength.STRONG;
    }

    public UmlClassifier source() {
        return outerClassifier;
    }

    public UmlClassifier target() {
        return innerClassifier;
    }

    public UmlClassifier outerClassifier() {
        return outerClassifier;
    }

    public UmlClassifier innerClassifier() {
        return innerClassifier;
    }

    public boolean isStatic() {
        return isStatic;
    }
}
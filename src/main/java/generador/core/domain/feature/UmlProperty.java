package generador.core.domain.feature;

import generador.core.domain.spec.AggregationKind;
import generador.core.domain.spec.UmlModifier;
import generador.core.domain.spec.UmlVisibility;
import generador.core.domain.type.UmlType;

import java.util.Set;
import java.util.Optional;

public record UmlProperty(
        String name,
        UmlVisibility visibility,
        UmlType type,
        Set<UmlModifier> modifiers,
        Optional<String> initialValue,
        Optional<AggregationKind> aggregationKind
) {

    // Métodos de verificación de modificadores del diagrama
    public boolean isStatic() {
        return modifiers != null && modifiers.contains(UmlModifier.STATIC);
    }

    public boolean isReadOnly() {
        return modifiers != null && modifiers.contains(UmlModifier.READ_ONLY);
    }

    public boolean isFinal() {
        return modifiers != null && modifiers.contains(UmlModifier.FINAL);
    }
}
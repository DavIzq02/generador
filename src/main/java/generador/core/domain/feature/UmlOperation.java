package generador.core.domain.feature;

import generador.core.domain.spec.UmlModifier;
import generador.core.domain.spec.UmlVisibility;
import generador.core.domain.type.UmlType;

import java.util.List;
import java.util.Set;
import java.util.Optional;

public record UmlOperation(
        String name,
        UmlVisibility visibility,
        UmlType returnType,
        List<UmlParameter> parameters,
        Set<UmlModifier> modifiers,
        Optional<String> stereotype
) {

    // Métodos de verificación basados en los modificadores
    public boolean isLeaf() {
        return modifiers != null && modifiers.contains(UmlModifier.LEAF);
    }

    public boolean isStatic() {
        return modifiers != null && modifiers.contains(UmlModifier.STATIC);
    }

    public boolean isAbstract() {
        return modifiers != null && modifiers.contains(UmlModifier.ABSTRACT);
    }

    public boolean isDefault() {
        return modifiers != null && modifiers.contains(UmlModifier.DEFAULT);
    }
}
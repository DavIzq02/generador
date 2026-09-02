package generador.core.domain.classifier;

import generador.core.domain.element.UmlNamespace;
import generador.core.domain.feature.UmlOperation;
import generador.core.domain.feature.UmlProperty;
import generador.core.domain.spec.UmlClassification;
import generador.core.domain.spec.UmlModifier;
import generador.core.domain.spec.UmlVisibility;

import java.util.List;
import java.util.Set;
import java.util.Optional;

public abstract class UmlClassifier {

    // Atributos privados e inmutables (readOnly)
    private final UmlVisibility visibility;
    private final UmlClassification classification;
    private final List<String> templateParameters;
    private final Set<UmlModifier> modifiers;
    private final Optional<UmlClassifier> nestingClassifier;
    private final List<UmlProperty> properties;
    private final List<UmlOperation> operations;

    // Constructor protegidos («Create»)
    protected UmlClassifier(
            String name,
            UmlNamespace namespace,
            UmlVisibility visibility,
            UmlClassification classification,
            List<String> templateParameters,
            Set<UmlModifier> modifiers,
            Optional<UmlClassifier> nestingClassifier,
            List<UmlProperty> properties,
            List<UmlOperation> operations,
            Optional<String> stereotype,
            Optional<String> note) {

        // Nota: Si hereda de otra clase superior (como UmlNamedElement o similar),
        // aquí se llamaría a super(name, namespace, stereotype, note);

        this.visibility = visibility;
        this.classification = classification;
        this.templateParameters = templateParameters;
        this.modifiers = modifiers;
        this.nestingClassifier = nestingClassifier;
        this.properties = properties;
        this.operations = operations;
    }

    // Métodos consultores (Getters)
    public UmlVisibility visibility() {
        return visibility;
    }

    public UmlClassification classification() {
        return classification;
    }

    public List<String> templateParameters() {
        return templateParameters;
    }

    public Set<UmlModifier> modifiers() {
        return modifiers;
    }

    public Optional<UmlClassifier> nestingClassifier() {
        return nestingClassifier;
    }

    public List<UmlProperty> properties() {
        return properties;
    }

    public List<UmlOperation> operations() {
        return operations;
    }

    // Métodos de verificación
    public boolean isAbstract() {
        // Implementación lógica sugerida según los modificadores de la clase
        return modifiers != null && modifiers.contains(UmlModifier.ABSTRACT);
    }

    public boolean isLeaf() {
        return modifiers != null && modifiers.contains(UmlModifier.LEAF);
    }

    public boolean isStatic() {
        return modifiers != null && modifiers.contains(UmlModifier.STATIC);
    }
}
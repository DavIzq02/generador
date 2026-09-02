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


public final class UmlConcreteClassifier extends UmlClassifier {

    // Constructor público («Create»)
    public UmlConcreteClassifier(
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

        super(name, namespace, visibility, classification, templateParameters,
                modifiers, nestingClassifier, properties, operations, stereotype, note);
    }
}
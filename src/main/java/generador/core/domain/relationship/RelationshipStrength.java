package generador.core.domain.relationship;

public enum RelationshipStrength {

    WEAK(1, "WEAK"),
    MEDIUM(2, "MEDIUM"),
    STRONG(3, "STRONG");

    private final int weight;
    private final String code;

    // Constructor de paquete (package-private `~`)
    RelationshipStrength(int weight, String code) {
        this.weight = weight;
        this.code = code;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isStrongerThan(RelationshipStrength other) {
        if (other == null) {
            return true;
        }
        return this.weight > other.weight;
    }

    public String toCode() {
        return code;
    }
}
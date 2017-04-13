package no.priv.garshol.duke;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CompareResult {

    private double probability;

    private Map<String, Double> propertyProbabilities = new HashMap<>();

    public double getProbability() {
        return probability;
    }

    public void addPropertyProbability(String property, double probability) {
        this.propertyProbabilities.put(property, probability);
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public Map<String, Double> getPropertyProbabilities() {
        return propertyProbabilities;
    }

    public void setPropertyProbabilities(Map<String, Double> propertyProbabilities) {
        this.propertyProbabilities = propertyProbabilities;
    }

    @Override
    public int hashCode() {
        return Objects.hash(probability, propertyProbabilities);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CompareResult other = (CompareResult) obj;
        return Objects.equals(this.probability, other.probability)
                && Objects.equals(this.propertyProbabilities, other.propertyProbabilities);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompareResult{");
        sb.append("probability=").append(probability);
        sb.append(", propertyProbabilities=").append(propertyProbabilities);
        sb.append('}');
        return sb.toString();
    }
}

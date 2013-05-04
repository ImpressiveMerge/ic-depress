package org.impressivecode.depress.metric.eclipsemetrics;

import static org.junit.Assert.*;

import org.junit.Test;

public class EclipseMetricsEntryTest {

    @Test
    public void shouldReturnSetValue() {
        EclipseMetricsEntryClassLevel entry = new EclipseMetricsEntryClassLevel();

        String className = "package.name.then.ClassName$InternalClassName";
        entry.setClassName(className);
        assertEquals(className, entry.getClassName());

        Double expected = 2.5;
        entry.setNumberOfOverriddenMethods(expected);
        assertEquals(expected, entry.getNumberOfOverriddenMethods());

        expected = 3.5;
        entry.setNumberOfAttributes(expected);
        assertEquals(expected, entry.getNumberOfAttributes());

        expected = 4.5;
        entry.setNumberOfChildren(expected);
        assertEquals(expected, entry.getNumberOfChildren());

        expected = 5.5;
        entry.setNumberOfMethods(expected);
        assertEquals(expected, entry.getNumberOfMethods());

        expected = 6.5;
        entry.setDepthOfInheritanceTree(expected);
        assertEquals(expected, entry.getDepthOfInheritanceTree());

        expected = 7.5;
        entry.setLackOfCohesionOfMethods(expected);
        assertEquals(expected, entry.getLackOfCohesionOfMethods());

        expected = 8.5;
        entry.setNumberOfStaticMethods(expected);
        assertEquals(expected, entry.getNumberOfStaticMethods());

        expected = 9.5;
        entry.setSpecializationIndex(expected);
        assertEquals(expected, entry.getSpecializationIndex());

        expected = 10.5;
        entry.setWeightedMethodsPerClass(expected);
        assertEquals(expected, entry.getWeightedMethodsPerClass());

        expected = 11.5;
        entry.setNumberOfStaticAttributes(expected);
        assertEquals(expected, entry.getNumberOfStaticAttributes());
    }

}

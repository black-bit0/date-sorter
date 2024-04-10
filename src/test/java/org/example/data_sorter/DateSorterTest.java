package org.example.data_sorter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class DateSorterTest {

    @Test
    public void testSortDates() {
        DateSorter dateSorter = new DateSorter();

        // Arrange
        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3)
        );

        // Actual
        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        // Assert
        List<LocalDate> expectedDates = Arrays.asList(
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3),
                LocalDate.of(2004, 7, 1)
        );
        assertEquals(expectedDates, sortedDates);
    }

}
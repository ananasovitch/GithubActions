package ananasovitch.org.githubactions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoundaryServiceTest {

    @Test
    @DisplayName("Проверка метода findMin с положительными числами")
    public void testFindMinWithPositiveNumbers() {
        BoundaryService boundaryService = new BoundaryService();
        int[] marks = {7, 3, 9, 5, 1};
        assertEquals(1, boundaryService.findMin(marks));
    }

    @Test
    @DisplayName("Проверка метода findMin с отрицательными числами")
    public void testFindMinWithNegativeNumbers() {
        BoundaryService boundaryService = new BoundaryService();
        int[] marks = {-7, -3, -9, 0, -5, -1};
        assertEquals(-9, boundaryService.findMin(marks));
    }

    @Test
    @DisplayName("Проверка метода findMin с одним положительным числом")
    public void testFindMinWithSinglePositiveNumber() {
        BoundaryService boundaryService = new BoundaryService();
        int[] marks = {-1};  //сломал тест
        assertEquals(10, boundaryService.findMin(marks));
    }

    @Test
    @DisplayName("Проверка метода findMin с одним отрицательным числом")
    public void testFindMinWithSingleNegativeNumber() {
        BoundaryService boundaryService = new BoundaryService();
        int[] marks = {-10};
        assertEquals(-10, boundaryService.findMin(marks));
    }
}


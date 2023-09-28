package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Проверка сложения")
    @Test
    void plusTest(){
        int a = 5;
        int b = 3;
        int c = 8;
        int result = calc.plus.apply(a, b);
        assertEquals(c, result);
    }

    @DisplayName("Проверка вычетания")
    @Test
    void minusTest(){
        int a = 5;
        int b = 3;
        int c = 2;
        int result = calc.minus.apply(a, b);
        assertEquals(c, result);
    }

    @DisplayName("Ошибка при деление на ноль")
    @Test
    void devideEroorTest(){
        int a = 5;
        int b = 0;
        assertThrows(ArithmeticException.class, () -> calc.devide.apply(a, b));
    }

    @DisplayName("Проверка умножения")
    @Test
    void multiplyTest(){
        int a = 5;
        int b = 3;
        int c = 15;
        int result = calc.multiply.apply(a, b);
        assertEquals(c, result);
    }
}
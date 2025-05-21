package com.sowtware_engineering.jenkins_project.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {
    // test calculating
    @Test
    @DisplayName("1+1 test")
    void add() {
        int num1 = 1;
        int num2 = 2;

        Assertions.assertEquals(3, num1 + num2);
    }
}

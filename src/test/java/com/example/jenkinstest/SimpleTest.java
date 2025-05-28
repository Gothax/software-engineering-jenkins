package com.example.jenkinstest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SimpleTest {

    @Test
    @DisplayName("1+1 test")
    void onePlusOneTest() {
        // given
        int a = 1;
        int b = 1;

        // when
        int result = a + b;
        // then
        assertThat(result).isEqualTo(2);

    }


}

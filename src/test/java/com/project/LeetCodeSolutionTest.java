package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void clearDigitsTest() {

        assertEquals("abc", LeetCodeSolution.clearDigits("abc"));
        assertEquals("", LeetCodeSolution.clearDigits("cb34"));

    }

}

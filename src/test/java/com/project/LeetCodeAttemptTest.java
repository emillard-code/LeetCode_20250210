package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void clearDigitsTest() {

        assertEquals("abc", LeetCodeAttempt.clearDigits("abc"));
        assertEquals("", LeetCodeAttempt.clearDigits("cb34"));

    }

}

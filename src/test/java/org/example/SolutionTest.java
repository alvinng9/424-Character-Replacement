package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void characterReplacementTest() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.characterReplacement("ABAB", 2));
        Assert.assertEquals(4, solution.characterReplacement("AABABBA", 1));
    }

}
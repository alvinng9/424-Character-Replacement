package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void characterReplacementTest() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.characterReplacement("ABAB", 2));
        Assert.assertEquals(4, solution.characterReplacement("AABABBA", 1));
        Assert.assertEquals(8, solution.characterReplacement("ABCBCBCNNCBCBN", 4));
        Assert.assertEquals(12, solution.characterReplacement("AABBAAAABBBBAAABBBBAAA", 4));
        Assert.assertEquals(7, solution.characterReplacement("FHHSJJJFHBBBBFFFUENCMAJJSAMCB", 3));
    }

}
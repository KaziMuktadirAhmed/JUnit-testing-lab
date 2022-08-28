package Calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @org.junit.jupiter.api.Test
    void findFactorial() {
        testFact1();
        testFact2();
        testFact7();
        testFact9();
        testFact10();
    }
    @Test
    void testFact1() {
        assertEquals(1, Calculate.findFactorial(1));
    }
    @Test
    void testFact2() {
        assertEquals(2, Calculate.findFactorial(2));
    }
    @Test
    void testFact7() {
        assertEquals(5040, Calculate.findFactorial(7));
    }
    @Test
    void testFact9() {
        assertEquals(362880, Calculate.findFactorial(9));
    }
    void testFact10() {
        assertEquals(3628800, Calculate.findFactorial(10));
    }

    @org.junit.jupiter.api.Test
    void checkArmstrong() {
    }

    @org.junit.jupiter.api.Test
    void intersectionPointInBothAxisForALinearEqn() {
        testAmax();
        testAmaxM();
        testAmin();
        testAminP();
        testBmax();
        testBmaxM();
        testBmin();
        testBminP();
    }

    @Test
    void testAmax() {
        assertEquals(new int[]{0, 0}, Calculate.intersectionPointInBothAxisForALinearEqn(Integer.MAX_VALUE, 0 , 0));
    }
    @Test
    void testAmaxM() {
        assertEquals(new int[]{0, 0}, Calculate.intersectionPointInBothAxisForALinearEqn(Integer.MAX_VALUE-2, 0 , 0));
    }
    @Test
    void testAmin() {
        assertEquals(new int[]{0, 0}, Calculate.intersectionPointInBothAxisForALinearEqn(Integer.MIN_VALUE, 0 , 0));
    }
    @Test
    void testAminP() {
        assertEquals(new int[]{0, 0}, Calculate.intersectionPointInBothAxisForALinearEqn(Integer.MIN_VALUE+2, 0 , 0));
    }
    @Test
    void testBmax() {
        assertEquals(new int[]{0, 0}, Calculate.intersectionPointInBothAxisForALinearEqn(0, Integer.MAX_VALUE, 0));
    }
    @Test
    void testBmaxM() {
        assertEquals(new int[]{0, 0}, Calculate.intersectionPointInBothAxisForALinearEqn(0, Integer.MAX_VALUE-2, 0));
    }
    @Test
    void testBmin() {
        assertEquals(new int[]{0, 0}, Calculate.intersectionPointInBothAxisForALinearEqn(0, Integer.MIN_VALUE, 0));
    }
    @Test
    void testBminP() {
        assertEquals(new int[]{0, 0}, Calculate.intersectionPointInBothAxisForALinearEqn(0, Integer.MIN_VALUE+2, 0));
    }
}
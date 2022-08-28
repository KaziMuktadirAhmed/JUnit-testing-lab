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
        assertEquals(0, Calculate.intersectionPointInBothAxisForALinearEqn(Integer.MAX_VALUE, 0 , 0));
    }
    @Test
    void testAmaxM() {
        assertEquals(0, Calculate.intersectionPointInBothAxisForALinearEqn(Integer.MAX_VALUE-2, 0 , 0));
    }
    @Test
    void testAmin() {
        assertEquals(0, Calculate.intersectionPointInBothAxisForALinearEqn(Integer.MIN_VALUE, 0 , 0));
    }
    @Test
    void testAminP() {
        assertEquals(0, Calculate.intersectionPointInBothAxisForALinearEqn(Integer.MIN_VALUE+2, 0 , 0));
    }
    @Test
    void testBmax() {
        assertEquals(0, Calculate.intersectionPointInBothAxisForALinearEqn(0, Integer.MAX_VALUE, 0));
    }
    void testBmaxM() {
        assertEquals(0, Calculate.intersectionPointInBothAxisForALinearEqn(0, Integer.MAX_VALUE-2, 0));
    }
    void testBmin() {
        assertEquals(0, Calculate.intersectionPointInBothAxisForALinearEqn(0, Integer.MIN_VALUE, 0));
    }
    void testBminP() {
        assertEquals(0, Calculate.intersectionPointInBothAxisForALinearEqn(0, Integer.MIN_VALUE+2, 0));
    }
}
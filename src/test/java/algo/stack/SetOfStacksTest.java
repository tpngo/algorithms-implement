package algo.stack;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SetOfStacksTest {
    private SetOfStacks<Integer> setOfStacks = new SetOfStacks<>(2);
    @Test
    @Order(1)
    void testPush(){
        setOfStacks.push(1);
        Assertions.assertEquals(1, setOfStacks.peek());
        setOfStacks.push(2);
        Assertions.assertEquals(2, setOfStacks.peek());
        setOfStacks.push(3);
        Assertions.assertEquals(3, setOfStacks.peek());
    }

    @Test
    @Order(2)
    void testPop(){
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        Assertions.assertEquals(3, setOfStacks.pop());
        Assertions.assertEquals(2, setOfStacks.pop());
        Assertions.assertEquals(1, setOfStacks.pop());
    }
}

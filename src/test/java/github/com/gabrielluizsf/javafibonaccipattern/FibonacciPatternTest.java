package github.com.gabrielluizsf.javafibonaccipattern;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FibonacciPatternTest {
    
    @Test
    public void testGenerateFibonacciSequence() {
        int n = 10;
        int[] expectedSequence = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        
        int[] actualSequence = FibonacciPattern.generateFibonacciSequence(n);
        
        Assert.assertArrayEquals(expectedSequence, actualSequence);
    }
    
    @Test
    public void testDrawFibonacciPattern() {
        int n = 5;
        String expectedOutput = "\n*\n*\n**\n***\n";
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        FibonacciPattern.drawFibonacciPattern(n);
        String actualOutput = outputStream.toString();
        
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testMain() {
        // Testar a execução do método main não é estritamente necessário,
        // mas pode ser usado para verificar se não há exceções sendo lançadas.
        FibonacciPattern.main(new String[]{});
    }
}

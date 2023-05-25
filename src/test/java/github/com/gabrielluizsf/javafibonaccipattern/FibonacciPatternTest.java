package github.com.gabrielluizsf.javafibonaccipattern;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciPatternTest {
    StringBuilder output = new StringBuilder();
    @Test
    public void testDrawFibonacciPattern() {
        int n = 5;
        String expectedOutput = "*\n*\n**\n***\n*****\n";

        // Redireciona a saída padrão para um StringBuilder
        System.setOut(new java.io.PrintStream(new java.io.ByteArrayOutputStream() {
            @Override
            public void write(int b) {
                output.append((char) b);
            }
        }));

        FibonacciPattern.drawFibonacciPattern(n);
        String actualOutput = output.toString();

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}

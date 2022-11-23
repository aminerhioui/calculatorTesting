import jdk.jfr.StackTrace;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculatorUnderTest;
    @BeforeEach
    public void initCalculator(){
        calculatorUnderTest=new Calculator();
    }

    @ParameterizedTest
    @CsvSource({ "2,5,7", "-2,-5,-7", "-2,5,3", "2,-5,-3", "0,0,0" })
    void testAddTwoNumbers(int arg1,int arg2,int expectNumber){
        //given


        //when
        int result=calculatorUnderTest.Add(arg1,arg2);
        //then
        assertThat(result).isEqualTo(expectNumber);
    }

    @Test
    void testMultiplyTwoPositiveNumbers(){
        //given
        int a=5;
        int b=6;

        //when
        int result=calculatorUnderTest.multiply(a,b);
        //then
        assertThat(result).isEqualTo(30);

    }
}

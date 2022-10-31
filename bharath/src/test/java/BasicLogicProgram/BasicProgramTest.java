package BasicLogicProgram;

import junit.framework.TestCase;

public class BasicProgramTest extends TestCase {
    BasicProgram obj = new BasicProgram();

    public void testfloatNumber(){
      assertEquals( 9.0,obj.floatNumber(3,3));

    }
    public void testswapNumber(){

    assertEquals(3,2 ,obj.swapNumber(2,3));
    assertEquals(4,2 ,obj.swapNumber(2,4));

    }

        public  void testaddOrEven(){
        obj.addOrEven(7);
        assertEquals( 0,obj.addOrEven(8));

        }

        public void testamongBiggestThreeNumbers(){
       assertEquals(22222,obj.amongBiggestThreeNumbers(999,1111,22222));
        }
        public void testlcmOfTwoNumbers(){
      assertEquals(75, obj.lcmOfTwoNumbers(25,15));
        }

        public void  testgcdorHcfofTwoNumbers(){
     assertEquals(21,obj.gcdorHcfofTwoNumbers(0,21));
        }

        public void testprimeNumbers(){
        obj.primeNumbers(5);
        assertEquals(2,3,obj.primeNumbers(5));
        }
        public void testleapYear(){
       assertEquals(true,obj.leapYear(2000));
        }
        public void testarmStrongNumber(){
        assertEquals(true,obj.armStrongNumber(371));
        }

        public void testneonNumber(){
        assertEquals(true,obj.neonNumber(9));
        }
        public void testvowel(){
        assertEquals(true,obj.vowel('E'));
    }

    public void testfactorialNumber(){
        assertEquals(720,obj.factorialNumber(6));
    }
}
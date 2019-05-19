package unitests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.TestCase;

public class MathematicsTest extends TestCase{
    public String someDatabaseConnection;
    private int array_of_words;

    @Override  
    public void tearDown(){  

        this.someDatabaseConnection = null;
    }

    @Override  
    public void setUp(){
        this.someDatabaseConnection = "Connecting to a database is a time expensive process so doing it for every single test function is not reccomended, instead do it once and reuse it through the tests.";
    }


    @BeforeClass  
    public static void logStartOfTestSession(){
        System.out.println("Testing session has started");
    }


    @AfterClass 
    public static void logEndOfTestSession(){
        System.out.println("Testing has ended.");
    }


    @Before 
    public void thisWillPringBeforeEveryTestFunction(){
        System.out.println("Before test");
    }


    @After 
    public void thisWillPrintAfterEveryTestFunction(){
        System.out.println("After test");
    }

    @Test
    public void testIfOnePlusOneIsTwo(){
        Mathematics math = new Mathematics();
        assertTrue(math.sum(1,1) == 2);  
    }


    @Test
    public void testIfTwoMinusOneIsOne(){
        Mathematics math = new Mathematics();
        System.out.println(this.someDatabaseConnection);
        assertEquals(math.minus(2, 1), 1);  
    }


    @Test(expected = ArithmeticException.class)  
    public void testIfDivisionThrowsExceptionOnZeroDivision(){
        Mathematics math = new Mathematics();
        double result = math.division(5, 0);
    }

    @Test
    public void testIfDivisionByZeroErrorIsCaughtByItsMessage(){
        try {
            Mathematics math = new Mathematics();
            double result = math.division(5, 0);
        } catch (ArithmeticException e) {
            assertEquals(e.getMessage(), "/ by zero");
        }
    }
    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testPathAddressIfExists(){
        File file = new File(file.path);
        assertTrue(file.exists());
      }
      @Test
    public void testPathAddressIfNotEmpty(){
        File file = new File(file.path);
        assertTrue(!((String) file).isEmpty());
    }
    @Test
	public void WordsInLowerEqualsWordsInArrayLower() {
		assertEquals(String this.array_of_words[i] == words_in_array);
    }
    @Test
	public void StringNotNull() {
		assertFalse(this.array_of_words.StringNotNull(null));
    }
    @Test
    public void containsString(String string) {
        assertThat(file.path, containsString(","));
    }
    @Test
    public void countingI(){
        assertTrue("Error, i'sid ei ole 2 korda", this.array_of_words <= 1);
        assertTrue("I'sid on üle 2 korra",  this.array_of_words  >= 1);
    }
    public void ifIdoesEqual(){
        Assert.assertEquals("Lauses on nii palju i'.", count_i(file.path), 2);
    }

    private Object count_i(String string) {
        return null;
    }
}
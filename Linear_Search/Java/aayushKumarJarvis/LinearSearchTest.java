
import static org.junit.Assert.*;
import org.junit.Test;

public class LinearSearchTest {

    @Test
    public void TestLinearSearch() {

        int testArray[] = {1,2,3,4,5,6}; 
        int testElement1 = 4; 
        int testElement2 = 0;

        LinearSearch objectForLinearSearch = new LinearSearch();
        int testSearch1 = objectForLinearSearch.linearSearch(testArray,testElement1);
        int testSearch2 = objectForLinearSearch.linearSearch(testArray,testElement2);

        assertEquals(testSearch1,3);
        assertEquals(testSearch2,0);
    }
}



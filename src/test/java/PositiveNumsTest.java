import com.company.PositiveNumsApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PositiveNumsTest {

    private PositiveNumsApp positiveNums;

    @BeforeEach
    void setUp() {
        positiveNums = new PositiveNumsApp();
    }

    @Test
    void findPositiveNumbers(){
        Integer[] nums = new Integer[]{3,-5, 4,89, -82, -2, 0, 9};

        List<Integer> numbers = positiveNums.findPositiveNumbers(nums);

        assertEquals(List.of(89,9,4,3,0), numbers);
    }

    @Test
    void findPositiveNumbersThrowException() throws NullPointerException{
        Throwable thrown = assertThrows(NullPointerException.class, () ->{
            Integer[] nums = null;
            List<Integer> numbers = positiveNums.findPositiveNumbers(nums);
                });
    }
}

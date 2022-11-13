import com.company.HashTagsApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class HashTagsTest {

    private HashTagsApp hashTags;

    @BeforeEach
    void setUp() {
        hashTags = new HashTagsApp();
    }

    @Test
    void findHashTags() {
        List<String> stringList = List.of(
                "agsh sdvh #a sdvj #b hbj #a dkdk #c",
                "dbkb flk j #b kdjvk #b #b #c dkbvk",
                "hb dgnk #c"
        );

        Map<String, Integer> tags = this.hashTags.findHashTags(stringList);
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("#c", 3);
        expected.put("#b", 2);
        expected.put("#a", 1);

        assertEquals(expected, tags);
    }
}

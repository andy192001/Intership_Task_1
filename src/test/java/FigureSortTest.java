import com.company.models.Cube;
import com.company.models.Cylinder;
import com.company.models.Figure;
import com.company.FigureSortApp;
import com.company.models.Sphere;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FigureSortTest {

    private FigureSortApp figureSort;

    @BeforeEach
    void setUp() {
        figureSort = new FigureSortApp();
    }

    @Test
    void testSortFigures() {
        List<Figure> figures = List.of(
                new Cube(4),
                new Cylinder(5, 2),
                new Sphere(3)
        );

        List<Figure> sortedFigures = figureSort.sortFigures(figures);

        List<Figure> expected = List.of(
                new Cylinder(5, 2),
                new Cube(4),
                new Sphere(3));

        assertEquals(expected.toString(), sortedFigures.toString());

    }
}

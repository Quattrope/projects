import org.junit.Test;

import java.util.Map;

public class AGRastererTest extends AGMapTest {
    /**
     * Test the rastering functionality of the student code, by calling their getMapRaster method
     * and ensuring that the resulting map is correct. All of the test data is stored in a
     * TestParameters object that is loaded by the AGMapTest constructor. Note that this test file
     * extends AGMapTest, where most of the interesting stuff happens.
     * @throws Exception
     */

    @Test
    public void testGetMapRaster() throws Exception {
        for (TestParameters p : params) {
            System.out.println(p.rasterParams); // todo: remove
            String[][] testGrid = (String[][]) p.rasterResult.get("render_grid");
            System.out.println(testGrid.length + " by " + testGrid[0].length);
            Map<String, Object> studentRasterResult = rasterer.getMapRaster(p.rasterParams);
            System.out.println("Test results: " + p.rasterResult);

            checkParamsMap("Returned result differed for input: " + p.rasterParams + ".\n",
                    p.rasterResult, studentRasterResult);
        }
    }
}

package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;

import java.util.Arrays;

public class TemperatureSeriesAnalysisTest {

//    @Ignore
    @Test
    public void testAverageWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
    }

//    @Ignore
    @Test
    public void testAverage() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.average();
        
        assertEquals(expResult, actualResult, 0.00001);        
    }

//    @Ignore
    @Test
    public void testDeviationWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;

        // call tested method
        double actualResult = seriesAnalysis.deviation();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.deviation();
    }

//    @Ignore
    @Test
    public void testDeviation() {
        double[] temperatureSeries = {3.0, -3.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 3.0;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testMax() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;

        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testMaxWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.max();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testMaxWithEqualElementsArray() {
        // setup input data and expected result
        double[] temperatureSeries = {1.0, 1.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        // call tested method
        double actualResult = seriesAnalysis.max();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testMaxWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.max();
    }

//    @Ignore
    @Test
    public void testMin() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -5.0;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testMinWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.min();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testMinWithEqualElementsArray() {
        // setup input data and expected result
        double[] temperatureSeries = {1.0, 1.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        // call tested method
        double actualResult = seriesAnalysis.min();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testMinWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.min();
    }

//    @Ignore
    @Test
    public void testfindTempClosestToZeroWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToZero();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testfindTempClosestToZeroWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToZero();
    }

//    @Ignore
    @Test
    public void testfindTempClosestToZeroEqualElementArray() {
        double[] temperatureSeries = {3.0, 3.0, 3.0, 3.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 3.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }
//    @Ignore
    @Test
    public void testfindTempClosestToZero() {
        double[] temperatureSeries = {30.0, -5.0, 10.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempClosestToZeroPositiveNegative() {
        double[] temperatureSeries = {30.0, -5.0, 10.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempClosestToValueWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToValue(-3.0);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testfindTempClosestToValueWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToValue(0.0);
    }

//    @Ignore
    @Test
    public void testfindTempClosestToValueEqualElementArray() {
        double[] temperatureSeries = {3.0, 3.0, 3.0, 3.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 3.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(-3.0);

        assertEquals(expResult, actualResult, 0.00001);
    }
//    @Ignore
    @Test
    public void testfindTempClosestToValue() {
        double[] temperatureSeries = {30.0, -5.0, 10.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -5.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(-3.0);

        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempClosestToValuePositiveNegative() {
        double[] temperatureSeries = {30.0, -5.0, 10.0, -1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(-3.0);

        assertEquals(expResult, actualResult, 0.00001);
    }


//    @Ignore
    @Test
    public void testfindTempsLessThenWithOneBiggerElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};


        // call tested method
        double[] actualResult = seriesAnalysis.findTempsLessThen(-3.0);

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsLessThenWithOneSmallerElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {-1.0};

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsLessThen(3.0);

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsLessThenWithEmptyArray() {
        // setup input data and expected result
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsLessThen(3.0);

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsLessThenEqualBiggerElementArray() {
        double[] temperatureSeries = {3.0, 3.0, 3.0, 3.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};

        double[] actualResult = seriesAnalysis.findTempsLessThen(-3.0);

        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsLessThenEqualSmallerElementArray() {
        double[] temperatureSeries = {3.0, 3.0, 3.0, 3.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {3.0, 3.0, 3.0, 3.0};

        double[] actualResult = seriesAnalysis.findTempsLessThen(4.0);

        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsLessThen() {
        double[] temperatureSeries = {30.0, -5.0, 10.0, 1.0, 4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {-5.0, 1.0, 4.0};
        double[] actualResult = seriesAnalysis.findTempsLessThen(4.0);

        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsGreaterThenWithOneBiggerElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {-1.0};


        // call tested method
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(-3.0);

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsGreaterThenWithOneSmallerElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(3.0);

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsGreaterThenThenWithEmptyArray() {
        // setup input data and expected result
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(3.0);

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsGreaterThenEqualBiggerElementArray() {
        double[] temperatureSeries = {3.0, 3.0, 3.0, 3.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {3.0, 3.0, 3.0, 3.0};

        double[] actualResult = seriesAnalysis.findTempsGreaterThen(-3.0);

        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsGreaterThenEqualSmallerElementArray() {
        double[] temperatureSeries = {3.0, 3.0, 3.0, 3.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};

        double[] actualResult = seriesAnalysis.findTempsGreaterThen(4.0);

        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testfindTempsGreaterThen() {
        double[] temperatureSeries = {30.0, -5.0, 10.0, 1.0, 4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {30.0, 10.0, 4.0};
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(4.0);

        assertArrayEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testsummaryStatisticsWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.summaryStatistics();
    }

//    @Ignore
    @Test
    public void testsummaryStatisticsWithOneBiggerElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0, 6.0, -5.0, 27.0, 4.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        TempSummaryStatistics stats = seriesAnalysis.summaryStatistics();
        double expResultAv = 6.0;
        double expResultD = 10.132456102380443;
        double expResultMax = 27.0;
        double expResultMin = -5.0;


        // call tested method
        double actualResultAv = stats.getAvgTemp();
        double actualResultD = stats.getDevTemp();
        double actualResultMax = stats.getMaxTemp();
        double actualResultMin = stats.getMinTemp();

        // compare expected result with actual result
        assertEquals(expResultAv, actualResultAv, 0.00001);
        assertEquals(expResultD, actualResultD, 0.00001);
        assertEquals(expResultMax, actualResultMax, 0.00001);
        assertEquals(expResultMin, actualResultMin, 0.00001);
    }

//    @Ignore
    @Test
    public void testaddTempsNoFreeSpace() {
        double[] temperatureSeries = {30.0, -5.0, 10.0, 1.0, 4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] temps = {3.0, 9.0, 2.0};
        int expResult = 54;
        int actualResult = seriesAnalysis.addTemps(temps);
        assertEquals(10, seriesAnalysis.getArr().length, 0.00001);
        assertEquals(expResult, actualResult, 0.00001);
    }

//    @Ignore
    @Test
    public void testaddTempsWithFreeSpace() {
        double[] temperatureSeries = {30.0, -5.0, 0.0, 0.0, 0.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] temps = {3.0, 9.0, 2.0};
        int expResult = 39;
        int actualResult = seriesAnalysis.addTemps(temps);
        assertEquals(5, seriesAnalysis.getArr().length, 0.00001);
        assertEquals(expResult, actualResult, 0.00001);
    }

}

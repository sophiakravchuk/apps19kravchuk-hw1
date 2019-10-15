package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    private final double avgTemp;
    private final double devTemp;
    private final double minTemp;
    private final double maxTemp;

    TempSummaryStatistics(double[] temperatureSeries) {
        final TemperatureSeriesAnalysis ARR_TEMP =
                new TemperatureSeriesAnalysis(temperatureSeries);
        this.avgTemp = ARR_TEMP.average();
        this.devTemp = ARR_TEMP.deviation();
        this.minTemp = ARR_TEMP.min();
        this.maxTemp = ARR_TEMP.max();
    }
    public double getAvgTemp() {
        return avgTemp;
    }
    public double getDevTemp() {
        return devTemp;
    }
    public double getMinTemp() {
        return minTemp;
    }
    public double getMaxTemp() {
        return maxTemp;
    }
}

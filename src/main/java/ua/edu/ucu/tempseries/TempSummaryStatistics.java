package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    private final double avgTemp;
    private final double devTemp;
    private final double minTemp;
    private final double maxTemp;

    TempSummaryStatistics(double[] temperatureSeries) {
        final TemperatureSeriesAnalysis ArrTemp_ =
                new TemperatureSeriesAnalysis(temperatureSeries);
        this.avgTemp = ArrTemp_.average();
        this.devTemp = ArrTemp_.deviation();
        this.minTemp = ArrTemp_.min();
        this.maxTemp = ArrTemp_.max();
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

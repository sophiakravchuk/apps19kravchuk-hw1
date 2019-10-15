package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    private final double avgTemp;
    private final double devTemp;
    private final double minTemp;
    private final double maxTemp;

    TempSummaryStatistics(double[] temperatureSeries) {
        final TemperatureSeriesAnalysis ArrTemp =
                new TemperatureSeriesAnalysis(temperatureSeries);
        this.avgTemp = ArrTemp.average();
        this.devTemp = ArrTemp.deviation();
        this.minTemp = ArrTemp.min();
        this.maxTemp = ArrTemp.max();
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

package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    private final double avgTemp;
    private final double devTemp;
    private final double minTemp;
    private final double maxTemp;

    TempSummaryStatistics(double[] temperatureSeries) {
        final TemperatureSeriesAnalysis Arr =
                new TemperatureSeriesAnalysis(temperatureSeries);
        this.avgTemp = Arr.average();
        this.devTemp = Arr.deviation();
        this.minTemp = Arr.min();
        this.maxTemp = Arr.max();
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

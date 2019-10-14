package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    private final double avgTemp;
    private final double devTemp;
    private final double minTemp;
    private final double maxTemp;

    TempSummaryStatistics(double[] temperatureSeries) {
        final TemperatureSeriesAnalysis arr = new TemperatureSeriesAnalysis(temperatureSeries);
        this.avgTemp = arr.average();
        this.devTemp = arr.deviation();
        this.minTemp = arr.min();
        this.maxTemp = arr.max();
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

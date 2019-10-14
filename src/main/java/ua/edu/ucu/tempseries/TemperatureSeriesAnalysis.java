package ua.edu.ucu.tempseries;

import java.util.Arrays;
import java.util.InputMismatchException;


public class TemperatureSeriesAnalysis {
    private double[] arr;

    public TemperatureSeriesAnalysis() {
    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        this.arr = Arrays.copyOf(temperatureSeries, temperatureSeries.length);
        for (double el: arr){
            if  (el < -273){
                throw new InputMismatchException();
            }
        }
    }

    public double[] getArr() {
        return arr;
    }

    public double average() {
        if (arr.length == 0){
            throw new IllegalArgumentException();
        }
        int sum = 0;
        int average;
        for (double el: arr){
            sum += el;
        }
        average = sum / arr.length;
        return average;
    }


    public double deviation() {
        if (arr.length == 0){
            throw new IllegalArgumentException();
        }
        double av = this.average();
        double disp = 0;
        for (double el: arr){
            disp += Math.pow((el - av), 2);
        }

        return Math.sqrt(disp/arr.length);
    }


    public double min() {
        if (arr.length == 0){
            throw new IllegalArgumentException();
        }
        double min = Double.MAX_VALUE;
        for(double el: arr) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }


    public double max() {
        if (arr.length == 0){
            throw new IllegalArgumentException();
        }
        double max = -Double.MAX_VALUE;
        for(double el: arr) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }


    public double findTempClosestToZero() {
        if (arr.length == 0){
            throw new IllegalArgumentException();
        }
        double closest = Double.MAX_VALUE;
        for (double el: arr){
            if (Math.abs(closest) > Math.abs(el)){
                closest = el;
            }
            else if (Math.abs(closest) == Math.abs(el)){
                if (closest < el){
                    closest = el;
                }
            }
        }
        return closest;
    }


    public double findTempClosestToValue(double tempValue) {
        if (arr.length == 0){
            throw new IllegalArgumentException();
        }
        double closest = Double.MAX_VALUE;
        for (double el: arr){
            if (Math.abs(closest - tempValue) > Math.abs(el - tempValue)){
                closest = el;
            }
            else if (Math.abs(closest - tempValue) == Math.abs(el - tempValue)){
                if (closest < el){
                    closest = el;
                }
            }
        }
        return closest;
    }

    private double[] shrinkArray(double[] tempArr, int i){
        double[] shArr = new double [i];
        int j = 0;
        for (int l = 0; l < i; l++){
            shArr[j] = tempArr[l];
            j++;
        }
        return shArr;
    }

    public double[] findTempsLessThen(double tempValue) {
        double[] less_arr_t = new double [arr.length];
        int i = 0;
        for (double el: arr){
            if (el <= tempValue){
                less_arr_t[i] = el;
                i++;
            }
        }
        return shrinkArray(less_arr_t, i);
    }

    public double[] findTempsGreaterThen(double tempValue) {
        double[] great_arr_t = new double [arr.length];
        int i = 0;
        for (double el: arr){
            if (el >= tempValue){
                great_arr_t[i] = el;
                i++;
            }
        }
        return shrinkArray(great_arr_t, i);
    }

    public TempSummaryStatistics summaryStatistics() {
        if (arr.length == 0){
            throw new IllegalArgumentException();
        }
        TempSummaryStatistics statistic = new TempSummaryStatistics(arr);
        statistic.setAvgTemp(this.average());
        statistic.setDevTemp(this.deviation());
        statistic.setMaxTemp(this.max());
        statistic.setMinTemp(this.min());
        return statistic;
    }

    public int addTemps(double... temps) {
        double[] arrNew;
        int LTemps = temps.length;
        if (arr[arr.length-LTemps] != 0.0){
            arrNew = new double[2*arr.length];
        }
        else{
            arrNew = new double[arr.length];
        }
        int sumVal = 0;
        int i = 0;
        while (arr[i] != 0.0){
            arrNew[i] = arr[i];
            sumVal += arr[i];
            i++;
            if (i == arr.length){
                break;
            }
        }
        for (double el: temps){
            arrNew[i] = el;
            sumVal += el;
            i++;
        }
        this.arr = arrNew;
        return sumVal;
    }
}

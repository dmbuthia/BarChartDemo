package com.zybooks.barchartdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        barChart = (BarChart) findViewById(R.id.barChartGithub);

        ArrayList<BarEntry> info = new ArrayList<>();
        info.add(new BarEntry(20,30));
        info.add(new BarEntry(32,40));
        info.add(new BarEntry(43,50));
        info.add(new BarEntry(54,60));
        info.add(new BarEntry(60,70));

        BarDataSet barDataSet = new BarDataSet(info,"statistics");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(20f);

        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);
        barChart.animateX(2000);


    }
}
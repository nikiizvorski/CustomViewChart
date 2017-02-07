package com.nikiizvorski.customviewchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nikiizvorski.customviewchart.chartView.PieChart;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = (PieChart) findViewById(R.id.pie_chart);
        float[] data = {450, 630, 300, 200, 400};
        pieChart.setData(data);
    }
}

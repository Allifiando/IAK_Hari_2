package com.example.ando.cobaseh;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*private SensorManager sensorManager;
        public TextView tvHasil;

        Sensor proxymity;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            public totalHarga;

            private int jumlah;

            private int harga

            tvHasil = (TextView) findViewById(R.id.tvHasil);
            sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
            proxymity = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
            if (proxymity == null){
                Toast.makeText(MainActivity.this,"Sensor Gaada wkwkw",Toast.LENGTH_LONG);
            }

            SensorEventListener proxymityListener = new SensorEventListener() {
                @Override
                public void onSensorChanged(SensorEvent sensorEvent) {
                    if (sensorEvent.values[0] < proxymity.getMaximumRange()){
                        tvHasil.setText("Kamu Dekat");
                        getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                    }else {
                        tvHasil.setText("Kamu Jauh");
                        getWindow().getDecorView().setBackgroundColor(Color.RED);
                    }
                }

                @Override
                public void onAccuracyChanged(Sensor sensor, int i) {

                }
            };

            sensorManager.registerListener(proxymityListener,proxymity, 2 *1000*1000);
        }


    public TextView getTvHasil() {
        return tvHasil;
    }

    sensorManager;

    public void setTvHasil(TextView tvHasil) {
        this.tvHasil = tvHasil;
    }
    */
    }
}

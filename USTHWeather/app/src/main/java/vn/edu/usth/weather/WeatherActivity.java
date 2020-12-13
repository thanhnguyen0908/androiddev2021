package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.widget.Toast; // Use Toast class to display message

import android.os.Bundle;

public class WeatherActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        // Create a new fragment to be placed in the activity
        ForecastFragment firstFragment = new ForecastFragment();

        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("WeatherActivity", "onStart"); // Send an INFO log message
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("WeatherActivity", "onResume"); // Send an INFO log message
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("WeatherActivity", "onPause"); // Send an INFO log message
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("WeatherActivity", "onStop"); // Send an INFO log message
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity", "onDestroy"); // Send an INFO log message
    }
}
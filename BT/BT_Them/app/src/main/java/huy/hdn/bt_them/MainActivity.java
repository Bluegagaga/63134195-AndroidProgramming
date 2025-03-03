package huy.hdn.bt_them;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateBMI(View view) {
        EditText weightInput = findViewById(R.id.weightInput);
        EditText heightInput = findViewById(R.id.heightInput);
        TextView bmiResult = findViewById(R.id.bmiResult);

        double weight = Double.parseDouble(weightInput.getText().toString());
        double height = Double.parseDouble(heightInput.getText().toString());
        double bmi = weight / (height * height);

        bmiResult.setText("BMI: " + String.format("%.2f", bmi));
    }

    public void convertUnits(View view) {
        EditText valueInput = findViewById(R.id.valueInput);
        Spinner unitSpinner = findViewById(R.id.unitSpinner);
        TextView conversionResult = findViewById(R.id.conversionResult);

        double value = Double.parseDouble(valueInput.getText().toString());
        String unit = unitSpinner.getSelectedItem().toString();
        double convertedValue = unit.equals("Cm to Inches") ? value / 2.54 : value * 2.54;

        conversionResult.setText("Converted: " + String.format("%.2f", convertedValue));
    }

    public void calculateAreaPerimeter(View view) {
        EditText radiusInput = findViewById(R.id.radiusInput);
        TextView areaResult = findViewById(R.id.areaResult);
        TextView perimeterResult = findViewById(R.id.perimeterResult);

        double radius = Double.parseDouble(radiusInput.getText().toString());
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        areaResult.setText("Area: " + String.format("%.2f", area));
        perimeterResult.setText("Perimeter: " + String.format("%.2f", perimeter));
    }
}

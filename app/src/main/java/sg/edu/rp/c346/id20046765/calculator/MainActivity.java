package sg.edu.rp.c346.id20046765.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText etRadius;
    EditText etCircumference;
    Button calculatebtn;
    Button calculatebtn1;
    TextView tvCalculatedArea;
    TextView tvCalculatedDiameter;
    TextView tvCalculatedCircumference;
    TextView tvRadius1;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText
        etRadius = findViewById(R.id.etRadius);
        etCircumference = findViewById(R.id.etRCircumference);
        //Button
        calculatebtn = findViewById(R.id.calculatebtn);
        calculatebtn1 = findViewById(R.id.calculatebtn1);
        //TextView
        tvCalculatedArea = findViewById(R.id.tvCalculatedArea);
        tvCalculatedCircumference = findViewById(R.id.tvCalculatedCircumference);
        tvCalculatedDiameter = findViewById(R.id.tvCalculatedDiameter);
        tvRadius1 = findViewById(R.id.tvRadius1);
        //ToggleButton
        tbtn = findViewById(R.id.tgbt);

        etCircumference.setEnabled(false);

        calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action

                String strResponse = etRadius.getText().toString();
                double dblNumber = Double.parseDouble(strResponse);

                double Area = 0;
                double Circumference = 0;
                double Diameter = 0;

                Area += 3.142 * (dblNumber * dblNumber);
                Circumference += 2 * 3.142 * dblNumber;
                Diameter += 2 * dblNumber;

                String areaString = String.format("Area: %.3f", Area);
                String circumferenceString = String.format("Circumference: %.3f", Circumference);
                String diameterString = String.format("Diameter:  %.3f", Diameter);


                tvCalculatedArea.setText(areaString);
                tvCalculatedCircumference.setText(circumferenceString);
                tvCalculatedDiameter.setText(diameterString);
            }
        });

        calculatebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action

                String strCircumference = etCircumference.getText().toString();
                double dblNumber2 = Double.parseDouble(strCircumference);

                double Radius = 0;

                Radius += dblNumber2 / 3.142;
                String RadiusCircum = String.format("Radius: %.3f", Radius);
                tvRadius1.setText(RadiusCircum);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action

                if(tbtn.isChecked()){
                    etRadius.setEnabled(true);
                    etCircumference.setEnabled(false);
                }else{
                    etRadius.setEnabled(false);
                    etCircumference.setEnabled(true);
                }

            }
        });

    }
}
package davibern.calculadora_basica_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campo1, campo2;
    private TextView etiResultado;
    private Button btnSumar, btnRestar, btnMultiplicar, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = findViewById(R.id.campo1);
        campo2 = findViewById(R.id.campo2);
        etiResultado = findViewById(R.id.etiResultado);
        btnSumar = findViewById(R.id.btnSuma);
        btnRestar = findViewById(R.id.btnResta);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDiv = findViewById(R.id.btnDiv);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(campo1.getText().toString());
                int num2 = Integer.parseInt(campo2.getText().toString());
                etiResultado.setText("Resultado: " + (num1 + num2));
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(campo1.getText().toString());
                int num2 = Integer.parseInt(campo2.getText().toString());
                etiResultado.setText("Resultado: " + (num1 - num2));
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(campo1.getText().toString());
                int num2 = Integer.parseInt(campo2.getText().toString());
                etiResultado.setText("Resultado: " + (num1 * num2));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(campo1.getText().toString());
                int num2 = Integer.parseInt(campo2.getText().toString());
                if (num2 > 0) {
                    etiResultado.setText("Resultado: " + (num1 / num2));
                } else {
                    etiResultado.setText("Resultado: Infinito");
                }
            }
        });
    }

}
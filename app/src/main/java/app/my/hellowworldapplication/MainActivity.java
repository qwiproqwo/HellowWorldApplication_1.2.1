package app.my.hellowworldapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOK = (Button) findViewById(R.id.buttonOK);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        final TextView inputTextName = (TextView) findViewById(R.id.inputTextName);
        final TextView inputTextEmail = (TextView) findViewById(R.id.inputTextEmail);
        final TextView outputText = (TextView) findViewById(R.id.outputText);

        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText.setText(String.format("Подписка оформлена на %s %nпо почте %s", inputTextName.getText().toString(), inputTextEmail.getText().toString()));
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextName.setText("");
                inputTextEmail.setText("");
                outputText.setText("Подписка не оформлена");
            }
        });

    }
}

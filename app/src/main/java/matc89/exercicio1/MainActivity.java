package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText input;
    private TextView label;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.label = (TextView)findViewById(R.id.labelMensagem);
        this.input = (EditText)findViewById(R.id.editNome);
    }

    public void onPress(View minhaView){
        this.label.setText("Alô, "+this.input.getText()+"!");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("inputText", this.input.getText().toString());
        outState.putString("labelText", (String) this.label.getText().toString());
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){

        this.input.setText(savedInstanceState.getString("inputText"));
        this.label.setText(savedInstanceState.getString("labelText"));
    }
}

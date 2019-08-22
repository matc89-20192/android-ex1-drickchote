package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;
    TextView label;
    EditText mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.label = (TextView)findViewById(R.id.labelMensagem);
        this.mensagem = (EditText)findViewById(R.id.editNome);
    }

    protected void onPress(View minhaView){
        


    }
}

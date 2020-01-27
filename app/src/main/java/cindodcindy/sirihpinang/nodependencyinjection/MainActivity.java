package cindodcindy.sirihpinang.nodependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button button_toouch;
    public TextView textView_viewresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_toouch=findViewById(R.id.btntouch);
        textView_viewresult=findViewById(R.id.tvview);

        button_toouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DarkKnight darkKnight = new DarkKnight();

                LightKnight lightKnight= new LightKnight();

                textView_viewresult.setText("Ligth Knig menggunakan senjata " + lightKnight.pedang());
                textView_viewresult.setText("Dark knight menggunakan senjata " + darkKnight.tombak());
            }
        });
    }
}

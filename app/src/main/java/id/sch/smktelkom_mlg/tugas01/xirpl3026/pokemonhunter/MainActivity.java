package id.sch.smktelkom_mlg.tugas01.xirpl3026.pokemonhunter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Nm, loc;
    RadioButton L, P;
    CheckBox UlB, HyP, LuM, LuE;
    Button ButtonOk;
    TextView tvHasil;
    Spinner spTeam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nm = (EditText) findViewById(R.id.Nama);
        loc = (EditText) findViewById(R.id.Alamat);

        L = (RadioButton) findViewById(R.id.male);
        P = (RadioButton) findViewById(R.id.Female);

        UlB = (CheckBox) findViewById(R.id.UB);
        HyP = (CheckBox) findViewById(R.id.HP);
        LuM = (CheckBox) findViewById(R.id.LM);
        LuE = (CheckBox) findViewById(R.id.LE);

        spTeam = (Spinner) findViewById(R.id.spinner);

        tvHasil = (TextView) findViewById(R.id.hsl);

        findViewById(ButtonOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick()
            }
        });


    }

    private void doclick() {
        if (isValid()) {
            String id = Nm.getText().toString();
            String place = loc.getText().toString();
            tvHasil.setText(id + " beralamat di " + place);
        }
    }

    private boolean isValid() {
        String id = Nm.getText().toString();
        String place = loc.getText().toString();
        boolean valid = true;
        if (id.isEmpty()) {
            Nm.setError("Nama Belum Diisi");
            valid = false;
        } else if (id.length() < 3) {
            Nm.setError("Nama harus lebih dari 3 karakter");
            valid = false;
        } else {
            Nm.setError(null);
        }
        if (place.isEmpty())
            loc.setError("Alamat belum diisi");
        else {
            loc.setError(null);
        }
        return valid;
    }
}

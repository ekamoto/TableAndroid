package br.com.hisamoto.tableAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import br.com.hisamoto.tableAndroid.activity.TabelaNomesActivity;

public class HisamotoActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);

        /** Utilizando Table**/
        Button botaoTableNomes = new Button(getApplicationContext());

        botaoTableNomes.setText("Lista de Nomes");

        botaoTableNomes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TabelaNomesActivity.class);
                startActivity(intent);
            }
        });
        layout.addView(botaoTableNomes);

        setContentView(layout);
    }
}

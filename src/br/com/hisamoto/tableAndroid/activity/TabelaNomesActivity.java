package br.com.hisamoto.tableAndroid.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import br.com.hisamoto.tableAndroid.R;

/**
 * @author Leandro Shindi
 * @version 1.0 25/06/15.
 */
public class TabelaNomesActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tabela_nomes);

        TableLayout tabela = (TableLayout)findViewById(R.id.tableNomes);

        // Inserindo dinâmicamente linhas na tabela
        for(int i = 1 ; i <= 50 ; i++) {

            TableRow tr1 = new TableRow(this);

            TextView nome = new TextView(this);
            nome.setText("Nome_" + i);
            nome.setTextColor(Color.BLACK);
            nome.setPadding(10,10,10,10);
            tr1.addView(nome);

            TextView email = new TextView(this);
            email.setText("pp__" + i + "@hotmail.com.br");
            email.setTextColor(Color.BLACK);
            email.setPadding(10,10,10,10);
            tr1.addView(email);

            if(i%2 == 0) {

                tr1.setBackgroundColor(Color.GREEN);
            } else {

                tr1.setBackgroundColor(Color.BLUE);
            }

            tabela.addView(tr1, new TableLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        }
    }
}
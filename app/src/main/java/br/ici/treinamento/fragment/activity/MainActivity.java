package br.ici.treinamento.fragment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.ici.treinamento.fragment.R;
import br.ici.treinamento.fragment.fragment.ContatosFragment;
import br.ici.treinamento.fragment.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas, buttonContatos;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContatos = findViewById(R.id.buttonContatos);
        buttonConversas = findViewById(R.id.buttonConversas);

        //Removendo a sombra da Action Bar
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        //Configurando um objeto para o fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction().replace(R.id.frameConteudo,conversasFragment);
        transaction.commit();

        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatosFragment = new ContatosFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();

            }
        });

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conversasFragment = new ConversasFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();
            }
        });
    }
}

package com.example.pedra_papel_tesoura_lagarto_spock;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }
    public void selecionarPapel(View view){
        this.opcaoSelecionada("papel");
    }
    public void selecionarTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }
    public void selecionarLagarto(View view){
        this.opcaoSelecionada("lagarto");
    }
    public void selecionarSpock(View view){
        this.opcaoSelecionada("spock");
    }

    public void opcaoSelecionada(String escolhaUsuario){

        ImageView imagemResultado = findViewById(R.id.imageResultado);
        TextView textoResultado = findViewById(R.id.textResultado);
        String[] opcoes = {"pedra", "papel", "tesoura", "lagarto","spock"};
        int numero = new Random().nextInt(5);
        String escolhaApp = opcoes[numero];
        switch (escolhaApp){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
            case "lagarto":
                imagemResultado.setImageResource(R.drawable.lizard);
                break;
            case "spock":
                imagemResultado.setImageResource(R.drawable.spock);
                break;
        }
        if (
                (escolhaApp == "pedra" && escolhaUsuario == "tesoura") || //pedra ganha da tesoura
                (escolhaApp == "papel" && escolhaUsuario == "pedra") || // papel ganha da pedra
                (escolhaApp == "tesoura" && escolhaUsuario == "papel") || // tesoura corta o papel
                (escolhaApp == "lagarto" && escolhaUsuario == "spock") ||// lagarto envenena spock
                (escolhaApp == "spock" && escolhaUsuario == "pedra" ) ||// spock pulveriza a pedra
                (escolhaApp == "papel" && escolhaUsuario == "spock") || // papel repele spock
                (escolhaApp == "tesoura" && escolhaUsuario == "lagarto")|| //tesoura corta o lagarto
                (escolhaApp == "pedra" && escolhaUsuario == "lagarto") || // pedra esmaga o lagarto
                (escolhaApp == "lagarto" && escolhaUsuario == "papel") || // lagarto come o papel
                (escolhaApp == "spock" && escolhaUsuario == "tesoura")//spock amassa tesoura


        ){

            //Aqui é testado se a CPU ganhou!
            textoResultado.setText("Você Perdeu :( ");

        }
        else if(
                (escolhaUsuario == "pedra" && escolhaApp == "tesoura") || //pedra ganha da tesoura
                (escolhaUsuario == "papel" && escolhaApp == "pedra") || // papel ganha da pedra
                (escolhaUsuario == "tesoura" && escolhaApp == "papel") || // tesoura corta o papel
                (escolhaUsuario == "lagarto" && escolhaApp == "spock") ||// lagarto envenena spock
                (escolhaUsuario == "spock" && escolhaApp == "pedra" ) ||// spock pulveriza a pedra
                (escolhaUsuario == "papel" && escolhaApp == "spock") || // papel repele spock
                (escolhaUsuario == "tesoura" && escolhaApp == "lagarto")|| //tesoura corta o lagarto
                (escolhaUsuario == "pedra" && escolhaApp == "lagarto") || // pedra esmaga o lagarto
                (escolhaUsuario == "lagarto" && escolhaApp == "papel") || // lagarto come o papel
                (escolhaUsuario == "spock" && escolhaApp == "tesoura")//spock amassa tesoura

        ){// Aqui é do Usuário

            textoResultado.setText("Você Ganhou :) ");

        }else


            {//Empate



            textoResultado.setText("Empatamos ");

        }





    }
}

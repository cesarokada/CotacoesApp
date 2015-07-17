package com.example.cesar.cotacoesapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;


public class MainActivity extends ActionBarActivity {

    private Button button1;
    private String url1 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=21";

    private Button button2;
    private String url2 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=28";

    private Button button3;
    private String url3 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=23";

    private Button button4;
    private String url4 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=25";

    private Button button5;
    private String url5 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=26";

    private Button button6;
    private String url6 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=22";


    private Button button7;
    private String url7 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=24";

    private Button button8;
    private String url8 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=16";

    private Button button9;
    private String url9 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=27";

    private Button button10;
    private String url10 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=18";

    private Button button11;
    private String url11 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=17";

    private Button button12;
    private String url12 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=20";

    private Button button13;
    private String url13 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=30";

    private Button button14;
    private String url14 = "http://www.agrolink.com.br/agromaquinas/AnuncioLista.aspx?codGrupo=6546";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);

        ScrollView sv = (ScrollView) findViewById(R.id.scrollView);
        sv.scrollTo(0,0);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url1);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url2);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url3);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url4);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url5);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url6);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url7);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url8);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url9);
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url10);
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url11);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url12);
                startActivity(intent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url13);
                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityFilho.class);
                intent.putExtra("url", url14);
                startActivity(intent);
            }
        });
    }

}

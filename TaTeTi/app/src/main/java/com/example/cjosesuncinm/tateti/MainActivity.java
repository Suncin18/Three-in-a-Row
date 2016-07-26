package com.example.cjosesuncinm.tateti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, clear, exit, point; //Inicializa los botones
    int Turn, PuntosX, PuntosO; //Definimos la variable para los turnos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.b1); //Ubicamos los botones
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        point = (Button)findViewById(R.id.point);
        clear = (Button)findViewById(R.id.clear);
        exit = (Button)findViewById(R.id.exit);
        Turn = 1; //Definimos que el turno del primer jugador
        //Definimos los puntos de los jugadores
        PuntosX = 0;
        PuntosO = 0;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")){ /*Verificamos si no se ha marcado ese lugar*/
                    if (Turn == 1){ /*Definimos un algoritmo para intercambiar los turnos de los jugadores*/
                        Turn = 2;
                        b1.setText("X"); //Si es el turno de jugador1 entonces se marca X
                    }else if (Turn == 2){
                        Turn = 1;
                        b1.setText("O"); //Si es el turno de jugador1 entonces se marca O
                    }
                }
              endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")){
                    if (Turn == 1){
                        Turn = 2;
                        b2.setText("X");
                    }else if (Turn == 2){
                        Turn = 1;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")){
                    if (Turn == 1){
                        Turn = 2;
                        b3.setText("X");
                    }else if (Turn == 2){
                        Turn = 1;
                        b3.setText("O");
                    }
                }
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")){
                    if (Turn == 1){
                        Turn = 2;
                        b4.setText("X");
                    }else if (Turn == 2){
                        Turn = 1;
                        b4.setText("O");
                    }
                }
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")){
                    if (Turn == 1){
                        Turn = 2;
                        b5.setText("X");
                    }else if (Turn == 2){
                        Turn = 1;
                        b5.setText("O");
                    }
                }
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")){
                    if (Turn == 1){
                        Turn = 2;
                        b6.setText("X");
                    }else if (Turn == 2){
                        Turn = 1;
                        b6.setText("O");
                    }
                }
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")){
                    if (Turn == 1){
                        Turn = 2;
                        b7.setText("X");
                    }else if (Turn == 2){
                        Turn = 1;
                        b7.setText("O");
                    }
                }
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")){
                    if (Turn == 1){
                        Turn = 2;
                        b8.setText("X");
                    }else if (Turn == 2){
                        Turn = 1;
                        b8.setText("O");
                    }
                }
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")){
                    if (Turn == 1){
                        Turn = 2;
                        b9.setText("X");
                    }else if (Turn == 2){
                        Turn = 1;
                        b9.setText("O");
                    }
                }
                endGame();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lo que haré será simplemente limpiar los campos para volver a jugar.
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

                //Habilitaremos la opción para que puedan volver a jugar
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void endGame()
    {
        boolean end = false;
        //Cada boton tendrá su representante en letre y en número por orden natural
        //a=1. B=2. C=3 ...
        String a = b1.getText().toString();
        String b = b2.getText().toString();
        String c = b3.getText().toString();
        String d = b4.getText().toString();
        String e = b5.getText().toString();
        String f = b6.getText().toString();
        String g = b7.getText().toString();
        String h = b8.getText().toString();
        String i = b9.getText().toString();
        //Vamos a poner las posibles victorias.
        if (a.equals("X") && b.equals("X") && c.equals("X"))
        {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosX++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (a.equals("X") && d.equals("X") && g.equals("X"))
        {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosX++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (a.equals("X") && e.equals("X") && i.equals("X"))
        {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosX++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (b.equals("X") && e.equals("X") && h.equals("X"))
        {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosX++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (c.equals("X") && e.equals("X") && g.equals("X"))
        {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosX++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (c.equals("X") && f.equals("X") && i.equals("X"))
        {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosX++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (d.equals("X") && e.equals("X") && f.equals("X"))
        {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosX++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (g.equals("X") && h.equals("X") && i.equals("X"))
        {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosX++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }

        //AHORA EN CASO DE QUE GANE 'O'

        if (a.equals("O") && b.equals("O") && c.equals("O"))
        {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosO++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (a.equals("O") && d.equals("O") && g.equals("O"))
        {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosO++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (a.equals("O") && e.equals("O") && i.equals("O"))
        {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosO++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (b.equals("O") && e.equals("O") && h.equals("O"))
        {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosO++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (c.equals("O") && e.equals("O") && g.equals("O"))
        {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosO++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (c.equals("O") && f.equals("O") && i.equals("O"))
        {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosO++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (d.equals("O") && e.equals("O") && f.equals("O"))
        {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosO++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }
        if (g.equals("O") && h.equals("O") && i.equals("O"))
        {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
            PuntosO++;
            point.setText("Player X: "+ PuntosX + " " + "Player O: " + PuntosO);
        }

        //Trataremos de evitar que los usuarios sigan jugando luego de que X o O ganen.
        if (end)
        {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }
}

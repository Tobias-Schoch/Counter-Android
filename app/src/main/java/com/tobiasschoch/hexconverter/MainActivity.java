package com.tobiasschoch.hexconverter;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView nul;
    private TextView eins;
    private TextView zwei;
    private TextView drei;
    private TextView vier;
    private TextView fünf;
    private TextView sechs;
    private TextView sieben;
    private TextView acht;
    private TextView neun;
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView bindez;
    private TextView hexdez;
    private TextView bin;
    private TextView hex;
    private TextView vor;
    private TextView ergebnis;
    private TextView ce;
    private TextView inc;
    private TextView hexbin;
    private TextView binhex;

    String zahl11 = "";
    int zahl1 = 0;
    int result = 0;
    String binary = "";
    int aa = 10;
    int bb = 11;
    int cc = 11;
    int dd = 11;
    int ee = 11;
    int ff = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nul = findViewById(R.id.nul);
        eins = findViewById(R.id.eins);
        zwei = findViewById(R.id.zwei);
        drei = findViewById(R.id.drei);
        vier = findViewById(R.id.vier);
        fünf = findViewById(R.id.fünf);
        sechs = findViewById(R.id.sechs);
        sieben = findViewById(R.id.sieben);
        acht = findViewById(R.id.acht);
        neun = findViewById(R.id.neun);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        e = findViewById(R.id.e);
        f = findViewById(R.id.f);
        bindez = findViewById(R.id.bindez);
        hexdez = findViewById(R.id.hexdez);
        bin = findViewById(R.id.bin);
        hex = findViewById(R.id.hex);
        vor = findViewById(R.id.vor);
        ergebnis = findViewById(R.id.ergebnis);
        ce = findViewById(R.id.ce);
        inc = findViewById(R.id.inc);
        hexbin = findViewById(R.id.hexbin);
        binhex = findViewById(R.id.binhex);

        nul.setOnClickListener(this);
        eins.setOnClickListener(this);
        zwei.setOnClickListener(this);
        drei.setOnClickListener(this);
        vier.setOnClickListener(this);
        fünf.setOnClickListener(this);
        sechs.setOnClickListener(this);
        sieben.setOnClickListener(this);
        acht.setOnClickListener(this);
        neun.setOnClickListener(this);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        bindez.setOnClickListener(this);
        hexdez.setOnClickListener(this);
        bin.setOnClickListener(this);
        hex.setOnClickListener(this);
        vor.setOnClickListener(this);
        ce.setOnClickListener(this);
        inc.setOnClickListener(this);
        hexbin.setOnClickListener(this);
        binhex.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == eins) {
            zahl11 = zahl11 + "1";
            vor.setText(zahl11);
        } else if (view == zwei) {
            zahl11 = zahl11 + "2";
            vor.setText(zahl11);
        } else if (view == drei) {
            zahl11 = zahl11 + "3";
            vor.setText(zahl11);
        } else if (view == vier) {
            zahl11 = zahl11 + "4";
            vor.setText(zahl11);
        } else if (view == fünf) {
            zahl11 = zahl11 + "5";
            vor.setText(zahl11);
        } else if (view == sechs) {
            zahl11 = zahl11 + "6";
            vor.setText(zahl11);
        } else if (view == sieben) {
            zahl11 = zahl11 + "7";
            vor.setText(zahl11);
        } else if (view == acht) {
            zahl11 = zahl11 + "8";
            vor.setText(zahl11);
        } else if (view == neun) {
            zahl11 = zahl11 + "9";
            vor.setText(zahl11);
        } else if (view == nul) {
            zahl11 = zahl11 + "0";
            vor.setText(zahl11);
        } else if (view == a) {
            zahl11 = zahl11 + "A";
            vor.setText(zahl11);
        } else if (view == b) {
            zahl11 = zahl11 + "B";
            vor.setText(zahl11);
        } else if (view == c) {
            zahl11 = zahl11 + "C";
            vor.setText(zahl11);
        } else if (view == d) {
            zahl11 = zahl11 + "D";
            vor.setText(zahl11);
        } else if (view == e) {
            zahl11 = zahl11 + "E";
            vor.setText(zahl11);
        } else if (view == f) {
            zahl11 = zahl11 + "F";
            vor.setText(zahl11);
        } else if (view == bin) {
            try {
                if (zahl11 == "") {
                    zahl1 = Integer.parseInt(ergebnis.getText().toString());
                } else {
                    zahl1 = Integer.parseInt(zahl11);
                }

                zahl11 = Integer.toBinaryString(zahl1);
                ergebnis.setText(zahl11 + "");
                zahl11 = "";
                zahl1 = 0;
                binary = "";
            } catch (Exception e) {
                vor.setText("Not Working");
            }
        } else if (view == hex) {
            try {
                if (zahl11 == "") {
                    zahl1 = Integer.parseInt(ergebnis.getText().toString());
                } else {
                    zahl1 = Integer.parseInt(zahl11);
                }

                binary = Integer.toHexString(zahl1);
                ergebnis.setText(binary + "");
                vor.setText("");
                zahl11 = "";
                zahl1 = 0;
                binary = "";
            } catch (Exception e) {
                vor.setText("Not Working");
            }
        } else if (view == bindez) {
            try {
                if (zahl11 == "") {
                    zahl1 = Integer.parseInt(ergebnis.getText().toString(), 2);
                } else {
                    zahl1 = Integer.parseInt(zahl11, 2);
                }

                ergebnis.setText(zahl1 + "");
                vor.setText("");
                zahl11 = "";
                zahl1 = 0;
                binary = "";
            } catch (Exception e) {
                vor.setText("Not Working");
            }
        } else if (view == hexdez) {
            try {
                if (zahl11 == "") {
                    zahl1 = Integer.parseInt(ergebnis.getText().toString(), 16);
                } else {
                    zahl1 = Integer.parseInt(zahl11, 16);
                }
                ergebnis.setText(zahl1 + "");
                vor.setText("");
                zahl11 = "";
                zahl1 = 0;
                binary = "";
            } catch (Exception e) {
                vor.setText("Not Working");
            }
        } else if (view == ce) {
            ergebnis.setText(0 + "");
            vor.setText("");
            zahl11 = "";
            zahl1 = 0;
            binary = "";
        } else if (view == binhex) {
            try {
                if (zahl11 == "") {
                    zahl1 = Integer.parseInt(ergebnis.getText().toString(), 2);
                } else {
                    zahl1 = Integer.parseInt(zahl11, 2);
                }
                binary = Integer.toHexString(zahl1);
                ergebnis.setText(binary + "");
                vor.setText("");
                zahl11 = "";
                zahl1 = 0;
                binary = "";
            } catch (Exception e) {
                vor.setText("Not Working");
            }
        } else if (view == hexbin) {
            try {
                if (zahl11 == "") {
                    binary = new BigInteger(ergebnis.getText().toString(), 16).toString(2);
                } else {
                    binary = new BigInteger(zahl11, 16).toString(2);
                }
                ergebnis.setText(binary + "");
                vor.setText("");
                zahl11 = "";
                zahl1 = 0;
                binary = "";
            } catch (Exception e) {
                vor.setText("Not Working");
            }
        }

    }
}

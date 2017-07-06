package com.example.ramiro.projectefinal.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import com.example.ramiro.projectefinal.R;
import com.example.ramiro.projectefinal.flipper.Coolimagefliper;

import java.util.Map;
import java.util.Random;

public class memory extends MainActivity {


    Coolimagefliper flipper;
    Drawable postcard;
    Drawable goku;
    Drawable krilin;
    Drawable vegeta;
    Drawable bulma;
    Drawable gohan;
    Drawable mutenroshi;
    Drawable frezza;
    Drawable picolo;
    boolean isbola = true;

    int [] imagenes = {R.drawable.goku,R.drawable.krilin,R.drawable.vegeta,
            R.drawable.bulma,R.drawable.gohan,R.drawable.mutenroshi,R.drawable.freezer,R.drawable.picolo};

    int [] id = {R.id.imageView1,R.id.imageView2,R.id.imageView3,R.id.imageView4,
            R.id.imageView5,R.id.imageView6,R.id.imageView7,R.id.imageView8,R.id.imageView9,R.id.imageView10,
            R.id.imageView11,R.id.imageView12,R.id.imageView13,R.id.imageView14,R.id.imageView15,R.id.imageView16};

    int [] imagenes_assignadas = new int[16];



    void initBoard(){

        Random ran = new Random();
        boolean [] usadas = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        int rand;

        for (int i=0; i <16; ++i){

            rand = Math.abs(ran.nextInt() % 8);

            if(!usadas[rand]){
                imagenes_assignadas[i] = imagenes[rand];
                usadas[rand] = true;
            }
            else if (!usadas[rand+8]){
                imagenes_assignadas[i] = imagenes[rand];
                usadas[rand+8] = true;

            }
            else --i;


        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
        super.setItemChecked();
        toolbar.setTitle("MEMORY");

        initBoard();

        flipper = new Coolimagefliper(this);
        postcard = getResources().getDrawable(R.drawable.postcard);
        goku = getResources().getDrawable(R.drawable.goku);
        krilin = getResources().getDrawable(R.drawable.krilin);
        vegeta = getResources().getDrawable(R.drawable.vegeta);
        bulma = getResources().getDrawable(R.drawable.bulma);
        gohan = getResources().getDrawable(R.drawable.gohan);
        mutenroshi = getResources().getDrawable(R.drawable.mutenroshi);
        frezza = getResources().getDrawable(R.drawable.freezer);
        picolo = getResources().getDrawable(R.drawable.picolo);


    }

    public void foodClicked(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.imageView1:
                if (isbola) {
                    flipper.flipImage(getResources().getDrawable(imagenes_assignadas[0]), ((ImageView) view));

                }
                break;
            case R.id.imageView2:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[1]), ((ImageView) view));
                break;
            case R.id.imageView3:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[2]), ((ImageView) view));
                break;
            case R.id.imageView4:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[3]), ((ImageView) view));
                break;
            case R.id.imageView5:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[4]), ((ImageView) view));
                break;
            case R.id.imageView6:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[5]), ((ImageView) view));
                break;
            case R.id.imageView7:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[6]), ((ImageView) view));
                break;
            case R.id.imageView8:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[7]), ((ImageView) view));
                break;
            case R.id.imageView9:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[8]), ((ImageView) view));
                break;
            case R.id.imageView10:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[9]), ((ImageView) view));
                break;
            case R.id.imageView11:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[10]), ((ImageView) view));
                break;
            case R.id.imageView12:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[11]), ((ImageView) view));
                break;
            case R.id.imageView13:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[12]), ((ImageView) view));
                break;
            case R.id.imageView14:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[13]), ((ImageView) view));
                break;
            case R.id.imageView15:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[14]), ((ImageView) view));
                break;
            case R.id.imageView16:
                flipper.flipImage(getResources().getDrawable(imagenes_assignadas[15]), ((ImageView) view));
                break;

        }

    }

    @Override
    protected int whatIsMyId() {
        return R.id.nav_memory;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_extra,menu);
        setTitle("MEMORY");
        return true;
    }
}

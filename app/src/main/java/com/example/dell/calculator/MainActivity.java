package com.example.dell.calculator;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    View view;
    Button btn_showdata;


    Button buttonForZero,buttonforone,buttonfortwo,buttonforthree,buttonforfour,buttonforfive,
            buttonforsix,buttonforseven,buttonforeight,buttonfornine,buttonformul,buttonforsub,
            buttonforadd,buttonfordiv,buttonforequal,buttonforclear,buttonforpi,buttonfortan,
            buttonforcos,buttonforsin,buttonforlog,buttonforln,buttonforpoint,buttonforbracket,
            buttonforpercentage,buttonforrootoverx,buttonforxpowery,buttonforsquarex,
            buttonfordelete,buttonforEXP;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout viewGroup = (RelativeLayout)findViewById(R.id.mainView);
        for(int i =0; i<viewGroup.getChildCount(); i++){
            if(viewGroup.getChildAt(i) instanceof Button){
                viewGroup.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        }

        buttonForZero = findViewById(R.id.buttonForZero);
        Typeface roboto = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonForZero.setTypeface(roboto);


        buttonforone=findViewById(R.id.button23);
        Typeface roboto1 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforone.setTypeface(roboto1);


        buttonfortwo=findViewById(R.id.button17);
        Typeface roboto2 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonfortwo.setTypeface(roboto2);

        buttonforthree=findViewById(R.id.button7);
        Typeface roboto3 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforthree.setTypeface(roboto3);

        buttonforfour=findViewById(R.id.button22);
        Typeface roboto4 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforfour.setTypeface(roboto4);
        buttonforfour.setBackgroundColor(getResources().getColor(R.color.black));



        buttonforfive=findViewById(R.id.button11);
        Typeface roboto5 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforfive.setTypeface(roboto5);

        buttonforsix=findViewById(R.id.button4);
        Typeface roboto6 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforsix.setTypeface(roboto6);

        buttonforseven=findViewById(R.id.button21);
        Typeface roboto7 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforseven.setTypeface(roboto7);

        buttonforeight=findViewById(R.id.button8);
        Typeface roboto8 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforeight.setTypeface(roboto8);

        buttonfornine=findViewById(R.id.button3);
        Typeface roboto9 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonfornine.setTypeface(roboto9);

        buttonformul=findViewById(R.id.button13);
        Typeface roboto10 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonformul.setTypeface(roboto10);

        buttonforsub=findViewById(R.id.button14);
        Typeface roboto11 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforsub.setTypeface(roboto11);

        buttonforadd=findViewById(R.id.button15);
        Typeface roboto12 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforadd.setTypeface(roboto12);

        buttonfordiv=findViewById(R.id.button19);
        Typeface roboto13 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonfordiv.setTypeface(roboto13);

        buttonforequal=findViewById(R.id.button16);
        Typeface roboto14 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforequal.setTypeface(roboto14);
        buttonforequal.setBackgroundColor(getResources().getColor(R.color.blue));


        buttonforclear=findViewById(R.id.button18);
        Typeface roboto15 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforclear.setTypeface(roboto15);
        buttonforclear.setBackgroundColor(getResources().getColor(R.color.red));


        buttonforpi=findViewById(R.id.button25);
        Typeface roboto16 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforpi.setTypeface(roboto16);

        buttonfortan=findViewById(R.id.button26);
        Typeface roboto17 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonfortan.setTypeface(roboto17);

        buttonforcos=findViewById(R.id.button27);
        Typeface roboto18 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforcos.setTypeface(roboto18);

        buttonforsin=findViewById(R.id.button28);
        Typeface roboto19 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforsin.setTypeface(roboto19);

        buttonforlog=findViewById(R.id.button29);
        Typeface roboto20 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforlog.setTypeface(roboto20);

        buttonforln=findViewById(R.id.button30);
        Typeface roboto22 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforln.setTypeface(roboto22);

        buttonforpoint=findViewById(R.id.button24);
        Typeface roboto23 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforpoint.setTypeface(roboto23);

        buttonforbracket=findViewById(R.id.button20);
        Typeface roboto24 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforbracket.setTypeface(roboto24);

        buttonforpercentage=findViewById(R.id.button9);
        Typeface roboto25 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforpercentage.setTypeface(roboto25);

        buttonforrootoverx=findViewById(R.id.button);
        Typeface roboto26 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforrootoverx.setTypeface(roboto26);

        buttonforxpowery=findViewById(R.id.button6);
        Typeface roboto27 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforxpowery.setTypeface(roboto27);

        buttonforsquarex=findViewById(R.id.button12);
        Typeface roboto28 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforsquarex.setTypeface(roboto28);

        buttonfordelete=findViewById(R.id.button5);
        Typeface roboto29 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonfordelete.setTypeface(roboto29);

        buttonforEXP=findViewById(R.id.button10);
        Typeface roboto30 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        buttonforEXP.setTypeface(roboto30);

        textview=(TextView)findViewById(R.id.textView);
        Typeface roboto31 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        textview.setTypeface(roboto31);





        view =this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.grey);


    }


    public void setText(View view) {
        Button button = findViewById(view.getId());
        String text = button.getText().toString();
        button.setText(text.substring(0, text.length() - 1));
        textview.setText(textview.getText()+text);
    }
}

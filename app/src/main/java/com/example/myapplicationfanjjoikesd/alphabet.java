package com.example.myapplicationfanjjoikesd;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class alphabet extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitry_alphabet);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setHomeAsUpIndicator(R.drawable.mybutton);
        actionBar.setDisplayHomeAsUpEnabled(true);



        ImageButton a = (ImageButton)findViewById(R.id.button25);
        ImageButton b = (ImageButton)findViewById(R.id.button23);
        ImageButton c = (ImageButton)findViewById(R.id.button26);
        ImageButton d = (ImageButton)findViewById(R.id.button22);
        ImageButton e = (ImageButton)findViewById(R.id.button24);
        ImageButton f = (ImageButton)findViewById(R.id.button20);
        ImageButton g = (ImageButton)findViewById(R.id.button19);
        ImageButton h = (ImageButton)findViewById(R.id.button21);
        ImageButton i = (ImageButton)findViewById(R.id.button18);
        ImageButton j = (ImageButton)findViewById(R.id.button16);
        ImageButton k = (ImageButton)findViewById(R.id.button17);
        ImageButton l = (ImageButton)findViewById(R.id.button14);
        ImageButton m = (ImageButton)findViewById(R.id.button13);
        ImageButton n = (ImageButton)findViewById(R.id.button15);
        ImageButton o = (ImageButton)findViewById(R.id.button12);
        ImageButton p = (ImageButton)findViewById(R.id.button10);
        ImageButton q = (ImageButton)findViewById(R.id.button11);
        ImageButton r = (ImageButton)findViewById(R.id.button9);
        ImageButton s = (ImageButton)findViewById(R.id.button7);
        ImageButton t = (ImageButton)findViewById(R.id.button8);
        ImageButton u = (ImageButton)findViewById(R.id.button6);
        ImageButton v = (ImageButton)findViewById(R.id.button5);
        ImageButton w = (ImageButton)findViewById(R.id.button4);
        ImageButton x = (ImageButton)findViewById(R.id.button3);
        ImageButton y = (ImageButton)findViewById(R.id.button);
        ImageButton z = (ImageButton)findViewById(R.id.button2);
        ImageView liat = (ImageView) findViewById(R.id.viewimej);

        View.OnClickListener hurufg = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.button25:
                        liat.setImageResource(R.drawable.a);
                        liat.bringToFront();
                        break;
                    case  R.id.button23:

                        liat.setImageResource(R.drawable.b);
                        liat.bringToFront();
                        break;
                    case  R.id.button26:

                        liat.setImageResource(R.drawable.c);
                        liat.bringToFront();
                        break;
                    case  R.id.button22:

                        liat.setImageResource(R.drawable.d);
                        liat.bringToFront();
                        break;
                    case  R.id.button24:

                        liat.setImageResource(R.drawable.e);
                        liat.bringToFront();
                        break;
                    case  R.id.button20:

                        liat.setImageResource(R.drawable.f);
                        liat.bringToFront();
                        break;
                    case  R.id.button19:

                        liat.setImageResource(R.drawable.g);
                        liat.bringToFront();
                        break;
                    case  R.id.button21:

                        liat.setImageResource(R.drawable.h);
                        liat.bringToFront();
                        break;
                    case  R.id.button18:

                        liat.setImageResource(R.drawable.i);
                        liat.bringToFront();
                        break;
                    case  R.id.button16:

                        liat.setImageResource(R.drawable.j);
                        liat.bringToFront();
                        break;
                    case  R.id.button17:

                        liat.setImageResource(R.drawable.k);
                        liat.bringToFront();
                        break;
                    case R.id.button14:

                        liat.setImageResource(R.drawable.l);
                        liat.bringToFront();
                        break;
                    case  R.id.button13:

                        liat.setImageResource(R.drawable.m);
                        liat.bringToFront();
                        break;
                    case R.id.button15:

                        n.setImageResource(R.drawable.m);
                        liat.bringToFront();
                        break;
                    case   R.id.button12:

                        liat.setImageResource(R.drawable.o);
                        liat.bringToFront();
                        break;
                    case  R.id.button10:

                        liat.setImageResource(R.drawable.p);
                        liat.bringToFront();
                        break;
                    case  R.id.button11:

                        liat.setImageResource(R.drawable.q);
                        liat.bringToFront();
                        break;
                    case R.id.button9:

                        liat.setImageResource(R.drawable.r);
                        liat.bringToFront();
                        break;
                    case  R.id.button7:

                        liat.setImageResource(R.drawable.s);
                        liat.bringToFront();
                        break;
                    case   R.id.button8:

                        liat.setImageResource(R.drawable.t);
                        liat.bringToFront();
                        break;
                    case  R.id.button6:

                        liat.setImageResource(R.drawable.u);
                        liat.bringToFront();
                        break;
                    case   R.id.button5:

                        liat.setImageResource(R.drawable.v);
                        liat.bringToFront();
                        break;
                    case R.id.button4:

                        liat.setImageResource(R.drawable.w);
                        liat.bringToFront();
                        break;
                    case  R.id.button3:

                        liat.setImageResource(R.drawable.x);
                        liat.bringToFront();
                        break;
                    case  R.id.button:

                        liat.setImageResource(R.drawable.y);
                        liat.bringToFront();
                        break;
                    case  R.id.button2:

                        liat.setImageResource(R.drawable.z);
                        liat.bringToFront();
                        break;
                }
            }
        };
        a.setOnClickListener(hurufg);
        b.setOnClickListener(hurufg);
        c.setOnClickListener(hurufg);
        d.setOnClickListener(hurufg);
        e.setOnClickListener(hurufg);
        f.setOnClickListener(hurufg);
        g.setOnClickListener(hurufg);
        h.setOnClickListener(hurufg);
        i.setOnClickListener(hurufg);
        j.setOnClickListener(hurufg);
        k.setOnClickListener(hurufg);
        l.setOnClickListener(hurufg);
        f.setOnClickListener(hurufg);
        g.setOnClickListener(hurufg);
        h.setOnClickListener(hurufg);
        i.setOnClickListener(hurufg);
        j.setOnClickListener(hurufg);
        k.setOnClickListener(hurufg);
        l.setOnClickListener(hurufg);
        m.setOnClickListener(hurufg);
        n.setOnClickListener(hurufg);
        o.setOnClickListener(hurufg);
        p.setOnClickListener(hurufg);
        q.setOnClickListener(hurufg);
        r.setOnClickListener(hurufg);
        s.setOnClickListener(hurufg);
        t.setOnClickListener(hurufg);
        u.setOnClickListener(hurufg);
        v.setOnClickListener(hurufg);
        w.setOnClickListener(hurufg);
        x.setOnClickListener(hurufg);
        y.setOnClickListener(hurufg);
        z.setOnClickListener(hurufg);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

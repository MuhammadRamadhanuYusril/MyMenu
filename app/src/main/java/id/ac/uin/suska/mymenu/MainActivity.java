package id.ac.uin.suska.mymenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView d1,d2,d3,d4,d5,d6 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d1 = (CardView) findViewById(R.id.d1);
        d2 = (CardView) findViewById(R.id.d2);
        d3 = (CardView) findViewById(R.id.d3);
        d4 = (CardView) findViewById(R.id.d4);
        d5 = (CardView) findViewById(R.id.d5);
        d6 = (CardView) findViewById(R.id.d6);

        d1.setOnClickListener((View.OnClickListener) this);
        d2.setOnClickListener((View.OnClickListener) this);
        d3.setOnClickListener((View.OnClickListener) this);
        d4.setOnClickListener((View.OnClickListener) this);
        d5.setOnClickListener((View.OnClickListener) this);
        d6.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v) {
        Intent i ;
        switch (v.getId()){
            case R.id.d1 : i = new Intent(this,D1.class); startActivity(i); break;
            case R.id.d2 : i = new Intent(this,D2.class); startActivity(i); break;
            case R.id.d3 : i = new Intent(this,D3.class); startActivity(i); break;
            case R.id.d4 : i = new Intent(this,D4.class); startActivity(i); break;
            case R.id.d5 : i = new Intent(this,D5.class); startActivity(i); break;
            case R.id.d6 : i = new Intent(this,D6.class); startActivity(i); break;
        }

    }
}
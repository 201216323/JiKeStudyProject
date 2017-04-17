package bruce.chang.somedrawableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button, button2, button3, button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                startActivity(new Intent(this, ClipAc.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, InsetAc.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this, RotateAc.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this, ScaleAct.class));
                break;
            case R.id.button5:
                startActivity(new Intent(this, BitmapAct.class));
                break;
            case R.id.button6:
//                startActivity(new Intent(this, ScaleAct.class));
                break;
            case R.id.button7:
//                startActivity(new Intent(this, ScaleAct.class));
                break;
        }
    }
}

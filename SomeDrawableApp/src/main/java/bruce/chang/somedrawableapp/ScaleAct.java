package bruce.chang.somedrawableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ScaleAct extends AppCompatActivity {
    ImageView img;
    private int scaleLevel=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        img = (ImageView) findViewById(R.id.img);
        img.getDrawable().setLevel(5000);
        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scaleLevel > 200) {
                    img.post(mRunnableDis);
                } else {
                    img.post(mRunnableShow);
                }
            }
        });
    }

    Runnable mRunnableDis = new Runnable() {
        @Override
        public void run() {
            if (scaleLevel > 200) {
                scaleLevel -= 600;
                img.getDrawable().setLevel(scaleLevel);
                img.postDelayed(mRunnableDis, 100);
            }
        }
    };

    Runnable mRunnableShow = new Runnable() {
        @Override
        public void run() {
            if (scaleLevel < 10000) {
                scaleLevel += 600;
                img.getDrawable().setLevel(scaleLevel);
                img.postDelayed(mRunnableShow, 100);
            }
        }
    };
}

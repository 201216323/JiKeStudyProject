package bruce.chang.somedrawableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RotateAc extends AppCompatActivity {
    ImageView image;
    Button btAdd;
    int rotateLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        image = (ImageView) findViewById(R.id.image);
        btAdd = (Button) findViewById(R.id.btAdd);
        image.getDrawable().setLevel(3000);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rotateLevel == 0) {
                    image.post(mRunnableAdd);
                }
            }
        });
    }

    Runnable mRunnableAdd = new Runnable() {
        @Override
        public void run() {
            if (rotateLevel < 10000) {
                rotateLevel += 200;
                image.getDrawable().setLevel(rotateLevel);
                image.postDelayed(mRunnableAdd, 100);
            }
        }
    };

}

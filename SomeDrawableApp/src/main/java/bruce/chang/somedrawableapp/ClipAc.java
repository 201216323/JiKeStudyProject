package bruce.chang.somedrawableapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ClipAc extends AppCompatActivity {

    private ImageView clipLine, clipVertical, clipImage;
    private int clipLineLevel = 10000, clipVerLevel = 10000, clipImageLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip);
        clipLine = (ImageView) findViewById(R.id.clipLine);
        clipVertical = (ImageView) findViewById(R.id.clipVertical);
        clipImage = (ImageView) findViewById(R.id.clipImage);

        clipLine.setImageLevel(10000);
        clipVertical.setImageLevel(10000);
//        clipImage.setImageLevel(500);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.clipHorAdd:
                if (clipLineLevel < 10000) {
                    clipLineLevel += 200;
                }
                clipLine.getDrawable().setLevel(clipLineLevel);
                break;
            case R.id.clipHorSub:
                if (clipLineLevel > 200) {
                    clipLineLevel -= 200;
                }
                clipLine.getDrawable().setLevel(clipLineLevel);
                break;
            case R.id.clipVerAdd:
                if (clipVerLevel < 10000) {
                    clipVerLevel += 200;
                }
                clipVertical.getDrawable().setLevel(clipVerLevel);
                break;
            case R.id.clipVerSub:
                if (clipVerLevel > 200) {
                    clipVerLevel -= 200;
                }
                clipVertical.getDrawable().setLevel(clipVerLevel);
                break;
            case R.id.imageShow:
                if (clipImageLevel > 200) {
                    clipImage.post(mRunnableDis);
                } else {
                    clipImage.post(mRunnableShow);
                }
                break;
        }
    }

    Runnable mRunnableDis = new Runnable() {
        @Override
        public void run() {
            if (clipImageLevel > 200) {
                clipImageLevel -= 200;
                clipImage.getDrawable().setLevel(clipImageLevel);
                clipImage.postDelayed(mRunnableDis, 50);
            }
        }
    };


    Runnable mRunnableShow = new Runnable() {
        @Override
        public void run() {
            if (clipImageLevel < 10000) {
                clipImageLevel += 200;
                clipImage.getDrawable().setLevel(clipImageLevel);
                clipImage.postDelayed(mRunnableShow, 100);
            }
        }
    };
}

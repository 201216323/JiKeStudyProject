package bruce.chang.testlitepal;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by: BruceChang
 * Date on : 2017/4/8.
 * Time on: 17:10
 * Progect_Name:JiKeStudyProject
 * Source Github：
 * Description:
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(getApplicationContext());
    }
}

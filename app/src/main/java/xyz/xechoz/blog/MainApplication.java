package xyz.xechoz.blog;

import android.app.Application;
import android.content.Context;
import android.support.annotation.WorkerThread;

import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

public class MainApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        asyncInit();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        context = base;
    }

    @WorkerThread
    private void asyncInit() {
        String TAG = "xechoz";
        Logger
                .init(TAG)
                .methodCount(3)
                .logLevel(BuildConfig.DEBUG? LogLevel.NONE: LogLevel.FULL)
                .methodOffset(2);

        Iconify
                .with(new FontAwesomeModule());
    }

    public static Context getContext() {
        return MainApplication.context;
    }
}

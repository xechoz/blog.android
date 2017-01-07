package xyz.xechoz.blog.concurrent;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

public class ThreadManager {
    private static ExecutorService service;
    private static Handler uiHandler;

    static {
        service = Executors.newCachedThreadPool();
        uiHandler = new Handler(Looper.getMainLooper());
    }

    public static void workerThread(Runnable task) {
        service.execute(task);
    }

    public static void uiThread(Runnable task) {
        uiHandler.post(task);
    }

    public static void uiThread(Runnable task, long delayMillionSeconds) {
        uiHandler.postDelayed(task, delayMillionSeconds);
    }
}

package com.myandroid.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Huochai on 2018/10/27.
 * ACTIVIE管理
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    //  增加
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    //  删除
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    //  删除所有
    public static void finishAll(){
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}

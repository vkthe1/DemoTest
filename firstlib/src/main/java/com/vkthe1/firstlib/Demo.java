package com.vkthe1.firstlib;

import android.content.Context;
import android.widget.Toast;

public class Demo {

    public static void useToToast(Context context) {
        Toast.makeText(context,"This is a toast from Library",Toast.LENGTH_LONG).show();
    }

}

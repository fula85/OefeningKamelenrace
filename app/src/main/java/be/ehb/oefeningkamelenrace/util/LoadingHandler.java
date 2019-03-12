package be.ehb.oefeningkamelenrace.util;

import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.TextView;

public class LoadingHandler extends Handler {

    private ProgressBar progressBar;
    private TextView tv;

    public LoadingHandler(ProgressBar progressBar, TextView tv) {
        this.progressBar = progressBar;
        this.tv = tv;
    }

    public void handleMessage(Message message){
        int progress = message.arg1;
    }
}

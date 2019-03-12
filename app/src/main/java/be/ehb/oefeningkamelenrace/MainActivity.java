package be.ehb.oefeningkamelenrace;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import be.ehb.oefeningkamelenrace.util.LoadingHandler;

public class MainActivity extends AppCompatActivity {

    private TextView tvLoadingEen;
    private ProgressBar pbLoading;
    private LoadingHandler loadingHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pbLoading = findViewById(R.id.pb_loading);
        tvLoadingEen = findViewById(R.id.tv_lbl_een);
    }

    public void onStartClicked(View view) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=20; i++){
                    Message message = new Message();
                    message.arg1 = i;
                    loadingHandler.sendMessage(message);
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }


}

package com.khuosh.toastme;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    public void showNormalToast(View view) {
        // Show a toast object
        Toast toast = Toast.makeText(this, R.string.hello_toast, Toast.LENGTH_SHORT);
        toast.show();
        // Position the toast object in the top-right corner
        toast.setGravity(Gravity.TOP|Gravity.START|Gravity.END,
                0, 130);
    }
}
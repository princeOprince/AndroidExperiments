package com.khuosh.toastme;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
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
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.START|Gravity.END,
                0, 0);
    }

    public void showCustomToast(View view) {
        // Create a custom toast view
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_toast_container));

        TextView textView = layout.findViewById(R.id.text);
        textView.setText(getString(R.string.custom_toast_text));

        Toast customToast = new Toast(this);
        customToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        customToast.setDuration(Toast.LENGTH_SHORT);
        customToast.setView(layout);
        customToast.show();
    }
}
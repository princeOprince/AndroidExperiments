package prince.oprince.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countText = findViewById(R.id.count_text);
        if (savedInstanceState != null) {
            count = Integer.parseInt(savedInstanceState.getString("count_text"));
            countText.setText(Integer.toString(count));
        }
    }

    public void upCount(View view) {
        count++;
        countText.setText(Integer.toString(count));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("count_text", countText.getText().toString());
    }
}

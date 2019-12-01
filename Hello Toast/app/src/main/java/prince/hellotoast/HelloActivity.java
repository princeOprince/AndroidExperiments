package prince.hellotoast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends Activity {
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        mShowCount = findViewById(R.id.show_count2);
        Intent intent = getIntent();
        String count = intent.getStringExtra(MainActivity.EXTRA_COUNT);
        mShowCount.setText(count);
    }
}

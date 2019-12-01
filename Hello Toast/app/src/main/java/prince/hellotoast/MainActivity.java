package prince.hellotoast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import static android.widget.Toast.makeText;

public class MainActivity extends Activity {
    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_COUNT = "prince.hellotoast.extra.COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
        String count = (String) mShowCount.getText();
        /*Log.d("In ShowToast Button", "count = " + count + " mShowCount = " + mShowCount2);
        if (mShowCount2 != null)
            mShowCount2.setText(count);*/
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra(EXTRA_COUNT, count);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}

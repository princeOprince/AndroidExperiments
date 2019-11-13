package prince.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if ((mCount % 2) == 0)
            view.setBackgroundColor(Color.rgb(000, 180,000));
        else
            view.setBackgroundColor(Color.rgb(180, 000, 000));
        if (mCount > 0)
            findViewById(R.id.button_zero).setBackgroundColor(Color.MAGENTA);
    }

    public void setToZero(View view) {
        mShowCount.setText(Integer.toString(mCount = 0));
        view.setBackgroundColor(Color.GRAY);
    }
}

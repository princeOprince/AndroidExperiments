package prince.oprince.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int ITEM_CODE = 1;
    private boolean isSame;
    TextView firstItem, secondItem, thirdItem, fourthItem, fifthItem, sixthItem, seventhItem,
             eighthItem, ninthItem, tenthItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstItem = findViewById(R.id.item1);
        secondItem = findViewById(R.id.item2);
        thirdItem = findViewById(R.id.item3);
        fourthItem = findViewById(R.id.item4);
        fifthItem = findViewById(R.id.item5);
        sixthItem = findViewById(R.id.item6);
        seventhItem = findViewById(R.id.item7);
        eighthItem = findViewById(R.id.item8);
        ninthItem = findViewById(R.id.item9);
        tenthItem = findViewById(R.id.item10);
    }

    public void addItem(View view) {
        startActivityForResult(new Intent(this, ShoppingActiviy.class), ITEM_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView[] textViews = {firstItem, secondItem, thirdItem, fourthItem, fifthItem, sixthItem,
                                seventhItem, eighthItem, ninthItem, tenthItem};
        if (requestCode == ITEM_CODE) {
            if (resultCode == RESULT_OK) {
                for (TextView textView : textViews) {
                    if (textView.getText().toString().isEmpty()) {
                        String text = data.getStringExtra(ShoppingActiviy.EXTRA_ITEM);
                        for (TextView textView1 : textViews) {
                            String pick = textView1.getText().toString();
                            isSame = pick.equals(text);
                            if (isSame)
                                break;
                        }
                        if (!isSame) {
                            textView.setText(text);
                            break;
                        }
                        else
                            Toast.makeText(this,"Already selected " + text, Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        TextView[] textViews = {firstItem, secondItem, thirdItem, fourthItem, fifthItem, sixthItem,
                seventhItem, eighthItem, ninthItem, tenthItem};
        for (int i = 0; i < textViews.length; i++) {
            if (!(textViews[i].getText().toString().isEmpty())) {
                outState.putString("item" + i, textViews[i].getText().toString());
            }
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        TextView[] textViews = {firstItem, secondItem, thirdItem, fourthItem, fifthItem, sixthItem,
                seventhItem, eighthItem, ninthItem, tenthItem};
        if (savedInstanceState != null) {
            for (int i = 0; i < textViews.length; i++) {
                if (textViews[i].getText().toString().isEmpty()) {
                    textViews[i].setText(savedInstanceState.getString("item" + i));
                }
            }
        }
    }
}

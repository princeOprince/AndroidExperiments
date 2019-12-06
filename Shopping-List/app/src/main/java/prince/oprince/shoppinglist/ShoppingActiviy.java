package prince.oprince.shoppinglist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ShoppingActiviy extends AppCompatActivity {
    public static final String EXTRA_ITEM = "prince.oprince.shoppinglist.extra.ITEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
    }

    public void addItem(View view) {
        Intent intent = new Intent();
        Button firstItem = findViewById(R.id.item1);
        Button secondItem = findViewById(R.id.item2);
        Button thirdItem = findViewById(R.id.item3);
        Button fourthItem = findViewById(R.id.item4);
        Button fifthItem = findViewById(R.id.item5);
        Button sixthItem = findViewById(R.id.item6);
        Button seventhItem = findViewById(R.id.item7);
        Button eighthItem = findViewById(R.id.item8);
        Button ninthItem = findViewById(R.id.item9);
        Button tenthItem = findViewById(R.id.item10);
        int id = view.getId();
        switch (id) {
            case R.id.item1 :
                intent.putExtra(EXTRA_ITEM, firstItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            case R.id.item2 :
                intent.putExtra(EXTRA_ITEM, secondItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            case R.id.item3 :
                intent.putExtra(EXTRA_ITEM, thirdItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            case R.id.item4 :
                intent.putExtra(EXTRA_ITEM, fourthItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            case R.id.item5 :
                intent.putExtra(EXTRA_ITEM, fifthItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            case R.id.item6 :
                intent.putExtra(EXTRA_ITEM, sixthItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            case R.id.item7 :
                intent.putExtra(EXTRA_ITEM, seventhItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            case R.id.item8 :
                intent.putExtra(EXTRA_ITEM, eighthItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            case R.id.item9 :
                intent.putExtra(EXTRA_ITEM, ninthItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            case R.id.item10 :
                intent.putExtra(EXTRA_ITEM, tenthItem.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
        }
    }
}

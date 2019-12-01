package prince.oprince.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

    }

    public void successSecretOne(View view) {
        Intent intent = new Intent(this, SuccessSecretOne.class);
        startActivity(intent);
    }

    public void successSecretTwo(View view) {
        Intent intent = new Intent(this, SuccessSecretTwo.class);
        startActivity(intent);
    }

    public void successSecretThree(View view) {
        Intent intent = new Intent(this, SuccessSecretThree.class);
        startActivity(intent);
    }
}

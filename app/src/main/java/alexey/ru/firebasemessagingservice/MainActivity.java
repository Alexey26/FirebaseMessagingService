package alexey.ru.firebasemessagingservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",  bundle.getString("phone")
                    , null)));
        }
    }
}


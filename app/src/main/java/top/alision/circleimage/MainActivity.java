package top.alision.circleimage;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.user_portrait);
        circleImageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.timg));
    }
}

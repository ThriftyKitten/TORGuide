package mashapps.torguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goWorld(View view) {
        Intent intent = new Intent(this, WorldActivity.class);
        startActivity(intent);
    }
    public void goCombat(View view) {
        Intent intent = new Intent(this, CombatActivity.class);
        startActivity(intent);
    }

}

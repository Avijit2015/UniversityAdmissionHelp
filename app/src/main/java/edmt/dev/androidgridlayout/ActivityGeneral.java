package edmt.dev.androidgridlayout;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityGeneral extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        TextView OptionsDu = findViewById(R.id.TextDu);
        TextView OptionsRu = findViewById(R.id.TextRu);

        OptionsDu.setOnClickListener(this);
        OptionsRu.setOnClickListener(this);

        //Test Push....

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.TextDu:
                Intent intent = new Intent(this, GenDuOptions.class);
                startActivity(intent);
                break;

            case R.id.TextRu:
                Intent intent1 = new Intent(this, GenRuOptions.class);
                startActivity(intent1);
                break;


            default:
                break;
        }
    }


}

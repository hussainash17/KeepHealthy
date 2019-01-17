package edu.unidhaka.cse.cse2216.keephealthy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class list_of_exercise extends Activity {

        private TextView tvtitle,tvdescription,tvcategory;
        private ImageView img;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list_of_exercise);

            tvtitle = (TextView) findViewById(R.id.txttitle);
            tvdescription = (TextView) findViewById(R.id.txtDesc);
            tvcategory = (TextView) findViewById(R.id.txtCat);
            img = (ImageView) findViewById(R.id.bookthumbnail);

            // Recieve data
            Intent intent = getIntent();
            String Title = intent.getExtras().getString("Title");
            String Description = intent.getExtras().getString("Description");
            int image = intent.getExtras().getInt("Thumbnail") ;

            // Setting values

            tvtitle.setText(Title);
            tvdescription.setText(Description);
            img.setImageResource(image);


        }
    }
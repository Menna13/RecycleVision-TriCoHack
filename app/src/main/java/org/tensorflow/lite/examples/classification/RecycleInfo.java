package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecycleInfo extends AppCompatActivity {

    TextView etInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_info);

        etInfo = findViewById(R.id.etInfo);
        Intent intent = getIntent();
        String num = intent.getStringExtra("number");
        if (num.equals ("1")){
            etInfo.setText("Plastic type one! PETE plastics make up 96% of all plastic bottles and containers in the United States, yet only 25% of these products are recycled. By being mindful and making sure to recycle code 1 plastics, you're helping to ensure a cleaner environment and less landfill pollution!");
        }
        else if (num.equals("2")){
            etInfo.setText("Plastic type two! HDPE is the most commonly recycled plastic because it will not break under exposure to extreme heat or cold. According to the EPA, 12% of all HDPE products created are recycled in a year. This is a very small dent in the planet's carbon footprint.");
        }
        else if (num.equals("3")){
            etInfo.setText("Plastic type three! PVC is one of the least recycled materials; generally less than 1% of PVC plastic is recycled each year. It has been called the 'poison plastic' because it contains numerous toxins and is harmful to our health and the environment.");
        }
        else if (num.equals("4")){
            etInfo.setText("Plastic type four! Packaging and containers made from LDPE make up about 56% of all plastic waste, 75% of which comes from residential households. Fortunately, many recycling programs are evolving to handle these products. This means less LDPE will end up in landfills and negatively affect the environment!");
        }
        else if (num.equals("5")){
            etInfo.setText("Plastic type five! Only about 3% of polypropylene products are recycled in the US, but interestingly enough, 325 million pounds of non-bottle plastics were collected for recycling over a year. In other words, a lot of this plastic is created, but only a small fraction is actually recycled.");
        }
        else if (num.equals("6")){
            etInfo.setText("Plastic type six! Since polystyrene is lightweight and easy to form into plastic materials, it also breaks effortlessly, making it more harmful to the environment. Beaches all over the world are littered with pieces of polystyrene, endangering the health of marine animals. Polystyrene accounts for about 35% of US landfill materials.");
        }
        else if (num.equals("7")){
            etInfo.setText("Plastic type seven! Many BPA products fall into this category, which means it's best to avoid them, especially for food products. It is not very easy to break down these plastics once they are created, unless they are exposed to high temperatures. This means they are nearly impossible to recycle.");
        }
        else{
            etInfo.setText("Please input a valid number (1-7)");
        }



    }

}
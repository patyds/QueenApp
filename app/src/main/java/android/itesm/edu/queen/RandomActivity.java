package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    private String[] songs = {"Bohemian Rhapsody","Don't Stop Me Now","We Will Rock You","Another One Bites the Dust","Somebody to Love",
                                "Love of My Life", "I Want to Break Free","Killer Queen", "Crazy Little Thing Called Love",
                                "Under Pressure","Who wants to live forever?", "These Are the Days of Our Lives",
                                "The Show Must Go On","I Want It All", "You're My Best Friend", "A Kind of Magic"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
    }

    public void done(View view){
        Intent intent = new Intent();
        int value = ((int)(Math.random()* songs.length));

        ((TextView)findViewById(R.id.textView)).setText(songs[value]);
        intent.putExtra("random", songs[value]);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

}

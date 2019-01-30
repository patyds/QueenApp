package android.itesm.edu.queen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class SongActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        textView =  findViewById(R.id.song);

        String string = getIntent().getStringExtra("file");
        String file = "";
        if(string.equals("bohemian")){
            file = getFile("Bohemian.txt");
            textView.setText("Bohemian Rhapsody \n\n");
        }else if(string.equals("dont")){
            file = getFile("dontstopmenow.txt");
            textView.setText("Don't Stop Me Now \n\n");
        }else if(string.equals("another")){
            file = getFile("anotheronebitesthedust.txt");
            textView.setText("Another One Bites The Dust \n\n");
        }else if(string.equals("fat")){
            file = getFile("fatbottomedgirls.txt");
            textView.setText("Fat Bottomed Girls \n\n");
        }else if(string.equals("somebody")){
            file = getFile("somebodytolove.txt");
            textView.setText("Somebody To Love \n\n");
        }else if(string.equals("we")){
            file = getFile("wewillrockyou.txt");
            textView.setText("We will Rock You \n\n");
        }
        textView.append(file);
    }

    private String getFile(String assetf){
        String file = "";
        try {
            InputStream is = getAssets().open(assetf);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            file = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

}

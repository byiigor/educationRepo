package primelabs.ru.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick(View v){
        Toast.makeText(this, "А кнопка просто нажималась.", Toast.LENGTH_LONG).show(); //Данный метод выводит оповещение о том, что кнопка нажата.
    }
}
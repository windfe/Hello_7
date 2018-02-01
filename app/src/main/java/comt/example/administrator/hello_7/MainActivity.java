package comt.example.administrator.hello_7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playTheQuizeClick(View view) {
        //跳转事件并传值
        Intent intent=new Intent(this,QuizActivity.class);
        intent.putExtra("key1",14);//传值的多种方式的一种,数值类型不同
        intent.putExtra("key2","values");
        startActivity(intent);
    }

    public void addWord(View view) {
    }
}

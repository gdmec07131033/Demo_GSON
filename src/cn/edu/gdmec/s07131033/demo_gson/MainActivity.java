package cn.edu.gdmec.s07131033.demo_gson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        List<String> phones = new ArrayList<String>();
        phones.add("342342");
        phones.add("4654634");
        phones.add("423424");
        phones.add("5435235");
        
        Person person = new Person(20, "lanlan", phones);
        
        Gson gson = new Gson();
        String s = gson.toJson(person);
        
        Log.i("info", s);
        
        Person person2 = gson.fromJson(s, Person.class);
        
        Log.i("s", "Json对象转换成java对象:"+person2);
    }
}

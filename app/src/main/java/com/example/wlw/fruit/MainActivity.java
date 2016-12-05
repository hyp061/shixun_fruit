package com.example.wlw.fruit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList=new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView= (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>adapterView, View view, int i, long id) {
                Fruit fruit= (Fruit) adapterView.getItemAtPosition(i);
                String title=fruit.getTitle();
                Toast.makeText(MainActivity.this,title,Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void  initFruits(){
        Fruit fruit;
        fruit=new Fruit(R.drawable.ic_launcher,"苹果","这是一个苹果");
        fruitList.add(fruit);
        fruit=new Fruit(R.drawable.ic_launcher,"橙子","这是一个橙子");
        fruitList.add(fruit);
        fruit=new Fruit(R.drawable.ic_launcher,"香蕉","这是一个香蕉");
        fruitList.add(fruit);
        fruit=new Fruit(R.drawable.ic_launcher,"西瓜","这是一个西瓜");
        fruitList.add(fruit);
        fruit=new Fruit(R.drawable.ic_launcher,"雪梨","这是一个雪梨");
        fruitList.add(fruit);
        fruit=new Fruit(R.drawable.ic_launcher,"呆子","这是一个呆子");
        fruitList.add(fruit);
    }
}

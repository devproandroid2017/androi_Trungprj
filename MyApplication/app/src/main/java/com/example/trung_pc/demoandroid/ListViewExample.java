package com.example.trung_pc.demoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewExample extends AppCompatActivity {

    ListView mListView;
    ArrayList<Recipe> mArrayList;
    AdapterItem mAdapterItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);
        List<Recipe> image_details = getListData();

        mListView= (ListView) findViewById(R.id.lvDanhsach);
        mListView.setAdapter(new AdapterItem(this, image_details));
       // ArrayList<String> mArrayList=new ArrayList<String>();
//        mArrayList.add(0,"a");
//        mArrayList.add(1,"b");
//        mArrayList.add(2,"c");
//        mArrayList.add(3,"d");
//        mArrayList.add("d");
//        mArrayList.add("b");
//        mArrayList.add("d");
//        mArrayList.add("b");
//        mArrayList.add("d");
//        mArrayList.add("b");
//        mArrayList.add("d");
//        mArrayList.add("b");
//        mArrayList.add("d");
//        mArrayList.add("b");
//        mArrayList.add("d");
//        mArrayList.add("b");





//        mArrayList=new ArrayList<Recipe>();
//     mAdapterItem=new AdapterItem(this,mArrayList);
//     //   ArrayAdapter<String> mAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, mArrayList);
//        mListView.setAdapter(mAdapterItem);
//        mAdapterItem.notifyDataSetChanged();





//// 1
//        final ArrayList<Recipe> recipeList = Recipe.getRecipesFromFile("recipes.json", this);
//// 2
//        String[] listItems = new String[recipeList.size()];
//// 3
//        for(int i = 0; i < recipeList.size(); i++){
//            Recipe recipe = recipeList.get(i);
//            listItems[i] = recipe.title;
//        }
//// 4
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);
//        mListView.setAdapter(adapter);


    }
    private List<Recipe> getListData() {
        List<Recipe> list = new ArrayList<Recipe>();

        Recipe vietnam = new Recipe("Loa", "vn","bluto");
        Recipe usa = new Recipe("danh ba", "us", "danhba");
        Recipe maill = new Recipe("mail", "ru","mail");
        Recipe loa = new Recipe("loa", "ru","loa");
        Recipe fb = new Recipe("", "ru","R.drawable.fb");
        Recipe message = new Recipe("message", "ru","message");
        list.add(vietnam);
        list.add(usa);
        list.add(fb);
        list.add(loa);
        list.add(message);
        list.add(maill);

        return list;
    }
}

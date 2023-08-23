package com.example.lifeguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;


class Item {
    private int image;
    private String name;

    public int getImage(){return image;}
    public String getName(){return name;}

    public Item(int image, String name){
        this.image = image;
        this.name = name;
    }
}


class Frag3Adapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<Item> data;
    private int layout;

    public Frag3Adapter(Context context, int layout, ArrayList<Item> data){
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position).getName();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(layout,parent,false);
        }

        Item item = data.get(position);
        ImageView image = (ImageView)convertView.findViewById(R.id.image);
        image.setImageResource(item.getImage());
        TextView name = (TextView)convertView.findViewById(R.id.name);
        name.setText(item.getName());

        return convertView;
    }
}


public class Frag3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag3, container, false);


        // 연결
        ListView listviewChat = view.findViewById(R.id.listview_chat);
        ArrayList<Item> data = new ArrayList<>();

        Item person1 = new Item(R.drawable.person_image, "임종호");
        Item person2 = new Item(R.drawable.person_image, "이재완");
        Item person3 = new Item(R.drawable.person_image, "이찬규");
        Item person4 = new Item(R.drawable.person_image, "ㅇㅇㅇ");

        data.add(person1);
        data.add(person2);
        data.add(person3);
        data.add(person4);

        Frag3Adapter adapter = new Frag3Adapter(getActivity(), R.layout.frag3_item, data);

        listviewChat.setAdapter(adapter);


        // 화면 전환
        listviewChat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), ChatRoom.class);
                startActivity(intent);
            }
        });



        return view;
    }

}




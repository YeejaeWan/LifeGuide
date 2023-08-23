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
    final private int image;
    final private String name;
    final private String message;
    final private String time;

    public int getImage(){return image;}
    public String getName(){return name;}
    public String getMessage(){return message;}
    public String getTime(){return time;}

    public Item(int image, String name, String message, String time){
        this.image = image;
        this.name = name;
        this.message = message;
        this.time = time;
    }
}


class Frag3Adapter extends BaseAdapter {

    final private LayoutInflater inflater;
    final private ArrayList<Item> data;
    final private int layout;

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

        // 아이템
        ImageView image = (ImageView)convertView.findViewById(R.id.image);
        image.setImageResource(item.getImage());

        TextView name = (TextView)convertView.findViewById(R.id.name);
        name.setText(item.getName());

        TextView message = (TextView)convertView.findViewById(R.id.message);
        message.setText(item.getMessage());

        TextView time = (TextView)convertView.findViewById(R.id.time);
        time.setText(item.getTime());

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

        Item person1 = new Item(R.drawable.profile, "이재완 상담사", "안녕하세요.", "7월 12일");
        Item person2 = new Item(R.drawable.profile, "홍현지 멘토", "어떤 부분에서 멘토링을....", "오후 1시 14분");
        Item person3 = new Item(R.drawable.profile, "임종호 상담사", "저번에 했던 상담은 괜찮나요...", "7월 8일");
        Item person4 = new Item(R.drawable.profile, "이나경 상담사", "처음 뵙습니다~", "8월 10일");
        Item person5 = new Item(R.drawable.profile, "이찬규 멘토", "상담 결과는 만족스럽나요?", "오전 10시 7분");
        Item person6 = new Item(R.drawable.profile, "김유진 상담사", "다음에 언제 시간이 되시나요...", "12월 25일");

        data.add(person1);
        data.add(person2);
        data.add(person3);
        data.add(person4);
        data.add(person5);
        data.add(person6);

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




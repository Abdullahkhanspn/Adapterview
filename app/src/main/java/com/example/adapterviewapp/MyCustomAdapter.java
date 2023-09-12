package com.example.adapterviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {
    private Context context;    //bridge between the application code and android .
    private String[] items;     //this is data source of the customize datasource.

    public MyCustomAdapter(Context context, String[]items) {
        this.context = context;
        this.items =items;
    }

    @Override
    public int getCount() {
        return items.length;  //return the number of items in your data source.
    }

    @Override
    public Object getItem(int position) {
        return items[position];     // return the data item at the given position.
    }

    @Override
    public long getItemId(int position) {
        return position;      //returns a unique identifier for the item at the given position.
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        // Agr List me phelle se koi item nhi hai to create views
        if (convertView==null){
            //ConvertView = is a recycled view that you can reuse to improve the
            // performance of your list.
            convertView= LayoutInflater.from(context).
                    inflate(R.layout.mylist_item,parent,false);

            holder=new ViewHolder();
            holder.textView=convertView.findViewById(R.id.text1);
            convertView.setTag(holder);

        }
        // Agr items ko recycle ya reuse karna hai whi wale to ye use karege.
        else{
            //Reusing the view that (recycled)
            holder=(ViewHolder) convertView.getTag();
        }
        holder.textView.setText(items[position]);
        // Binding data to the views with in the convertView.
        return convertView; //Display the data in the data set.
    }

    static class ViewHolder{
        // Holds references to the views with in a item layout.
        TextView textView;
    }
}

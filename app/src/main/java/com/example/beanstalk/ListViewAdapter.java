package com.example.beanstalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    Context Context = null;
    LayoutInflater LayoutInflater = null;
    ArrayList<CertificateData> certificate;

    public ListViewAdapter(Context context, ArrayList<CertificateData> data){
        Context = context;
        certificate = data;
        LayoutInflater = android.view.LayoutInflater.from(Context);
    }

    @Override
    public int getCount() {
        return certificate.size();
    }

    @Override
    public CertificateData getItem(int i) {
        return certificate.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = LayoutInflater.inflate(R.layout.listview_item, null);

        TextView cerName = (TextView) view1.findViewById(R.id.item_name);
        TextView write_price = (TextView) view1.findViewById(R.id.write_price);
        TextView practical_price = (TextView) view1.findViewById(R.id.practical_price);
        TextView cerAgency = (TextView) view1.findViewById(R.id.item_agency);

        cerName.setText(certificate.get(i).getName());
        write_price.setText(certificate.get(i).getWrite_price());
        practical_price.setText(certificate.get(i).getPractical_price());
        cerAgency.setText(certificate.get(i).getAgency());

        return view1;
    }
}
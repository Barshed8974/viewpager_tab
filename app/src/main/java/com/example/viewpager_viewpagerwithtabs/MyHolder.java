package com.example.viewpager_viewpagerwithtabs;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    private TextView tv;
    public MyHolder(@NonNull View itemView) {
        super(itemView);
        initview();
    }

    private void initview() {
        tv=itemView.findViewById(R.id.tv1);
    }
    public void setData(Model model)
    {
        tv.setText(model.getS());
    }
}

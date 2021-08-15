package com.example.asus.sleepkeeper;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {
    private com.example.asus.sleepkeeper.CircleImageView sreport;
    private com.example.asus.sleepkeeper.CircleImageView datasave;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_manage, null);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        sreport=(com.example.asus.sleepkeeper.CircleImageView) getActivity().findViewById(R.id.s_report);
        sreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
        datasave=(com.example.asus.sleepkeeper.CircleImageView) getActivity().findViewById(R.id.datasave);
        datasave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), DataActivity.class);
                startActivity(intent);
            }
        });
    }
}
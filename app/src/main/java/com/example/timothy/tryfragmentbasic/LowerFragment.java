package com.example.timothy.tryfragmentbasic;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.SentenceSuggestionsInfo;
import android.widget.TextView;

public class LowerFragment extends Fragment {

    // Required empty public constructor
    public LowerFragment() {}

    TextView tvLowerFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_lower, container, false);
        tvLowerFragment = (TextView) rootView.findViewById(R.id.tvLowerFragment);
        return rootView;
    }

    public void updateSentence(String newSentence){
        tvLowerFragment.setText(newSentence);
    }
}

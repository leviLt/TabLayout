package com.android.customtablayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment extends Fragment {
    private static final String TAG = "BlankFragment";
    private TextView mTextView;
    private String string;

    public BlankFragment() {
        // Required empty public constructor
    }


    public static BlankFragment newInstance(String param) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(TAG, param);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            string = getArguments().getString(TAG);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        mTextView = view.findViewById(R.id.tv);
        mTextView.setText(string);
        return view;
    }

}

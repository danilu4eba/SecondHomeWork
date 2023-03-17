package com.example.secondhomework;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FifthFragment extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews();
        Bundle();
    }

    private void findViews() {
        textView = requireActivity().findViewById(R.id.tv_of_fifth_fragment);
    }

    public void Bundle() {
        if (getArguments() != null) {
            if (getArguments().getString("key") != null) {
                textView.setText(getArguments().getString("key"));

            } else if (getArguments().getString("keyTwo") != null) {
                textView.setText(getArguments().getString("keyTwo"));

            } else if (getArguments().getString("keyThree") != null) {
                textView.setText(getArguments().getString("keyThree"));
            }
        }
    }
}

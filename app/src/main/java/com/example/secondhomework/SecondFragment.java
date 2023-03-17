package com.example.secondhomework;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
public class SecondFragment extends Fragment {
    private View buttonToFifthFragment;
    private EditText editTextInSecondFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews();
        clickListeners();
    }

    private void findViews() {
        buttonToFifthFragment = requireActivity().findViewById(R.id.button_to_fifth_fragment);
        editTextInSecondFragment = requireActivity().findViewById(R.id.et_of_second_fragment);
    }

    private void clickListeners() {
        buttonToFifthFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToFifthFragment();
            }
        });
    }

    private void navigateToFifthFragment() {
        if (!editTextInSecondFragment.getText().toString().isEmpty()) {
            FifthFragment fragment = new FifthFragment();
            String editText = editTextInSecondFragment.getText().toString();
            Bundle bundle = new Bundle();
            bundle.putString("key", editText);
            fragment.setArguments(bundle);
            requireActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container_view, fragment)
                    .commit();
        } else {
            Toast.makeText(getContext(), "incorrect", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.secondhomework;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {

    private View firstButtonNavigation;
    private View secondButtonNavigation;
    private View thirdButtonNavigation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews();
        clickListeners();
    }

    private void findViews() {
        firstButtonNavigation = requireActivity().findViewById(R.id.first_button);
        secondButtonNavigation = requireActivity().findViewById(R.id.second_button);
        thirdButtonNavigation = requireActivity().findViewById(R.id.third_button);
    }

    private void clickListeners() {
        firstButtonNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToSecondFragment();
            }
        });
        secondButtonNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToThirdFragment();
            }
        });
        thirdButtonNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToFourthFragment();
            }
        });
    }

    private void navigateToSecondFragment() {
        requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, new SecondFragment())
                .addToBackStack(null)
                .commit();
    }

    private void navigateToThirdFragment() {
        requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, new ThirdFragment())
                .commit();
    }

    private void navigateToFourthFragment() {
        requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, new FourthFragment())
                .commit();
    }
}
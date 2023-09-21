package com.example.testviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.testviewpager.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ActivityMainBinding binding;
    ArrayList<Fragment> list = new ArrayList<>();
    ChatFragment chatFragment;
    StatusFragment statusFragment;
    FragmentMyPagerAdapter fragmentMyPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        chatFragment = new ChatFragment();
        statusFragment = new StatusFragment();

        list.add(chatFragment);
        list.add(statusFragment);

        fragmentMyPagerAdapter = new FragmentMyPagerAdapter(this,list);
        binding.viewPagerContainer.setAdapter(fragmentMyPagerAdapter);
    }
}
package com.example.eswcon2021;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class ScheduleSaturday extends Fragment {

    private ListView listView;
    public static SharedPreferences sharedPreferences;
    public static String selectedEvent;

    public ScheduleSaturday() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_schedule_saturday, container, false);
        listView = view.findViewById(R.id.listviewsat);

        setupListView();

        sharedPreferences = getActivity().getSharedPreferences("Event", Context.MODE_PRIVATE);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(getActivity(), ScheduleDetailedSat.class));
                        sharedPreferences.edit().putString(selectedEvent, "slot1").apply();
                        break;
                    case 1:
                        startActivity(new Intent(getActivity(), ScheduleDetailedSat.class));
                        sharedPreferences.edit().putString(selectedEvent, "slot2").apply();
                        break;
                    case 2:
                        startActivity(new Intent(getActivity(), ScheduleDetailedSat.class));
                        sharedPreferences.edit().putString(selectedEvent, "slot3").apply();
                        break;
                    case 3:
                        startActivity(new Intent(getActivity(), ScheduleDetailedSat.class));
                        sharedPreferences.edit().putString(selectedEvent, "slot4").apply();
                        break;
                    case 4:
                        startActivity(new Intent(getActivity(), ScheduleDetailedSat.class));
                        sharedPreferences.edit().putString(selectedEvent, "slot5").apply();
                        break;
                    case 5:
                        startActivity(new Intent(getActivity(), ScheduleDetailedSat.class));
                        sharedPreferences.edit().putString(selectedEvent, "slot6").apply();
                        break;
                    case 6:
                        startActivity(new Intent(getActivity(), ScheduleDetailedSat.class));
                        sharedPreferences.edit().putString(selectedEvent, "slot7").apply();
                        break;
                    default: break;
                }
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    private void setupListView()
    {
        String[] event = getResources().getStringArray(R.array.EventsSaturday);
        String[] time = getResources().getStringArray(R.array.TimeSaturday);
        String[] location = getResources().getStringArray(R.array.LocationSaturday);

        SectionsListAdapter adapter = new SectionsListAdapter(getActivity(), event, time, location); // Replaced from "this"
        listView.setAdapter(adapter);
    }

}
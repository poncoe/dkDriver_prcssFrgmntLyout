package dkdriver_processfragmentlayout.kataponcoe.id.dkdriver_processfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by docotel on 3/7/16.
 */
public class ProsesFragment extends Fragment {

    private RecyclerView listMember;
    private LinearLayoutManager linearLayoutManager;
    private ProsesListAdapter prosesListAdapter;

    protected Context context;

    public static ProsesFragment newInstance(){
        return new ProsesFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_proses, container, false);

        listMember = (RecyclerView) rootView.findViewById(R.id.listProses);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        linearLayoutManager = new LinearLayoutManager(context);
        prosesListAdapter = new ProsesListAdapter();

        listMember.setLayoutManager(linearLayoutManager);
        listMember.setAdapter(prosesListAdapter);

        loadData();
    }

    private void loadData(){
        List<Proses> prosesList = new ArrayList<>();
        Proses proses;

        String name[] = {"Poncoe", "Panda",
                "Gembul", "Munjul"};

        String team[] = {"DKantin HQ", "Pet Shop",
                "Warung Indomie", "Cafe Munjul"};

        String time[] = {"Jalan Makanan Enak no 3 Blok C, Bandung Jawa Barat",
                "Jalan Makanan Enak no 4 Blok D, Bandung Jawa Barat", "Jalan Makanan Enak no 5 Blok E, Bandung Jawa Barat", "Jalan Makanan Enak no 6 Blok F, Bandung Jawa Barat"};

        for(int i=0; i < name.length; i++){
            proses = new Proses();

            proses.setId(i+1);
            proses.setName(name[i]);
            proses.setTeam(team[i]);
            proses.setTime(time[i]);

            prosesList.add(proses);
        }

        prosesListAdapter.addAll(prosesList);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
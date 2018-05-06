package dkdriver_processfragmentlayout.kataponcoe.id.dkdriver_processfragment;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by docotel on 3/7/16.
 */
public class ProsesListAdapter extends RecyclerView.Adapter<ProsesListAdapter.MemberViewHolder>{

    private List<Proses> prosesList;

    public ProsesListAdapter() {
        prosesList = new ArrayList<>();
    }

    private void add(Proses item) {
        prosesList.add(item);
        notifyItemInserted(prosesList.size() - 1);
    }

    public void addAll(List<Proses> prosesList) {
        for (Proses proses : prosesList) {
            add(proses);
        }
    }

    public void remove(Proses item) {
        int position = prosesList.indexOf(item);
        if (position > -1) {
            prosesList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public Proses getItem(int position){
        return prosesList.get(position);
    }

    @Override
    public MemberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_proses, parent, false);
        MemberViewHolder memberViewHolder = new MemberViewHolder(view);
        return memberViewHolder;
    }

    @Override
    public void onBindViewHolder(MemberViewHolder holder, int position) {
        final Proses proses = prosesList.get(position);

        holder.memberName.setText(proses.getName());
        holder.memberTeam.setText(proses.getTeam());
        holder.memberTime.setText(proses.getTime());

        //Setting Func Selesai, Cancel & Tunda
        holder.btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Akhirnya Selesai Juga", Snackbar.LENGTH_LONG).show();
            }
        });
        holder.btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Cancel aja ah Jauh", Snackbar.LENGTH_LONG).show();
            }
        });
        holder.btnTunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Tunda Dulu, Lagi Banyak Orderan", Snackbar.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return prosesList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    static class MemberViewHolder extends RecyclerView.ViewHolder {

        TextView memberName;
        TextView memberTeam;
        TextView memberTime;
        public Button btnSelesai;
        public Button btnCancel;
        public Button btnTunda;

        public MemberViewHolder(View itemView) {
            super(itemView);

            memberName = (TextView) itemView.findViewById(R.id.name);
            memberTeam = (TextView) itemView.findViewById(R.id.team);
            memberTime = (TextView) itemView.findViewById(R.id.time);
            btnSelesai = (Button) itemView.findViewById(R.id.btn_selesai);
            btnCancel = (Button) itemView.findViewById(R.id.btn_cancel);
            btnTunda = (Button) itemView.findViewById(R.id.btn_tunda);
        }
    }
}

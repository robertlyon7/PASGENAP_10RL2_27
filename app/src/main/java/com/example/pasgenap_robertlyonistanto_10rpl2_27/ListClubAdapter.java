package com.example.pasgenap_robertlyonistanto_10rpl2_27;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListClubAdapter extends RecyclerView.Adapter<ListClubAdapter.ListViewHolder> {
    private ArrayList<Club> listClub;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListClubAdapter(ArrayList<Club> list){
        this.listClub = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_club, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListClubAdapter.ListViewHolder holder, int position) {
        Club club = listClub.get(position);
        Glide.with(holder.itemView.getContext())
                .load(club.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(club.getName());
        holder.tvDetail.setText(club.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listClub.get(holder.getAbsoluteAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listClub.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        CardView cardView;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_club);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_item_detail);
            cardView = itemview.findViewById(R.id.mCardView);
            cardView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Select an option");
            menu.add(this.getAbsoluteAdapterPosition(), 01, 0, "Delete This Item");
            menu.add(this.getAbsoluteAdapterPosition(), 02, 1, "Favorite");
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Club data);
    }

    public void removeItem (int position){
        listClub.remove(position);
        notifyDataSetChanged();
    }
}

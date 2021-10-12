package com.androidmarket.pdfcreator.adapter;

import androidx.annotation.NonNull;
import com.google.android.material.card.MaterialCardView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import androidmarket.R;
import com.androidmarket.pdfcreator.interfaces.OnItemClickListener;
import com.androidmarket.pdfcreator.pdfModel.EnhancementOptionsEntity;

public class AdapterEnhancementOptions
        extends RecyclerView.Adapter<AdapterEnhancementOptions.EnhancementOptionsViewHolder> {

    private final OnItemClickListener mOnItemClickListener;
    private final List<EnhancementOptionsEntity> mEnhancementOptionsEntityList;

    public AdapterEnhancementOptions(OnItemClickListener mOnItemClickListener,
                                     List<EnhancementOptionsEntity> mEnhancementOptionsEntityList) {
        this.mOnItemClickListener = mOnItemClickListener;
        this.mEnhancementOptionsEntityList = mEnhancementOptionsEntityList;
    }

    @NonNull
    @Override
    public EnhancementOptionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view_enhancement_option, parent, false);
        return new EnhancementOptionsViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull EnhancementOptionsViewHolder holder, int position) {
        holder.optionImage.setImageDrawable(mEnhancementOptionsEntityList.get(position).getImage());
        holder.optionName.setText(mEnhancementOptionsEntityList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mEnhancementOptionsEntityList.size();
    }

    public class EnhancementOptionsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.option_image)
        ImageView optionImage;
        @BindView(R.id.option_name)
        TextView optionName;

        CardView cardView;

        EnhancementOptionsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
            cardView = itemView.findViewById(R.id.container_card_view);
        }

        @Override
        public void onClick(View view) {
            mOnItemClickListener.onItemClick(getAdapterPosition());
        }
    }
}

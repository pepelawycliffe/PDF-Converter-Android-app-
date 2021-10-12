package com.androidmarket.pdfcreator.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.androidmarket.pdfcreator.pdfModel.PreviewImageOptionItem;

import androidmarket.R;

public class AdapterPreviewImageOptions extends RecyclerView.Adapter<AdapterPreviewImageOptions.ViewHolder> {
    private final ArrayList<PreviewImageOptionItem> mOptions;
    private final Context mContext;
    private final OnItemClickListener mOnItemClickListener;

    public AdapterPreviewImageOptions(OnItemClickListener onItemClickListener,
                                      ArrayList<PreviewImageOptionItem> optionItems, Context context) {
        mOnItemClickListener = onItemClickListener;
        mOptions = optionItems;
        mContext = context;
    }

    @NonNull
    @Override
    public AdapterPreviewImageOptions.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_preview_image_options,
                parent, false);
        return new AdapterPreviewImageOptions.ViewHolder(view);
    }

    @SuppressLint("NewApi")
    @Override
    public void onBindViewHolder(@NonNull AdapterPreviewImageOptions.ViewHolder holder, int position) {
        int imageId = mOptions.get(position).getOptionImageId();
        holder.imageView.setImageDrawable(mContext.getDrawable(imageId));
        holder.textView.setText(mOptions.get(position).getOptionName());
    }

    @Override
    public int getItemCount() {
        return mOptions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        final ImageView imageView;
        final TextView textView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.option_image);
            textView = itemView.findViewById(R.id.option_name);
            imageView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            mOnItemClickListener.onItemClick(getAdapterPosition());
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}

package com.example.rahul.imagegallery.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.rahul.imagegallery.R;
import com.example.rahul.imagegallery.model.ImageList;

import java.util.List;

/**
 * Created by Rahul on 1/12/17.
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageHolder> {

    private List<ImageList> imageData;
    private LayoutInflater inflater;
    private ItemClickCallback itemClickCallback;

    public ImageAdapter(List<ImageList> imageData, Context context) {

        this.inflater = LayoutInflater.from(context);
        this.imageData = imageData;
    }

    public void setItemClickCallback(final ItemClickCallback itemClickCallback) {
        this.itemClickCallback = itemClickCallback;
    }

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ImageHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {
        ImageList list = imageData.get(position);
        holder.imageView.setImageResource(list.getImageResId());

    }

    @Override
    public int getItemCount() {
        return imageData.size();
    }

    public interface ItemClickCallback {
        void onItemClick(int p);

    }

    class ImageHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageView;
        private View container;

        public ImageHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.item_image);
            container = itemView.findViewById(R.id.item_container);
            container.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.item_container) {
                itemClickCallback.onItemClick(getAdapterPosition());
            }
        }
    }
}

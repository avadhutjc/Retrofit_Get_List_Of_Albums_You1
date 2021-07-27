package com.masai.a1414july_get_list_of_albums_you1;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlbumViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvId;
    private TextView mTvTitle;

    public AlbumViewHolder(@NonNull View itemView) {
        super(itemView);
        iniView(itemView);
    }

    private void iniView(View itemView) {
        mTvId = itemView.findViewById(R.id.tvId);
        mTvTitle = itemView.findViewById(R.id.tvTitle);
    }

    public void setData(ResponseModel responseModel) {
        mTvId.setText(responseModel.getTitle());
        //if I add ..mTvTitle.setText(responseModel.getUserId() + ""); it works
        mTvTitle.setText(responseModel.getTitle());
    }
}

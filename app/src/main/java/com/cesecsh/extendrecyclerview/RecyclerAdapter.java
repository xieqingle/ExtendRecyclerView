package com.cesecsh.extendrecyclerview;

import android.content.Context;

import com.cesecsh.extendrecyclerview.baseAdapter.BaseRecyclerViewHolder;
import com.cesecsh.extendrecyclerview.baseAdapter.CommonRecyclerAdapter;

import java.util.List;

/**
 * ExtendRecyclerView
 * Created by RockQ on 2017/2/20.
 */

public class RecyclerAdapter extends CommonRecyclerAdapter<String> {
    private Context context;
    private List<String> datas;

    public RecyclerAdapter(Context context, int layoutId, List<String> datas) {
        super(context, layoutId, datas);
        this.context = context;
        this.datas = datas;

    }

    @Override
    protected void convert(BaseRecyclerViewHolder holder, String s, int position) {
        holder.setText(R.id.text_view, s);
    }

}

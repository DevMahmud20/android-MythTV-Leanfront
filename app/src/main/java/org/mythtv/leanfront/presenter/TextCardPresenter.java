package org.mythtv.leanfront.presenter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.leanback.widget.Presenter;

import org.mythtv.leanfront.model.GuideSlot;

public class TextCardPresenter extends Presenter {
    private Context mContext;

    public TextCardPresenter(Context context) {
        super();
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new ViewHolder(new TextCardView(mContext));
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        ((TextCardView)viewHolder.view).updateUi((GuideSlot) item);
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {
        ((TextCardView)viewHolder.view).updateUi(null);
    }
}

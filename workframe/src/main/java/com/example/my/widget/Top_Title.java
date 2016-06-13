package com.example.my.widget;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.my.R;
import com.example.utils.ScreenUtils;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2016/6/8 0008.
 */
public class Top_Title extends LinearLayout {


    private Context mContext;
    private TextView top_title;
    private Toolbar toolbar;
    private ImageView top_back;

    public Top_Title(Context context) {
        super(context);
        mContext = context;
        getView();
    }

    public Top_Title(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        getView();
    }

    public Top_Title(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        getView();
    }

    private void getView() {
        View view = inflate(mContext, R.layout.top_title, this);
        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setTitle("");
        top_title = (TextView) view.findViewById(R.id.top_title);
        top_back = (ImageView) view.findViewById(R.id.top_back);
//        initTopBar(view);
    }

    public void setOnClickLeftBack(final Activity activity){
        top_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(activity!=null){
                    activity.finish();
                }
            }
        });
    }

    public void setLeftView(int visibility){
        top_back.setVisibility(visibility);
    }

    public Toolbar getToolbar(){
        return toolbar;
    }

    public void setTitle(CharSequence text) {
        top_title.setText(text);
    }
    public void setTitle(int text) {
        top_title.setText(text);
    }

//    private void initTopBar(View view) {
//        int height= ScreenUtils.getScreenHeight(mContext);
//        view.setLayoutParams(new LinearLayout.LayoutParams(
//                LayoutParams.MATCH_PARENT, height / 2, 0));
//    }
}

package com.personage.myolq.mvp.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.widget.rippleclick.Click_Text;
import com.personage.myolq.R;
import com.personage.myolq.base.InitFragment;
import com.personage.myolq.bmob.model.UserModel;
import com.personage.myolq.mvp.view.activity.LoginActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.bmob.newim.BmobIM;

/**
 * Created by Administrator on 2016/6/21 0021.
 */
public class SetFragment extends InitFragment {
    @Bind(R.id.click_exit)
    Click_Text clickExit;

    @Override
    public int getFragmentLayout() {
        return R.layout.fragment_set;
    }

    @Override
    public void getFragmentCreateView() {
        clickExit.setOnClickListener(new Click_Text.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserModel.getInstance().logout();
                //可断开连接
                BmobIM.getInstance().disConnect();
                getActivity().finish();
                startActivity(LoginActivity.class,null);
            }
        });
    }


}

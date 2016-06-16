package com.personage.myolq.mvp.view.activity;

import android.widget.EditText;

import com.example.my.mvp.base.BaseActivity;
import com.example.utils.L;
import com.example.utils.StringUtils;
import com.example.utils.ToastUtil;
import com.personage.myolq.R;
import com.personage.myolq.mvp.iuiview.IUiRegisterView;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * A login screen that offers login via email/password.
 */
public class RegisterActivity extends BaseActivity implements IUiRegisterView {


    @Bind(R.id.et_email)
    EditText etEmail;
    @Bind(R.id.et_password)
    EditText etPassword;
    @Bind(R.id.et_password1)
    EditText etPassword1;
    @Bind(R.id.et_username)
    EditText etUsername;
    @Bind(R.id.et_mobile)
    EditText etMobile;
//    private TestPresenter mLoginPresenter;

    @Override
    protected void setLayout() {
        setContentView(R.layout.activity_test2);
        setTitle(R.string.title_activity_register);
        setLeftOnBack();
//        mLoginPresenter = new TestPresenterImpl(this);
    }

    @Override
    protected void getonCreate() {

    }

    @OnClick(R.id.tv_register)
    public void onregister() {
        if(StringUtils.isNull(getemail())){
            ToastUtil.show(this,getString(R.string.username_isnull));
            return;
        }
        if(StringUtils.isNull(getPassWord())){
            ToastUtil.show(this,getString(R.string.userpass_isnull));
            return;
        }
        if(StringUtils.isNull(getPassWord1())){
            ToastUtil.show(this,getString(R.string.userpass_isnull));
            return;
        }
        if(StringUtils.isEquals(getPassWord(),getPassWord1())){
            ToastUtil.show(this,getString(R.string.userpass_isequest));
            return;
        }
        if(StringUtils.isNull(getUserName())){
            ToastUtil.show(this,getString(R.string.mobile_isnull));
            return;
        }
        L.log(getemail()+"++"+getMobile()+"++"+getUserName()+"++"+getPassWord());
//        mLoginPresenter.getReg(this,getemail(),getMobile(),getUserName(),getPassWord());
    }

    @Override
    public String getemail() {
        return etEmail.getText().toString().trim();
    }

    @Override
    public String getPassWord() {
        return etPassword.getText().toString().trim();
    }

    @Override
    public String getPassWord1() {
        return etPassword1.getText().toString().trim();
    }


    @Override
    public String getUserName() {
        return etUsername.getText().toString().trim();
    }

    @Override
    public String getMobile() {
        return etMobile.getText().toString().trim();
    }


    @Override
    public void onSucceed(Object object) {
        finish();
    }

    @Override
    public void onFailure(Throwable t) {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onToast(String text) {
        ToastUtil.show(this,text);
    }



}


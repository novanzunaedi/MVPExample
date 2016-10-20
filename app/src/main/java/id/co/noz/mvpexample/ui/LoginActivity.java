package id.co.noz.mvpexample.ui;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.co.noz.mvpexample.BuildConfig;
import id.co.noz.mvpexample.R;
import id.co.noz.mvpexample.login.LoginPresenter;
import id.co.noz.mvpexample.login.iLoginView;

public class LoginActivity extends AppCompatActivity implements iLoginView {

    @BindView(R.id.btnLogin) Button btnLogin;
    @BindView(R.id.etEmail) EditText etbfEmail;
    @BindView(R.id.etPassword) EditText etbfPassword;

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if(BuildConfig.DEBUG){
            etbfEmail.setText("novan@gmail.com");
            etbfPassword.setText("password");
        }

        presenter = new LoginPresenter(this);
    }

    @OnClick(R.id.btnLogin)
    public void loginTapped(View view){
        String email = etbfEmail.getText().toString();
        String passwod = etbfPassword.getText().toString();
        presenter.attemptLogin(email, passwod);
    }

    @Override
    public void navigatedToListActivity() {
        Toast.makeText(this, "Login Suksess...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this, "Login Failed... ", Toast.LENGTH_SHORT).show();
    }
}

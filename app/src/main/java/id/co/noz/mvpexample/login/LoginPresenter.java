package id.co.noz.mvpexample.login;

import id.co.noz.mvpexample.ui.LoginActivity;

/**
 * Created by CLient-Pc on 21/10/2016.
 */

public class LoginPresenter {

    private iLoginView view;
    private SynchronousLoginInteractor interactor;

    public LoginPresenter(iLoginView loginView) {
        this.view = loginView;
        this.interactor = new SynchronousLoginInteractor();
    }

    public void attemptLogin(String username, String password){
        boolean isValid = interactor.validatedCredentials(username, password);
        if(isValid) view.navigatedToListActivity();
        else view.loginFailed();
    }
}



























































































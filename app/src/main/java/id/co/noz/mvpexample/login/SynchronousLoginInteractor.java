package id.co.noz.mvpexample.login;

/**
 * Created by CLient-Pc on 21/10/2016.
 */

public class SynchronousLoginInteractor implements iLoginInteractor{


    public SynchronousLoginInteractor(){

    }

    public boolean validatedCredentials(String username, String password){
        return username.contains("gmail");
    }

}

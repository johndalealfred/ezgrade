package fueledbysushi.ezgrade.activities;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.common.SignInButton;

import fueledbysushi.ezgrade.R;

/**
 * Created by Johndale Alfred Julian on 3/8/2018.
 */

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SignInButton googleSigninButton = (SignInButton) findViewById(R.id.google_signin_btn);
        googleSigninButton.setSize(SignInButton.SIZE_WIDE);
    }
}

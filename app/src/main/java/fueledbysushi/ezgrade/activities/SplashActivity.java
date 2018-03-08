package fueledbysushi.ezgrade.activities;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import fueledbysushi.ezgrade.R;
import fueledbysushi.ezgrade.firebase.FirebaseReferences;
import fueledbysushi.ezgrade.firebase.FirebaseUtils;
import fueledbysushi.ezgrade.models.ProjectSettings;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getProjectSettings();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        new Handler().postDelayed(runnable, 1000);

    }

    private void getProjectSettings() {
        FirebaseUtils.getFirebaseDatabase()
                .child(FirebaseReferences.PROJECT_SETTINGS)
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        ProjectSettings pj = dataSnapshot.getValue(ProjectSettings.class);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
    }
}

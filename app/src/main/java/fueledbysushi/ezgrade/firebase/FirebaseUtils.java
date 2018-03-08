package fueledbysushi.ezgrade.firebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Johndale Alfred Julian on 3/8/2018.
 */

public class FirebaseUtils {
    public static DatabaseReference getFirebaseDatabase() {
        return FirebaseDatabase.getInstance().getReference();
    }
}

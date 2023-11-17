package p078f6;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: f6.b */
public final /* synthetic */ class C6161b implements Comparator {

    /* renamed from: d */
    public static final /* synthetic */ C6161b f19141d = new C6161b();

    private /* synthetic */ C6161b() {
    }

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).mo11897v().compareTo(((Scope) obj2).mo11897v());
    }
}

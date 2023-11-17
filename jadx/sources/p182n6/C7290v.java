package p182n6;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p156l6.C6942g;

/* renamed from: n6.v */
public abstract class C7290v implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static C7290v m27943b(Activity activity, Intent intent, int i) {
        return new C7287t(intent, activity, i);
    }

    /* renamed from: c */
    public static C7290v m27944c(C6942g gVar, Intent intent, int i) {
        return new C7289u(intent, gVar, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21660a();

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo21660a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}

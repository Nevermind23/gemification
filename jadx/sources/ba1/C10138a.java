package ba1;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import kotlin.jvm.internal.C41536l;

/* renamed from: ba1.a */
public final class C10138a {

    /* renamed from: a */
    public static final C10138a f28118a = new C10138a();

    /* renamed from: b */
    private static String f28119b;

    private C10138a() {
    }

    /* renamed from: a */
    public final void mo26660a(Context context) {
        C41536l.m120489i(context, "context");
        f28119b = Build.SERIAL + '_' + Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}

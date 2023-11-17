package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.content.Context;
import p572qf.C17496a;
import p627uf.C18154b;
import p627uf.C18156d;

/* renamed from: dagger.hilt.android.internal.managers.e */
public abstract class C12064e {
    /* renamed from: a */
    public static Object m44264a(Context context) {
        Application a = C17496a.m60996a(context.getApplicationContext());
        C18156d.m62246a(a instanceof C18154b, "Hilt BroadcastReceiver must be attached to an @AndroidEntryPoint Application. Found: %s", a.getClass());
        return ((C18154b) a).generatedComponent();
    }
}

package p313x7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C3847a;
import p157l7.C6983e;

/* renamed from: x7.a */
public abstract class C8972a {

    /* renamed from: a */
    private static final C3847a.C3856g f24979a;

    /* renamed from: b */
    private static final C3847a.C3848a f24980b;

    /* renamed from: c */
    public static final C3847a f24981c;

    static {
        C3847a.C3856g gVar = new C3847a.C3856g();
        f24979a = gVar;
        C8975d dVar = new C8975d();
        f24980b = dVar;
        f24981c = new C3847a("TapAndPay.TAP_AND_PAY_API", dVar, gVar);
    }

    /* renamed from: a */
    public static C8973b m33242a(Activity activity) {
        return new C6983e(activity);
    }

    /* renamed from: b */
    public static C8973b m33243b(Context context) {
        return new C6983e(context);
    }
}

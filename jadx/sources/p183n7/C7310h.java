package p183n7;

import android.content.Context;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.location.C4527a;
import p118i7.C6590c;
import p118i7.C6593d0;
import p118i7.C6604o;

/* renamed from: n7.h */
public abstract class C7310h {

    /* renamed from: a */
    public static final C3847a f21507a;

    /* renamed from: b */
    public static final C7295a f21508b = new C6593d0();

    /* renamed from: c */
    public static final C7302d f21509c = new C6590c();

    /* renamed from: d */
    public static final C7314j f21510d = new C6604o();

    /* renamed from: e */
    private static final C3847a.C3856g f21511e;

    /* renamed from: f */
    private static final C3847a.C3848a f21512f;

    static {
        C3847a.C3856g gVar = new C3847a.C3856g();
        f21511e = gVar;
        C7303d0 d0Var = new C7303d0();
        f21512f = d0Var;
        f21507a = new C3847a("LocationServices.API", d0Var, gVar);
    }

    /* renamed from: a */
    public static C4527a m27978a(Context context) {
        return new C4527a(context);
    }

    /* renamed from: b */
    public static C7304e m27979b(Context context) {
        return new C7304e(context);
    }

    /* renamed from: c */
    public static C7316k m27980c(Context context) {
        return new C7316k(context);
    }
}

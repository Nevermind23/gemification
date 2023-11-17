package p274u7;

import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.Scope;

/* renamed from: u7.d */
public abstract class C8644d {

    /* renamed from: a */
    public static final C3847a.C3856g f24422a;

    /* renamed from: b */
    public static final C3847a.C3856g f24423b;

    /* renamed from: c */
    public static final C3847a.C3848a f24424c;

    /* renamed from: d */
    static final C3847a.C3848a f24425d;

    /* renamed from: e */
    public static final Scope f24426e = new Scope("profile");

    /* renamed from: f */
    public static final Scope f24427f = new Scope("email");

    /* renamed from: g */
    public static final C3847a f24428g;

    /* renamed from: h */
    public static final C3847a f24429h;

    static {
        C3847a.C3856g gVar = new C3847a.C3856g();
        f24422a = gVar;
        C3847a.C3856g gVar2 = new C3847a.C3856g();
        f24423b = gVar2;
        C8642b bVar = new C8642b();
        f24424c = bVar;
        C8643c cVar = new C8643c();
        f24425d = cVar;
        f24428g = new C3847a("SignIn.API", bVar, gVar);
        f24429h = new C3847a("SignIn.INTERNAL_API", cVar, gVar2);
    }
}

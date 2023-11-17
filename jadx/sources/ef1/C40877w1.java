package ef1;

import kotlinx.coroutines.internal.C41584a0;

/* renamed from: ef1.w1 */
public abstract class C40877w1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C41584a0 f96587a = new C41584a0("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C41584a0 f96588b = new C41584a0("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C41584a0 f96589c = new C41584a0("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C41584a0 f96590d = new C41584a0("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C41584a0 f96591e = new C41584a0("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C40879x0 f96592f = new C40879x0(false);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C40879x0 f96593g = new C40879x0(true);

    /* renamed from: g */
    public static final Object m118568g(Object obj) {
        return obj instanceof C40824j1 ? new C40829k1((C40824j1) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m118569h(Object obj) {
        C40824j1 j1Var;
        C40829k1 k1Var = obj instanceof C40829k1 ? (C40829k1) obj : null;
        return (k1Var == null || (j1Var = k1Var.f96543a) == null) ? obj : j1Var;
    }
}

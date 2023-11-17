package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.n */
public abstract class C41609n {

    /* renamed from: a */
    private static final Object f97810a = new C41584a0("CONDITION_FALSE");

    /* renamed from: b */
    private static final Object f97811b = new C41584a0("LIST_EMPTY");

    /* renamed from: a */
    public static final Object m120712a() {
        return f97810a;
    }

    /* renamed from: b */
    public static final C41610o m120713b(Object obj) {
        C41610o oVar;
        C41625x xVar = obj instanceof C41625x ? (C41625x) obj : null;
        return (xVar == null || (oVar = xVar.f97836a) == null) ? (C41610o) obj : oVar;
    }
}

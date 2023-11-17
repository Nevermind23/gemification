package p172m9;

/* renamed from: m9.e */
public class C7146e {

    /* renamed from: a */
    public final String f21155a;

    /* renamed from: b */
    public final String f21156b;

    /* renamed from: c */
    public final StackTraceElement[] f21157c;

    /* renamed from: d */
    public final C7146e f21158d;

    public C7146e(Throwable th, C7145d dVar) {
        C7146e eVar;
        this.f21155a = th.getLocalizedMessage();
        this.f21156b = th.getClass().getName();
        this.f21157c = dVar.mo21397a(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            eVar = new C7146e(cause, dVar);
        } else {
            eVar = null;
        }
        this.f21158d = eVar;
    }
}

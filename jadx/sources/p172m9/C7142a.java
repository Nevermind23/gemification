package p172m9;

/* renamed from: m9.a */
public class C7142a implements C7145d {

    /* renamed from: a */
    private final int f21150a;

    /* renamed from: b */
    private final C7145d[] f21151b;

    /* renamed from: c */
    private final C7143b f21152c;

    public C7142a(int i, C7145d... dVarArr) {
        this.f21150a = i;
        this.f21151b = dVarArr;
        this.f21152c = new C7143b(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo21397a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f21150a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C7145d dVar : this.f21151b) {
            if (stackTraceElementArr2.length <= this.f21150a) {
                break;
            }
            stackTraceElementArr2 = dVar.mo21397a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f21150a) {
            return this.f21152c.mo21397a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}

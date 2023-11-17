package p342j$.util.stream;

/* renamed from: j$.util.stream.u1 */
class C9726u1 extends C9731v1 {

    /* renamed from: c */
    public final /* synthetic */ int f26493c;

    /* renamed from: d */
    private final Object f26494d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9726u1(C9534E0 e0, Object obj) {
        this((C9539F0) e0, obj, 0);
        this.f26493c = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9726u1(C9539F0 f0, Object obj, int i) {
        super(f0);
        this.f26493c = i;
        this.f26494d = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9726u1(C9539F0 f0, Object[] objArr) {
        this(f0, (Object) objArr, 1);
        this.f26493c = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9726u1(C9726u1 u1Var, C9534E0 e0, int i) {
        super(u1Var, e0, i);
        this.f26493c = 0;
        this.f26494d = u1Var.f26494d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9726u1(C9726u1 u1Var, C9539F0 f0, int i) {
        super(u1Var, f0, i);
        this.f26493c = 1;
        this.f26494d = (Object[]) u1Var.f26494d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26172a() {
        switch (this.f26493c) {
            case 0:
                ((C9534E0) this.f26501a).mo25748e(this.f26494d, this.f26502b);
                return;
            default:
                this.f26501a.mo25796j((Object[]) this.f26494d, this.f26502b);
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9726u1 mo26173b(int i, int i2) {
        switch (this.f26493c) {
            case 0:
                return new C9726u1(this, ((C9534E0) this.f26501a).mo25746c(i), i2);
            default:
                return new C9726u1(this, this.f26501a.mo25746c(i), i2);
        }
    }
}

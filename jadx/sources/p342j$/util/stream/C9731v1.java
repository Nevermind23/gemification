package p342j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.v1 */
abstract class C9731v1 extends CountedCompleter {

    /* renamed from: a */
    protected final C9539F0 f26501a;

    /* renamed from: b */
    protected final int f26502b;

    C9731v1(C9539F0 f0) {
        this.f26501a = f0;
        this.f26502b = 0;
    }

    C9731v1(C9731v1 v1Var, C9539F0 f0, int i) {
        super(v1Var);
        this.f26501a = f0;
        this.f26502b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo26172a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C9726u1 mo26173b(int i, int i2);

    public final void compute() {
        C9731v1 v1Var = this;
        while (v1Var.f26501a.mo25797t() != 0) {
            v1Var.setPendingCount(v1Var.f26501a.mo25797t() - 1);
            int i = 0;
            int i2 = 0;
            while (i < v1Var.f26501a.mo25797t() - 1) {
                C9726u1 b = v1Var.mo26173b(i, v1Var.f26502b + i2);
                i2 = (int) (((long) i2) + b.f26501a.count());
                b.fork();
                i++;
            }
            v1Var = v1Var.mo26173b(i, v1Var.f26502b + i2);
        }
        v1Var.mo26172a();
        v1Var.propagateCompletion();
    }
}

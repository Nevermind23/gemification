package kotlinx.coroutines.internal;

import ef1.C40825j2;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;

/* renamed from: kotlinx.coroutines.internal.j0 */
final class C41605j0 {

    /* renamed from: a */
    public final C41752f f97801a;

    /* renamed from: b */
    private final Object[] f97802b;

    /* renamed from: c */
    private final C40825j2[] f97803c;

    /* renamed from: d */
    private int f97804d;

    public C41605j0(C41752f fVar, int i) {
        this.f97801a = fVar;
        this.f97802b = new Object[i];
        this.f97803c = new C40825j2[i];
    }

    /* renamed from: a */
    public final void mo96385a(C40825j2 j2Var, Object obj) {
        Object[] objArr = this.f97802b;
        int i = this.f97804d;
        objArr[i] = obj;
        C40825j2[] j2VarArr = this.f97803c;
        this.f97804d = i + 1;
        j2VarArr[i] = j2Var;
    }

    /* renamed from: b */
    public final void mo96386b(C41752f fVar) {
        int length = this.f97803c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                C40825j2 j2Var = this.f97803c[length];
                C41536l.m120486f(j2Var);
                j2Var.mo95173R(fVar, this.f97802b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}

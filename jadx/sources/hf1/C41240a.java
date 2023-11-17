package hf1;

import he1.C41225n;
import he1.C41238w;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;

/* renamed from: hf1.a */
public abstract class C41240a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C41242c[] f97228a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f97229b;

    /* renamed from: c */
    private int f97230c;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C41242c mo95699g() {
        C41242c cVar;
        synchronized (this) {
            C41242c[] cVarArr = this.f97228a;
            if (cVarArr == null) {
                cVarArr = mo95701i(2);
                this.f97228a = cVarArr;
            } else if (this.f97229b >= cVarArr.length) {
                Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                C41536l.m120488h(copyOf, "copyOf(this, newSize)");
                this.f97228a = (C41242c[]) copyOf;
                cVarArr = (C41242c[]) copyOf;
            }
            int i = this.f97230c;
            do {
                cVar = cVarArr[i];
                if (cVar == null) {
                    cVar = mo95700h();
                    cVarArr[i] = cVar;
                }
                i++;
                if (i >= cVarArr.length) {
                    i = 0;
                }
            } while (!cVar.mo95705a(this));
            this.f97230c = i;
            this.f97229b++;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C41242c mo95700h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C41242c[] mo95701i(int i);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo95702j(C41242c cVar) {
        int i;
        Continuation[] b;
        synchronized (this) {
            int i2 = this.f97229b - 1;
            this.f97229b = i2;
            if (i2 == 0) {
                this.f97230c = 0;
            }
            b = cVar.mo95706b(this);
        }
        for (Continuation continuation : b) {
            if (continuation != null) {
                C41225n.C41226a aVar = C41225n.f97210d;
                continuation.mo94382h(C41225n.m119478a(C41238w.f97225a));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo95703k() {
        return this.f97229b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C41242c[] mo95704l() {
        return this.f97228a;
    }
}

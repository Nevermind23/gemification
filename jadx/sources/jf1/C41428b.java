package jf1;

import ae1.C40293a;
import ef1.C40810g0;
import java.util.concurrent.CancellationException;
import me1.C41752f;

/* renamed from: jf1.b */
public abstract class C41428b {
    /* renamed from: a */
    public static final void m120214a(Throwable th, C41752f fVar) {
        if (!(th instanceof CancellationException)) {
            try {
                C40293a.m116722s(th);
            } catch (Throwable th2) {
                C41211b.m119461a(th, th2);
                C40810g0.m118295a(fVar, th);
            }
        }
    }
}

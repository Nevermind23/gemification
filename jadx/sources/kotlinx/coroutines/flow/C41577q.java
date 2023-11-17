package kotlinx.coroutines.flow;

import hf1.C41242c;
import kotlin.coroutines.Continuation;

/* renamed from: kotlinx.coroutines.flow.q */
public final class C41577q extends C41242c {

    /* renamed from: a */
    public long f97756a = -1;

    /* renamed from: b */
    public Continuation f97757b;

    /* renamed from: c */
    public boolean mo95705a(C41572o oVar) {
        if (this.f97756a >= 0) {
            return false;
        }
        this.f97756a = oVar.mo96341V();
        return true;
    }

    /* renamed from: d */
    public Continuation[] mo95706b(C41572o oVar) {
        long j = this.f97756a;
        this.f97756a = -1;
        this.f97757b = null;
        return oVar.mo96340U(j);
    }
}

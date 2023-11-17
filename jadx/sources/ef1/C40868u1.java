package ef1;

import kotlin.jvm.internal.C41536l;

/* renamed from: ef1.u1 */
public abstract class C40868u1 extends C40778a0 implements C40870v0, C40824j1 {

    /* renamed from: g */
    public C40871v1 f96577g;

    public void dispose() {
        mo95227y().mo95244y0(this);
    }

    /* renamed from: k */
    public boolean mo95168k() {
        return true;
    }

    /* renamed from: l */
    public C40889z1 mo95169l() {
        return null;
    }

    public String toString() {
        return C40832l0.m118329a(this) + '@' + C40832l0.m118330b(this) + "[job@" + C40832l0.m118330b(mo95227y()) + ']';
    }

    /* renamed from: y */
    public final C40871v1 mo95227y() {
        C40871v1 v1Var = this.f96577g;
        if (v1Var != null) {
            return v1Var;
        }
        C41536l.m120506z("job");
        return null;
    }

    /* renamed from: z */
    public final void mo95228z(C40871v1 v1Var) {
        this.f96577g = v1Var;
    }
}

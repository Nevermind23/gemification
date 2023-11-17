package p191o2;

import of1.C41880d0;
import p113i2.C6511a;
import p113i2.C6525f;

/* renamed from: o2.b */
public abstract class C7420b {
    /* renamed from: a */
    public static void m28229a(C41880d0 d0Var, C6511a aVar) {
        if (aVar.mo20446D() != C6525f.OK_HTTP_RESPONSE && d0Var != null && d0Var.mo96739a() != null && d0Var.mo96739a().mo21304t() != null) {
            try {
                d0Var.mo96739a().mo21304t().close();
            } catch (Exception unused) {
            }
        }
    }
}

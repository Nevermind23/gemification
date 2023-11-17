package p165m2;

import com.androidnetworking.error.ANError;
import of1.C41880d0;
import p113i2.C6511a;
import p113i2.C6521b;
import p113i2.C6525f;
import p191o2.C7420b;
import p191o2.C7421c;

/* renamed from: m2.g */
public abstract class C7077g {
    /* renamed from: a */
    public static C6521b m27353a(C6511a aVar) {
        int C = aVar.mo20445C();
        if (C == 0) {
            return m27355c(aVar);
        }
        if (C == 1) {
            return m27354b(aVar);
        }
        if (C != 2) {
            return new C6521b(new ANError());
        }
        return m27356d(aVar);
    }

    /* renamed from: b */
    private static C6521b m27354b(C6511a aVar) {
        try {
            C41880d0 d = C7068c.m27330d(aVar);
            if (d == null) {
                return new C6521b(C7421c.m28233d(new ANError()));
            }
            if (d.mo96747q() >= 400) {
                C6521b bVar = new C6521b(C7421c.m28235f(new ANError(d), aVar, d.mo96747q()));
                bVar.mo20500e(d);
                return bVar;
            }
            C6521b bVar2 = new C6521b((Object) "success");
            bVar2.mo20500e(d);
            return bVar2;
        } catch (ANError e) {
            return new C6521b(C7421c.m28233d(new ANError((Throwable) e)));
        } catch (Exception e2) {
            return new C6521b(C7421c.m28233d(new ANError((Throwable) e2)));
        }
    }

    /* renamed from: c */
    private static C6521b m27355c(C6511a aVar) {
        C41880d0 d0Var = null;
        try {
            d0Var = C7068c.m27331e(aVar);
            if (d0Var == null) {
                return new C6521b(C7421c.m28233d(new ANError()));
            }
            if (aVar.mo20446D() == C6525f.OK_HTTP_RESPONSE) {
                C6521b bVar = new C6521b((Object) d0Var);
                bVar.mo20500e(d0Var);
                C7420b.m28229a(d0Var, aVar);
                return bVar;
            } else if (d0Var.mo96747q() >= 400) {
                C6521b bVar2 = new C6521b(C7421c.m28235f(new ANError(d0Var), aVar, d0Var.mo96747q()));
                bVar2.mo20500e(d0Var);
                C7420b.m28229a(d0Var, aVar);
                return bVar2;
            } else {
                C6521b J = aVar.mo20452J(d0Var);
                J.mo20500e(d0Var);
                C7420b.m28229a(d0Var, aVar);
                return J;
            }
        } catch (ANError e) {
            return new C6521b(C7421c.m28233d(new ANError((Throwable) e)));
        } catch (Exception e2) {
            return new C6521b(C7421c.m28233d(new ANError((Throwable) e2)));
        } finally {
            C7420b.m28229a(d0Var, aVar);
        }
    }

    /* renamed from: d */
    private static C6521b m27356d(C6511a aVar) {
        C41880d0 d0Var = null;
        try {
            d0Var = C7068c.m27332f(aVar);
            if (d0Var == null) {
                return new C6521b(C7421c.m28233d(new ANError()));
            }
            if (aVar.mo20446D() == C6525f.OK_HTTP_RESPONSE) {
                C6521b bVar = new C6521b((Object) d0Var);
                bVar.mo20500e(d0Var);
                C7420b.m28229a(d0Var, aVar);
                return bVar;
            } else if (d0Var.mo96747q() >= 400) {
                C6521b bVar2 = new C6521b(C7421c.m28235f(new ANError(d0Var), aVar, d0Var.mo96747q()));
                bVar2.mo20500e(d0Var);
                C7420b.m28229a(d0Var, aVar);
                return bVar2;
            } else {
                C6521b J = aVar.mo20452J(d0Var);
                J.mo20500e(d0Var);
                C7420b.m28229a(d0Var, aVar);
                return J;
            }
        } catch (ANError e) {
            return new C6521b(C7421c.m28233d(e));
        } catch (Exception e2) {
            return new C6521b(C7421c.m28233d(new ANError((Throwable) e2)));
        } finally {
            C7420b.m28229a(d0Var, aVar);
        }
    }
}

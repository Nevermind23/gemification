package ef1;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C41596f;
import kotlinx.coroutines.internal.C41610o;

/* renamed from: ef1.q */
public abstract class C40854q {
    /* renamed from: a */
    public static final void m118426a(C40839n nVar, C40870v0 v0Var) {
        nVar.mo95186i(new C40876w0(v0Var));
    }

    /* renamed from: b */
    public static final C40843o m118427b(Continuation continuation) {
        if (!(continuation instanceof C41596f)) {
            return new C40843o(continuation, 1);
        }
        C40843o n = ((C41596f) continuation).mo96365n();
        if (n != null) {
            if (!n.mo95197L()) {
                n = null;
            }
            if (n != null) {
                return n;
            }
        }
        return new C40843o(continuation, 2);
    }

    /* renamed from: c */
    public static final void m118428c(C40839n nVar, C41610o oVar) {
        nVar.mo95186i(new C40797d2(oVar));
    }
}

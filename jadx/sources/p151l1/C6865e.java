package p151l1;

import androidx.work.C2073m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p164m1.C7055a;
import p164m1.C7056b;
import p164m1.C7057c;
import p164m1.C7059d;
import p164m1.C7060e;
import p164m1.C7062f;
import p164m1.C7064g;
import p164m1.C7065h;
import p177n1.C7215o;
import p190o1.C7399v;

/* renamed from: l1.e */
public final class C6865e implements C6864d, C7057c.C7058a {

    /* renamed from: a */
    private final C6863c f20551a;

    /* renamed from: b */
    private final C7057c[] f20552b;

    /* renamed from: c */
    private final Object f20553c;

    public C6865e(C6863c cVar, C7057c[] cVarArr) {
        C41536l.m120489i(cVarArr, "constraintControllers");
        this.f20551a = cVar;
        this.f20552b = cVarArr;
        this.f20553c = new Object();
    }

    /* renamed from: a */
    public void mo20941a() {
        synchronized (this.f20553c) {
            for (C7057c f : this.f20552b) {
                f.mo21283f();
            }
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: b */
    public void mo20942b(Iterable iterable) {
        C41536l.m120489i(iterable, "workSpecs");
        synchronized (this.f20553c) {
            for (C7057c g : this.f20552b) {
                g.mo21284g((C7057c.C7058a) null);
            }
            for (C7057c e : this.f20552b) {
                e.mo21282e(iterable);
            }
            for (C7057c g2 : this.f20552b) {
                g2.mo21284g(this);
            }
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: c */
    public void mo20943c(List list) {
        C41536l.m120489i(list, "workSpecs");
        synchronized (this.f20553c) {
            ArrayList<C7399v> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (mo20945e(((C7399v) next).f21630a)) {
                    arrayList.add(next);
                }
            }
            for (C7399v vVar : arrayList) {
                C2073m e = C2073m.m8071e();
                String a = C6866f.f20554a;
                e.mo6959a(a, "Constraints met for " + vVar);
            }
            C6863c cVar = this.f20551a;
            if (cVar != null) {
                cVar.mo6784f(arrayList);
                C41238w wVar = C41238w.f97225a;
            }
        }
    }

    /* renamed from: d */
    public void mo20944d(List list) {
        C41536l.m120489i(list, "workSpecs");
        synchronized (this.f20553c) {
            C6863c cVar = this.f20551a;
            if (cVar != null) {
                cVar.mo6783b(list);
                C41238w wVar = C41238w.f97225a;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo20945e(String str) {
        boolean z;
        C7057c cVar;
        C41536l.m120489i(str, "workSpecId");
        synchronized (this.f20553c) {
            C7057c[] cVarArr = this.f20552b;
            int length = cVarArr.length;
            z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArr[i];
                if (cVar.mo21281d(str)) {
                    break;
                }
                i++;
            }
            if (cVar != null) {
                C2073m.m8071e().mo6959a(C6866f.f20554a, "Work " + str + " constrained by " + cVar.getClass().getSimpleName());
            }
            if (cVar == null) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6865e(C7215o oVar, C6863c cVar) {
        this(cVar, new C7057c[]{new C7055a(oVar.mo21580a()), new C7056b(oVar.mo21581b()), new C7065h(oVar.mo21583d()), new C7059d(oVar.mo21582c()), new C7064g(oVar.mo21582c()), new C7062f(oVar.mo21582c()), new C7060e(oVar.mo21582c())});
        C41536l.m120489i(oVar, "trackers");
    }
}

package p202p0;

import android.os.Bundle;
import he1.C41238w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: p0.c0 */
public abstract class C7530c0 {

    /* renamed from: a */
    private C7539e0 f21975a;

    /* renamed from: b */
    private boolean f21976b;

    /* renamed from: p0.c0$a */
    public interface C7531a {
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: p0.c0$b */
    public @interface C7532b {
        String value();
    }

    /* renamed from: p0.c0$c */
    static final class C7533c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C7530c0 f21977d;

        /* renamed from: e */
        final /* synthetic */ C7602w f21978e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7533c(C7530c0 c0Var, C7602w wVar, C7531a aVar) {
            super(1);
            this.f21977d = c0Var;
            this.f21978e = wVar;
        }

        /* renamed from: a */
        public final C7549j invoke(C7549j jVar) {
            C41536l.m120489i(jVar, "backStackEntry");
            C7589q f = jVar.mo22097f();
            if (!(f instanceof C7589q)) {
                f = null;
            }
            if (f == null) {
                return null;
            }
            C7589q d = this.f21977d.mo22021d(f, jVar.mo22095d(), this.f21978e, (C7531a) null);
            if (d == null) {
                return null;
            }
            if (C41536l.m120484d(d, f)) {
                return jVar;
            }
            return this.f21977d.mo22048b().mo22070a(d, d.mo22209j(jVar.mo22095d()));
        }
    }

    /* renamed from: p0.c0$d */
    static final class C7534d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7534d f21979d = new C7534d();

        C7534d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo22058a(C7604x xVar) {
            C41536l.m120489i(xVar, "$this$navOptions");
            xVar.mo22268d(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo22058a((C7604x) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: a */
    public abstract C7589q mo22020a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C7539e0 mo22048b() {
        C7539e0 e0Var = this.f21975a;
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    /* renamed from: c */
    public final boolean mo22049c() {
        return this.f21976b;
    }

    /* renamed from: d */
    public C7589q mo22021d(C7589q qVar, Bundle bundle, C7602w wVar, C7531a aVar) {
        C41536l.m120489i(qVar, "destination");
        return qVar;
    }

    /* renamed from: e */
    public void mo22050e(List list, C7602w wVar, C7531a aVar) {
        C41536l.m120489i(list, "entries");
        for (C7549j h : C40355o.m116856n(C40355o.m116863u(C41358y.m119997M(list), new C7533c(this, wVar, aVar)))) {
            mo22048b().mo22077h(h);
        }
    }

    /* renamed from: f */
    public void mo22051f(C7539e0 e0Var) {
        C41536l.m120489i(e0Var, "state");
        this.f21975a = e0Var;
        this.f21976b = true;
    }

    /* renamed from: g */
    public void mo22052g(C7549j jVar) {
        C41536l.m120489i(jVar, "backStackEntry");
        C7589q f = jVar.mo22097f();
        if (!(f instanceof C7589q)) {
            f = null;
        }
        if (f != null) {
            mo22021d(f, (Bundle) null, C7605y.m28929a(C7534d.f21979d), (C7531a) null);
            mo22048b().mo22075f(jVar);
        }
    }

    /* renamed from: h */
    public void mo22053h(Bundle bundle) {
        C41536l.m120489i(bundle, "savedState");
    }

    /* renamed from: i */
    public Bundle mo22054i() {
        return null;
    }

    /* renamed from: j */
    public void mo22055j(C7549j jVar, boolean z) {
        C41536l.m120489i(jVar, "popUpTo");
        List list = (List) mo22048b().mo22071b().getValue();
        if (list.contains(jVar)) {
            ListIterator listIterator = list.listIterator(list.size());
            C7549j jVar2 = null;
            while (mo22022k()) {
                jVar2 = (C7549j) listIterator.previous();
                if (C41536l.m120484d(jVar2, jVar)) {
                    break;
                }
            }
            if (jVar2 != null) {
                mo22048b().mo22076g(jVar2, z);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + jVar + " which does not exist in back stack " + list).toString());
    }

    /* renamed from: k */
    public boolean mo22022k() {
        return true;
    }
}

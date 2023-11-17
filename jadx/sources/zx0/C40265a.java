package zx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b41.C31128a;
import dy0.C31622e;
import g91.C32343x;
import he1.C41217g;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import jx0.C36816d0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import ue1.C43064a;
import ue1.C43075l;
import ux0.C39162n;
import ux0.C39163o;
import vx0.C39491a;

/* renamed from: zx0.a */
public final class C40265a extends C39491a {

    /* renamed from: b */
    private final C39163o f95702b;

    /* renamed from: c */
    private C36816d0 f95703c;

    /* renamed from: d */
    private boolean f95704d = true;

    /* renamed from: e */
    private boolean f95705e = true;

    /* renamed from: f */
    private String f95706f;

    /* renamed from: g */
    private int f95707g = -1;

    /* renamed from: h */
    private final C41217g f95708h = C41219i.m119470b(new C40266a(this));

    /* renamed from: i */
    private C31128a f95709i;

    /* renamed from: zx0.a$a */
    static final class C40266a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40265a f95710d;

        /* renamed from: zx0.a$a$a */
        /* synthetic */ class C40267a extends C41535k implements C43075l {
            C40267a(Object obj) {
                super(1, obj, C40265a.class, "onTemplateClicked", "onTemplateClicked(J)V", 0);
            }

            /* renamed from: b */
            public final void mo94289b(long j) {
                ((C40265a) this.receiver).m116640D(j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo94289b(((Number) obj).longValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40266a(C40265a aVar) {
            super(0);
            this.f95710d = aVar;
        }

        /* renamed from: b */
        public final C40268b invoke() {
            return new C40268b(new C40267a(this.f95710d));
        }
    }

    public C40265a(C39163o oVar) {
        C41536l.m120489i(oVar, "formContext");
        this.f95702b = oVar;
    }

    /* renamed from: B */
    private final List m116639B() {
        C31128a aVar = this.f95709i;
        if (aVar instanceof C31128a.C31131c) {
            return (List) ((C31128a.C31131c) aVar).mo71340a();
        }
        return C41341q.m119907j();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m116640D(long j) {
        Object obj;
        boolean z;
        if (mo94285A()) {
            Iterator it = m116639B().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C31622e) obj).mo72050d() == j) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C31622e eVar = (C31622e) obj;
            if (eVar != null) {
                C39162n b = this.f95702b.mo92813b();
                if (b != null) {
                    b.mo80248A(eVar);
                }
                m116642y().mo94294q(Long.valueOf(j));
                C39162n b2 = this.f95702b.mo92813b();
                if (b2 != null) {
                    b2.mo80261p("payment_form", "click", "template");
                    return;
                }
                return;
            }
            m116642y().mo94294q((Long) null);
        }
    }

    /* renamed from: y */
    private final C40268b m116642y() {
        return (C40268b) this.f95708h.getValue();
    }

    /* renamed from: z */
    private final C36816d0 m116643z() {
        C36816d0 d0Var = this.f95703c;
        C41536l.m120486f(d0Var);
        return d0Var;
    }

    /* renamed from: A */
    public boolean mo94285A() {
        return this.f95705e;
    }

    /* renamed from: C */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        this.f95703c = C36816d0.m109079d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        m116643z().f88820e.mo53597e();
        m116643z().f88822g.setAdapter(m116642y());
        mo93137v(!bVar.mo80328p());
        StateView c = m116643z().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    /* renamed from: E */
    public final void mo94287E(C31128a aVar) {
        this.f95709i = aVar;
        if (aVar instanceof C31128a.C31130b) {
            m116643z().f88820e.mo53597e();
        } else if (aVar instanceof C31128a.C31131c) {
            m116642y().mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
            m116643z().f88820e.mo53595c();
        } else {
            boolean z = true;
            if (!(aVar instanceof C31128a.C31129a) && aVar != null) {
                z = false;
            }
            if (z) {
                m116642y().mo6029i(C41341q.m119907j());
                m116643z().f88820e.mo53595c();
            }
        }
    }

    /* renamed from: e */
    public int mo93120e() {
        return this.f95707g;
    }

    /* renamed from: g */
    public String mo93122g() {
        return this.f95706f;
    }

    /* renamed from: h */
    public Object mo93123h() {
        return m116642y().mo94290m();
    }

    /* renamed from: i */
    public boolean mo93124i() {
        return this.f95704d;
    }

    /* renamed from: j */
    public boolean mo93125j() {
        return true;
    }

    /* renamed from: p */
    public void mo93131p() {
        m116642y().mo94294q((Long) null);
    }

    /* renamed from: q */
    public void mo93132q(Object obj) {
        try {
            m116642y().mo94294q(Long.valueOf(Long.parseLong(String.valueOf(obj))));
        } catch (Exception unused) {
        }
    }

    /* renamed from: s */
    public void mo93134s(int i) {
        this.f95707g = i;
    }

    /* renamed from: t */
    public void mo93135t(boolean z) {
        this.f95705e = z;
        m116642y().mo94293p(z);
    }

    /* renamed from: u */
    public void mo93136u(String str) {
        Long l;
        this.f95706f = str;
        if (str != null && (l = C40438v.m117100l(str)) != null) {
            m116642y().mo94294q(Long.valueOf(l.longValue()));
        }
    }

    /* renamed from: v */
    public void mo93137v(boolean z) {
        StateView c;
        this.f95704d = z;
        C36816d0 d0Var = this.f95703c;
        if (d0Var != null && (c = d0Var.mo3946b()) != null) {
            C32343x.m95483r1(c, z, false, 2, (Object) null);
        }
    }
}

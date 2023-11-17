package wx0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import by0.C31217a;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import jx0.C36840v;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import o31.C37603j;
import ox0.C37833c;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import u31.C39010b;
import ue1.C43064a;
import ue1.C43075l;
import ux0.C39163o;
import vx0.C39491a;
import x31.C39778a;
import y31.C40019a;

/* renamed from: wx0.h */
public final class C39722h extends C39491a {

    /* renamed from: b */
    private final C39163o f94374b;

    /* renamed from: c */
    private C36840v f94375c;

    /* renamed from: d */
    private final C41217g f94376d = C41219i.m119470b(new C39723a(this));

    /* renamed from: e */
    private boolean f94377e;

    /* renamed from: f */
    private String f94378f;

    /* renamed from: g */
    private boolean f94379g = true;

    /* renamed from: h */
    private int f94380h = -1;

    /* renamed from: wx0.h$a */
    static final class C39723a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C39722h f94381d;

        /* renamed from: wx0.h$a$a */
        static final class C39724a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C39722h f94382d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39724a(C39722h hVar) {
                super(1);
                this.f94382d = hVar;
            }

            /* renamed from: a */
            public final void mo93455a(C40019a aVar) {
                C41536l.m120489i(aVar, "it");
                this.f94382d.m115391F(aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo93455a((C40019a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39723a(C39722h hVar) {
            super(0);
            this.f94381d = hVar;
        }

        /* renamed from: b */
        public final C39010b invoke() {
            return new C39010b(new C39724a(this.f94381d));
        }
    }

    /* renamed from: wx0.h$b */
    static final class C39725b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39722h f94383d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39725b(C39722h hVar) {
            super(1);
            this.f94383d = hVar;
        }

        /* renamed from: a */
        public final void mo93456a(C31217a.C31220c cVar) {
            int i;
            C39722h hVar = this.f94383d;
            String a = cVar.mo71474a();
            if (a == null) {
                a = "";
            }
            hVar.mo93453H(a);
            C39722h hVar2 = this.f94383d;
            String a2 = cVar.mo71474a();
            boolean z = false;
            if (a2 != null) {
                i = a2.length();
            } else {
                i = 0;
            }
            if (i < 9) {
                z = true;
            }
            hVar2.mo93137v(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93456a((C31217a.C31220c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wx0.h$c */
    public static final class C39726c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39726c f94384d = new C39726c();

        public C39726c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C31217a aVar) {
            C41536l.m120489i(aVar, "it");
            return Boolean.valueOf(aVar instanceof C31217a.C31220c);
        }
    }

    public C39722h(C39163o oVar) {
        C41536l.m120489i(oVar, "formContext");
        this.f94374b = oVar;
    }

    /* renamed from: A */
    private final C36840v m115387A() {
        C36840v vVar = this.f94375c;
        C41536l.m120486f(vVar);
        return vVar;
    }

    /* renamed from: B */
    private final C39010b m115388B() {
        return (C39010b) this.f94376d.getValue();
    }

    /* renamed from: D */
    private final void m115389D() {
        C40749p i = this.f94374b.mo92812a().mo94990M(new C39163o.C39164a(C39726c.f94384d)).mo95023i(C31217a.C31220c.class);
        C41536l.m120488h(i, "getElementEventObservabl…s T }.cast(T::class.java)");
        C41205b F0 = i.mo94981F0(new C39720f(new C39725b(this)));
        C41536l.m120488h(F0, "private fun observeEleme…           }.bind()\n    }");
        mo93117b(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static final void m115390E(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m115391F(C40019a aVar) {
        if (mo93451C()) {
            this.f94374b.mo92816e(new C31217a.C31219b(aVar.mo93841c()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final void m115392I(C39722h hVar) {
        C41536l.m120489i(hVar, "this$0");
        hVar.mo93137v(hVar.mo93124i());
    }

    /* renamed from: C */
    public boolean mo93451C() {
        return this.f94379g;
    }

    /* renamed from: G */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        this.f94375c = C36840v.m109173d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        m115387A().f88909e.setAdapter(m115388B());
        m115387A().f88910f.setText(C34646b.m101752f(C37833c.f90838a.mo91159u(), (Context) null, 1, (Object) null));
        m115389D();
        mo93453H("");
        mo93137v(mo93124i());
        return m115387A().mo3946b();
    }

    /* renamed from: H */
    public final void mo93453H(String str) {
        List list;
        C41536l.m120489i(str, "searchText");
        Context context = m115387A().mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        Cursor e = C37603j.m110582e(context, str);
        if (e == null || (list = C41358y.m119991B0(new C39778a().mo93510a(e))) == null) {
            list = new ArrayList();
        }
        m115388B().mo6030j(list, new C39721g(this));
    }

    /* renamed from: e */
    public int mo93120e() {
        return this.f94380h;
    }

    /* renamed from: g */
    public String mo93122g() {
        return this.f94378f;
    }

    /* renamed from: i */
    public boolean mo93124i() {
        return this.f94377e;
    }

    /* renamed from: j */
    public boolean mo93125j() {
        return true;
    }

    /* renamed from: s */
    public void mo93134s(int i) {
        this.f94380h = i;
    }

    /* renamed from: t */
    public void mo93135t(boolean z) {
        this.f94379g = z;
    }

    /* renamed from: u */
    public void mo93136u(String str) {
        this.f94378f = str;
    }

    /* renamed from: v */
    public void mo93137v(boolean z) {
        boolean z2;
        this.f94377e = z;
        C36840v vVar = this.f94375c;
        if (vVar != null) {
            if (!mo93124i() || m115388B().getItemCount() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            LayerView c = vVar.mo3946b();
            C41536l.m120488h(c, "it.root");
            C32343x.m95483r1(c, z2, false, 2, (Object) null);
        }
    }
}

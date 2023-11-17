package a90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g90.C20781c;
import g90.C20782d;
import g91.C32303f;
import g91.C32343x;
import h80.C24910q;
import he1.C41224m;
import he1.C41233s;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p615tg.C17963d;
import ue1.C43075l;

/* renamed from: a90.c */
public final class C19202c extends C1819o {

    /* renamed from: f */
    private final C43075l f53407f;

    /* renamed from: a90.c$a */
    public final class C19203a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24910q f53408d;

        /* renamed from: e */
        final /* synthetic */ C19202c f53409e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19203a(C19202c cVar, C24910q qVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            this.f53409e = cVar;
            this.f53408d = qVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64621j(C20782d dVar, C19202c cVar, View view) {
            C41536l.m120489i(dVar, "$income");
            C41536l.m120489i(cVar, "this$0");
            if (dVar.mo49338d() != C20781c.NONE) {
                cVar.mo47424k().invoke(dVar.mo49345i());
            }
        }

        /* renamed from: k */
        private final C41224m m64622k(C20782d dVar) {
            BigDecimal bigDecimal;
            String a;
            String e = dVar.mo49339e();
            String str = null;
            if (e != null) {
                bigDecimal = new BigDecimal(e);
            } else {
                bigDecimal = null;
            }
            String n = C32303f.m95203n(bigDecimal, dVar.mo49337c());
            String l = dVar.mo49348l();
            if (l == null) {
                LookupUiModel h = dVar.mo49343h();
                if (!(h == null || (a = h.mo52391a()) == null)) {
                    str = C32343x.m95388F(a, new Object[0]);
                }
                if (str == null) {
                    l = dVar.mo49335a();
                } else {
                    l = str;
                }
            }
            return C41233s.m119492a(n, l);
        }

        /* renamed from: i */
        public final void mo47427i(C20782d dVar) {
            String str;
            boolean z;
            C41536l.m120489i(dVar, "income");
            C24910q qVar = this.f53408d;
            C19202c cVar = this.f53409e;
            C41224m k = m64622k(dVar);
            String str2 = (String) k.mo95675a();
            String str3 = (String) k.mo95676b();
            ThreeLineTextItem threeLineTextItem = qVar.f64049g;
            LookupUiModel g = dVar.mo49342g();
            if (g != null) {
                str = g.mo52391a();
            } else {
                str = null;
            }
            threeLineTextItem.setTitle(C32343x.m95388F(str, new Object[0]));
            qVar.f64049g.setSubtitle(str3);
            qVar.f64049g.setText(str2);
            BogImageView bogImageView = qVar.f64048f;
            C41536l.m120488h(bogImageView, "edit");
            if (dVar.mo49338d() != C20781c.NONE || dVar.mo49350n()) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(bogImageView, z, false, 2, (Object) null);
            qVar.f64048f.setOnClickListener(new C19201b(dVar, cVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19202c(C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar, "incomeClick");
        this.f53407f = lVar;
    }

    /* renamed from: k */
    public final C43075l mo47424k() {
        return this.f53407f;
    }

    /* renamed from: l */
    public void onBindViewHolder(C19203a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        C20782d dVar = (C20782d) mo6026f().get(i);
        C41536l.m120488h(dVar, "incomeItem");
        aVar.mo47427i(dVar);
    }

    /* renamed from: m */
    public C19203a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24910q d = C24910q.m79626d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C19203a(this, d);
    }
}

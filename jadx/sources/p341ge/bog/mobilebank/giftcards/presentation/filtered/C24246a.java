package p341ge.bog.mobilebank.giftcards.presentation.filtered;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj0.C26237a;
import th0.C28421q0;
import th0.C28425s0;
import th0.C28430v;
import th0.C28434x;
import th0.C28436y;
import vi0.C29080a;
import vi0.C29082b;
import vi0.C29084d;
import vi0.C29086f;
import vi0.C29087g;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.a */
public final class C24246a extends C1819o {

    /* renamed from: g */
    public static final C24247a f62716g = new C24247a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C24249c f62717f;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.a$a */
    public static final class C24247a {
        private C24247a() {
        }

        public /* synthetic */ C24247a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.a$b */
    private static final class C24248b extends C1796h.C1802f {

        /* renamed from: a */
        public static final C24248b f62718a = new C24248b();

        private C24248b() {
        }

        /* renamed from: d */
        public boolean mo5976a(C24254d dVar, C24254d dVar2) {
            C41536l.m120489i(dVar, "oldItem");
            C41536l.m120489i(dVar2, "newItem");
            if (dVar.mo61912d() != dVar2.mo61912d() || !C24254d.f62724b.mo61917a().contains(Integer.valueOf(dVar2.mo61912d()))) {
                return C41536l.m120484d(dVar, dVar2);
            }
            boolean b = dVar2.mo61910b();
            dVar2.mo61911c(false);
            if (!b) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo5977b(C24254d dVar, C24254d dVar2) {
            C41536l.m120489i(dVar, "oldItem");
            C41536l.m120489i(dVar2, "newItem");
            if (!C24254d.f62724b.mo61917a().contains(Integer.valueOf(dVar2.mo61912d()))) {
                return C41536l.m120484d(dVar, dVar2);
            }
            if (dVar.mo61912d() == dVar2.mo61912d()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.a$c */
    public interface C24249c {
        /* renamed from: G */
        void mo61882G();

        /* renamed from: I0 */
        void mo61883I0(long j);

        /* renamed from: N */
        void mo61884N(long j, long j2);

        /* renamed from: f */
        void mo61885f(String str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24246a(C24249c cVar) {
        super(C24248b.f62718a);
        C41536l.m120489i(cVar, "listener");
        this.f62717f = cVar;
    }

    public int getItemViewType(int i) {
        return ((C24254d) mo6027g(i)).mo61912d();
    }

    /* renamed from: k */
    public void onBindViewHolder(C26237a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo65239h(g);
    }

    /* renamed from: l */
    public C26237a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 1) {
            C28434x d = C28434x.m87260d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …      false\n            )");
            return new C29084d(d, this.f62717f);
        } else if (i == 2) {
            C28436y d2 = C28436y.m87268d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …      false\n            )");
            return new C29080a(d2, this.f62717f);
        } else if (i == 3) {
            C28421q0 d3 = C28421q0.m87206d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …      false\n            )");
            return new C29087g(d3, this.f62717f);
        } else if (i == 4) {
            C28425s0 d4 = C28425s0.m87222d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …      false\n            )");
            return new C29086f(d4, this.f62717f);
        } else if (i == 5) {
            C28430v d5 = C28430v.m87243d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d5, "inflate(\n               …      false\n            )");
            return new C29082b(d5);
        } else {
            throw new IllegalStateException("Unsupported ViewType".toString());
        }
    }
}

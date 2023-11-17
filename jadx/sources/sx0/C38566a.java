package sx0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import cx0.C31456c;
import he1.C41238w;
import java.util.List;
import jx0.C36825i;
import jx0.C36827j;
import jx0.C36830l;
import jx0.C36832n;
import jx0.C36834p;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p615tg.C17963d;
import sx0.C38574b;
import sx0.C38587c;
import u61.C39033a;
import ue1.C43075l;

/* renamed from: sx0.a */
public final class C38566a extends C1819o {

    /* renamed from: f */
    private final C38567a f92416f;

    /* renamed from: g */
    private final C38568b f92417g;

    /* renamed from: h */
    private boolean f92418h;

    /* renamed from: sx0.a$a */
    public interface C38567a {
        /* renamed from: a */
        void mo80208a(C31456c cVar);
    }

    /* renamed from: sx0.a$b */
    public interface C38568b {
        /* renamed from: a */
        void mo80211a(C39033a aVar);
    }

    /* renamed from: sx0.a$c */
    /* synthetic */ class C38569c extends C41535k implements C43075l {
        C38569c(Object obj) {
            super(1, obj, C38567a.class, "invoke", "invoke(Lge/bog/mobilebank/paymentconfiguration/domain/model/PaymentConfigTreeNode;)V", 0);
        }

        /* renamed from: b */
        public final void mo92167b(C31456c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((C38567a) this.receiver).mo80208a(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92167b((C31456c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: sx0.a$d */
    /* synthetic */ class C38570d extends C41535k implements C43075l {
        C38570d(Object obj) {
            super(1, obj, C38567a.class, "invoke", "invoke(Lge/bog/mobilebank/paymentconfiguration/domain/model/PaymentConfigTreeNode;)V", 0);
        }

        /* renamed from: b */
        public final void mo92168b(C31456c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((C38567a) this.receiver).mo80208a(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92168b((C31456c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: sx0.a$e */
    /* synthetic */ class C38571e extends C41535k implements C43075l {
        C38571e(Object obj) {
            super(1, obj, C38567a.class, "invoke", "invoke(Lge/bog/mobilebank/paymentconfiguration/domain/model/PaymentConfigTreeNode;)V", 0);
        }

        /* renamed from: b */
        public final void mo92169b(C31456c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((C38567a) this.receiver).mo80208a(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92169b((C31456c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: sx0.a$f */
    /* synthetic */ class C38572f extends C41535k implements C43075l {
        C38572f(Object obj) {
            super(1, obj, C38567a.class, "invoke", "invoke(Lge/bog/mobilebank/paymentconfiguration/domain/model/PaymentConfigTreeNode;)V", 0);
        }

        /* renamed from: b */
        public final void mo92170b(C31456c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((C38567a) this.receiver).mo80208a(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92170b((C31456c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: sx0.a$g */
    /* synthetic */ class C38573g extends C41535k implements C43075l {
        C38573g(Object obj) {
            super(1, obj, C38568b.class, "invoke", "invoke(Lge/bog/mobilebank/templates/domain/models/Template;)V", 0);
        }

        /* renamed from: b */
        public final void mo92171b(C39033a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C38568b) this.receiver).mo80211a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92171b((C39033a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38566a(C38567a aVar, C38568b bVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(aVar, "onNodeClickedListener");
        C41536l.m120489i(bVar, "onTemplateClickedListener");
        this.f92416f = aVar;
        this.f92417g = bVar;
    }

    public int getItemViewType(int i) {
        return ((C38574b) mo6027g(i)).mo92172a();
    }

    /* renamed from: k */
    public final void mo92164k(List list, boolean z, Runnable runnable) {
        this.f92418h = z;
        super.mo6030j(list, runnable);
    }

    /* renamed from: l */
    public void onBindViewHolder(C38587c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        C38574b bVar = (C38574b) mo6027g(i);
        if (bVar instanceof C38574b.C38580d) {
            ((C38587c.C38593d) cVar).mo92207i((C38574b.C38580d) bVar);
        } else if (bVar instanceof C38574b.C38578c) {
            ((C38587c.C38591c) cVar).mo92205i((C38574b.C38578c) bVar);
        } else if (bVar instanceof C38574b.C38582e) {
            ((C38587c.C38595e) cVar).mo92209i((C38574b.C38582e) bVar, this.f92418h);
        } else if (bVar instanceof C38574b.C38576b) {
            ((C38587c.C38589b) cVar).mo92203j((C38574b.C38576b) bVar);
        } else if (bVar instanceof C38574b.C38584f) {
            ((C38587c.C38597f) cVar).mo92211i((C38574b.C38584f) bVar);
        } else if (bVar instanceof C38574b.C38575a) {
            ((C38587c.C38588a) cVar).mo92202h();
        }
    }

    /* renamed from: m */
    public C38587c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C38574b.C38580d.f92429d.mo92201a()) {
            C36832n d = C36832n.m109141d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …, false\n                )");
            return new C38587c.C38593d(d, new C38569c(this.f92416f));
        } else if (i == C38574b.C38578c.f92426d.mo92201a()) {
            C36830l d2 = C36830l.m109133d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …, false\n                )");
            return new C38587c.C38591c(d2, new C38570d(this.f92416f));
        } else if (i == C38574b.C38582e.f92432d.mo92201a()) {
            C36834p d3 = C36834p.m109149d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …, false\n                )");
            return new C38587c.C38595e(d3, new C38571e(this.f92416f));
        } else if (i == C38574b.C38576b.f92421f.mo92201a()) {
            C36827j d4 = C36827j.m109121d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …, false\n                )");
            return new C38587c.C38589b(d4, new C38572f(this.f92416f));
        } else if (i == C38574b.C38584f.f92435d.mo92201a()) {
            C36834p d5 = C36834p.m109149d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d5, "inflate(\n               …, false\n                )");
            return new C38587c.C38597f(d5, new C38573g(this.f92417g));
        } else if (i == C38574b.C38575a.f92420b.mo92172a()) {
            C36825i d6 = C36825i.m109113d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d6, "inflate(\n               …, false\n                )");
            return new C38587c.C38588a(d6);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}

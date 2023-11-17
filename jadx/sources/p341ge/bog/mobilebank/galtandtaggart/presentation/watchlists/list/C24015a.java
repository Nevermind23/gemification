package p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import ie0.C25190j;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.WatchList;
import ue0.C28761x0;
import ue1.C43075l;
import zg0.C30298a;
import zg0.C30299b;
import zg0.C30300c;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.a */
public final class C24015a extends C1819o {

    /* renamed from: f */
    private final List f62330f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C24016a f62331g;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.a$a */
    public interface C24016a {
        /* renamed from: K0 */
        void mo60789K0(WatchList watchList);

        /* renamed from: M0 */
        void mo60790M0(WatchList watchList);
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.a$b */
    public final class C24017b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28761x0 f62332d;

        /* renamed from: e */
        final /* synthetic */ C24015a f62333e;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.a$b$a */
        static final class C24018a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ WatchList f62334d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24018a(WatchList watchList) {
                super(1);
                this.f62334d = watchList;
            }

            /* renamed from: a */
            public final Boolean invoke(BigDecimal bigDecimal) {
                C41536l.m120489i(bigDecimal, "it");
                return Boolean.valueOf(C41536l.m120484d(bigDecimal, this.f62334d.mo60081a()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24017b(C24015a aVar, C28761x0 x0Var) {
            super(x0Var.mo3946b());
            C41536l.m120489i(x0Var, "binding");
            this.f62333e = aVar;
            this.f62332d = x0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m77481l(C24015a aVar, WatchList watchList, CompoundButton compoundButton, boolean z, boolean z2) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(watchList, "$watchList");
            C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
            if (z) {
                List m = aVar.mo61018m();
                if (m != null) {
                    m.add(watchList.mo60081a());
                    return;
                }
                return;
            }
            List m2 = aVar.mo61018m();
            if (m2 != null) {
                boolean unused = C41352v.m119961F(m2, new C24018a(watchList));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m77482m(C24015a aVar, WatchList watchList, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(watchList, "$watchList");
            C24016a k = aVar.f62331g;
            if (k != null) {
                k.mo60789K0(watchList);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final boolean m77483n(C24015a aVar, WatchList watchList, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(watchList, "$watchList");
            C24016a k = aVar.f62331g;
            if (k == null) {
                return true;
            }
            k.mo60790M0(watchList);
            return true;
        }

        /* renamed from: k */
        public final void mo61022k(WatchList watchList) {
            boolean z;
            C41536l.m120489i(watchList, "watchList");
            C28761x0 x0Var = this.f62332d;
            C24015a aVar = this.f62333e;
            CheckboxView checkboxView = x0Var.f73533e;
            C41536l.m120488h(checkboxView, "checkBx");
            boolean z2 = false;
            if (aVar.mo61018m() != null) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(checkboxView, z, false, 2, (Object) null);
            CheckboxView checkboxView2 = x0Var.f73533e;
            List m = aVar.mo61018m();
            if (m != null) {
                z2 = m.contains(watchList.mo60081a());
            }
            checkboxView2.setChecked(z2);
            x0Var.f73533e.setOnCheckedStateChangeListener(new C30298a(aVar, watchList));
            x0Var.f73534f.setText(watchList.mo60082b());
            x0Var.f73534f.setTitle(watchList.mo60083d() + " " + this.f62332d.mo3946b().getContext().getString(C25190j.gt_share_title));
            x0Var.mo3946b().setOnClickListener(new C30299b(aVar, watchList));
            x0Var.mo3946b().setOnLongClickListener(new C30300c(aVar, watchList));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24015a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = ie1.C41358y.m120001Q((r0 = ie1.C41358y.m120036z0(r0)));
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo61017l() {
        /*
            r1 = this;
            java.util.List r0 = r1.f62330f
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = ie1.C41358y.m120036z0(r0)
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = ie1.C41358y.m120001Q(r0)
            if (r0 != 0) goto L_0x0014
        L_0x0010:
            java.util.List r0 = ie1.C41341q.m119907j()
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.C24015a.mo61017l():java.util.List");
    }

    /* renamed from: m */
    public final List mo61018m() {
        return this.f62330f;
    }

    /* renamed from: n */
    public void onBindViewHolder(C24017b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo61022k((WatchList) g);
    }

    /* renamed from: o */
    public C24017b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28761x0 d = C28761x0.m88178d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C24017b(this, d);
    }

    /* renamed from: p */
    public final void mo61021p(C24016a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f62331g = aVar;
    }

    public C24015a(List list) {
        super(C37599g.f90345a.mo90787d());
        this.f62330f = list;
    }
}

package yf0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.C1806i;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import ie0.C25185e;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.search.SearchView;
import ue0.C28744p;
import ue0.C28759w0;
import ue1.C43064a;
import ue1.C43075l;
import xf0.C29765d;

/* renamed from: yf0.c */
public final class C30010c extends C30008a {

    /* renamed from: L */
    public static final C30013b f75836L = new C30013b((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C30026d f75837G;

    /* renamed from: H */
    private C28744p f75838H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C30011a f75839I;

    /* renamed from: J */
    private final C41217g f75840J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C30014c f75841K;

    /* renamed from: yf0.c$a */
    private static final class C30011a extends RecyclerView.C1736h {

        /* renamed from: d */
        private List f75842d;

        /* renamed from: e */
        private C43075l f75843e;

        /* renamed from: yf0.c$a$a */
        private static final class C30012a extends RecyclerView.C1734f0 {

            /* renamed from: d */
            private final C28759w0 f75844d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C30012a(C28759w0 w0Var) {
                super(w0Var.mo3946b());
                C41536l.m120489i(w0Var, "binding");
                this.f75844d = w0Var;
            }

            /* renamed from: h */
            public final void mo70317h(C29765d dVar) {
                C41536l.m120489i(dVar, "item");
                this.f75844d.f73501f.setText(dVar.mo69922b());
                this.f75844d.f73500e.setChecked(dVar.mo69924d());
            }
        }

        public C30011a(List list, C43075l lVar) {
            C41536l.m120489i(list, "data");
            this.f75842d = list;
            this.f75843e = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final void m90976h(C30011a aVar, C29765d dVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(dVar, "$item");
            C43075l lVar = aVar.f75843e;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
            for (C29765d e : aVar.f75842d) {
                e.mo69925e(false);
            }
            dVar.mo69925e(true);
        }

        /* renamed from: g */
        public void onBindViewHolder(C30012a aVar, int i) {
            C41536l.m120489i(aVar, "holder");
            C29765d dVar = (C29765d) this.f75842d.get(i);
            aVar.mo70317h(dVar);
            aVar.itemView.setOnClickListener(new C30009b(this, dVar));
        }

        public int getItemCount() {
            return this.f75842d.size();
        }

        /* renamed from: i */
        public C30012a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C41536l.m120489i(viewGroup, "parent");
            C28759w0 d = C28759w0.m88169d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C30012a(d);
        }

        /* renamed from: j */
        public final void mo70316j(List list) {
            C41536l.m120489i(list, "newData");
            for (C29765d e : this.f75842d) {
                e.mo69925e(false);
            }
            this.f75842d = list;
            notifyDataSetChanged();
        }
    }

    /* renamed from: yf0.c$b */
    public static final class C30013b {
        private C30013b() {
        }

        public /* synthetic */ C30013b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C30010c m90981b(C30013b bVar, List list, String str, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            return bVar.mo70318a(list, str, z);
        }

        /* renamed from: a */
        public final C30010c mo70318a(List list, String str, boolean z) {
            C41536l.m120489i(list, "list");
            C41536l.m120489i(str, "title");
            C30010c cVar = new C30010c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("SELECTABLES_LIST", list), C41233s.m119492a("ACTION_SHEET_TITLE", str), C41233s.m119492a("IS_SEARCH_VISIBLE_KEY", Boolean.valueOf(z))));
            return cVar;
        }
    }

    /* renamed from: yf0.c$c */
    public interface C30014c {
        /* renamed from: g */
        void mo60412g(C29765d dVar, String str);
    }

    /* renamed from: yf0.c$d */
    public static final class C30015d implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C29765d) obj).mo69922b(), ((C29765d) obj2).mo69922b());
        }
    }

    /* renamed from: yf0.c$e */
    static final class C30016e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30010c f75845d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30016e(C30010c cVar) {
            super(1);
            this.f75845d = cVar;
        }

        /* renamed from: a */
        public final void mo70320a(C29765d dVar) {
            C41536l.m120489i(dVar, "it");
            C30014c e2 = this.f75845d.f75841K;
            if (e2 != null) {
                e2.mo60412g(dVar, this.f75845d.getTag());
            }
            this.f75845d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70320a((C29765d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yf0.c$f */
    static final class C30017f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30010c f75846d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30017f(C30010c cVar) {
            super(1);
            this.f75846d = cVar;
        }

        /* renamed from: a */
        public final void mo70321a(String str) {
            C41536l.m120489i(str, "text");
            this.f75846d.m90970i2().mo70327U9(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70321a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yf0.c$g */
    static final class C30018g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f75847a;

        C30018g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f75847a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f75847a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f75847a.invoke(obj);
        }
    }

    /* renamed from: yf0.c$h */
    static final class C30019h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30010c f75848d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30019h(C30010c cVar) {
            super(1);
            this.f75848d = cVar;
        }

        /* renamed from: a */
        public final void mo70324a(List list) {
            C30011a d2 = this.f75848d.f75839I;
            if (d2 == null) {
                C41536l.m120506z("adapter");
                d2 = null;
            }
            C41536l.m120488h(list, "list");
            d2.mo70316j(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70324a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yf0.c$i */
    public static final class C30020i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f75849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30020i(Fragment fragment) {
            super(0);
            this.f75849d = fragment;
        }

        public final Fragment invoke() {
            return this.f75849d;
        }
    }

    /* renamed from: yf0.c$j */
    public static final class C30021j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f75850d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30021j(C43064a aVar) {
            super(0);
            this.f75850d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f75850d.invoke();
        }
    }

    /* renamed from: yf0.c$k */
    public static final class C30022k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f75851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30022k(C41217g gVar) {
            super(0);
            this.f75851d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f75851d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: yf0.c$l */
    public static final class C30023l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f75852d;

        /* renamed from: e */
        final /* synthetic */ C41217g f75853e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30023l(C43064a aVar, C41217g gVar) {
            super(0);
            this.f75852d = aVar;
            this.f75853e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f75852d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f75853e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: yf0.c$m */
    static final class C30024m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30010c f75854d;

        /* renamed from: yf0.c$m$a */
        static final class C30025a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C30010c f75855d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30025a(C30010c cVar) {
                super(0);
                this.f75855d = cVar;
            }

            /* renamed from: b */
            public final C30028f invoke() {
                C30026d h2 = this.f75855d.mo70313h2();
                Bundle arguments = this.f75855d.getArguments();
                Object obj = arguments != null ? arguments.get("SELECTABLES_LIST") : null;
                C41536l.m120487g(obj, "null cannot be cast to non-null type kotlin.collections.List<ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.model.SelectableSubTypeUIModel>");
                return h2.mo32819a((List) obj);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30024m(C30010c cVar) {
            super(0);
            this.f75854d = cVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C30025a(this.f75854d));
        }
    }

    public C30010c() {
        C30024m mVar = new C30024m(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C30021j(new C30020i(this)));
        this.f75840J = C1514j0.m5374c(this, C41520a0.m120436b(C30028f.class), new C30022k(a), new C30023l((C43064a) null, a), mVar);
    }

    /* renamed from: g2 */
    private final C28744p m90969g2() {
        C28744p pVar = this.f75838H;
        C41536l.m120486f(pVar);
        return pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final C30028f m90970i2() {
        return (C30028f) this.f75840J.getValue();
    }

    /* renamed from: j2 */
    private final void m90971j2() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        m90970i2().mo70328dw().mo70326S1().mo4819k(viewLifecycleOwner, new C30018g(new C30019h(this)));
    }

    /* renamed from: k2 */
    private final void m90972k2(boolean z) {
        if (z) {
            SearchView searchView = m90969g2().f73406f;
            C41536l.m120488h(searchView, "binding.searchView");
            C32343x.m95447f1(searchView);
            return;
        }
        SearchView searchView2 = m90969g2().f73406f;
        C41536l.m120488h(searchView2, "binding.searchView");
        C32343x.m95455i0(searchView2);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f75838H = C28744p.m88102d(layoutInflater, viewGroup, true);
    }

    /* renamed from: h2 */
    public final C30026d mo70313h2() {
        C30026d dVar = this.f75837G;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onAttach(Context context) {
        C30014c cVar;
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (context instanceof C30014c) {
            this.f75841K = (C30014c) context;
        } else if (getParentFragment() instanceof C30014c) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof C30014c) {
                cVar = (C30014c) parentFragment;
            } else {
                cVar = null;
            }
            this.f75841K = cVar;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        List list;
        String str;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m90971j2();
        Bundle arguments = getArguments();
        C30011a aVar = null;
        if (arguments != null) {
            obj = arguments.get("SELECTABLES_LIST");
        } else {
            obj = null;
        }
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("ACTION_SHEET_TITLE");
        } else {
            str = null;
        }
        boolean z = requireArguments().getBoolean("IS_SEARCH_VISIBLE_KEY");
        mo26370a2(str);
        m90972k2(z);
        if (list == null) {
            mo4577k1();
            return;
        }
        this.f75839I = new C30011a(C41358y.m120030t0(list, new C30015d()), new C30016e(this));
        RecyclerView recyclerView = m90969g2().f73405e;
        C30011a aVar2 = this.f75839I;
        if (aVar2 == null) {
            C41536l.m120506z("adapter");
        } else {
            aVar = aVar2;
        }
        recyclerView.setAdapter(aVar);
        RecyclerView recyclerView2 = m90969g2().f73405e;
        C1806i iVar = new C1806i(getContext(), 1);
        Drawable b = C5769a.m23210b(requireContext(), C25185e.f64663v);
        C41536l.m120486f(b);
        iVar.mo5985l(b);
        recyclerView2.mo5351j(iVar);
        m90969g2().f73406f.setOnTextChangeListener(new C30017f(this));
    }
}

package p363bh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.additionalactions.model.SelectorConfig;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.search.SearchView;
import p349ah.C9860d;
import p352ak.C9883c;
import p377ch.C10439c;
import p392dh.C12128a;
import p392dh.C12129b;
import p601sg.C17780e;
import p601sg.C17785j;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: bh.f */
public final class C10282f extends C9860d {

    /* renamed from: F */
    public static final C10283a f28515F = new C10283a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C12129b f28516B;

    /* renamed from: C */
    private C9883c f28517C;

    /* renamed from: D */
    private final C41217g f28518D = C41219i.m119470b(new C10288d(this));

    /* renamed from: E */
    private final C41217g f28519E = C41219i.m119470b(new C10285b(this));

    /* renamed from: bh.f$a */
    public static final class C10283a {

        /* renamed from: bh.f$a$a */
        public static final class C10284a implements C12129b {
            C10284a() {
            }

            /* renamed from: a */
            public String mo26885a(Object obj) {
                C41536l.m120489i(obj, "item");
                return obj.toString();
            }

            /* renamed from: b */
            public String mo26886b(Object obj) {
                C41536l.m120489i(obj, "item");
                return null;
            }
        }

        private C10283a() {
        }

        public /* synthetic */ C10283a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final C12129b m37493a() {
            return new C10284a();
        }

        /* renamed from: b */
        private final C10282f m37494b(SelectorConfig selectorConfig, C12129b bVar) {
            C10282f fVar = new C10282f(bVar);
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_CONFIG", selectorConfig)));
            return fVar;
        }

        /* renamed from: e */
        public static /* synthetic */ C10282f m37495e(C10283a aVar, SelectorConfig selectorConfig, C12129b bVar, int i, Object obj) {
            if ((i & 2) != 0) {
                bVar = aVar.m37493a();
            }
            return aVar.mo26884d(selectorConfig, bVar);
        }

        /* renamed from: c */
        public final C10282f mo26883c(SelectorConfig selectorConfig, C12129b bVar) {
            C41536l.m120489i(selectorConfig, "config");
            C41536l.m120489i(bVar, "textAdapter");
            return m37494b(selectorConfig, bVar);
        }

        /* renamed from: d */
        public final C10282f mo26884d(SelectorConfig selectorConfig, C12129b bVar) {
            C41536l.m120489i(selectorConfig, "config");
            C41536l.m120489i(bVar, "textAdapter");
            return m37494b(selectorConfig, bVar);
        }
    }

    /* renamed from: bh.f$b */
    static final class C10285b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C10282f f28520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10285b(C10282f fVar) {
            super(0);
            this.f28520d = fVar;
        }

        /* renamed from: b */
        public final C10439c invoke() {
            C10439c.C10440a aVar;
            if (this.f28520d.m37488p2().mo34790f()) {
                aVar = C10439c.C10440a.CHECK_MULTIPLE;
            } else if (this.f28520d.m37488p2().mo34795j()) {
                aVar = C10439c.C10440a.CHECK_ONE;
            } else {
                aVar = C10439c.C10440a.NONE;
            }
            return new C10439c(aVar, this.f28520d.f28516B, this.f28520d.m37488p2().mo34788e());
        }
    }

    /* renamed from: bh.f$c */
    static final class C10286c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C10282f f28521d;

        /* renamed from: bh.f$c$a */
        static final class C10287a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C10282f f28522d;

            /* renamed from: e */
            final /* synthetic */ String f28523e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10287a(C10282f fVar, String str) {
                super(1);
                this.f28522d = fVar;
                this.f28523e = str;
            }

            /* renamed from: a */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(C40440x.m117135K(this.f28522d.f28516B.mo26885a(obj), this.f28523e, true));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10286c(C10282f fVar) {
            super(1);
            this.f28521d = fVar;
        }

        /* renamed from: a */
        public final void mo26888a(String str) {
            C41536l.m120489i(str, "changed");
            this.f28521d.m37486n2().mo27100q(new C10287a(this.f28521d, str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26888a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bh.f$d */
    static final class C10288d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C10282f f28524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10288d(C10282f fVar) {
            super(0);
            this.f28524d = fVar;
        }

        /* renamed from: b */
        public final SelectorConfig invoke() {
            Bundle arguments = this.f28524d.getArguments();
            SelectorConfig selectorConfig = arguments != null ? (SelectorConfig) arguments.getParcelable("PARAM_CONFIG") : null;
            return selectorConfig == null ? new SelectorConfig((String) null, false, (String) null, false, false, (String) null, (String) null, false, false, 510, (DefaultConstructorMarker) null) : selectorConfig;
        }
    }

    public C10282f(C12129b bVar) {
        C41536l.m120489i(bVar, "textAdapter");
        this.f28516B = bVar;
    }

    /* renamed from: i2 */
    private final void m37481i2() {
        if (!m37488p2().mo34795j()) {
            m37486n2().mo27105v(new C10280d(this));
        }
        m37487o2().f26828e.setOnClickListener(new C10281e(this));
        m37487o2().f26830g.setOnTextChangeListener(new C10286c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m37482j2(C10282f fVar, C12128a aVar) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(aVar, "it");
        fVar.m37484l2(C41339p.m119900e(aVar.mo32321d()));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m37483k2(C10282f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        m37485m2(fVar, (List) null, 1, (Object) null);
    }

    /* renamed from: l2 */
    private final void m37484l2(List list) {
        C1533o.m5445b(this, m37488p2().mo34791g(), C0908e.m3336b(C41233s.m119492a("SELECTOR_RESULT_KEY", new ArrayList(list))));
        mo4577k1();
    }

    /* renamed from: m2 */
    static /* synthetic */ void m37485m2(C10282f fVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fVar.m37486n2().mo27101r();
        }
        fVar.m37484l2(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final C10439c m37486n2() {
        return (C10439c) this.f28519E.getValue();
    }

    /* renamed from: o2 */
    private final C9883c m37487o2() {
        C9883c cVar = this.f28517C;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final SelectorConfig m37488p2() {
        return (SelectorConfig) this.f28518D.getValue();
    }

    /* renamed from: s2 */
    private final void m37489s2() {
        Button button = m37487o2().f26828e;
        String a = m37488p2().mo34784a();
        if (a == null) {
            a = getString(C17785j.confirm);
        }
        button.setButtonText(a);
        Button button2 = m37487o2().f26828e;
        C41536l.m120488h(button2, "binding.confirmButton");
        C18368l.m62751F(button2, m37488p2().mo34795j(), false, 2, (Object) null);
        SearchView searchView = m37487o2().f26830g;
        C41536l.m120488h(searchView, "binding.searchView");
        C18368l.m62751F(searchView, m37488p2().mo34794i(), false, 2, (Object) null);
        if (m37488p2().mo34786d() != null) {
            m37487o2().f26829f.setVisibility(0);
            m37487o2().f26829f.setTitleText(m37488p2().mo34786d());
        }
        m37487o2().f26831h.setAdapter(m37486n2());
        if (m37488p2().mo34785b()) {
            m37487o2().f26831h.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C17780e.f49660V)));
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f28517C = C9883c.m36250d(layoutInflater, viewGroup, true);
        m37489s2();
        m37481i2();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        mo26370a2(m37488p2().mo34792h());
        super.onViewCreated(view, bundle);
    }

    /* renamed from: q2 */
    public final void mo26881q2(List list) {
        C41536l.m120489i(list, "data");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (Object aVar : list) {
            arrayList.add(new C12128a(aVar, false, 0, 6, (DefaultConstructorMarker) null));
        }
        mo26882r2(arrayList);
    }

    /* renamed from: r2 */
    public final void mo26882r2(List list) {
        C41536l.m120489i(list, "data");
        m37486n2().mo27104u(list);
    }
}

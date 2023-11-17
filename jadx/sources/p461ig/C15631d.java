package p461ig;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import he1.C41217g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.presentation.actionsheet.AccountSelectorComponentData;
import p349ah.C9860d;
import p376cg.C10422a;
import p653wf.C18590s;
import ue1.C43064a;

/* renamed from: ig.d */
public final class C15631d extends C9860d {

    /* renamed from: E */
    public static final C15632a f44435E = new C15632a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C10422a f44436B;

    /* renamed from: C */
    private final C15634e f44437C;

    /* renamed from: D */
    private final C41217g f44438D = C41219i.m119470b(new C15633b(this));

    /* renamed from: ig.d$a */
    public static final class C15632a {
        private C15632a() {
        }

        public /* synthetic */ C15632a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15631d mo42939a(List list) {
            C41536l.m120489i(list, "data");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("DATA", new ArrayList(list));
            C15631d dVar = new C15631d();
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* renamed from: ig.d$b */
    static final class C15633b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15631d f44439d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15633b(C15631d dVar) {
            super(0);
            this.f44439d = dVar;
        }

        /* renamed from: b */
        public final List invoke() {
            Bundle arguments = this.f44439d.getArguments();
            ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("DATA") : null;
            return parcelableArrayList == null ? C41341q.m119907j() : parcelableArrayList;
        }
    }

    public C15631d() {
        C15634e eVar = new C15634e();
        eVar.mo42945m(new C15629b(this));
        this.f44437C = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m56433f2(C15631d dVar) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m56434g2().f29633f.getButton().setEnabled(true);
    }

    /* renamed from: g2 */
    private final C10422a m56434g2() {
        C10422a aVar = this.f44436B;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: h2 */
    private final List m56435h2() {
        return (List) this.f44438D.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m56436i2(C15631d dVar, View view) {
        Object obj;
        C41536l.m120489i(dVar, "this$0");
        Iterator it = dVar.f44437C.mo42941h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AccountSelectorComponentData) obj).mo34197i()) {
                break;
            }
        }
        AccountSelectorComponentData accountSelectorComponentData = (AccountSelectorComponentData) obj;
        if (accountSelectorComponentData != null) {
            ((C15628a) dVar.requireActivity()).mo34208W(accountSelectorComponentData);
        }
        dVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f44436B = C10422a.m37854d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f44436B = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(getString(C18590s.chat_selector_component_title));
        m56434g2().f29634g.setAdapter(this.f44437C);
        m56434g2().f29633f.getButton().setEnabled(false);
        this.f44437C.mo42946n(m56435h2());
        m56434g2().f29633f.setOnClickListener(new C15630c(this));
    }
}

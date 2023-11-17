package p341ge.bog.mobilebank.cardapplications.presentation.actionsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem;
import p481jm.C16216a;
import p621tm.C18020o;
import p725cr.C19788a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.d */
public final class C13955d extends C19788a {

    /* renamed from: J */
    public static final C13956a f41339J = new C13956a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C16216a f41340H;

    /* renamed from: I */
    private final C41217g f41341I = C41219i.m119470b(new C13957b(this));

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.d$a */
    public static final class C13956a {
        private C13956a() {
        }

        public /* synthetic */ C13956a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13955d mo39053a(List list) {
            C41536l.m120489i(list, "data");
            C13955d dVar = new C13955d();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("ARG_DATA", new ArrayList(list));
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.d$b */
    static final class C13957b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C13955d f41342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13957b(C13955d dVar) {
            super(0);
            this.f41342d = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m51930c(C13955d dVar, CardRenewalListItem.CardRenewalCardItem cardRenewalCardItem) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(cardRenewalCardItem, "it");
            C1533o.m5445b(dVar, "REQUEST_KEY_CARD_RENEWAL", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_RENEWAL_SELECTED_CARD", cardRenewalCardItem)));
            dVar.mo4577k1();
        }

        /* renamed from: b */
        public final C18020o invoke() {
            return new C18020o(new C13958e(this.f41342d));
        }
    }

    /* renamed from: e2 */
    private final C18020o m51924e2() {
        return (C18020o) this.f41341I.getValue();
    }

    /* renamed from: f2 */
    private final C16216a m51925f2() {
        C16216a aVar = this.f41340H;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: g2 */
    private final void m51926g2() {
        ArrayList arrayList;
        mo26370a2(C32343x.m95388F("text.card.applications.recover.actionsheet.title", new Object[0]));
        m51925f2().f45768f.setText(C32343x.m95388F("text.card.applications.recover.actionsheet.description", new Object[0]));
        m51925f2().f45767e.setAdapter(m51924e2());
        Bundle arguments = getArguments();
        List list = null;
        if (arguments != null) {
            arrayList = arguments.getParcelableArrayList("ARG_DATA");
        } else {
            arrayList = null;
        }
        C18020o e2 = m51924e2();
        if (arrayList != null) {
            list = C41356x.m119982J(arrayList, CardRenewalListItem.class);
        }
        e2.mo6029i(list);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f41340H = C16216a.m57793d(getLayoutInflater(), viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f41340H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m51926g2();
    }
}

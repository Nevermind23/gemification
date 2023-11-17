package d21;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import b31.C31112a;
import e21.C31650b;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorData;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;
import p725cr.C19788a;
import ue1.C43064a;

/* renamed from: d21.a */
public final class C31517a extends C19788a {

    /* renamed from: J */
    public static final C31518a f78078J = new C31518a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C31112a f78079H;

    /* renamed from: I */
    private final C41217g f78080I = C41219i.m119470b(new C31519b(this));

    /* renamed from: d21.a$a */
    public static final class C31518a {
        private C31518a() {
        }

        public /* synthetic */ C31518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31517a mo71926a(CardAccountSelectorData cardAccountSelectorData) {
            C41536l.m120489i(cardAccountSelectorData, "data");
            C31517a aVar = new C31517a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_SELECTOR_DATA", cardAccountSelectorData)));
            return aVar;
        }
    }

    /* renamed from: d21.a$b */
    static final class C31519b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31517a f78081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31519b(C31517a aVar) {
            super(0);
            this.f78081d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m93597c(C31517a aVar, CardAccountSelectorUiModel cardAccountSelectorUiModel) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cardAccountSelectorUiModel, "it");
            C1533o.m5445b(aVar, "REQUEST_KEY_CARD_ACCOUNT_SELECTED", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SELECTED_ACCOUNT", cardAccountSelectorUiModel)));
            aVar.mo4577k1();
        }

        /* renamed from: b */
        public final C31650b invoke() {
            return new C31650b(new C31520b(this.f78081d));
        }
    }

    /* renamed from: e2 */
    private final C31650b m93592e2() {
        return (C31650b) this.f78080I.getValue();
    }

    /* renamed from: f2 */
    private final C31112a m93593f2() {
        C31112a aVar = this.f78079H;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f78079H = C31112a.m92567d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f78079H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41238w wVar;
        CardAccountSelectorData cardAccountSelectorData;
        long j;
        C41536l.m120489i(view, "view");
        mo26370a2(C32343x.m95388F("text.activate.iic.card.choose.account", new Object[0]));
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (cardAccountSelectorData = (CardAccountSelectorData) arguments.getParcelable("ARG_SELECTOR_DATA")) == null) {
            wVar = null;
        } else {
            m93593f2().f77318e.setAdapter(m93592e2());
            C31650b e2 = m93592e2();
            Long b = cardAccountSelectorData.mo84193b();
            if (b != null) {
                j = b.longValue();
            } else {
                j = -1;
            }
            e2.mo72078m(j);
            m93592e2().mo6029i(cardAccountSelectorData.mo84192a());
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            mo4577k1();
        }
    }
}

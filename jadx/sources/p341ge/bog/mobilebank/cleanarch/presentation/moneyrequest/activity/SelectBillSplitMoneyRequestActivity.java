package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import g91.C32343x;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n20.C26360b;
import o20.C26698k;
import o20.C26699l;
import o20.C26700m;
import o20.C26701n;
import p341ge.bog.designsystem.components.list.ListItem;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10464h;
import p738du.C20101a;
import p748eu.C20292b;
import p748eu.C20294d;
import p90.C27246a2;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectBillSplitMoneyRequestActivity */
public final class SelectBillSplitMoneyRequestActivity extends C21812b {

    /* renamed from: J */
    public static final C21792a f58161J = new C21792a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C20292b f58162G;

    /* renamed from: H */
    public C20294d f58163H;

    /* renamed from: I */
    private final C41217g f58164I = C41219i.m119470b(new C21793b(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectBillSplitMoneyRequestActivity$a */
    public static final class C21792a {
        private C21792a() {
        }

        public /* synthetic */ C21792a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54373a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, SelectBillSplitMoneyRequestActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectBillSplitMoneyRequestActivity$b */
    static final class C21793b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SelectBillSplitMoneyRequestActivity f58165d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21793b(SelectBillSplitMoneyRequestActivity selectBillSplitMoneyRequestActivity) {
            super(0);
            this.f58165d = selectBillSplitMoneyRequestActivity;
        }

        /* renamed from: b */
        public final C27246a2 invoke() {
            C27246a2 a = C27246a2.m84288a(this.f58165d.findViewById(C10322k.select_method_activity));
            C41536l.m120488h(a, "bind(findViewById(R.id.select_method_activity))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectBillSplitMoneyRequestActivity$c */
    static final class C21794c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectBillSplitMoneyRequestActivity f58166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21794c(SelectBillSplitMoneyRequestActivity selectBillSplitMoneyRequestActivity) {
            super(1);
            this.f58166d = selectBillSplitMoneyRequestActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "loaded");
            if (bool.booleanValue()) {
                ListItem listItem = this.f58166d.m70622J2().f68292j;
                C20101a aVar = C20101a.f54724a;
                int i = 0;
                listItem.setVisibility(aVar.mo48498b(this.f58166d.mo54371K2()) ? 0 : 8);
                View view = this.f58166d.m70622J2().f68293k;
                if (!aVar.mo48498b(this.f58166d.mo54371K2())) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final C27246a2 m70622J2() {
        return (C27246a2) this.f58164I.getValue();
    }

    /* renamed from: M2 */
    private final void m70623M2(String str) {
        C32343x.m95393H0(this, "money_request", str, "money_request_click_type", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m70624N2(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: O2 */
    private final void m70625O2(String str) {
        C36546y.m108282F().mo27152s("money_request", "", str);
        C36546y.m108282F().mo27137H("money_request", str, "", (Bundle) null, C10464h.C10465a.FACEBOOK);
    }

    /* renamed from: P2 */
    private final void m70626P2() {
        C27246a2 J2 = m70622J2();
        J2.f68291i.setOnClickListener(new C26699l(this));
        J2.f68289g.setOnClickListener(new C26700m(this));
        J2.f68292j.setOnClickListener(new C26701n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public static final void m70627Q2(SelectBillSplitMoneyRequestActivity selectBillSplitMoneyRequestActivity, View view) {
        C41536l.m120489i(selectBillSplitMoneyRequestActivity, "this$0");
        C26360b.f66777a.mo65556h(selectBillSplitMoneyRequestActivity);
        selectBillSplitMoneyRequestActivity.m70625O2("money_request_type_request_click");
        selectBillSplitMoneyRequestActivity.m70623M2("concrete_request_money");
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m70628R2(SelectBillSplitMoneyRequestActivity selectBillSplitMoneyRequestActivity, View view) {
        C41536l.m120489i(selectBillSplitMoneyRequestActivity, "this$0");
        C26360b.f66777a.mo65554f(selectBillSplitMoneyRequestActivity);
        selectBillSplitMoneyRequestActivity.m70625O2("money_request_type_split_click");
        selectBillSplitMoneyRequestActivity.m70623M2("money_split");
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m70629S2(SelectBillSplitMoneyRequestActivity selectBillSplitMoneyRequestActivity, View view) {
        C41536l.m120489i(selectBillSplitMoneyRequestActivity, "this$0");
        selectBillSplitMoneyRequestActivity.m70625O2("money_request_type_split_click");
        selectBillSplitMoneyRequestActivity.m70623M2("link_request");
        C38125h.m112238c(selectBillSplitMoneyRequestActivity).mo91613k0(selectBillSplitMoneyRequestActivity);
    }

    /* renamed from: T2 */
    private final void m70630T2() {
        C27246a2 J2 = m70622J2();
        J2.f68288f.setTitle(C32343x.m95388F("text.money.request.type.title", new Object[0]));
        J2.f68295m.setText(C32343x.m95388F("text.money.request.title", new Object[0]));
        J2.f68295m.setTitle(C32343x.m95388F("text.money.request.desc", new Object[0]));
        J2.f68297o.setText(C32343x.m95388F("text.bill.split.title", new Object[0]));
        J2.f68297o.setTitle(C32343x.m95388F("text.bill.split.desc", new Object[0]));
        J2.f68296n.setTitle(C32343x.m95388F("text.p2p.link.desc", new Object[0]));
        J2.f68296n.setText(C32343x.m95388F("text.p2p.link.title", new Object[0]));
    }

    /* renamed from: K2 */
    public final C20292b mo54371K2() {
        C20292b bVar = this.f58162G;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("getAppSettingByNameUseCase");
        return null;
    }

    /* renamed from: L2 */
    public final C20294d mo54372L2() {
        C20294d dVar = this.f58163H;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("internalAppSettingsLoadedUseCase");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_select_method;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C32343x.m95393H0(this, "money_request", (String) null, "money_request_first_page", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        m70630T2();
        m70626P2();
        C41205b F0 = mo54372L2().mo48777a().mo94981F0(new C26698k(new C21794c(this)));
        C41536l.m120488h(F0, "override fun onCreateSaf…       }\n        })\n    }");
        mo86438k1(F0);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m70625O2("money_request_page_view");
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.money_request_search_header);
        C41536l.m120488h(string, "getString(R.string.money_request_search_header)");
        return string;
    }
}

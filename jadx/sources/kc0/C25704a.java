package kc0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import ic0.C25168f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37619u;
import p341ge.bog.designsystem.components.actioncard.ActionCardData;
import p341ge.bog.designsystem.components.actioncard.ActionCardView;
import p341ge.bog.designsystem.components.actioncard.BadgeData;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlActionSheetArgs;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlongationTypeResultModel;
import p696zg.C19021a;
import p725cr.C19788a;
import rb0.C27982a;
import rb0.C27983b;
import rb0.C27984c;
import ue1.C43064a;
import xb0.C29713d;

/* renamed from: kc0.a */
public final class C25704a extends C19788a {

    /* renamed from: J */
    public static final C25705a f65475J = new C25705a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C29713d f65476H;

    /* renamed from: I */
    private final C41217g f65477I = C41219i.m119470b(new C25706b(this));

    /* renamed from: kc0.a$a */
    public static final class C25705a {
        private C25705a() {
        }

        public /* synthetic */ C25705a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25704a mo64277a(DepositProlActionSheetArgs depositProlActionSheetArgs) {
            C41536l.m120489i(depositProlActionSheetArgs, "args");
            C25704a aVar = new C25704a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlongationTypeActionSheet.ARGS_KEY", depositProlActionSheetArgs)));
            return aVar;
        }
    }

    /* renamed from: kc0.a$b */
    static final class C25706b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25704a f65478d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25706b(C25704a aVar) {
            super(0);
            this.f65478d = aVar;
        }

        /* renamed from: b */
        public final DepositProlActionSheetArgs invoke() {
            DepositProlActionSheetArgs depositProlActionSheetArgs;
            Bundle arguments = this.f65478d.getArguments();
            if (arguments != null && (depositProlActionSheetArgs = (DepositProlActionSheetArgs) arguments.getParcelable("ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlongationTypeActionSheet.ARGS_KEY")) != null) {
                return depositProlActionSheetArgs;
            }
            throw new NullPointerException("arguments cannot be null");
        }
    }

    /* renamed from: kc0.a$c */
    static final class C25707c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25704a f65479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25707c(C25704a aVar) {
            super(0);
            this.f65479d = aVar;
        }

        public final void invoke() {
            this.f65479d.m80926i2(C25168f.INITIAL_AMOUNT_WITH_INTEREST);
        }
    }

    /* renamed from: kc0.a$d */
    static final class C25708d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25704a f65480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25708d(C25704a aVar) {
            super(0);
            this.f65480d = aVar;
        }

        public final void invoke() {
            this.f65480d.m80926i2(C25168f.INITIAL_AMOUNT);
        }
    }

    /* renamed from: kc0.a$e */
    static final class C25709e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25704a f65481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25709e(C25704a aVar) {
            super(0);
            this.f65481d = aVar;
        }

        public final void invoke() {
            this.f65481d.m80926i2(C25168f.LOWER_THAN_INITIAL_AMOUNT);
        }
    }

    /* renamed from: kc0.a$f */
    static final class C25710f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25704a f65482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25710f(C25704a aVar) {
            super(0);
            this.f65482d = aVar;
        }

        public final void invoke() {
            this.f65482d.m80926i2(C25168f.DONT_WANT_TO_RENEW);
        }
    }

    /* renamed from: f2 */
    private final ActionCardData m80923f2(int i, String str, String str2) {
        Color.Resource resource = r0;
        Color.Resource resource2 = new Color.Resource(C27983b.f71221c);
        Image.Resource resource3 = r0;
        Image.Resource resource4 = new Image.Resource(i, (Boolean) null, 2, (DefaultConstructorMarker) null);
        C19021a aVar = C19021a.OVAL_ICON;
        Color.Attribute attribute = r0;
        Color.Attribute attribute2 = new Color.Attribute(C27982a.f71218c);
        return new ActionCardData(str, resource3, aVar, (Color) null, (Color) null, attribute, (Color) null, true, resource, (BadgeData) null, str2, (String) null, (Color) null, (Color) null, (Color) null, false, (Integer) null, (String) null, (Color) null, 522840, (DefaultConstructorMarker) null);
    }

    /* renamed from: g2 */
    private final DepositProlActionSheetArgs m80924g2() {
        return (DepositProlActionSheetArgs) this.f65477I.getValue();
    }

    /* renamed from: h2 */
    private final C29713d m80925h2() {
        C29713d dVar = this.f65476H;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final void m80926i2(C25168f fVar) {
        C1533o.m5445b(this, "ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlongationTypeActionSheet.REQUEST_TAG", C0908e.m3336b(C41233s.m119492a("ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlongationTypeActionSheet.REQUEST_TAG", new DepositProlongationTypeResultModel(fVar))));
        mo4577k1();
    }

    /* renamed from: j2 */
    private final void m80927j2() {
        boolean z;
        mo26370a2(C32343x.m95388F("deposit.prolong.actionsheet.header", new Object[0]));
        C29713d h2 = m80925h2();
        PageDescriptionView pageDescriptionView = h2.f74993j;
        pageDescriptionView.setTitle(m80924g2().mo58169a());
        pageDescriptionView.setText(C32343x.m95388F("deposit.prolong.actionsheet.text.body", new Object[0]));
        h2.f74991h.setDescription(C32343x.m95388F("deposit.prolong.actionsheet.additional.interest.info", new Object[0]));
        ActionCardView actionCardView = h2.f74990g;
        actionCardView.setData(m80923f2(C27984c.f71230a, C32343x.m95388F("deposit.prolong.actionsheet.amount.interest.subject", new Object[0]), C32343x.m95388F("deposit.prolong.actionsheet.amount.interest.body", new Object[0])));
        C41536l.m120488h(actionCardView, "setupViews$lambda$5$lambda$1");
        C37619u.m110621b(actionCardView, 0, new C25707c(this), 1, (Object) null);
        ActionCardView actionCardView2 = h2.f74989f;
        actionCardView2.setData(m80923f2(C27984c.icons_16_deposit_deposit_secured, C32343x.m95388F("deposit.prolong.actionsheet.amount.subject", new Object[0]), C32343x.m95388F("deposit.prolong.actionsheet.amount.body", new Object[0])));
        C41536l.m120488h(actionCardView2, "setupViews$lambda$5$lambda$2");
        C37619u.m110621b(actionCardView2, 0, new C25708d(this), 1, (Object) null);
        ActionCardView actionCardView3 = h2.f74992i;
        actionCardView3.setData(m80923f2(C27984c.icons_16_deposit_deposit_outline, C32343x.m95388F("deposit.prolong.actionsheet.lower.amount.subject", new Object[0]), C32343x.m95388F("deposit.prolong.actionsheet.lower.amount.body", new Object[0])));
        C41536l.m120488h(actionCardView3, "setupViews$lambda$5$lambda$3");
        C37619u.m110621b(actionCardView3, 0, new C25709e(this), 1, (Object) null);
        Button button = h2.f74988e;
        button.setButtonTextTint(C0767a.m2894d(button.getContext(), C27983b.f71223e));
        button.setButtonText(C32343x.m95388F("deposit.prolong.actionsheet.decline", new Object[0]));
        C41536l.m120488h(button, "setupViews$lambda$5$lambda$4");
        if (m80924g2().mo58170b() != C25168f.DONT_WANT_TO_RENEW) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(button, z, false, 2, (Object) null);
        C37619u.m110621b(button, 0, new C25710f(this), 1, (Object) null);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f65476H = C29713d.m90218d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f65476H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m80927j2();
    }
}

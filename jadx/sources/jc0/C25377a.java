package jc0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodArgs;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodModel;
import p725cr.C19788a;
import rb0.C27984c;
import ue1.C43064a;
import ue1.C43075l;
import xb0.C29711c;

/* renamed from: jc0.a */
public final class C25377a extends C19788a {

    /* renamed from: J */
    public static final C25378a f65023J = new C25378a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C29711c f65024H;

    /* renamed from: I */
    private final C41217g f65025I = C41219i.m119470b(new C25379b(this));

    /* renamed from: jc0.a$a */
    public static final class C25378a {
        private C25378a() {
        }

        public /* synthetic */ C25378a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25377a mo63964a(DepositPeriodArgs depositPeriodArgs) {
            C41536l.m120489i(depositPeriodArgs, "args");
            C25377a aVar = new C25377a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodActionSheet.ARGS_KEY", depositPeriodArgs)));
            return aVar;
        }
    }

    /* renamed from: jc0.a$b */
    static final class C25379b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25377a f65026d;

        /* renamed from: jc0.a$b$a */
        /* synthetic */ class C25380a extends C41535k implements C43075l {
            C25380a(Object obj) {
                super(1, obj, C25377a.class, "onItemClicked", "onItemClicked(Lge/bog/mobilebank/deposits/presentation/prolongation/actionsheet/depositperiod/DepositPeriodModel;)V", 0);
            }

            /* renamed from: b */
            public final void mo63966b(DepositPeriodModel depositPeriodModel) {
                C41536l.m120489i(depositPeriodModel, "p0");
                ((C25377a) this.receiver).m80557h2(depositPeriodModel);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo63966b((DepositPeriodModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25379b(C25377a aVar) {
            super(0);
            this.f65026d = aVar;
        }

        /* renamed from: b */
        public final C25382c invoke() {
            return new C25382c(new C25380a(this.f65026d));
        }
    }

    /* renamed from: f2 */
    private final C25382c m80555f2() {
        return (C25382c) this.f65025I.getValue();
    }

    /* renamed from: g2 */
    private final C29711c m80556g2() {
        C29711c cVar = this.f65024H;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final void m80557h2(DepositPeriodModel depositPeriodModel) {
        C1533o.m5445b(this, "ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.REQUEST", C0908e.m3336b(C41233s.m119492a("ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.REQUEST", depositPeriodModel)));
        mo4577k1();
    }

    /* renamed from: i2 */
    private final void m80558i2(DepositPeriodArgs depositPeriodArgs) {
        String str;
        DepositPeriodModel depositPeriodModel = (DepositPeriodModel) C41358y.m120009Y(depositPeriodArgs.mo58135a());
        if (depositPeriodModel != null) {
            if (depositPeriodModel instanceof DepositPeriodModel.Deposit) {
                str = C32343x.m95388F("deposit.prolong.actionsheat.terms.choosig.month", new Object[0]);
            } else if (depositPeriodModel instanceof DepositPeriodModel.Withdrawal) {
                str = C32343x.m95388F("deposit.prolong.actionsheat.acrual.periods", new Object[0]);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            mo26370a2(C32343x.m95388F(str, new Object[0]));
        }
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        BottomSheetBehavior K1 = mo26359K1();
        if (K1 != null) {
            K1.mo15579I0(4);
        }
        m80556g2().f74983e.setAdapter(m80555f2());
        m80556g2().f74983e.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C27984c.f71248y), true, false));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f65024H = C29711c.m90211d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f65024H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41238w wVar;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        DepositPeriodArgs depositPeriodArgs = (DepositPeriodArgs) requireArguments().getParcelable("ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodActionSheet.ARGS_KEY");
        if (depositPeriodArgs != null) {
            m80558i2(depositPeriodArgs);
            m80555f2().mo6029i(depositPeriodArgs.mo58135a());
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            mo4577k1();
        }
    }
}

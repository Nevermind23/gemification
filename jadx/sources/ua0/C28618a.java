package ua0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import da0.C19950d;
import g91.C32343x;
import ha0.C24927d;
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
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodArgs;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodModel;
import p725cr.C19788a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ua0.a */
public final class C28618a extends C19788a {

    /* renamed from: J */
    public static final C28619a f72634J = new C28619a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C24927d f72635H;

    /* renamed from: I */
    private final C41217g f72636I = C41219i.m119470b(new C28620b(this));

    /* renamed from: ua0.a$a */
    public static final class C28619a {
        private C28619a() {
        }

        public /* synthetic */ C28619a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28618a mo68338a(DepositPeriodArgs depositPeriodArgs) {
            C41536l.m120489i(depositPeriodArgs, "args");
            C28618a aVar = new C28618a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.DepositPeriodActionSheet.ARGS_KEY", depositPeriodArgs)));
            return aVar;
        }
    }

    /* renamed from: ua0.a$b */
    static final class C28620b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C28618a f72637d;

        /* renamed from: ua0.a$b$a */
        /* synthetic */ class C28621a extends C41535k implements C43075l {
            C28621a(Object obj) {
                super(1, obj, C28618a.class, "onItemClicked", "onItemClicked(Lge/bog/mobilebank/depositapplication/presentation/combinedoffer/fragments/actionsheet/period/DepositPeriodModel;)V", 0);
            }

            /* renamed from: b */
            public final void mo68340b(DepositPeriodModel depositPeriodModel) {
                C41536l.m120489i(depositPeriodModel, "p0");
                ((C28618a) this.receiver).m87580h2(depositPeriodModel);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo68340b((DepositPeriodModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28620b(C28618a aVar) {
            super(0);
            this.f72637d = aVar;
        }

        /* renamed from: b */
        public final C28623c invoke() {
            return new C28623c(new C28621a(this.f72637d));
        }
    }

    /* renamed from: f2 */
    private final C28623c m87578f2() {
        return (C28623c) this.f72636I.getValue();
    }

    /* renamed from: g2 */
    private final C24927d m87579g2() {
        C24927d dVar = this.f72635H;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final void m87580h2(DepositPeriodModel depositPeriodModel) {
        C1533o.m5445b(this, "ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.REQUEST", C0908e.m3336b(C41233s.m119492a("ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.REQUEST", depositPeriodModel)));
        mo4577k1();
    }

    /* renamed from: i2 */
    private final void m87581i2(DepositPeriodArgs depositPeriodArgs) {
        String str;
        DepositPeriodModel depositPeriodModel = (DepositPeriodModel) C41358y.m120009Y(depositPeriodArgs.mo56958a());
        if (depositPeriodModel != null) {
            if (depositPeriodModel instanceof DepositPeriodModel.Deposit) {
                str = "applications.deposits.term.label";
            } else if (depositPeriodModel instanceof DepositPeriodModel.Withdrawal) {
                str = "applications.deposits.int.accrual.period.label";
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
        m87579g2().f64105e.setAdapter(m87578f2());
        m87579g2().f64105e.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C19950d.f54501u), true, false));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f72635H = C24927d.m79686d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f72635H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41238w wVar;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        DepositPeriodArgs depositPeriodArgs = (DepositPeriodArgs) requireArguments().getParcelable("ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.DepositPeriodActionSheet.ARGS_KEY");
        if (depositPeriodArgs != null) {
            m87581i2(depositPeriodArgs);
            m87578f2().mo6029i(depositPeriodArgs.mo56958a());
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            mo4577k1();
        }
    }
}

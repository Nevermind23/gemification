package p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main;

import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import ic0.C25168f;
import ic0.C25169g;
import ie1.C41330k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jc0.C25377a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc0.C25916a;
import lc0.C25917b;
import lc0.C25918c;
import lc0.C25919d;
import lc0.C25920e;
import lc0.C25921f;
import lc0.C25922g;
import lc0.C25923h;
import lc0.C25926k;
import lc0.C25927l;
import lc0.C25928m;
import lc0.C25929n;
import lc0.C25931p;
import lc0.C25932q;
import lc0.C25933r;
import lc0.C25940x;
import lc0.C25949y;
import ld0.C25950a;
import o00.C26656a;
import o31.C37588a0;
import o31.C37619u;
import p00.C27113k;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodArgs;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodModel;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.DepositProlongationResultFragmentArgs;
import p341ge.bog.mobilebank.model.offers.Summary;
import p547oi.C17199a;
import p547oi.C17201b;
import p561pi.C17367b;
import p615tg.C17959a;
import p642vh.C18368l;
import py0.C38049c;
import py0.C38050d;
import rb0.C27985d;
import rb0.C27988g;
import rb0.C27989h;
import ue1.C43064a;
import ue1.C43075l;
import xb0.C29716e0;
import xb0.C29718f0;
import xb0.C29722j;
import xb0.C29723k;
import ze1.C43420e;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment */
public final class DepositProlongationMainFragment extends C23288a implements C26656a {

    /* renamed from: g */
    private C29723k f60852g;

    /* renamed from: h */
    private final C41217g f60853h = C41219i.m119470b(new C23253a(this));

    /* renamed from: i */
    public C25929n f60854i;

    /* renamed from: j */
    private final C41217g f60855j;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$a */
    static final class C23253a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23253a(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(0);
            this.f60856d = depositProlongationMainFragment;
        }

        /* renamed from: b */
        public final DepositProlongationMainFragmentArgs invoke() {
            DepositProlongationMainFragmentArgs depositProlongationMainFragmentArgs;
            Bundle arguments = this.f60856d.getArguments();
            if (arguments != null && (depositProlongationMainFragmentArgs = (DepositProlongationMainFragmentArgs) arguments.getParcelable(this.f60856d.getString(C27988g.deposit_prolongation_fragment_args_key))) != null) {
                return depositProlongationMainFragmentArgs;
            }
            throw new NullPointerException("arguments cannot be null");
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$a0 */
    static final class C23254a0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60857d;

        /* renamed from: e */
        final /* synthetic */ C25949y f60858e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23254a0(DepositProlongationMainFragment depositProlongationMainFragment, C25949y yVar) {
            super(0);
            this.f60857d = depositProlongationMainFragment;
            this.f60858e = yVar;
        }

        public final void invoke() {
            this.f60857d.m75107K1();
            this.f60857d.m75122a2(this.f60858e.mo64860b());
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$b */
    /* synthetic */ class C23255b extends C41535k implements C43075l {
        C23255b(Object obj) {
            super(1, obj, DepositProlongationMainFragment.class, "updateButtonState", "updateButtonState(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo58192b(boolean z) {
            ((DepositProlongationMainFragment) this.receiver).m75149r2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58192b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$b0 */
    public static final class C23256b0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f60859d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23256b0(Fragment fragment) {
            super(0);
            this.f60859d = fragment;
        }

        public final Fragment invoke() {
            return this.f60859d;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$c */
    /* synthetic */ class C23257c extends C41535k implements C43075l {
        C23257c(Object obj) {
            super(1, obj, DepositProlongationMainFragment.class, "updateAmountBlock", "updateAmountBlock(Lge/bog/mobilebank/deposits/presentation/prolongation/fragment/main/DepositProlongationMainViewModel$AmountUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo58193b(C25927l lVar) {
            C41536l.m120489i(lVar, "p0");
            ((DepositProlongationMainFragment) this.receiver).m75145p2(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58193b((C25927l) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$c0 */
    public static final class C23258c0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23258c0(C43064a aVar) {
            super(0);
            this.f60860d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f60860d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$d */
    /* synthetic */ class C23259d extends C41535k implements C43075l {
        C23259d(Object obj) {
            super(1, obj, DepositProlongationMainFragment.class, "onWithdrawalTypesResult", "onWithdrawalTypesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo58194b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositProlongationMainFragment) this.receiver).m75120Y1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58194b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$d0 */
    public static final class C23260d0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f60861d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23260d0(C41217g gVar) {
            super(0);
            this.f60861d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f60861d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$e */
    /* synthetic */ class C23261e extends C41535k implements C43075l {
        C23261e(Object obj) {
            super(1, obj, DepositProlongationMainFragment.class, "onProlongationPeriodResult", "onProlongationPeriodResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo58195b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositProlongationMainFragment) this.receiver).m75118W1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58195b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$e0 */
    public static final class C23262e0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60862d;

        /* renamed from: e */
        final /* synthetic */ C41217g f60863e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23262e0(C43064a aVar, C41217g gVar) {
            super(0);
            this.f60862d = aVar;
            this.f60863e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60862d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f60863e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$f */
    /* synthetic */ class C23263f extends C41535k implements C43075l {
        C23263f(Object obj) {
            super(1, obj, DepositProlongationMainFragment.class, "onPrecontractResult", "onPrecontractResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo58196b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositProlongationMainFragment) this.receiver).m75117V1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58196b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$f0 */
    static final class C23264f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23264f0(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60864d = depositProlongationMainFragment;
        }

        /* renamed from: a */
        public final void mo58197a(double d) {
            this.f60864d.m75112Q1().mo64850tw().mo64797z3(d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58197a(((Number) obj).doubleValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$g */
    /* synthetic */ class C23265g extends C41535k implements C43075l {
        C23265g(Object obj) {
            super(1, obj, DepositProlongationMainFragment.class, "onProlongationResult", "onProlongationResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo58198b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositProlongationMainFragment) this.receiver).m75119X1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58198b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$g0 */
    static final class C23266g0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60865d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$g0$a */
        static final class C23267a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ DepositProlongationMainFragment f60866d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23267a(DepositProlongationMainFragment depositProlongationMainFragment) {
                super(0);
                this.f60866d = depositProlongationMainFragment;
            }

            /* renamed from: b */
            public final C25940x invoke() {
                C25929n O1 = this.f60866d.mo58190O1();
                DepositProlongationMainFragmentArgs q1 = this.f60866d.m75108L1();
                C41536l.m120488h(q1, "args");
                return O1.mo32816a(q1);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23266g0(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(0);
            this.f60865d = depositProlongationMainFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C23267a(this.f60865d));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$h */
    /* synthetic */ class C23268h extends C41535k implements C43075l {
        C23268h(Object obj) {
            super(1, obj, DepositProlongationMainFragment.class, "updateAmountInfoState", "updateAmountInfoState(Lge/bog/mobilebank/deposits/presentation/prolongation/fragment/main/DepositProlongationMainViewModel$AmountInfoState;)V", 0);
        }

        /* renamed from: b */
        public final void mo58200b(C25926k kVar) {
            C41536l.m120489i(kVar, "p0");
            ((DepositProlongationMainFragment) this.receiver).m75147q2(kVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58200b((C25926k) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$i */
    /* synthetic */ class C23269i extends C41535k implements C43075l {
        C23269i(Object obj) {
            super(1, obj, DepositProlongationMainFragment.class, "updateNewAmountInfo", "updateNewAmountInfo(Lge/bog/mobilebank/deposits/presentation/prolongation/fragment/main/DepositProlongationMainViewModel$NewAmountWithChange;)V", 0);
        }

        /* renamed from: b */
        public final void mo58201b(C25932q qVar) {
            C41536l.m120489i(qVar, "p0");
            ((DepositProlongationMainFragment) this.receiver).m75157v2(qVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58201b((C25932q) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$j */
    /* synthetic */ class C23270j extends C41535k implements C43075l {
        C23270j(Object obj) {
            super(1, obj, DepositProlongationMainFragment.class, "updateInterestDetails", "updateInterestDetails(Lge/bog/mobilebank/deposits/presentation/prolongation/fragment/main/DepositProlongationMainViewModel$InterestDetailsUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo58202b(C25931p pVar) {
            C41536l.m120489i(pVar, "p0");
            ((DepositProlongationMainFragment) this.receiver).m75153t2(pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58202b((C25931p) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$k */
    /* synthetic */ class C23271k extends C41535k implements C43075l {
        C23271k(Object obj) {
            super(1, obj, DepositProlongationMainFragment.class, "updateChips", "updateChips(Lge/bog/mobilebank/deposits/presentation/prolongation/DepositProlongationType;)V", 0);
        }

        /* renamed from: b */
        public final void mo58203b(C25168f fVar) {
            C41536l.m120489i(fVar, "p0");
            ((DepositProlongationMainFragment) this.receiver).m75151s2(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58203b((C25168f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$l */
    static final class C23272l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23272l(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60867d = depositProlongationMainFragment;
        }

        /* renamed from: a */
        public final void mo58204a(C25950a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f60867d.m75116U1(false);
            C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, aVar.mo64864a(), false, (String) null, (ArrayList) null, (Summary) null, C32343x.m95388F("deposit.prolong.terms.precontract", new Object[0]), 30, (Object) null);
            FragmentManager childFragmentManager = this.f60867d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            c.mo4576A1(childFragmentManager, (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58204a((C25950a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$m */
    static final class C23273m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23273m(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60868d = depositProlongationMainFragment;
        }

        /* renamed from: a */
        public final void mo58205a(C25950a aVar) {
            this.f60868d.m75116U1(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58205a((C25950a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$n */
    static final class C23274n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60869d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23274n(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60869d = depositProlongationMainFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60869d.m75115T1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$o */
    static final class C23275o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60870d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23275o(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60870d = depositProlongationMainFragment;
        }

        /* renamed from: a */
        public final void mo58207a(C25928m mVar) {
            C41536l.m120489i(mVar, "it");
            this.f60870d.m75116U1(false);
            this.f60870d.m75128g2(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58207a((C25928m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$p */
    static final class C23276p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23276p(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60871d = depositProlongationMainFragment;
        }

        /* renamed from: a */
        public final void mo58208a(C25928m mVar) {
            this.f60871d.m75116U1(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58208a((C25928m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$q */
    static final class C23277q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23277q(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60872d = depositProlongationMainFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60872d.m75115T1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$r */
    static final class C23278r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60873d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23278r(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60873d = depositProlongationMainFragment;
        }

        /* renamed from: a */
        public final void mo58210a(LinkedHashMap linkedHashMap) {
            C41536l.m120489i(linkedHashMap, "it");
            this.f60873d.m75116U1(false);
            this.f60873d.m75113R1(linkedHashMap);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58210a((LinkedHashMap) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$s */
    static final class C23279s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23279s(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60874d = depositProlongationMainFragment;
        }

        /* renamed from: a */
        public final void mo58211a(LinkedHashMap linkedHashMap) {
            this.f60874d.m75116U1(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58211a((LinkedHashMap) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$t */
    static final class C23280t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23280t(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60875d = depositProlongationMainFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60875d.m75115T1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$u */
    static final class C23281u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23281u(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60876d = depositProlongationMainFragment;
        }

        /* renamed from: a */
        public final void mo58213a(C25949y yVar) {
            C41536l.m120489i(yVar, "it");
            this.f60876d.m75116U1(false);
            this.f60876d.m75143o2(yVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58213a((C25949y) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$v */
    static final class C23282v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23282v(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60877d = depositProlongationMainFragment;
        }

        /* renamed from: a */
        public final void mo58214a(C25949y yVar) {
            this.f60877d.m75116U1(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58214a((C25949y) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$w */
    static final class C23283w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60878d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23283w(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(1);
            this.f60878d = depositProlongationMainFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60878d.m75115T1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$x */
    static final class C23284x implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60879a;

        C23284x(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60879a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60879a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60879a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$y */
    static final class C23285y extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60880d;

        /* renamed from: e */
        final /* synthetic */ C25928m f60881e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23285y(DepositProlongationMainFragment depositProlongationMainFragment, C25928m mVar) {
            super(0);
            this.f60880d = depositProlongationMainFragment;
            this.f60881e = mVar;
        }

        public final void invoke() {
            this.f60880d.m75107K1();
            this.f60880d.m75121Z1(this.f60881e.mo64790b());
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment$z */
    static final class C23286z extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationMainFragment f60882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23286z(DepositProlongationMainFragment depositProlongationMainFragment) {
            super(0);
            this.f60882d = depositProlongationMainFragment;
        }

        public final void invoke() {
            this.f60882d.m75112Q1().mo64850tw().mo64796s2();
        }
    }

    public DepositProlongationMainFragment() {
        C23266g0 g0Var = new C23266g0(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C23258c0(new C23256b0(this)));
        this.f60855j = C1514j0.m5374c(this, C41520a0.m120436b(C25940x.class), new C23260d0(a), new C23262e0((C43064a) null, a), g0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public final void m75107K1() {
        Input input = m75109M1().f75101m.f75007e;
        C18368l.m62767p(input.getTextInput());
        input.clearFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final DepositProlongationMainFragmentArgs m75108L1() {
        return (DepositProlongationMainFragmentArgs) this.f60853h.getValue();
    }

    /* renamed from: M1 */
    private final C29723k m75109M1() {
        C29723k kVar = this.f60852g;
        C41536l.m120486f(kVar);
        return kVar;
    }

    /* renamed from: N1 */
    private final Spannable m75110N1(double d) {
        String str = d + "%";
        String F = C32343x.m95388F("deposit.prolong.page.interest.details.extra.amount", "+" + str);
        int X = C40440x.m117156X(F, str, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(F);
        spannableString.setSpan(new TextAppearanceSpan(requireContext(), C27989h.TextSubtitle1Primary500Left), X, str.length() + X, 33);
        return spannableString;
    }

    /* renamed from: P1 */
    private final C27113k m75111P1() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        return C32343x.m95443e0(childFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final C25940x m75112Q1() {
        return (C25940x) this.f60855j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public final void m75113R1(LinkedHashMap linkedHashMap) {
        DepositProlongationResultFragmentArgs depositProlongationResultFragmentArgs = new DepositProlongationResultFragmentArgs(C32343x.m95388F("deposit.prolong.success.newterm", new Object[0]), (String) null, linkedHashMap, 2, (DefaultConstructorMarker) null);
        C8034d.m30522a(this).mo22118M(C27985d.action_deposit_prolongation_main_to_deposit_prolongation_result, C0908e.m3336b(C41233s.m119492a(getString(C27988g.deposit_prolongation_result_fragment_args_key), depositProlongationResultFragmentArgs)));
    }

    /* renamed from: S1 */
    private final void m75114S1() {
        C25933r uw = m75112Q1().mo64851uw();
        uw.mo64817fe().mo4819k(getViewLifecycleOwner(), new C23284x(new C23257c(this)));
        uw.mo64821z1().mo4819k(getViewLifecycleOwner(), new C23284x(new C23259d(this)));
        uw.mo64816db().mo4819k(getViewLifecycleOwner(), new C23284x(new C23261e(this)));
        uw.mo64812P2().mo4819k(getViewLifecycleOwner(), new C23284x(new C23263f(this)));
        uw.mo64818ga().mo4819k(getViewLifecycleOwner(), new C23284x(new C23265g(this)));
        uw.mo64813Pr().mo4819k(getViewLifecycleOwner(), new C23284x(new C23268h(this)));
        uw.mo64820on().mo4819k(getViewLifecycleOwner(), new C23284x(new C23269i(this)));
        uw.mo64819od().mo4819k(getViewLifecycleOwner(), new C23284x(new C23270j(this)));
        uw.mo64815Z4().mo4819k(getViewLifecycleOwner(), new C23284x(new C23271k(this)));
        uw.mo64814T2().mo4819k(getViewLifecycleOwner(), new C23284x(new C23255b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public final void m75115T1(Throwable th) {
        m75116U1(false);
        handleError(th);
        CardView cardView = m75109M1().f75105q;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95447f1(cardView);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m75116U1(boolean z) {
        FrameLayout frameLayout = m75109M1().f75103o;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public final void m75117V1(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C23272l(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C23273m(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23274n(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public final void m75118W1(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C23275o(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C23276p(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23277q(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public final void m75119X1(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C23278r(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C23279s(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23280t(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final void m75120Y1(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C23281u(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C23282v(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23283w(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public final void m75121Z1(C38049c cVar) {
        C43420e eVar = new C43420e(cVar.mo91451d(), cVar.mo91449b());
        ArrayList arrayList = new ArrayList(C41343r.m119925u(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(new DepositPeriodModel.Deposit(((C41330k0) it).nextInt(), cVar.mo91450c(), cVar.mo91448a()));
        }
        C25377a.f65023J.mo63964a(new DepositPeriodArgs(arrayList)).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public final void m75122a2(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38050d dVar = (C38050d) it.next();
            arrayList.add(new DepositPeriodModel.Withdrawal(dVar.mo91456b(), dVar.mo91455a()));
        }
        C25377a.f65023J.mo63964a(new DepositPeriodArgs(arrayList)).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: b2 */
    private final void m75123b2() {
        boolean z;
        ChipGroup chipGroup = m75109M1().f75096h;
        C25168f[] values = C25168f.values();
        ArrayList<C25168f> arrayList = new ArrayList<>();
        for (C25168f fVar : values) {
            if (fVar != C25168f.DONT_WANT_TO_RENEW) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(fVar);
            }
        }
        for (C25168f b : arrayList) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(C32343x.m95388F(b.mo63710b(), new Object[0]));
            chipGroup.mo35183o(chip);
        }
        chipGroup.setOnChipActivatedChangedListener(new C25923h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m75124c2(DepositProlongationMainFragment depositProlongationMainFragment, Chip chip, int i) {
        C25168f a;
        C41536l.m120489i(depositProlongationMainFragment, "this$0");
        C41536l.m120489i(chip, "chip");
        if (chip.isActivated() && (a = C25169g.m80234a(i)) != null) {
            depositProlongationMainFragment.m75107K1();
            depositProlongationMainFragment.m75112Q1().mo64850tw().mo64794Bq(a);
        }
    }

    /* renamed from: d2 */
    private final void m75125d2() {
        C29722j jVar = m75109M1().f75098j;
        jVar.f75082e.setTitle(C32343x.m95388F("deposit.prolong.page.interest.details.subject", new Object[0]));
        jVar.f75086i.setText(C32343x.m95388F("deposit.prolong.page.interest.details.effective", new Object[0]));
        jVar.f75083f.setText(C32343x.m95388F("deposit.prolong.page.interest.details.extra.interest", new Object[0]));
        jVar.f75090m.setText(C32343x.m95388F("deposit.prolong.page.interest.details.total", new Object[0]));
        jVar.f75088k.setText(C32343x.m95388F("deposit.prolong.page.interest.details.potential", new Object[0]));
    }

    /* renamed from: e2 */
    private final void m75126e2() {
        C29716e0 e0Var = m75109M1().f75101m;
        e0Var.f75010h.setText(C32343x.m95388F("deposit.prolong.page.current.deposit.amount", new Object[0]));
        e0Var.f75008f.setText(C32343x.m95388F("deposit.prolong.page.new.deposit.amount", new Object[0]));
        e0Var.f75012j.setText(C32343x.m95388F("deposit.prolong.page.withdraw.amount", new Object[0]));
        Input input = e0Var.f75007e;
        input.setHintText((CharSequence) C32343x.m95388F("deposit.prolong.page.new.deposit.amount", new Object[0]));
        input.setFormatter(new C17367b((String) null, (String) null, (String) null, "###,##0.00", 7, (DefaultConstructorMarker) null));
        input.setFilters(new C17201b[]{new C17199a((String) null, 1, (DefaultConstructorMarker) null)});
        input.getTextInput().setOnKeyListener(new C25922g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final boolean m75127f2(DepositProlongationMainFragment depositProlongationMainFragment, View view, int i, KeyEvent keyEvent) {
        C41536l.m120489i(depositProlongationMainFragment, "this$0");
        if (i != 6 && keyEvent.getKeyCode() != 66) {
            return false;
        }
        depositProlongationMainFragment.m75107K1();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final void m75128g2(C25928m mVar) {
        Input input = m75109M1().f75107s;
        input.setHintText((CharSequence) C32343x.m95388F("deposit.prolong.page.selectbox.term", new Object[0]));
        m75160x2(mVar.mo64789a());
        C41536l.m120488h(input, "setupProlongationPeriodSelectBox$lambda$23");
        C37619u.m110621b(input, 0, new C23285y(this, mVar), 1, (Object) null);
    }

    /* renamed from: h2 */
    private final void m75129h2() {
        getChildFragmentManager().mo4367F1("ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.REQUEST", this, new C25917b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m75131i2(DepositProlongationMainFragment depositProlongationMainFragment, String str, Bundle bundle) {
        C41536l.m120489i(depositProlongationMainFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        DepositPeriodModel depositPeriodModel = (DepositPeriodModel) bundle.getParcelable("ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.REQUEST");
        if (depositPeriodModel == null) {
            return;
        }
        if (depositPeriodModel instanceof DepositPeriodModel.Deposit) {
            DepositPeriodModel.Deposit deposit = (DepositPeriodModel.Deposit) depositPeriodModel;
            depositProlongationMainFragment.m75160x2(deposit.mo58147d());
            depositProlongationMainFragment.m75112Q1().mo64847Aw(deposit);
        } else if (depositPeriodModel instanceof DepositPeriodModel.Withdrawal) {
            DepositPeriodModel.Withdrawal withdrawal = (DepositPeriodModel.Withdrawal) depositPeriodModel;
            depositProlongationMainFragment.m75162y2(withdrawal.mo58157a());
            depositProlongationMainFragment.m75112Q1().mo64848Cw(withdrawal.mo58158b(), withdrawal.mo58157a());
        }
    }

    /* renamed from: j2 */
    private final void m75133j2() {
        C29723k M1 = m75109M1();
        m75126e2();
        m75123b2();
        m75125d2();
        M1.f75094f.setTitle(C32343x.m95388F("deposit.prolong.page.header", new Object[0]));
        M1.f75100l.setDescription(C32343x.m95388F("deposit.prolong.page.additional.interest.info", new Object[0]));
        M1.f75108t.setTitle(C32343x.m95388F("deposit.prolong.page.choose.terms", new Object[0]));
        Button button = M1.f75097i;
        button.setButtonText(C32343x.m95388F("deposit.prolong.page.continue.button", new Object[0]));
        C41536l.m120488h(button, "setupViews$lambda$8$lambda$0");
        C37619u.m110621b(button, 0, new C23286z(this), 1, (Object) null);
        M1.f75104p.mo3946b().setOnClickListener(new C25918c(this, M1));
        TwoLineTextItem twoLineTextItem = M1.f75099k.f75120f;
        twoLineTextItem.setTitle(C32343x.m95388F("deposit.prolong.page.chips.amount.interest", new Object[0]));
        twoLineTextItem.setText(C32343x.m95388F("deposit.prolong.page.full.amount", new Object[0]));
        TwoLineTextItem twoLineTextItem2 = M1.f75102n.f75037g;
        twoLineTextItem2.setTitle(C32343x.m95388F("deposit.prolong.page.initial.amount", new Object[0]));
        twoLineTextItem2.setText(C32343x.m95388F("deposit.prolong.page.new.deposit.amount", new Object[0]));
        TwoLineTextItem twoLineTextItem3 = M1.f75102n.f75035e;
        twoLineTextItem3.setTitle(C32343x.m95388F("deposit.prolong.page.new.deposit.Accrued.interest", new Object[0]));
        twoLineTextItem3.setText(C32343x.m95388F("deposit.prolong.page.withdraw.amount", new Object[0]));
        M1.f75093e.setOnClickListener(new C25919d(this));
        M1.f75106r.setOnClickListener(new C25920e(this));
        M1.f75098j.mo3946b().setOnClickListener(new C25921f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m75135k2(DepositProlongationMainFragment depositProlongationMainFragment, C29723k kVar, View view) {
        C41536l.m120489i(depositProlongationMainFragment, "this$0");
        C41536l.m120489i(kVar, "$this_with");
        depositProlongationMainFragment.m75112Q1().onRefresh(6);
        CardView cardView = kVar.f75105q;
        C41536l.m120488h(cardView, "retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m75137l2(DepositProlongationMainFragment depositProlongationMainFragment, View view) {
        C41536l.m120489i(depositProlongationMainFragment, "this$0");
        depositProlongationMainFragment.m75107K1();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m75139m2(DepositProlongationMainFragment depositProlongationMainFragment, View view) {
        C41536l.m120489i(depositProlongationMainFragment, "this$0");
        depositProlongationMainFragment.m75107K1();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m75141n2(DepositProlongationMainFragment depositProlongationMainFragment, View view) {
        C41536l.m120489i(depositProlongationMainFragment, "this$0");
        depositProlongationMainFragment.m75107K1();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m75143o2(C25949y yVar) {
        Input input = m75109M1().f75109u;
        input.setHintText((CharSequence) C32343x.m95388F("deposit.prolong.page.selectbox.interest.receive", new Object[0]));
        input.setInputText(C32343x.m95388F(yVar.mo64859a(), new Object[0]));
        C41536l.m120488h(input, "setupWithdrawalSelectBox$lambda$22");
        C37619u.m110621b(input, 0, new C23254a0(this, yVar), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final void m75145p2(C25927l lVar) {
        m75155u2(lVar);
        m75158w2(lVar);
        m75109M1().f75099k.f75121g.setText(lVar.mo64782d());
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final void m75147q2(C25926k kVar) {
        C29723k M1 = m75109M1();
        FrameLayout c = M1.f75099k.mo3946b();
        C41536l.m120488h(c, "initialAmountWithInterestLayout.root");
        C32343x.m95483r1(c, kVar.mo64774b(), false, 2, (Object) null);
        LinearLayoutCompat c2 = M1.f75101m.mo3946b();
        C41536l.m120488h(c2, "lowerThanInitialAmountLayout.root");
        C32343x.m95483r1(c2, kVar.mo64775c(), false, 2, (Object) null);
        LinearLayoutCompat c3 = M1.f75102n.mo3946b();
        C41536l.m120488h(c3, "onlyInitialAmountLayout.root");
        C32343x.m95483r1(c3, kVar.mo64773a(), false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m75149r2(boolean z) {
        m75109M1().f75097i.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m75151s2(C25168f fVar) {
        ChipGroup chipGroup = m75109M1().f75096h;
        chipGroup.mo35182m(fVar.ordinal(), true);
        chipGroup.mo35192y(fVar.ordinal());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final void m75153t2(C25931p pVar) {
        C29722j jVar = m75109M1().f75098j;
        LayerView layerView = jVar.f75085h;
        C41536l.m120488h(layerView, "interestContainer");
        C32343x.m95407O0(layerView);
        AppCompatTextView appCompatTextView = jVar.f75087j;
        double c = pVar.mo64800c();
        appCompatTextView.setText(c + "%");
        AppCompatTextView appCompatTextView2 = jVar.f75084g;
        double b = pVar.mo64799b();
        appCompatTextView2.setText(b + "%");
        jVar.f75083f.setTitle(m75110N1(pVar.mo64799b()));
        AppCompatTextView appCompatTextView3 = jVar.f75091n;
        double e = pVar.mo64802e();
        appCompatTextView3.setText(e + "%");
        jVar.f75089l.setText(C17959a.m61877a(C17959a.m61879c(pVar.mo64801d(), pVar.mo64798a())));
    }

    /* renamed from: u2 */
    private final void m75155u2(C25927l lVar) {
        C29716e0 e0Var = m75109M1().f75101m;
        e0Var.f75011i.setText(lVar.mo64782d());
        Input input = e0Var.f75007e;
        String F = C32343x.m95388F("deposit.prolong.page.deposit.amount validation", C17959a.m61877a(C17959a.m61879c(lVar.mo64786g(), "")), C17959a.m61877a(C17959a.m61879c(lVar.mo64785f(), "")));
        input.setInfoText(C32343x.m95390G("deposit.prolong.page.new.deposit.minamount", C17959a.m61877a(C17959a.m61879c(lVar.mo64786g(), lVar.mo64781c()))));
        input.setSuffix(lVar.mo64780b());
        input.mo35923e(new C25916a(lVar.mo64786g(), lVar.mo64785f(), F, new C23264f0(this)), true, true, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m75157v2(C25932q qVar) {
        C29716e0 e0Var = m75109M1().f75101m;
        e0Var.f75009g.setText(C17959a.m61877a(C17959a.m61879c(qVar.mo64808c(), qVar.mo64806a())));
        e0Var.f75013k.setText(C17959a.m61877a(C17959a.m61879c(qVar.mo64807b(), qVar.mo64806a())));
    }

    /* renamed from: w2 */
    private final void m75158w2(C25927l lVar) {
        C29718f0 f0Var = m75109M1().f75102n;
        f0Var.f75038h.setText(C17959a.m61877a(C17959a.m61879c(lVar.mo64779a() - lVar.mo64783e(), lVar.mo64781c())));
        f0Var.f75036f.setText(C17959a.m61877a(C17959a.m61879c(lVar.mo64783e(), lVar.mo64781c())));
    }

    /* renamed from: x2 */
    private final void m75160x2(int i) {
        Input input = m75109M1().f75107s;
        String F = C32343x.m95388F("deposit.prolong.page.term.label.month", new Object[0]);
        input.setInputText(i + " " + F);
    }

    /* renamed from: y2 */
    private final void m75162y2(String str) {
        m75109M1().f75109u.setInputText(C32343x.m95388F(str, new Object[0]));
    }

    /* renamed from: O1 */
    public final C25929n mo58190O1() {
        C25929n nVar = this.f60854i;
        if (nVar != null) {
            return nVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: m */
    public void mo39137m() {
        C27113k P1 = m75111P1();
        if (P1 != null) {
            P1.mo4577k1();
        }
        m75112Q1().mo64850tw().mo64795Z();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f60852g = C29723k.m90259d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m75109M1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f60852g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m75133j2();
        m75129h2();
        m75114S1();
    }
}

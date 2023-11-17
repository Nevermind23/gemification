package p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep;

import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import da0.C19948b;
import da0.C19950d;
import da0.C19955i;
import g91.C32314k;
import g91.C32343x;
import ha0.C24935l;
import ha0.C24942s;
import ha0.C24943t;
import hb0.C24955f;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import ib0.C25143e;
import ie1.C41330k0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.actioncard.ActionCardData;
import p341ge.bog.designsystem.components.actioncard.ActionCardView;
import p341ge.bog.designsystem.components.actioncard.BadgeData;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferModel;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodArgs;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p380ck.C10464h;
import p547oi.C17199a;
import p547oi.C17201b;
import p561pi.C17367b;
import p603si.C17799b;
import p603si.C17809c;
import p615tg.C17961b;
import p642vh.C18368l;
import p696zg.C19021a;
import pa0.C27487a;
import ta0.C28345h;
import ua0.C28618a;
import ue1.C43064a;
import ue1.C43075l;
import va0.C29006a;
import va0.C29007b;
import va0.C29008c;
import va0.C29009d;
import va0.C29010e;
import va0.C29011f;
import va0.C29012g;
import va0.C29013h;
import va0.C29014i;
import va0.C29017l;
import va0.C29018m;
import va0.C29019n;
import va0.C29021p;
import va0.C29022q;
import va0.C29025t;
import xa0.C29665b;
import ze1.C43420e;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment */
public final class CombinedOfferFirstStepFragment extends C22899b {

    /* renamed from: l */
    public static final C22864a f60244l = new C22864a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C24935l f60245g;

    /* renamed from: h */
    private final C41217g f60246h = C41219i.m119470b(new C22868c(this));

    /* renamed from: i */
    private final C41217g f60247i = C41219i.m119470b(new C22866b(this));

    /* renamed from: j */
    public C29018m f60248j;

    /* renamed from: k */
    private final C41217g f60249k;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$a */
    public static final class C22864a {
        private C22864a() {
        }

        public /* synthetic */ C22864a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$a0 */
    public static final class C22865a0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f60250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22865a0(C41217g gVar) {
            super(0);
            this.f60250d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f60250d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$b */
    static final class C22866b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60251d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22866b(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(0);
            this.f60251d = combinedOfferFirstStepFragment;
        }

        public final String invoke() {
            String a = C32314k.m95245a(this.f60251d.m74186I1().mo56869ur().mo66794h());
            return " " + a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$b0 */
    public static final class C22867b0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60252d;

        /* renamed from: e */
        final /* synthetic */ C41217g f60253e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22867b0(C43064a aVar, C41217g gVar) {
            super(0);
            this.f60252d = aVar;
            this.f60253e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60252d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f60253e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$c */
    static final class C22868c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22868c(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(0);
            this.f60254d = combinedOfferFirstStepFragment;
        }

        /* renamed from: b */
        public final CombinedOfferFirstStepArgs invoke() {
            CombinedOfferFirstStepArgs combinedOfferFirstStepArgs;
            Bundle arguments = this.f60254d.getArguments();
            if (arguments != null && (combinedOfferFirstStepArgs = (CombinedOfferFirstStepArgs) arguments.getParcelable("first_step_args")) != null) {
                return combinedOfferFirstStepArgs;
            }
            throw new NullPointerException("arguments cannot be null");
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$c0 */
    static final class C22869c0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60255d;

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$c0$a */
        static final class C22870a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CombinedOfferFirstStepFragment f60256d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22870a(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
                super(0);
                this.f60256d = combinedOfferFirstStepFragment;
            }

            /* renamed from: b */
            public final C29025t invoke() {
                return this.f60256d.mo57001H1().mo32801a(this.f60256d.m74184F1().mo56990a(), this.f60256d.m74184F1().mo56991b());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22869c0(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(0);
            this.f60255d = combinedOfferFirstStepFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C22870a(this.f60255d));
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$d */
    static final class C22871d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24935l f60257d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22871d(C24935l lVar) {
            super(1);
            this.f60257d = lVar;
        }

        /* renamed from: a */
        public final void mo57004a(boolean z) {
            FrameLayout frameLayout = this.f60257d.f64193n;
            C41536l.m120488h(frameLayout, "progressBar");
            C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57004a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$e */
    static final class C22872e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24935l f60258d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22872e(C24935l lVar) {
            super(1);
            this.f60258d = lVar;
        }

        /* renamed from: a */
        public final void mo57005a(C27487a aVar) {
            Integer d = aVar.mo66789d();
            if (d != null) {
                C24935l lVar = this.f60258d;
                int intValue = d.intValue();
                Input input = lVar.f64198s;
                String F = C32343x.m95388F("applications.deposits.term.label.month", new Object[0]);
                input.setInputText(intValue + " " + F);
            }
            WithdrawalTypeUiModel k = aVar.mo66798k();
            if (k != null) {
                this.f60258d.f64200u.setInputText(C32343x.m95388F(k.mo56826a(), new Object[0]));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57005a((C27487a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$f */
    static final class C22873f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24935l f60259d;

        /* renamed from: e */
        final /* synthetic */ CombinedOfferFirstStepFragment f60260e;

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$f$a */
        static final class C22874a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24935l f60261d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22874a(C24935l lVar) {
                super(1);
                this.f60261d = lVar;
            }

            /* renamed from: a */
            public final void mo57007a(List list) {
                C41536l.m120489i(list, "it");
                Input input = this.f60261d.f64200u;
                C41536l.m120488h(input, "withdrawalSelectBox");
                C32343x.m95483r1(input, !list.isEmpty(), false, 2, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo57007a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$f$b */
        static final class C22875b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24935l f60262d;

            /* renamed from: e */
            final /* synthetic */ CombinedOfferFirstStepFragment f60263e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22875b(C24935l lVar, CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
                super(1);
                this.f60262d = lVar;
                this.f60263e = combinedOfferFirstStepFragment;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                Input input = this.f60262d.f64200u;
                C41536l.m120488h(input, "withdrawalSelectBox");
                C32343x.m95455i0(input);
                this.f60263e.handleError(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22873f(C24935l lVar, CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60259d = lVar;
            this.f60260e = combinedOfferFirstStepFragment;
        }

        /* renamed from: a */
        public final void mo57006a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C22874a(this.f60259d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C22875b(this.f60259d, this.f60260e), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57006a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$g */
    static final class C22876g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24935l f60264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22876g(C24935l lVar) {
            super(1);
            this.f60264d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f60264d.f64186g;
            C41536l.m120488h(bool, "isEnabled");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$h */
    /* synthetic */ class C22877h extends C41535k implements C43075l {
        C22877h(Object obj) {
            super(1, obj, CombinedOfferFirstStepFragment.class, "onInterestRateResult", "onInterestRateResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57010b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CombinedOfferFirstStepFragment) this.receiver).m74190M1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57010b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$i */
    /* synthetic */ class C22878i extends C41535k implements C43075l {
        C22878i(Object obj) {
            super(1, obj, CombinedOfferFirstStepFragment.class, "openSecondStep", "openSecondStep(Lge/bog/mobilebank/depositapplication/presentation/combinedoffer/fragments/firststep/CombinedOfferFirstStepViewModel$OpenSecondStepModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo57011b(C29021p pVar) {
            C41536l.m120489i(pVar, "p0");
            ((CombinedOfferFirstStepFragment) this.receiver).m74192O1(pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57011b((C29021p) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$j */
    static final class C22879j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22879j(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60265d = combinedOfferFirstStepFragment;
        }

        /* renamed from: a */
        public final void mo57012a(AccumulateOnPaymentModel accumulateOnPaymentModel) {
            C41536l.m120489i(accumulateOnPaymentModel, "it");
            C24955f.f64277O.mo63365a(accumulateOnPaymentModel).mo4576A1(this.f60265d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57012a((AccumulateOnPaymentModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$k */
    static final class C22880k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22880k(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60266d = combinedOfferFirstStepFragment;
        }

        /* renamed from: a */
        public final void mo57013a(C31128a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f60266d.m74193P1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57013a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$l */
    static final class C22881l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22881l(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60267d = combinedOfferFirstStepFragment;
        }

        /* renamed from: a */
        public final void mo57014a(C43420e eVar) {
            C41536l.m120489i(eVar, "it");
            this.f60267d.m74191N1(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57014a((C43420e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$m */
    static final class C22882m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22882m(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60268d = combinedOfferFirstStepFragment;
        }

        /* renamed from: a */
        public final void mo57015a(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
            C41536l.m120489i(accumulateOnSpecificDateModel, "it");
            C25143e.f64597O.mo63693a(accumulateOnSpecificDateModel).mo4576A1(this.f60268d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57015a((AccumulateOnSpecificDateModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$n */
    static final class C22883n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22883n(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60269d = combinedOfferFirstStepFragment;
        }

        /* renamed from: a */
        public final void mo57016a(C29019n nVar) {
            this.f60269d.m74213i2(nVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57016a((C29019n) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$o */
    static final class C22884o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24935l f60270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22884o(C24935l lVar) {
            super(1);
            this.f60270d = lVar;
        }

        /* renamed from: a */
        public final void mo57017a(C29017l lVar) {
            String a = lVar.mo68859a();
            Color b = lVar.mo68860b();
            ActionCardView actionCardView = this.f60270d.f64185f;
            actionCardView.setData(ActionCardData.m49489b(actionCardView.getData(), (String) null, (Image) null, (C19021a) null, (Color) null, (Color) null, (Color) null, (Color) null, false, (Color) null, (BadgeData) null, a, (String) null, (Color) null, b, (Color) null, false, (Integer) null, (String) null, (Color) null, 515071, (Object) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57017a((C29017l) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$p */
    static final class C22885p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24935l f60271d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22885p(C24935l lVar) {
            super(1);
            this.f60271d = lVar;
        }

        /* renamed from: a */
        public final void mo57018a(C29017l lVar) {
            String a = lVar.mo68859a();
            Color b = lVar.mo68860b();
            ActionCardView actionCardView = this.f60271d.f64197r;
            actionCardView.setData(ActionCardData.m49489b(actionCardView.getData(), (String) null, (Image) null, (C19021a) null, (Color) null, (Color) null, (Color) null, (Color) null, false, (Color) null, (BadgeData) null, a, (String) null, (Color) null, b, (Color) null, false, (Integer) null, (String) null, (Color) null, 515071, (Object) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57018a((C29017l) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$q */
    static final class C22886q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24935l f60272d;

        /* renamed from: e */
        final /* synthetic */ CombinedOfferFirstStepFragment f60273e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22886q(C24935l lVar, CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60272d = lVar;
            this.f60273e = combinedOfferFirstStepFragment;
        }

        /* renamed from: a */
        public final void mo57019a(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            LinearLayout c = this.f60272d.f64190k.mo3946b();
            C41536l.m120488h(c, "interestRateErrorLayout.root");
            C32343x.m95455i0(c);
            LinearLayoutCompat c2 = this.f60272d.f64191l.mo3946b();
            C41536l.m120488h(c2, "interestRateLayout.root");
            C32343x.m95447f1(c2);
            InterestRateUiModel interestRateUiModel = (InterestRateUiModel) mVar.mo95675a();
            String str = (String) mVar.mo95676b();
            if (!C41536l.m120484d(interestRateUiModel, InterestRateUiModel.f60141i.mo56821a())) {
                LayerView layerView = this.f60272d.f64189j;
                C41536l.m120488h(layerView, "interestContainer");
                C32343x.m95447f1(layerView);
                this.f60273e.m74215j2(interestRateUiModel, str);
                return;
            }
            LayerView layerView2 = this.f60272d.f64189j;
            C41536l.m120488h(layerView2, "interestContainer");
            C32343x.m95455i0(layerView2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57019a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$r */
    static final class C22887r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24935l f60274d;

        /* renamed from: e */
        final /* synthetic */ CombinedOfferFirstStepFragment f60275e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22887r(C24935l lVar, CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60274d = lVar;
            this.f60275e = combinedOfferFirstStepFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            LinearLayoutCompat c = this.f60274d.f64191l.mo3946b();
            C41536l.m120488h(c, "interestRateLayout.root");
            C32343x.m95455i0(c);
            LinearLayout c2 = this.f60274d.f64190k.mo3946b();
            C41536l.m120488h(c2, "interestRateErrorLayout.root");
            C32343x.m95447f1(c2);
            this.f60275e.handleError(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$s */
    static final class C22888s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60276d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22888s(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60276d = combinedOfferFirstStepFragment;
        }

        /* renamed from: a */
        public final void mo57021a(List list) {
            C41536l.m120489i(list, "it");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                WithdrawalTypeUiModel withdrawalTypeUiModel = (WithdrawalTypeUiModel) it.next();
                String b = withdrawalTypeUiModel.mo56827b();
                String a = withdrawalTypeUiModel.mo56826a();
                if (a == null) {
                    a = "";
                }
                arrayList.add(new DepositPeriodModel.Withdrawal(b, a));
            }
            C28618a.f72634J.mo68338a(new DepositPeriodArgs(arrayList)).mo4576A1(this.f60276d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57021a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$t */
    static final class C22889t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60277d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22889t(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60277d = combinedOfferFirstStepFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60277d.m74186I1().mo56855gv();
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$u */
    static final class C22890u implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60278a;

        C22890u(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60278a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60278a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60278a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$v */
    static final class C22891v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60279d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22891v(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(0);
            this.f60279d = combinedOfferFirstStepFragment;
        }

        public final void invoke() {
            this.f60279d.m74182D1();
            this.f60279d.m74186I1().mo68891pw().mo68874q1();
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$w */
    static final class C22892w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60280d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22892w(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(1);
            this.f60280d = combinedOfferFirstStepFragment;
        }

        /* renamed from: a */
        public final void mo57025a(String str) {
            C41536l.m120489i(str, "it");
            C29665b.C29666a.m90079b(this.f60280d.m74186I1(), C40440x.m117146P0(C40439w.m117103B(str, this.f60280d.m74183E1(), "", false, 4, (Object) null)).toString(), false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57025a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$x */
    static final class C22893x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferFirstStepFragment f60281d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22893x(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            super(0);
            this.f60281d = combinedOfferFirstStepFragment;
        }

        public final void invoke() {
            this.f60281d.m74182D1();
            this.f60281d.m74186I1().mo68891pw().mo68875r0();
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$y */
    public static final class C22894y extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f60282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22894y(Fragment fragment) {
            super(0);
            this.f60282d = fragment;
        }

        public final Fragment invoke() {
            return this.f60282d;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment$z */
    public static final class C22895z extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22895z(C43064a aVar) {
            super(0);
            this.f60283d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f60283d.invoke();
        }
    }

    public CombinedOfferFirstStepFragment() {
        C22869c0 c0Var = new C22869c0(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C22895z(new C22894y(this)));
        this.f60249k = C1514j0.m5374c(this, C41520a0.m120436b(C29025t.class), new C22865a0(a), new C22867b0((C43064a) null, a), c0Var);
    }

    /* renamed from: C1 */
    private final Spannable m74181C1(C29019n nVar) {
        Object obj;
        String str = null;
        if (nVar == null) {
            return null;
        }
        String valueOf = String.valueOf(C17961b.f51154a.mo45631a(nVar.mo68865b()));
        String str2 = nVar.mo68866c() + " " + C32343x.m95388F("applications.deposits.term.label.month", new Object[0]);
        try {
            C41225n.C41226a aVar = C41225n.f97210d;
            obj = C41225n.m119478a(Integer.valueOf(nVar.mo68864a().intValue()));
        } catch (Throwable th) {
            C41225n.C41226a aVar2 = C41225n.f97210d;
            obj = C41225n.m119478a(C41228o.m119482a(th));
        }
        if (C41225n.m119480c(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            str = num.intValue() + " " + valueOf;
        }
        if (str == null) {
            str = "";
        }
        String G = C32343x.m95390G(nVar.mo68867d(), str, str2);
        int X = C40440x.m117156X(G, str, 0, false, 6, (Object) null);
        int length = str.length() + X;
        int X2 = C40440x.m117156X(G, str2, 0, false, 6, (Object) null);
        int length2 = str2.length() + X2;
        SpannableString spannableString = new SpannableString(G);
        Context requireContext = requireContext();
        int i = C19955i.f54553h;
        spannableString.setSpan(new TextAppearanceSpan(requireContext, i), X, length, 33);
        Context requireContext2 = requireContext();
        int i2 = C19948b.f54492b;
        spannableString.setSpan(new ForegroundColorSpan(C0767a.m2893c(requireContext2, i2)), X, length, 33);
        spannableString.setSpan(new TextAppearanceSpan(requireContext(), i), X2, length2, 33);
        spannableString.setSpan(new ForegroundColorSpan(C0767a.m2893c(requireContext(), i2)), X2, length2, 33);
        return spannableString;
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final void m74182D1() {
        Input input = m74185G1().f64187h;
        C18368l.m62767p(input.getTextInput());
        input.clearFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final String m74183E1() {
        return (String) this.f60247i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final CombinedOfferFirstStepArgs m74184F1() {
        return (CombinedOfferFirstStepArgs) this.f60246h.getValue();
    }

    /* renamed from: G1 */
    private final C24935l m74185G1() {
        C24935l lVar = this.f60245g;
        C41536l.m120486f(lVar);
        return lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final C29025t m74186I1() {
        return (C29025t) this.f60249k.getValue();
    }

    /* renamed from: J1 */
    private final void m74187J1() {
        m74189L1();
        m74188K1();
    }

    /* renamed from: K1 */
    private final void m74188K1() {
        C29025t I1 = m74186I1();
        C24935l G1 = m74185G1();
        LiveData e = I1.mo56852e();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(e, viewLifecycleOwner, new C22871d(G1));
        I1.mo56850Z3().mo4819k(getViewLifecycleOwner(), new C22890u(new C22872e(G1)));
        I1.mo56874z1().mo4819k(getViewLifecycleOwner(), new C22890u(new C22873f(G1, this)));
        I1.mo56864m().mo4819k(getViewLifecycleOwner(), new C22890u(new C22876g(G1)));
        I1.mo56839Hc().mo4819k(getViewLifecycleOwner(), new C22890u(new C22877h(this)));
        LiveData qw = m74186I1().mo68892qw();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(qw, viewLifecycleOwner2, new C22878i(this));
    }

    /* renamed from: L1 */
    private final void m74189L1() {
        C29022q rw = m74186I1().mo68893rw();
        LiveData p3 = rw.mo68890p3();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(p3, viewLifecycleOwner, new C22879j(this));
        LiveData Fv = rw.mo68885Fv();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Fv, viewLifecycleOwner2, new C22880k(this));
        LiveData jg = rw.mo68889jg();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(jg, viewLifecycleOwner3, new C22881l(this));
        LiveData F2 = rw.mo68884F2();
        C1619q viewLifecycleOwner4 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner4, "viewLifecycleOwner");
        C37224b.m109963b(F2, viewLifecycleOwner4, new C22882m(this));
        C24935l G1 = m74185G1();
        LiveData Sc = rw.mo68886Sc();
        C1619q viewLifecycleOwner5 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner5, "viewLifecycleOwner");
        C37224b.m109964c(Sc, viewLifecycleOwner5, new C22883n(this));
        rw.mo68887X1().mo4819k(getViewLifecycleOwner(), new C22890u(new C22884o(G1)));
        rw.mo68888e0().mo4819k(getViewLifecycleOwner(), new C22890u(new C22885p(G1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final void m74190M1(C31128a aVar) {
        C24935l G1 = m74185G1();
        C31132b.m92648j(aVar, (int[]) null, new C22886q(G1, this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C22887r(G1, this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m74191N1(C43420e eVar) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(new DepositPeriodModel.Deposit(((C41330k0) it).nextInt()));
        }
        C28618a.f72634J.mo68338a(new DepositPeriodArgs(arrayList)).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public final void m74192O1(C29021p pVar) {
        C32343x.m95395I0(this, "deposit_application", pVar.mo68879c().mo57172g().toString(), "chosen_deposit_type_next_button", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
        C8034d.m30522a(this).mo22121Q(C22896a.f60284a.mo57029a(pVar.mo68879c(), pVar.mo68878b(), pVar.mo68877a(), pVar.mo68880d()));
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public final void m74193P1(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C22888s(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C22889t(this), 1, (Object) null);
    }

    /* renamed from: Q1 */
    private final void m74194Q1() {
        getChildFragmentManager().mo4367F1("AccumulateOnPaymentActionSheet.CAS_DATA", this, new C29007b(this));
        getChildFragmentManager().mo4367F1("AccumulateONSpecificDateActionSheet.REQUEST", this, new C29008c(this));
        getChildFragmentManager().mo4367F1("ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.REQUEST", this, new C29009d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public static final void m74195R1(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment, String str, Bundle bundle) {
        C41536l.m120489i(combinedOfferFirstStepFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        AccumulateOnPaymentModel accumulateOnPaymentModel = (AccumulateOnPaymentModel) bundle.getParcelable("AccumulateOnPaymentActionSheet.CAS_DATA");
        if (accumulateOnPaymentModel != null) {
            combinedOfferFirstStepFragment.m74186I1().mo68891pw().mo68871Kb(accumulateOnPaymentModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m74196S1(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment, String str, Bundle bundle) {
        C41536l.m120489i(combinedOfferFirstStepFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = (AccumulateOnSpecificDateModel) bundle.getParcelable("AccumulateOnSpecificDateActionSheet.STO_DATA");
        if (accumulateOnSpecificDateModel != null) {
            combinedOfferFirstStepFragment.m74186I1().mo68891pw().mo68873jk(accumulateOnSpecificDateModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m74197T1(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment, String str, Bundle bundle) {
        C41536l.m120489i(combinedOfferFirstStepFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        DepositPeriodModel depositPeriodModel = (DepositPeriodModel) bundle.getParcelable("ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.REQUEST");
        if (depositPeriodModel == null) {
            return;
        }
        if (depositPeriodModel instanceof DepositPeriodModel.Deposit) {
            combinedOfferFirstStepFragment.m74186I1().mo56841K(((DepositPeriodModel.Deposit) depositPeriodModel).mo56968a());
        } else if (depositPeriodModel instanceof DepositPeriodModel.Withdrawal) {
            combinedOfferFirstStepFragment.m74186I1().mo56851Z6(((DepositPeriodModel.Withdrawal) depositPeriodModel).mo56979b());
        }
    }

    /* renamed from: U1 */
    private final void m74198U1() {
        ActionCardView actionCardView = m74185G1().f64185f;
        String F = C32343x.m95388F("applications.deposits.accumulate.CAS", new Object[0]);
        String F2 = C32343x.m95388F("applications.deposits.accumulate.CAS.empty.state.text", new Object[0]);
        Color.Resource resource = r0;
        Color.Resource resource2 = new Color.Resource(C19948b.f54493c);
        Color.Resource resource3 = r0;
        Color.Resource resource4 = new Color.Resource(C19948b.color_information_tr_5);
        Image.Resource resource5 = r0;
        Image.Resource resource6 = new Image.Resource(C19950d.img_piggy_bank, (Boolean) null, 2, (DefaultConstructorMarker) null);
        actionCardView.setData(new ActionCardData(F, resource5, (C19021a) null, resource3, (Color) null, (Color) null, (Color) null, true, (Color) null, (BadgeData) null, F2, (String) null, (Color) null, resource, (Color) null, false, (Integer) null, (String) null, (Color) null, 514932, (DefaultConstructorMarker) null));
        C41536l.m120488h(actionCardView, "setupCasCard$lambda$11");
        C28345h.m86979b(actionCardView, 0, new C22891v(this), 1, (Object) null);
    }

    /* renamed from: V1 */
    private final void m74199V1() {
        Button button = m74185G1().f64186g;
        button.setButtonText(C32343x.m95388F("applications.deposits.I.main.button.label", new Object[0]));
        button.setOnClickListener(new C29014i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m74200W1(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment, View view) {
        C41536l.m120489i(combinedOfferFirstStepFragment, "this$0");
        combinedOfferFirstStepFragment.m74182D1();
        C29665b.C29666a.m90078a(combinedOfferFirstStepFragment.m74186I1(), 0, 1, (Object) null);
    }

    /* renamed from: X1 */
    private final void m74201X1() {
        Object obj;
        BigDecimal b;
        try {
            C41225n.C41226a aVar = C41225n.f97210d;
            obj = C41225n.m119478a(new BigDecimal(C32343x.m95388F(m74184F1().mo56991b().mo57226k(), new Object[0])));
        } catch (Throwable th) {
            C41225n.C41226a aVar2 = C41225n.f97210d;
            obj = C41225n.m119478a(C41228o.m119482a(th));
        }
        if (C41225n.m119479b(obj) != null) {
            obj = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        String F = C32343x.m95388F("applications.deposits.fields.deposit.amount.validation", bigDecimal.toString());
        Input input = m74185G1().f64187h;
        input.setHintText(C32343x.m95388F("applications.deposits.amount.label", new Object[0]));
        input.setInfoText(F);
        input.setSuffix(m74183E1());
        input.setFormatter(new C17367b((String) null, (String) null, (String) null, "###,##0.00", 7, (DefaultConstructorMarker) null));
        input.setFilters(new C17201b[]{new C17199a((String) null, 1, (DefaultConstructorMarker) null)});
        C41536l.m120488h(bigDecimal, "minAmount");
        input.mo35923e(C17809c.m61562a(new C17799b.C17806g(bigDecimal, (BigDecimal) null, 2, (DefaultConstructorMarker) null), F), true, true, true);
        CombinedOfferModel a = m74184F1().mo56990a();
        if (!(a == null || (b = a.mo56932b()) == null)) {
            String bigDecimal2 = b.toString();
            C41536l.m120488h(bigDecimal2, "it.toString()");
            input.setInputText(bigDecimal2);
        }
        C32343x.m95457j(input.getTextInput(), new C22892w(this));
        input.getTextInput().setOnKeyListener(new C29013h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final boolean m74202Y1(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment, View view, int i, KeyEvent keyEvent) {
        C41536l.m120489i(combinedOfferFirstStepFragment, "this$0");
        if (i != 6 && keyEvent.getKeyCode() != 66) {
            return false;
        }
        combinedOfferFirstStepFragment.m74182D1();
        return true;
    }

    /* renamed from: Z1 */
    private final void m74203Z1() {
        C24943t tVar = m74185G1().f64191l;
        tVar.f64243e.setText(C32343x.m95388F("applications.deposits.fields.deposit.int.rate.with.spread", new Object[0]));
        tVar.f64245g.setText(C32343x.m95388F("applications.deposits.fields.deposit.effective.int.rate", new Object[0]));
        tVar.f64248j.setText(C32343x.m95388F("applications.deposits.fields.deposit.planned.int.amount", new Object[0]));
        C24942s sVar = m74185G1().f64190k;
        sVar.f64241f.setText(C32343x.m95388F("applications.deposits.I.error.state.text", new Object[0]));
        sVar.f64240e.setButtonText(C32343x.m95388F("applications.deposits.I.error.state.button", new Object[0]));
        sVar.f64240e.setOnClickListener(new C29011f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m74204a2(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment, View view) {
        C41536l.m120489i(combinedOfferFirstStepFragment, "this$0");
        combinedOfferFirstStepFragment.m74186I1().mo56845Pn();
    }

    /* renamed from: b2 */
    private final void m74205b2() {
        ActionCardView actionCardView = m74185G1().f64197r;
        String F = C32343x.m95388F("applications.deposits.accumulate.STO", new Object[0]);
        String F2 = C32343x.m95388F("applications.deposits.accumulate.STO.empty.state.text", new Object[0]);
        Color.Resource resource = r0;
        Color.Resource resource2 = new Color.Resource(C19948b.f54493c);
        Color.Resource resource3 = r0;
        Color.Resource resource4 = new Color.Resource(C19948b.color_information_tr_5);
        Image.Resource resource5 = r0;
        Image.Resource resource6 = new Image.Resource(C19950d.ic_nbo_sto, (Boolean) null, 2, (DefaultConstructorMarker) null);
        actionCardView.setData(new ActionCardData(F, resource5, (C19021a) null, resource3, (Color) null, (Color) null, (Color) null, true, (Color) null, (BadgeData) null, F2, (String) null, (Color) null, resource, (Color) null, false, (Integer) null, (String) null, (Color) null, 514932, (DefaultConstructorMarker) null));
        C41536l.m120488h(actionCardView, "setupStoCard$lambda$12");
        C28345h.m86979b(actionCardView, 0, new C22893x(this), 1, (Object) null);
    }

    /* renamed from: c2 */
    private final void m74206c2() {
        Input input = m74185G1().f64198s;
        input.setHintText(C32343x.m95388F("applications.deposits.term.label", new Object[0]));
        input.setOnClickListener(new C29010e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public static final void m74207d2(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment, View view) {
        C41536l.m120489i(combinedOfferFirstStepFragment, "this$0");
        combinedOfferFirstStepFragment.m74182D1();
        combinedOfferFirstStepFragment.m74186I1().mo68891pw().mo68876yg();
    }

    /* renamed from: e2 */
    private final void m74208e2() {
        C35388f2 f2Var;
        C24935l G1 = m74185G1();
        C1505h requireActivity = requireActivity();
        if (requireActivity instanceof C35388f2) {
            f2Var = (C35388f2) requireActivity;
        } else {
            f2Var = null;
        }
        if (f2Var != null) {
            f2Var.mo86429X1(C32343x.m95388F("applications.deposits.main.page.header", new Object[0]));
        }
        G1.f64199t.setTitle(C32343x.m95388F("applications.deposits.offer.bundle.conditions", new Object[0]));
        G1.f64196q.setTitle(C32343x.m95388F("applications.deposits.accumulate.service.main.text", new Object[0]));
        G1.f64192m.setTitle(C32343x.m95388F("applications.deposits.calculated.interest.main.text", new Object[0]));
        G1.f64194o.mo3946b().setOnClickListener(new C29006a(this));
        m74201X1();
        m74206c2();
        m74210g2();
        m74198U1();
        m74205b2();
        m74203Z1();
        m74199V1();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m74209f2(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment, View view) {
        C41536l.m120489i(combinedOfferFirstStepFragment, "this$0");
        C21481a.onRefresh$default(combinedOfferFirstStepFragment.m74186I1(), 0, 1, (Object) null);
    }

    /* renamed from: g2 */
    private final void m74210g2() {
        Input input = m74185G1().f64200u;
        input.setHintText(C32343x.m95388F("applications.deposits.int.accrual.period.label", new Object[0]));
        input.setOnClickListener(new C29012g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m74211h2(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment, View view) {
        C41536l.m120489i(combinedOfferFirstStepFragment, "this$0");
        combinedOfferFirstStepFragment.m74182D1();
        combinedOfferFirstStepFragment.m74186I1().mo68891pw().mo68872Pe();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final void m74213i2(C29019n nVar) {
        C41238w wVar;
        InlineFeedback2 inlineFeedback2 = m74185G1().f64188i;
        Spannable C1 = m74181C1(nVar);
        if (C1 != null) {
            inlineFeedback2.setSpannableDescription(C1);
            C41536l.m120488h(inlineFeedback2, "updateInlineFeedback$lambda$23$lambda$22");
            C32343x.m95407O0(inlineFeedback2);
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            C41536l.m120488h(inlineFeedback2, "updateInlineFeedback$lambda$23");
            C32343x.m95401L0(inlineFeedback2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        if (r13 != null) goto L_0x0070;
     */
    /* renamed from: j2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m74215j2(p341ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel r12, java.lang.String r13) {
        /*
            r11 = this;
            ha0.l r0 = r11.m74185G1()
            ha0.t r0 = r0.f64191l
            android.widget.TextView r1 = r0.f64244f
            java.lang.Double r2 = r12.mo56813d()
            java.lang.String r3 = "%"
            r4 = 0
            if (r2 == 0) goto L_0x0025
            double r5 = r2.doubleValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0026
        L_0x0025:
            r2 = r4
        L_0x0026:
            r1.setText(r2)
            android.widget.TextView r1 = r0.f64246h
            java.lang.Double r2 = r12.mo56812b()
            if (r2 == 0) goto L_0x0045
            double r5 = r2.doubleValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0046
        L_0x0045:
            r2 = r4
        L_0x0046:
            r1.setText(r2)
            android.widget.TextView r1 = r0.f64249k
            if (r13 == 0) goto L_0x0064
            java.lang.Double r2 = r12.mo56815e()
            if (r2 == 0) goto L_0x0060
            double r5 = r2.doubleValue()
            r8 = 0
            r9 = 2
            r10 = 0
            r7 = r13
            java.lang.String r13 = g91.C32343x.m95410Q(r5, r7, r8, r9, r10)
            goto L_0x0061
        L_0x0060:
            r13 = r4
        L_0x0061:
            if (r13 == 0) goto L_0x0064
            goto L_0x0070
        L_0x0064:
            java.lang.Double r13 = r12.mo56815e()
            if (r13 == 0) goto L_0x006f
            java.lang.String r13 = r13.toString()
            goto L_0x0070
        L_0x006f:
            r13 = r4
        L_0x0070:
            r1.setText(r13)
            android.widget.TextView r13 = r0.f64243e
            java.lang.Double r1 = r12.mo56817f()
            r2 = 1
            r5 = 0
            if (r1 == 0) goto L_0x009b
            double r6 = r1.doubleValue()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            r1[r5] = r3
            java.lang.String r3 = "applications.deposits.fields.deposit.int.rate.with.spread"
            java.lang.String r1 = g91.C32343x.m95388F(r3, r1)
            goto L_0x009c
        L_0x009b:
            r1 = r4
        L_0x009c:
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = ""
        L_0x00a0:
            r13.setText(r1)
            android.widget.LinearLayout r13 = r0.f64247i
            java.lang.String r0 = "expectedInterestContainer"
            kotlin.jvm.internal.C41536l.m120488h(r13, r0)
            java.lang.Double r12 = r12.mo56815e()
            if (r12 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r2 = r5
        L_0x00b2:
            r12 = 2
            g91.C32343x.m95483r1(r13, r2, r5, r12, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment.m74215j2(ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel, java.lang.String):void");
    }

    /* renamed from: H1 */
    public final C29018m mo57001H1() {
        C29018m mVar = this.f60248j;
        if (mVar != null) {
            return mVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f60245g = C24935l.m79725d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m74185G1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f60245g = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m74208e2();
        m74187J1();
        m74194Q1();
    }
}

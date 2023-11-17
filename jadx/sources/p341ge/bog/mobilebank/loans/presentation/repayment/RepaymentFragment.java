package p341ge.bog.mobilebank.loans.presentation.repayment;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.activity.C0152h;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.p016os.C0908e;
import androidx.core.widget.NestedScrollView;
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
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import g91.C32343x;
import gs0.C36062a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.C36971a;
import ks0.C36972b;
import ks0.C36973c;
import ks0.C36974d;
import ks0.C36975e;
import ks0.C36976f;
import ks0.C36977g;
import ks0.C36978h;
import ks0.C36979i;
import ks0.C36980j;
import lr0.C37130e;
import lr0.C37133h;
import ls0.C37137d;
import m41.C37224b;
import ms0.C37253a;
import o31.C37588a0;
import o31.C37598f;
import os0.C37724a;
import os0.C37725b;
import os0.C37727c;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.accountpicker.AccountPickerView;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p341ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel;
import p341ge.bog.mobilebank.loans.presentation.model.PaymentResultData;
import p341ge.bog.mobilebank.loans.presentation.repayment.C32745c;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.InputExtensionKt;
import p642vh.C18368l;
import pr0.C37955g0;
import ue1.C43064a;
import ue1.C43075l;
import ur0.C39068a;
import z11.C40140b;

/* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment */
public final class RepaymentFragment extends C32743a {

    /* renamed from: m */
    public static final C32721a f80513m = new C32721a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C37955g0 f80514g;

    /* renamed from: h */
    public C32745c.C32750d f80515h;

    /* renamed from: i */
    private final C41217g f80516i = C41219i.m119470b(new C32724d(this));

    /* renamed from: j */
    private final C41217g f80517j;

    /* renamed from: k */
    private final C41217g f80518k;

    /* renamed from: l */
    private final C41217g f80519l;

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$a */
    public static final class C32721a {
        private C32721a() {
        }

        public /* synthetic */ C32721a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$b */
    public /* synthetic */ class C32722b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80520a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                os0.a[] r0 = os0.C37724a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                os0.a r1 = os0.C37724a.AMOUNT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                os0.a r1 = os0.C37724a.PLAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                os0.a r1 = os0.C37724a.TERMS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f80520a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment.C32722b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$c */
    static final class C32723c extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C32723c f80521d = new C32723c();

        C32723c() {
            super(0);
        }

        /* renamed from: b */
        public final C37253a invoke() {
            return new C37253a();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$d */
    static final class C32724d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ RepaymentFragment f80522d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32724d(RepaymentFragment repaymentFragment) {
            super(0);
            this.f80522d = repaymentFragment;
        }

        /* renamed from: b */
        public final LoansFlow.Repayment invoke() {
            Bundle arguments = this.f80522d.getArguments();
            LoansFlow.Repayment repayment = arguments != null ? (LoansFlow.Repayment) arguments.getParcelable(this.f80522d.getString(C37133h.loans_flow_extra)) : null;
            C41536l.m120486f(repayment);
            return repayment;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$e */
    static final class C32725e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ RepaymentFragment f80523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32725e(RepaymentFragment repaymentFragment) {
            super(0);
            this.f80523d = repaymentFragment;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f80523d.m96659H1().mo74050a());
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$f */
    public static final class C32726f extends C0152h {

        /* renamed from: d */
        final /* synthetic */ RepaymentFragment f80524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32726f(RepaymentFragment repaymentFragment) {
            super(true);
            this.f80524d = repaymentFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            if (!this.f80524d.m96661J1().mo74432Qw()) {
                mo365f(false);
                C1505h activity = this.f80524d.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$g */
    static final class C32727g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditText f80525d;

        /* renamed from: e */
        final /* synthetic */ RepaymentFragment f80526e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32727g(EditText editText, RepaymentFragment repaymentFragment) {
            super(1);
            this.f80525d = editText;
            this.f80526e = repaymentFragment;
        }

        /* renamed from: a */
        public final void mo74411a(String str) {
            C41536l.m120489i(str, "amount");
            Editable text = this.f80525d.getText();
            C41536l.m120488h(text, "text");
            InputExtensionKt.m101730b(text);
            this.f80526e.m96661J1().mo74439b2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74411a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$h */
    static final class C32728h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ RepaymentFragment f80527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32728h(RepaymentFragment repaymentFragment) {
            super(0);
            this.f80527d = repaymentFragment;
        }

        public final void invoke() {
            this.f80527d.m96661J1().mo74435Tw();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$i */
    static final class C32729i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RepaymentFragment f80528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32729i(RepaymentFragment repaymentFragment) {
            super(1);
            this.f80528d = repaymentFragment;
        }

        /* renamed from: a */
        public final void mo74412a(C37725b bVar) {
            int i;
            String str;
            boolean z = true;
            this.f80528d.refreshHeaderText(C34646b.m101752f(bVar.mo90983o(), (Context) null, 1, (Object) null));
            C37727c cVar = C37727c.PART;
            boolean contains = C41341q.m119910m(cVar, C37727c.FULL).contains(bVar.mo90984p());
            EmptyWidget emptyWidget = this.f80528d.m96658G1().f91168y;
            C41536l.m120488h(emptyWidget, "binding.paymentTypeTitle");
            C32343x.m95483r1(emptyWidget, contains, false, 2, (Object) null);
            ChipGroup chipGroup = this.f80528d.m96658G1().f91166w;
            C41536l.m120488h(chipGroup, "binding.paymentTypeGroup");
            C32343x.m95483r1(chipGroup, contains, false, 2, (Object) null);
            ChipGroup chipGroup2 = this.f80528d.m96658G1().f91166w;
            if (bVar.mo90984p() == cVar) {
                i = 0;
            } else {
                i = 1;
            }
            chipGroup2.mo35182m(i, false);
            if (bVar.mo90981m() == null || bVar.mo90982n() == null) {
                str = "";
            } else {
                str = " (" + C32343x.m95408P(bVar.mo90981m(), bVar.mo90982n()) + ")";
            }
            C40140b k = bVar.mo90979k();
            if (k != null) {
                this.f80528d.m96679c2(k);
            }
            this.f80528d.m96658G1().f91161r.getButton().setLoading(bVar.mo90977i());
            this.f80528d.m96658G1().f91161r.getButton().setButtonText(C32343x.m95388F("loan.repayment.details.repayment.button.label", new Object[0]) + str);
            View view = this.f80528d.m96658G1().f91165v;
            C41536l.m120488h(view, "binding.paymentLoadingCover");
            C32343x.m95483r1(view, bVar.mo90977i(), false, 2, (Object) null);
            InlineFeedback inlineFeedback = this.f80528d.m96658G1().f91160q;
            C41536l.m120488h(inlineFeedback, "binding.onlyFullPaymentHint");
            if (bVar.mo90984p() != C37727c.ONLY_FULL) {
                z = false;
            }
            C32343x.m95483r1(inlineFeedback, z, false, 2, (Object) null);
            this.f80528d.m96657F1().mo6029i(bVar.mo90970d());
            if (bVar.mo90984p() == cVar) {
                RepaymentFragment repaymentFragment = this.f80528d;
                C41536l.m120488h(bVar, "data");
                C41238w unused = repaymentFragment.m96678b2(bVar);
            } else {
                this.f80528d.m96676Z1();
            }
            C41238w unused2 = this.f80528d.m96680d2(bVar.mo90969c());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74412a((C37725b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$j */
    static final class C32730j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RepaymentFragment f80529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32730j(RepaymentFragment repaymentFragment) {
            super(1);
            this.f80529d = repaymentFragment;
        }

        /* renamed from: a */
        public final void mo74413a(C31128a aVar) {
            if (aVar instanceof C31128a.C31129a) {
                this.f80529d.m96658G1().f91144C.mo53596d();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f80529d.m96658G1().f91144C.mo53597e();
            } else if (aVar instanceof C31128a.C31131c) {
                this.f80529d.m96658G1().f91144C.mo53595c();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74413a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$k */
    /* synthetic */ class C32731k extends C41535k implements C43075l {
        C32731k(Object obj) {
            super(1, obj, RepaymentFragment.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: b */
        public final void mo74414b(Throwable th) {
            ((RepaymentFragment) this.receiver).handleError(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74414b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$l */
    static final class C32732l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RepaymentFragment f80530d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32732l(RepaymentFragment repaymentFragment) {
            super(1);
            this.f80530d = repaymentFragment;
        }

        /* renamed from: a */
        public final void mo74415a(List list) {
            C41536l.m120489i(list, "planTypes");
            this.f80530d.m96674X1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74415a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$m */
    static final class C32733m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RepaymentFragment f80531d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32733m(RepaymentFragment repaymentFragment) {
            super(1);
            this.f80531d = repaymentFragment;
        }

        /* renamed from: a */
        public final void mo74416a(long j) {
            C37137d.f89460Q.mo90119a(Long.valueOf(j)).mo4576A1(this.f80531d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74416a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$n */
    /* synthetic */ class C32734n extends C41535k implements C43075l {
        C32734n(Object obj) {
            super(1, obj, RepaymentFragment.class, "showInputErrors", "showInputErrors(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo74417b(List list) {
            C41536l.m120489i(list, "p0");
            ((RepaymentFragment) this.receiver).m96677a2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74417b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$o */
    static final class C32735o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RepaymentFragment f80532d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32735o(RepaymentFragment repaymentFragment) {
            super(1);
            this.f80532d = repaymentFragment;
        }

        /* renamed from: a */
        public final void mo74418a(PaymentResultData paymentResultData) {
            C41536l.m120489i(paymentResultData, "resultData");
            C8034d.m30522a(this.f80532d).mo22118M(C37130e.action_repaymentFragment_to_repaymentSuccessFragment, C0908e.m3336b(C41233s.m119492a(this.f80532d.getString(C37133h.arg_payment_result_data), paymentResultData)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74418a((PaymentResultData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$p */
    static final class C32736p implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80533a;

        C32736p(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80533a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80533a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80533a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$q */
    public static final class C32737q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80534d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32737q(Fragment fragment) {
            super(0);
            this.f80534d = fragment;
        }

        public final Fragment invoke() {
            return this.f80534d;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$r */
    public static final class C32738r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80535d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32738r(C43064a aVar) {
            super(0);
            this.f80535d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f80535d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$s */
    public static final class C32739s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f80536d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32739s(C41217g gVar) {
            super(0);
            this.f80536d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f80536d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$t */
    public static final class C32740t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80537d;

        /* renamed from: e */
        final /* synthetic */ C41217g f80538e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32740t(C43064a aVar, C41217g gVar) {
            super(0);
            this.f80537d = aVar;
            this.f80538e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80537d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f80538e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$u */
    static final class C32741u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ RepaymentFragment f80539d;

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment$u$a */
        static final class C32742a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ RepaymentFragment f80540d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32742a(RepaymentFragment repaymentFragment) {
                super(0);
                this.f80540d = repaymentFragment;
            }

            /* renamed from: b */
            public final C32745c invoke() {
                C32745c.C32750d K1 = this.f80540d.mo74407K1();
                LoansFlow.Repayment u1 = this.f80540d.m96659H1();
                C41536l.m120488h(u1, "extraData");
                return K1.mo32834a(u1);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32741u(RepaymentFragment repaymentFragment) {
            super(0);
            this.f80539d = repaymentFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C32742a(this.f80539d));
        }
    }

    public RepaymentFragment() {
        C32741u uVar = new C32741u(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C32738r(new C32737q(this)));
        this.f80517j = C1514j0.m5374c(this, C41520a0.m120436b(C32745c.class), new C32739s(a), new C32740t((C43064a) null, a), uVar);
        this.f80518k = C41219i.m119470b(new C32725e(this));
        this.f80519l = C41219i.m119470b(C32723c.f80521d);
    }

    /* renamed from: D1 */
    private final void m96655D1() {
        getChildFragmentManager().mo4367F1("OFFERED_PLAN_TYPE_REQUEST_KEY", getViewLifecycleOwner(), new C36971a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m96656E1(RepaymentFragment repaymentFragment, String str, Bundle bundle) {
        C41536l.m120489i(repaymentFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        OfferedPlanTypesUiModel offeredPlanTypesUiModel = (OfferedPlanTypesUiModel) bundle.getParcelable("OFFERED_PLAN_TYPE_KEY");
        if (offeredPlanTypesUiModel != null) {
            repaymentFragment.m96661J1().mo74437Xw(offeredPlanTypesUiModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final C37253a m96657F1() {
        return (C37253a) this.f80519l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public final C37955g0 m96658G1() {
        C37955g0 g0Var = this.f80514g;
        C41536l.m120486f(g0Var);
        return g0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final LoansFlow.Repayment m96659H1() {
        return (LoansFlow.Repayment) this.f80516i.getValue();
    }

    /* renamed from: I1 */
    private final boolean m96660I1() {
        return ((Boolean) this.f80518k.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final C32745c m96661J1() {
        return (C32745c) this.f80517j.getValue();
    }

    /* renamed from: L1 */
    private final void m96662L1() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        C1505h activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.mo342c(getViewLifecycleOwner(), new C32726f(this));
        }
    }

    /* renamed from: M1 */
    private final void m96663M1() {
        C37955g0 G1 = m96658G1();
        G1.f91159p.setOnScrollChangeListener(new C36973c(this));
        G1.f91142A.setOnClickListener(new C36974d(this));
        G1.f91166w.setOnChipActivatedChangedListener(new C36975e(G1, this));
        G1.f91145D.setTextClickListener(new C36976f(this));
        G1.f91145D.setOnCheckedStateChangeListener(new C36977g(this));
        G1.f91161r.getButton().setOnClickListener(new C36978h(this));
        EditText textInput = G1.f91149f.getTextInput();
        C32343x.m95457j(textInput, new C32727g(textInput, this));
        G1.f91149f.getTextInput().setOnKeyListener(new C36979i(G1));
        G1.f91167x.setOnClickListener(new C36980j(G1, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final boolean m96664N1(C37955g0 g0Var, View view, int i, KeyEvent keyEvent) {
        C41536l.m120489i(g0Var, "$this_with");
        if (i != 6) {
            return false;
        }
        C18368l.m62767p(g0Var.f91149f.getTextInput());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m96665O1(C37955g0 g0Var, RepaymentFragment repaymentFragment, View view) {
        C41536l.m120489i(g0Var, "$this_with");
        C41536l.m120489i(repaymentFragment, "this$0");
        Input input = g0Var.f91167x;
        C41536l.m120488h(input, "paymentTypeInput");
        InputExtensionKt.m101732d(input, new C32728h(repaymentFragment));
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m96666P1(RepaymentFragment repaymentFragment, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        C41536l.m120489i(repaymentFragment, "this$0");
        C41536l.m120489i(nestedScrollView, "<anonymous parameter 0>");
        repaymentFragment.m96661J1().mo74431Pw(repaymentFragment.m96658G1().f91159p.canScrollVertically(-1));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m96667Q1(RepaymentFragment repaymentFragment, View view) {
        C41536l.m120489i(repaymentFragment, "this$0");
        C21481a.onRefresh$default(repaymentFragment.m96661J1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public static final void m96668R1(C37955g0 g0Var, RepaymentFragment repaymentFragment, Chip chip, int i) {
        C37727c cVar;
        C41536l.m120489i(g0Var, "$this_with");
        C41536l.m120489i(repaymentFragment, "this$0");
        C41536l.m120489i(chip, "chip");
        if (chip.getId() == g0Var.f91151h.getId()) {
            cVar = C37727c.PART;
        } else {
            cVar = C37727c.FULL;
        }
        repaymentFragment.m96661J1().mo74436Ww(cVar);
        C18368l.m62767p(repaymentFragment.m96658G1().f91149f.getTextInput());
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m96669S1(RepaymentFragment repaymentFragment) {
        C41536l.m120489i(repaymentFragment, "this$0");
        repaymentFragment.m96675Y1();
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m96670T1(RepaymentFragment repaymentFragment, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(repaymentFragment, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        repaymentFragment.m96661J1().mo74427K0(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m96671U1(RepaymentFragment repaymentFragment, View view) {
        C41536l.m120489i(repaymentFragment, "this$0");
        repaymentFragment.m96661J1().mo74440ne();
    }

    /* renamed from: V1 */
    private final void m96672V1() {
        String str;
        String str2;
        String str3;
        C37955g0 G1 = m96658G1();
        EmptyWidget emptyWidget = G1.f91168y;
        if (m96660I1()) {
            str = "bnpl.loan.repayment.details.field.repayment.type.label";
        } else {
            str = "loan.repayment.details.field.repayment.type.label";
        }
        emptyWidget.setTitle(C32343x.m95388F(str, new Object[0]));
        G1.f91151h.setChipTitle(C32343x.m95388F("loan.repayment.details.repayment.type.partial", new Object[0]));
        G1.f91150g.setChipTitle(C32343x.m95388F("loan.repayment.details.repayment.type.full", new Object[0]));
        G1.f91164u.setTitleText(C32343x.m95388F("loan.repayment.details.info", new Object[0]));
        G1.f91164u.setCaptionText(C32343x.m95388F("loan.repayment.details.info.description", new Object[0]));
        G1.f91162s.setTitle(C32343x.m95388F("loan.repayment.details.payment.details", new Object[0]));
        G1.f91149f.setHintText((CharSequence) C32343x.m95388F("loan.repayment.details.field.amount.label", new Object[0]));
        Input input = G1.f91167x;
        if (m96660I1()) {
            str2 = "bnpl.loan.repayment.details.schedule.change.type.label";
        } else {
            str2 = "loan.repayment.details.schedule.change.type.label";
        }
        input.setHintText((CharSequence) C32343x.m95388F(str2, new Object[0]));
        EmptyWidget emptyWidget2 = G1.f91158o;
        if (m96660I1()) {
            str3 = "bnpl.loan.repayment.details.calculated.details";
        } else {
            str3 = "loan.repayment.details.calculated.details";
        }
        emptyWidget2.setTitle(C32343x.m95388F(str3, new Object[0]));
        G1.f91145D.mo35145g(C32343x.m95388F("loan.repayment.details.check.box.confirm", new Object[0]), C32343x.m95388F("loan.repayment.details.check.box.term", new Object[0]));
        G1.f91148e.setExpandedHint(C32343x.m95388F("loan.repayment.details.field.account.from.label", new Object[0]));
        G1.f91148e.setCollapsedHint(C32343x.m95388F("loan.repayment.details.field.account.from.label", new Object[0]));
        G1.f91160q.setTitleText(C32343x.m95388F("loan.repayment.details.fullpayment.info", new Object[0]));
        G1.f91160q.setCaptionText(C32343x.m95388F("loan.repayment.details.fullpayment.info.description", new Object[0]));
        G1.f91161r.getButton().setButtonText(C32343x.m95388F("loan.repayment.details.repayment.button.label", new Object[0]));
        G1.f91154k.setAdapter(m96657F1());
        G1.f91169z.setAdapter(m96657F1());
        G1.f91149f.getTextInput().setImeOptions(6);
        G1.f91149f.getTextInput().setFilters((InputFilter[]) new C37598f[]{new C37598f((Pattern) null, 1, (DefaultConstructorMarker) null)});
        G1.f91169z.setItemAnimator((RecyclerView.C1742m) null);
        G1.f91154k.setItemAnimator((RecyclerView.C1742m) null);
        G1.f91148e.setOnClickListener(new C36972b(this));
        G1.f91144C.mo53597e();
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m96673W1(RepaymentFragment repaymentFragment, View view) {
        C41536l.m120489i(repaymentFragment, "this$0");
        repaymentFragment.m96661J1().mo74434Sw();
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public final void m96674X1(List list) {
        String str;
        C36062a.C36063a aVar = C36062a.f87186K;
        if (m96660I1()) {
            str = "bnpl.loan.repayment.details.field.repayment.type.label";
        } else {
            str = "loan.repayment.details.field.repayment.type.label";
        }
        aVar.mo88783a(C32343x.m95388F(str, new Object[0]), list).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: Y1 */
    private final void m96675Y1() {
        PackageManager packageManager;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C32343x.m95388F("link.terms.loan.prepayment", new Object[0])));
        C1505h activity = getActivity();
        if (activity != null && (packageManager = activity.getPackageManager()) != null && intent.resolveActivity(packageManager) != null) {
            startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public final void m96676Z1() {
        C37955g0 G1 = m96658G1();
        RecyclerView recyclerView = G1.f91154k;
        C41536l.m120488h(recyclerView, "fullPrepaymentDetails");
        C32343x.m95447f1(recyclerView);
        InlineFeedback inlineFeedback = G1.f91164u;
        C41536l.m120488h(inlineFeedback, "paymentHint");
        C32343x.m95455i0(inlineFeedback);
        Input input = G1.f91167x;
        C41536l.m120488h(input, "paymentTypeInput");
        C32343x.m95455i0(input);
        Input input2 = G1.f91149f;
        C41536l.m120488h(input2, "amountInput");
        C32343x.m95455i0(input2);
        LayerView layerView = G1.f91156m;
        C41536l.m120488h(layerView, "loanDetailsLayer");
        C32343x.m95455i0(layerView);
        LayerView layerView2 = G1.f91157n;
        C41536l.m120488h(layerView2, "loanDetailsLoadingLayer");
        C32343x.m95455i0(layerView2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public final void m96677a2(List list) {
        C37955g0 G1 = m96658G1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = C32722b.f80520a[((C37724a) it.next()).ordinal()];
            if (i == 1) {
                G1.f91149f.mo35920c();
            } else if (i == 2) {
                G1.f91167x.mo35920c();
            } else if (i == 3) {
                G1.f91145D.setError(true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public final C41238w m96678b2(C37725b bVar) {
        boolean z;
        String str;
        C37955g0 G1 = m96658G1();
        RecyclerView recyclerView = G1.f91154k;
        C41536l.m120488h(recyclerView, "fullPrepaymentDetails");
        C32343x.m95455i0(recyclerView);
        Input input = G1.f91149f;
        C41536l.m120488h(input, "amountInput");
        C32343x.m95447f1(input);
        InlineFeedback inlineFeedback = G1.f91164u;
        C41536l.m120488h(inlineFeedback, "paymentHint");
        boolean z2 = true;
        C32343x.m95483r1(inlineFeedback, !m96660I1(), false, 2, (Object) null);
        Input input2 = G1.f91167x;
        C41536l.m120488h(input2, "paymentTypeInput");
        if (!(!bVar.mo90973f().isEmpty()) || bVar.mo90975h()) {
            z = false;
        } else {
            z = true;
        }
        C32343x.m95483r1(input2, z, false, 2, (Object) null);
        LayerView layerView = G1.f91156m;
        C41536l.m120488h(layerView, "loanDetailsLayer");
        if (!(!bVar.mo90970d().isEmpty()) || bVar.mo90975h()) {
            z2 = false;
        }
        C32343x.m95483r1(layerView, z2, false, 2, (Object) null);
        LayerView layerView2 = G1.f91157n;
        C41536l.m120488h(layerView2, "loanDetailsLoadingLayer");
        C32343x.m95483r1(layerView2, bVar.mo90975h(), false, 2, (Object) null);
        OfferedPlanTypesUiModel l = bVar.mo90980l();
        if (l == null) {
            return null;
        }
        G1.f91167x.setInputText(C32343x.m95388F(l.mo74334d(), new Object[0]));
        Input input3 = G1.f91167x;
        if (m96660I1()) {
            str = "bnpl.loan.repayment.details.chosen.schedule.change.type.label";
        } else {
            str = "loan.repayment.details.chosen.schedule.change.type.label";
        }
        input3.setHintText((CharSequence) C32343x.m95388F(str, new Object[0]));
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public final void m96679c2(C40140b bVar) {
        C37955g0 G1 = m96658G1();
        G1.f91148e.setCollapsedHint(bVar.mo94069a().mo34687e());
        AccountPickerView accountPickerView = G1.f91148e;
        C41536l.m120488h(accountPickerView, "accountPicker");
        AccountPickerView.m49453l(accountPickerView, bVar.mo94069a().mo34686d().mo46543a(), bVar.mo94069a().mo34686d().mo46544b().getCurrencyCode(), false, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public final C41238w m96680d2(boolean z) {
        C1505h activity = getActivity();
        C39068a aVar = activity instanceof C39068a ? (C39068a) activity : null;
        if (aVar == null) {
            return null;
        }
        aVar.mo74019j0(z);
        return C41238w.f97225a;
    }

    private final void observeData() {
        C32745c J1 = m96661J1();
        J1.mo74428Mw().mo4819k(getViewLifecycleOwner(), new C32736p(new C32729i(this)));
        J1.mo74423Gw().mo4819k(getViewLifecycleOwner(), new C32736p(new C32730j(this)));
        LiveData Nw = J1.mo74429Nw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Nw, viewLifecycleOwner, new C32731k(this));
        LiveData Iw = J1.mo74425Iw();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Iw, viewLifecycleOwner2, new C32732l(this));
        LiveData Hw = J1.mo74424Hw();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(Hw, viewLifecycleOwner3, new C32733m(this));
        LiveData Ow = J1.mo74430Ow();
        C1619q viewLifecycleOwner4 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner4, "viewLifecycleOwner");
        C37224b.m109963b(Ow, viewLifecycleOwner4, new C32734n(this));
        LiveData Jw = J1.mo74426Jw();
        C1619q viewLifecycleOwner5 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner5, "viewLifecycleOwner");
        C37224b.m109963b(Jw, viewLifecycleOwner5, new C32735o(this));
    }

    /* renamed from: K1 */
    public final C32745c.C32750d mo74407K1() {
        C32745c.C32750d dVar = this.f80515h;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        C1505h activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80514g = C37955g0.m111566d(layoutInflater, viewGroup, false);
        StateView c = m96658G1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroy() {
        Window window;
        super.onDestroy();
        C1505h activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(0);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80514g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m96663M1();
        m96672V1();
        observeData();
        m96655D1();
        m96662L1();
    }
}

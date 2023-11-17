package p341ge.bog.mobilebank.loans.presentation.pawnshop;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.activity.C0152h;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import g91.C32343x;
import g91.C32359z0;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import hs0.C36188a;
import hs0.C36190c;
import hs0.C36191d;
import hs0.C36192e;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37133h;
import m41.C37224b;
import ms0.C37253a;
import o31.C37588a0;
import o31.C37598f;
import o31.C37603j;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.accountpicker.AccountPickerView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p341ge.bog.mobilebank.loans.presentation.pawnshop.C32703b;
import p341ge.bog.mobilebank.loans.presentation.pawnshop.C32713e;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.shared.helper.InputExtensionKt;
import p380ck.C10464h;
import pr0.C37953f0;
import ue1.C43064a;
import ue1.C43075l;
import ur0.C39068a;

/* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment */
public final class PawnLoanFragment extends C32702a {

    /* renamed from: n */
    public static final C32687a f80460n = new C32687a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C37953f0 f80461i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C37253a f80462j;

    /* renamed from: k */
    public C32703b.C32705b f80463k;

    /* renamed from: l */
    private final C41217g f80464l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f80465m;

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$a */
    public static final class C32687a {
        private C32687a() {
        }

        public /* synthetic */ C32687a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$b */
    public static final class C32688b extends C0152h {

        /* renamed from: d */
        final /* synthetic */ PawnLoanFragment f80466d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32688b(PawnLoanFragment pawnLoanFragment) {
            super(true);
            this.f80466d = pawnLoanFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            if (!this.f80466d.f80465m) {
                mo365f(false);
                C1505h activity = this.f80466d.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$c */
    static final class C32689c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80467a;

        C32689c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80467a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80467a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80467a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$d */
    static final class C32690d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditText f80468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32690d(EditText editText) {
            super(1);
            this.f80468d = editText;
        }

        /* renamed from: a */
        public final void mo74370a(String str) {
            C41536l.m120489i(str, "it");
            Editable text = this.f80468d.getText();
            C41536l.m120488h(text, "text");
            InputExtensionKt.m101730b(text);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74370a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$e */
    static final class C32691e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PawnLoanFragment f80469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32691e(PawnLoanFragment pawnLoanFragment) {
            super(0);
            this.f80469d = pawnLoanFragment;
        }

        public final void invoke() {
            this.f80469d.m96606s1().mo74384pw();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$f */
    static final class C32692f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PawnLoanFragment f80470d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32692f(PawnLoanFragment pawnLoanFragment) {
            super(1);
            this.f80470d = pawnLoanFragment;
        }

        /* JADX WARNING: type inference failed for: r0v7, types: [androidx.fragment.app.h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo74371a(p341ge.bog.mobilebank.loans.presentation.pawnshop.C32709d r7) {
            /*
                r6 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.C41536l.m120489i(r7, r0)
                ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment r0 = r6.f80470d
                r1 = 0
                r0.f80465m = r1
                boolean r0 = r7 instanceof p341ge.bog.mobilebank.loans.presentation.pawnshop.C32709d.C32710a
                r2 = 0
                if (r0 == 0) goto L_0x0029
                ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment r0 = r6.f80470d
                androidx.fragment.app.h r0 = r0.requireActivity()
                boolean r1 = r0 instanceof p341ge.bog.mobilebank.p975ui.activities.C35388f2
                if (r1 == 0) goto L_0x001d
                r2 = r0
                ge.bog.mobilebank.ui.activities.f2 r2 = (p341ge.bog.mobilebank.p975ui.activities.C35388f2) r2
            L_0x001d:
                if (r2 == 0) goto L_0x0073
                ge.bog.mobilebank.loans.presentation.pawnshop.d$a r7 = (p341ge.bog.mobilebank.loans.presentation.pawnshop.C32709d.C32710a) r7
                java.lang.Throwable r7 = r7.mo74391a()
                r2.mo74709H1(r7)
                goto L_0x0073
            L_0x0029:
                boolean r0 = r7 instanceof p341ge.bog.mobilebank.loans.presentation.pawnshop.C32709d.C32711b
                if (r0 == 0) goto L_0x0054
                ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment r0 = r6.f80470d
                p0.l r0 = p228r0.C8034d.m30522a(r0)
                int r2 = lr0.C37130e.action_pawnLoanFragment_to_repaymentSuccessFragment
                r3 = 1
                he1.m[] r3 = new he1.C41224m[r3]
                ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment r4 = r6.f80470d
                int r5 = lr0.C37133h.arg_payment_result_data
                java.lang.String r4 = r4.getString(r5)
                ge.bog.mobilebank.loans.presentation.pawnshop.d$b r7 = (p341ge.bog.mobilebank.loans.presentation.pawnshop.C32709d.C32711b) r7
                ge.bog.mobilebank.loans.presentation.model.PaymentResultData r7 = r7.mo74392a()
                he1.m r7 = he1.C41233s.m119492a(r4, r7)
                r3[r1] = r7
                android.os.Bundle r7 = androidx.core.p016os.C0908e.m3336b(r3)
                r0.mo22118M(r2, r7)
                goto L_0x0073
            L_0x0054:
                boolean r7 = r7 instanceof p341ge.bog.mobilebank.loans.presentation.pawnshop.C32709d.C32712c
                if (r7 == 0) goto L_0x0073
                ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment r7 = r6.f80470d
                r7.m96608v1()
                ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment r7 = r6.f80470d
                pr0.f0 r7 = r7.m96605r1()
                ge.bog.designsystem.components.input.Input r7 = r7.f91125f
                r7.mo35919b()
                ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment r7 = r6.f80470d
                pr0.f0 r7 = r7.m96605r1()
                ge.bog.designsystem.components.input.Input r7 = r7.f91125f
                r7.setInfoText(r2)
            L_0x0073:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment.C32692f.mo74371a(ge.bog.mobilebank.loans.presentation.pawnshop.d):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74371a((C32709d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$g */
    static final class C32693g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PawnLoanFragment f80471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32693g(PawnLoanFragment pawnLoanFragment) {
            super(1);
            this.f80471d = pawnLoanFragment;
        }

        /* renamed from: a */
        public final void mo74372a(C32713e eVar) {
            String str;
            boolean z = eVar instanceof C32713e.C32717d;
            this.f80471d.f80465m = z;
            boolean z2 = true;
            if (z) {
                C32713e.C32717d dVar = (C32713e.C32717d) eVar;
                this.f80471d.m96605r1().f91132m.getButton().setLoading(dVar.mo74395a());
                this.f80471d.m96605r1().f91125f.getTextInput().setEnabled(!dVar.mo74395a());
                this.f80471d.m96605r1().f91134o.setEnabled(!dVar.mo74395a());
            } else if (eVar instanceof C32713e.C32716c) {
                this.f80471d.m96605r1().f91125f.mo35920c();
            } else if (eVar instanceof C32713e.C32719f) {
                this.f80471d.m96605r1().f91134o.setError(true);
            } else if (eVar instanceof C32713e.C32718e) {
                this.f80471d.m96605r1().f91125f.mo35920c();
                this.f80471d.m96605r1().f91134o.setError(true);
            } else if (eVar instanceof C32713e.C32714a) {
                this.f80471d.m96605r1().f91125f.mo35920c();
                C32713e.C32714a aVar = (C32713e.C32714a) eVar;
                this.f80471d.m96605r1().f91125f.setInfoText(C32343x.m95388F("pln.loan.repayment.incorrect.amount.text", C32343x.m95400L(C32343x.m95408P(aVar.mo74394b(), aVar.mo74393a()))));
            } else if (eVar instanceof C32713e.C32715b) {
                this.f80471d.m96605r1().f91125f.setInfoText((CharSequence) null);
                Button button = this.f80471d.m96605r1().f91132m.getButton();
                if (this.f80471d.m96605r1().f91125f.getInputText().length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    str = C32343x.m95388F("pln.loan.repayment.button.label", new Object[0]);
                } else {
                    String N = C32359z0.m95543N(C37603j.m110580c(this.f80471d.m96605r1().f91125f.getInputText()));
                    C41536l.m120488h(N, "getFormatedAmountFromTetriWithCommas(amount)");
                    String O = C32343x.m95406O(N, this.f80471d.m96606s1().mo74387sw().mo74037e());
                    str = C32343x.m95388F("pln.loan.repayment.button.label", new Object[0]) + " (" + O + ")";
                }
                button.setButtonText(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74372a((C32713e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$h */
    static final class C32694h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PawnLoanFragment f80472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32694h(PawnLoanFragment pawnLoanFragment) {
            super(1);
            this.f80472d = pawnLoanFragment;
        }

        /* renamed from: a */
        public final void mo74373a(List list) {
            C37253a k1 = this.f80472d.f80462j;
            if (k1 == null) {
                C41536l.m120506z("adapter");
                k1 = null;
            }
            k1.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74373a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$i */
    static final class C32695i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PawnLoanFragment f80473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32695i(PawnLoanFragment pawnLoanFragment) {
            super(1);
            this.f80473d = pawnLoanFragment;
        }

        /* renamed from: a */
        public final void mo74374a(C36188a aVar) {
            C1505h requireActivity = this.f80473d.requireActivity();
            C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
            ((C35388f2) requireActivity).mo86429X1(C32343x.m95388F(aVar.mo88949d(), new Object[0]));
            C1505h activity = this.f80473d.getActivity();
            C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.loans.presentation.ContentScrollListener");
            ((C39068a) activity).mo74019j0(aVar.mo88948c());
            C41238w unused = this.f80473d.m96594F1(aVar.mo88948c());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74374a((C36188a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$j */
    public static final class C32696j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32696j(Fragment fragment) {
            super(0);
            this.f80474d = fragment;
        }

        public final Fragment invoke() {
            return this.f80474d;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$k */
    public static final class C32697k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32697k(C43064a aVar) {
            super(0);
            this.f80475d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f80475d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$l */
    public static final class C32698l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f80476d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32698l(C41217g gVar) {
            super(0);
            this.f80476d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f80476d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$m */
    public static final class C32699m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80477d;

        /* renamed from: e */
        final /* synthetic */ C41217g f80478e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32699m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f80477d = aVar;
            this.f80478e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80477d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f80478e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$n */
    static final class C32700n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PawnLoanFragment f80479d;

        /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment$n$a */
        static final class C32701a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ PawnLoanFragment f80480d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32701a(PawnLoanFragment pawnLoanFragment) {
                super(0);
                this.f80480d = pawnLoanFragment;
            }

            /* renamed from: b */
            public final C32703b invoke() {
                LoansFlow.PawnLoanPayment pawnLoanPayment;
                C32703b.C32705b t1 = this.f80480d.mo74367t1();
                Bundle arguments = this.f80480d.getArguments();
                if (arguments != null) {
                    pawnLoanPayment = (LoansFlow.PawnLoanPayment) arguments.getParcelable(this.f80480d.getString(C37133h.loans_flow_extra));
                } else {
                    pawnLoanPayment = null;
                }
                C41536l.m120486f(pawnLoanPayment);
                return t1.mo32829a(pawnLoanPayment);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32700n(PawnLoanFragment pawnLoanFragment) {
            super(0);
            this.f80479d = pawnLoanFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C32701a(this.f80479d));
        }
    }

    public PawnLoanFragment() {
        C32700n nVar = new C32700n(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C32697k(new C32696j(this)));
        this.f80464l = C1514j0.m5374c(this, C41520a0.m120436b(C32703b.class), new C32698l(a), new C32699m((C43064a) null, a), nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m96589A1(PawnLoanFragment pawnLoanFragment) {
        C41536l.m120489i(pawnLoanFragment, "this$0");
        pawnLoanFragment.m96606s1().mo74386rw();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m96590B1(PawnLoanFragment pawnLoanFragment, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        C41536l.m120489i(pawnLoanFragment, "this$0");
        C41536l.m120489i(nestedScrollView, "<anonymous parameter 0>");
        pawnLoanFragment.m96606s1().mo74385qw(pawnLoanFragment.m96605r1().f91129j.canScrollVertically(-1));
    }

    /* renamed from: C1 */
    private final void m96591C1() {
        LiveData mw = m96606s1().mo74381mw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(mw, viewLifecycleOwner, new C32692f(this));
        m96606s1().mo74383ow().mo4819k(getViewLifecycleOwner(), new C32689c(new C32693g(this)));
        m96606s1().mo74380lw().mo4819k(getViewLifecycleOwner(), new C32689c(new C32694h(this)));
        m96606s1().mo74382nw().mo4819k(getViewLifecycleOwner(), new C32689c(new C32695i(this)));
    }

    /* renamed from: D1 */
    private final void m96592D1(LoansFlow.PawnLoanPayment pawnLoanPayment) {
        C37953f0 r1 = m96605r1();
        m96609x1(pawnLoanPayment);
        r1.f91124e.setExpandedHint(pawnLoanPayment.mo74033a());
        r1.f91124e.setCollapsedHint(pawnLoanPayment.mo74033a());
        AccountPickerView accountPickerView = r1.f91124e;
        C41536l.m120488h(accountPickerView, "accountPicker");
        AccountPickerView.m49453l(accountPickerView, pawnLoanPayment.mo74035d(), pawnLoanPayment.mo74037e(), false, 4, (Object) null);
    }

    /* renamed from: E1 */
    private final void m96593E1() {
        C37953f0 r1 = m96605r1();
        m96592D1(m96606s1().mo74387sw());
        r1.f91134o.mo35145g(C32343x.m95388F("pln.loan.repayment.check.box.confirm", new Object[0]), C32343x.m95388F("pln.loan.repayment.check.box.term", new Object[0]));
        r1.f91125f.setHintText((CharSequence) C32343x.m95388F("pln.loan.repayment.amount.field.label", new Object[0]));
        r1.f91127h.setTitle(C32343x.m95388F("pln.loan.repayment.loan.details.text", new Object[0]));
        r1.f91133n.setTitle(C32343x.m95388F("pln.loan.repayment.amount.detail.text", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final C41238w m96594F1(boolean z) {
        C1505h activity = getActivity();
        C39068a aVar = activity instanceof C39068a ? (C39068a) activity : null;
        if (aVar == null) {
            return null;
        }
        aVar.mo74019j0(z);
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final C37953f0 m96605r1() {
        C37953f0 f0Var = this.f80461i;
        C41536l.m120486f(f0Var);
        return f0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final C32703b m96606s1() {
        return (C32703b) this.f80464l.getValue();
    }

    /* renamed from: u1 */
    private final void m96607u1() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        C1505h activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.mo342c(getViewLifecycleOwner(), new C32688b(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m96608v1() {
        PackageManager packageManager;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C32343x.m95388F("pln.loan.repayment.check.box.link", new Object[0])));
        C1505h activity = getActivity();
        if (activity != null && (packageManager = activity.getPackageManager()) != null && intent.resolveActivity(packageManager) != null) {
            startActivity(intent);
        }
    }

    /* renamed from: x1 */
    private final void m96609x1(LoansFlow.PawnLoanPayment pawnLoanPayment) {
        this.f80462j = new C37253a();
        RecyclerView recyclerView = m96605r1().f91128i;
        C37253a aVar = this.f80462j;
        if (aVar == null) {
            C41536l.m120506z("adapter");
            aVar = null;
        }
        recyclerView.setAdapter(aVar);
        m96606s1().mo74379kw(pawnLoanPayment);
    }

    /* renamed from: y1 */
    private final void m96610y1() {
        C37953f0 r1 = m96605r1();
        r1.f91125f.getTextInput().setFilters(new InputFilter[]{new C37598f((Pattern) null, 1, (DefaultConstructorMarker) null)});
        EditText textInput = r1.f91125f.getTextInput();
        C32343x.m95457j(textInput, new C32690d(textInput));
        r1.f91132m.getButton().setOnClickListener(new C36190c(this, r1));
        r1.f91134o.setTextClickListener(new C36191d(this));
        Input input = m96605r1().f91125f;
        C41536l.m120488h(input, "binding.amountInput");
        InputExtensionKt.m101734f(input, new C32691e(this));
        r1.f91129j.setOnScrollChangeListener(new C36192e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m96611z1(PawnLoanFragment pawnLoanFragment, C37953f0 f0Var, View view) {
        C41536l.m120489i(pawnLoanFragment, "this$0");
        C41536l.m120489i(f0Var, "$this_with");
        pawnLoanFragment.m96606s1().mo74388tw(f0Var.f91125f.getInputText(), f0Var.f91134o.isChecked());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80461i = C37953f0.m111558d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m96605r1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80461i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        m96605r1();
        super.onViewCreated(view, bundle);
        C32343x.m95395I0(this, "loans", (String) null, "pln_payment_page", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
        m96593E1();
        m96591C1();
        m96610y1();
        m96607u1();
    }

    /* renamed from: t1 */
    public final C32703b.C32705b mo74367t1() {
        C32703b.C32705b bVar = this.f80463k;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }
}

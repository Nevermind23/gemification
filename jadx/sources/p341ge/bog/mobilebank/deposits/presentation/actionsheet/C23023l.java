package p341ge.bog.mobilebank.deposits.presentation.actionsheet;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import com.google.android.material.datepicker.C5023l;
import g91.C32303f;
import g91.C32319m;
import g91.C32343x;
import gc0.C20792a;
import gc0.C20794c;
import gc0.C20799d;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import nc0.C26424l;
import nc0.C26427o;
import nc0.C26434v;
import ny0.C37500b;
import o21.C37586a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalInsufficientAmountException;
import p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;
import xb0.C29714d0;

/* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l */
public final class C23023l extends C23014c {

    /* renamed from: N */
    public static final C23024a f60550N = new C23024a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C29714d0 f60551K;

    /* renamed from: L */
    private final C41217g f60552L = C1514j0.m5374c(this, C41520a0.m120436b(C26434v.class), new C23043t(this), new C23044u((C43064a) null, this), new C23045v(this));
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f60553M;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$a */
    public static final class C23024a {
        private C23024a() {
        }

        public /* synthetic */ C23024a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C23023l mo57701a() {
            return new C23023l();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$b */
    static final class C23025b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23023l f60554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23025b(C23023l lVar) {
            super(1);
            this.f60554d = lVar;
        }

        /* renamed from: a */
        public final void mo57702a(String str) {
            C41536l.m120489i(str, "it");
            this.f60554d.m74640H2().mo65739xw().mo65728Ot(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57702a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$c */
    static final class C23026c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23023l f60555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23026c(C23023l lVar) {
            super(1);
            this.f60555d = lVar;
        }

        /* renamed from: a */
        public final void mo57703a(C37500b bVar) {
            this.f60555d.f60553M = true;
            BigInputView bigInputView = this.f60555d.m74639F2().f74995e;
            String h = C32303f.m95197h(bVar.mo90671f());
            bigInputView.setSuffix(" " + h);
            this.f60555d.f60553M = false;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57703a((C37500b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$d */
    /* synthetic */ class C23027d extends C41535k implements C43075l {
        C23027d(Object obj) {
            super(1, obj, C23023l.class, "updateInput", "updateInput(Lge/bog/mobilebank/deposits/presentation/model/input/savinggoals/SavingGoalInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo57704b(C20799d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((C23023l) this.receiver).m74649S2(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57704b((C20799d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$e */
    static final class C23028e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23023l f60556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23028e(C23023l lVar) {
            super(1);
            this.f60556d = lVar;
        }

        /* renamed from: a */
        public final void mo57705a(C20792a aVar) {
            C23023l lVar = this.f60556d;
            Button button = lVar.m74639F2().f74997g;
            C41536l.m120488h(button, "binding.buttonSave");
            C41536l.m120488h(aVar, "it");
            lVar.m74647P2(button, aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57705a((C20792a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$f */
    static final class C23029f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23023l f60557d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23029f(C23023l lVar) {
            super(1);
            this.f60557d = lVar;
        }

        /* renamed from: a */
        public final void mo57706a(C20792a aVar) {
            C23023l lVar = this.f60557d;
            Button button = lVar.m74639F2().f74996f;
            C41536l.m120488h(button, "binding.buttonDelete");
            C41536l.m120488h(aVar, "it");
            lVar.m74647P2(button, aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57706a((C20792a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$g */
    /* synthetic */ class C23030g extends C41535k implements C43075l {
        C23030g(Object obj) {
            super(1, obj, C23023l.class, "openSavingGoalChooserActionSheet", "openSavingGoalChooserActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo57707b(List list) {
            C41536l.m120489i(list, "p0");
            ((C23023l) this.receiver).m74646O2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57707b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$h */
    /* synthetic */ class C23031h extends C41535k implements C43075l {
        C23031h(Object obj) {
            super(1, obj, C23023l.class, "openDatePicker", "openDatePicker(Lge/bog/mobilebank/shared/common/presentation/DatePickerData;)V", 0);
        }

        /* renamed from: b */
        public final void mo57708b(C37586a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C23023l) this.receiver).m74644L2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57708b((C37586a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$i */
    /* synthetic */ class C23032i extends C41535k implements C43075l {
        C23032i(Object obj) {
            super(1, obj, C23023l.class, "onCreateSavingGoalResult", "onCreateSavingGoalResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57709b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C23023l) this.receiver).m74642J2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57709b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$j */
    /* synthetic */ class C23033j extends C41535k implements C43075l {
        C23033j(Object obj) {
            super(1, obj, C23023l.class, "onDeleteSavingGoalResult", "onDeleteSavingGoalResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57710b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C23023l) this.receiver).m74643K2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57710b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$k */
    static final class C23034k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23023l f60558d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23034k(C23023l lVar) {
            super(1);
            this.f60558d = lVar;
        }

        /* renamed from: a */
        public final void mo57711a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f60558d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57711a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$l */
    public static final class C23035l implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C23023l f60559d;

        /* renamed from: e */
        final /* synthetic */ C43075l f60560e;

        public C23035l(C23023l lVar, C43075l lVar2) {
            this.f60559d = lVar;
            this.f60560e = lVar2;
        }

        public void afterTextChanged(Editable editable) {
            C43075l lVar;
            if (!this.f60559d.f60553M && (lVar = this.f60560e) != null) {
                lVar.invoke(String.valueOf(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$m */
    static final class C23036m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23023l f60561d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23036m(C23023l lVar) {
            super(1);
            this.f60561d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f60561d.m74639F2().f74997g.setLoading(true);
            this.f60561d.m74639F2().f74996f.setEnabled(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$n */
    static final class C23037n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23023l f60562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23037n(C23023l lVar) {
            super(1);
            this.f60562d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60562d.m74639F2().f74997g.setLoading(false);
            this.f60562d.m74639F2().f74996f.setEnabled(true);
            if (th instanceof SavingGoalInsufficientAmountException) {
                C12910e.m48792j(this.f60562d, C32343x.m95388F("error.pfm.saving.goal.amount.less.than.saved.amount", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
            } else {
                this.f60562d.handleError(th);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$o */
    static final class C23038o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23023l f60563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23038o(C23023l lVar) {
            super(1);
            this.f60563d = lVar;
        }

        /* renamed from: a */
        public final void mo57717a(C41238w wVar) {
            this.f60563d.m74639F2().f74996f.setLoading(true);
            this.f60563d.m74639F2().f74997g.setEnabled(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57717a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$p */
    static final class C23039p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23023l f60564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23039p(C23023l lVar) {
            super(1);
            this.f60564d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60564d.m74639F2().f74996f.setLoading(false);
            this.f60564d.handleError(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$q */
    /* synthetic */ class C23040q extends C41535k implements C43075l {
        C23040q(Object obj) {
            super(1, obj, C26424l.class, "setTargetDate", "setTargetDate(J)V", 0);
        }

        /* renamed from: b */
        public final void mo57719b(long j) {
            ((C26424l) this.receiver).mo65731bb(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57719b(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$r */
    static final class C23041r implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60565a;

        C23041r(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60565a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60565a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60565a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$s */
    static final class C23042s implements BigInputView.C13175b, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60566a;

        C23042s(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60566a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo34903a(String str) {
            this.f60566a.invoke(str);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof BigInputView.C13175b) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60566a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$t */
    public static final class C23043t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f60567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23043t(Fragment fragment) {
            super(0);
            this.f60567d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60567d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$u */
    public static final class C23044u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60568d;

        /* renamed from: e */
        final /* synthetic */ Fragment f60569e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23044u(C43064a aVar, Fragment fragment) {
            super(0);
            this.f60568d = aVar;
            this.f60569e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60568d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60569e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$v */
    public static final class C23045v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f60570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23045v(Fragment fragment) {
            super(0);
            this.f60570d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f60570d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.l$w */
    static final class C23046w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23023l f60571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23046w(C23023l lVar) {
            super(1);
            this.f60571d = lVar;
        }

        /* renamed from: a */
        public final void mo57724a(String str) {
            this.f60571d.m74640H2().mo65739xw().mo65728Ot(String.valueOf(str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57724a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m74634A2(C23023l lVar, String str, Bundle bundle) {
        C41536l.m120489i(lVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        SavingGoalUiModel savingGoalUiModel = (SavingGoalUiModel) bundle.getParcelable("RESULT_KEY_SAVED_GOAL");
        if (savingGoalUiModel != null) {
            lVar.m74640H2().mo65739xw().mo65729Wb(savingGoalUiModel);
        }
    }

    /* renamed from: B2 */
    private final void m74635B2() {
        C26427o yw = m74640H2().mo65740yw();
        C41536l.m120487g(yw, "null cannot be cast to non-null type ge.bog.mobilebank.deposits.presentation.viewmodel.delegates.SavingGoalsDelegate.Output");
        yw.mo65726F0().mo4819k(getViewLifecycleOwner(), new C23041r(new C23026c(this)));
        yw.mo65732da().mo4819k(getViewLifecycleOwner(), new C23041r(new C23027d(this)));
        yw.mo65725Dj().mo4819k(getViewLifecycleOwner(), new C23041r(new C23028e(this)));
        yw.mo65730Yg().mo4819k(getViewLifecycleOwner(), new C23041r(new C23029f(this)));
        LiveData sq = yw.mo65738sq();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(sq, viewLifecycleOwner, new C23030g(this));
        LiveData Cu = yw.mo65724Cu();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Cu, viewLifecycleOwner2, new C23031h(this));
        yw.mo65727Oi().mo4819k(getViewLifecycleOwner(), new C23041r(new C23032i(this)));
        yw.mo65735pp().mo4819k(getViewLifecycleOwner(), new C23041r(new C23033j(this)));
        LiveData pe = yw.mo65734pe();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(pe, viewLifecycleOwner3, new C23034k(this));
    }

    /* renamed from: C2 */
    private final void m74636C2(EditText editText, C43075l lVar) {
        editText.addTextChangedListener(new C23035l(this, lVar));
    }

    /* renamed from: D2 */
    private final void m74637D2(C20794c.C20798d dVar, BigInputView bigInputView, C43075l lVar) {
        this.f60553M = true;
        bigInputView.setTextChangeListener(new C23022k());
        if (!bigInputView.getTextInput().isFocused()) {
            String a = dVar.mo49393a();
            if (a == null) {
                a = "";
            }
            bigInputView.setText(a);
        }
        bigInputView.setTextChangeListener(new C23042s(lVar));
        this.f60553M = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m74638E2(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public final C29714d0 m74639F2() {
        C29714d0 d0Var = this.f60551K;
        C41536l.m120486f(d0Var);
        return d0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public final C26434v m74640H2() {
        return (C26434v) this.f60552L.getValue();
    }

    /* renamed from: I2 */
    private final void m74641I2() {
        Object j = C0767a.m2900j(requireContext(), InputMethodManager.class);
        C41536l.m120487g(j, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) j).hideSoftInputFromWindow(m74639F2().mo3946b().getWindowToken(), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final void m74642J2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C23036m(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23037n(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final void m74643K2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C23038o(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23039p(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final void m74644L2(C37586a aVar) {
        C5023l.C5029f i = C5023l.C5029f.m19565c().mo16276e(aVar.mo90772a()).mo16280i(C32343x.m95388F("deposit.saving.goal.end.date", new Object[0]));
        Long b = aVar.mo90773b();
        if (b != null) {
            C41536l.m120488h(i, "it");
            i.mo16278g(b);
        }
        C5023l a = i.mo16277f(0).mo16275a();
        a.mo16267J1(new C23016e(new C23040q(m74640H2().mo65739xw())));
        a.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m74645M2(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final void m74646O2(List list) {
        SavingGoalChooserActionSheet.f60523N.mo57688a(list).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m74647P2(Button button, C20792a aVar) {
        button.setEnabled(aVar.mo49383a());
        C32343x.m95483r1(button, aVar.mo49384b(), false, 2, (Object) null);
    }

    /* renamed from: R2 */
    private final void m74648R2() {
        mo26370a2(C32343x.m95388F("deposit.saving.goal.add", new Object[0]));
        m74639F2().f74995e.setInfoText(C32343x.m95388F("deposit.saving.goal.target.amt", new Object[0]));
        BigInputView bigInputView = m74639F2().f74995e;
        String h = C32303f.m95197h("GEL");
        bigInputView.setSuffix(" " + h);
        m74639F2().f75002l.setText(C32343x.m95388F("deposit.saving.goal.can.be.cancelled", new Object[0]));
        m74639F2().f74997g.setButtonText(C32343x.m95388F("deposit.saving.goal.save", new Object[0]));
        m74639F2().f74996f.setButtonText(C32343x.m95388F("deposit.saving.goal.delete", new Object[0]));
        m74639F2().f75001k.setHintText((CharSequence) C32343x.m95388F("deposit.saving.goal.end.date", new Object[0]));
        m74639F2().f74999i.setEnabled(false);
        m74639F2().f74999i.setHintText((CharSequence) C32343x.m95388F("deposit.saving.goal.monthly.contribution", new Object[0]));
        m74639F2().f74998h.setHintText((CharSequence) C32343x.m95388F("deposit.saving.goal.dep.goal", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final void m74649S2(C20799d dVar) {
        String str;
        String a;
        String F;
        C20794c.C20798d c = dVar.mo49405c();
        BigInputView bigInputView = m74639F2().f74995e;
        C41536l.m120488h(bigInputView, "binding.amountInput");
        m74637D2(c, bigInputView, new C23046w(this));
        Input input = m74639F2().f75001k;
        Long a2 = dVar.mo49409f().mo49388a();
        if (a2 != null) {
            str = C32319m.m95295b(a2.longValue());
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        input.setInputText(str);
        m74639F2().f75001k.setEnabled(dVar.mo49409f().mo49389b());
        Input input2 = m74639F2().f74999i;
        String a3 = dVar.mo49406d().mo49393a();
        if (a3 == null) {
            a3 = str2;
        }
        input2.setInputText(a3);
        Input input3 = m74639F2().f74998h;
        SavingGoalUiModel a4 = dVar.mo49407e().mo49396a();
        if (!(a4 == null || (a = a4.mo57863a()) == null || (F = C32343x.m95388F(a, new Object[0])) == null)) {
            str2 = F;
        }
        input3.setInputText(str2);
    }

    /* renamed from: v2 */
    private final void m74667v2() {
        m74636C2(m74639F2().f74995e.getTextInput(), new C23025b(this));
        m74639F2().f74998h.setOnClickListener(new C23017f(this));
        m74639F2().f75001k.setOnClickListener(new C23018g(this));
        m74639F2().f74997g.setOnClickListener(new C23019h(this));
        m74639F2().f74996f.setOnClickListener(new C23020i(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_SAVING_GOAL_SELECTED", getViewLifecycleOwner(), new C23021j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m74668w2(C23023l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        lVar.m74641I2();
        lVar.m74640H2().mo65739xw().mo65733gh();
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m74669x2(C23023l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        lVar.m74640H2().mo65739xw().mo65722A3();
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m74670y2(C23023l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        lVar.m74640H2().mo65739xw().mo65737s4();
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m74671z2(C23023l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        lVar.m74640H2().mo65739xw().mo65736qf();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f60551K = C29714d0.m90222d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f60551K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m74648R2();
        m74667v2();
        m74635B2();
    }
}

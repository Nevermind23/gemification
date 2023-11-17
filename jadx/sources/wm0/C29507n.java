package wm0;

import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import com.google.android.material.datepicker.C5023l;
import g91.C32319m;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import km0.C25743a;
import km0.C25744b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o21.C37586a;
import om0.C27054e;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.junior.domain.model.ClientPhoneSameAsChildsException;
import sm0.C28250b;
import sm0.C28251c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import ym0.C30103b;
import ym0.C30104c;
import zm0.C30363j;
import zm0.C30365k;
import zm0.C30372r;

/* renamed from: wm0.n */
public final class C29507n extends C29498e {

    /* renamed from: i */
    public static final C29508a f74623i = new C29508a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private final C41217g f74624g = C1514j0.m5374c(this, C41520a0.m120436b(C30372r.class), new C29527j0(this), new C29529k0((C43064a) null, this), new C29531l0(this));

    /* renamed from: h */
    private C27054e f74625h;

    /* renamed from: wm0.n$a */
    public static final class C29508a {
        private C29508a() {
        }

        public /* synthetic */ C29508a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C29507n mo69361a() {
            return new C29507n();
        }
    }

    /* renamed from: wm0.n$a0 */
    static final class C29509a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74626d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29509a0(C29507n nVar) {
            super(1);
            this.f74626d = nVar;
        }

        /* renamed from: a */
        public final void mo69362a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C29507n.m89674W1(this.f74626d, false, C29510b.REJECT_BUTTON, false, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69362a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$b */
    private enum C29510b {
        APPROVE_BUTTON,
        REJECT_BUTTON
    }

    /* renamed from: wm0.n$b0 */
    static final class C29511b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29511b0(C29507n nVar) {
            super(1);
            this.f74630d = nVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C29507n.m89674W1(this.f74630d, false, C29510b.REJECT_BUTTON, false, 4, (Object) null);
            this.f74630d.m89665N1().mo70728Cw().mo70701p7();
            this.f74630d.m89677Z1(th);
        }
    }

    /* renamed from: wm0.n$c */
    public /* synthetic */ class C29512c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74631a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                wm0.n$b[] r0 = wm0.C29507n.C29510b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wm0.n$b r1 = wm0.C29507n.C29510b.APPROVE_BUTTON     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wm0.n$b r1 = wm0.C29507n.C29510b.REJECT_BUTTON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f74631a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wm0.C29507n.C29512c.<clinit>():void");
        }
    }

    /* renamed from: wm0.n$c0 */
    static final class C29513c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29513c0(C29507n nVar) {
            super(1);
            this.f74632d = nVar;
        }

        /* renamed from: a */
        public final void mo69364a(C28250b bVar) {
            C29507n.m89674W1(this.f74632d, true, (C29510b) null, true, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69364a((C28250b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$d */
    public static final class C29514d implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C43075l f74633d;

        /* renamed from: e */
        final /* synthetic */ Input f74634e;

        public C29514d(C43075l lVar, Input input) {
            this.f74633d = lVar;
            this.f74634e = input;
        }

        public void afterTextChanged(Editable editable) {
            this.f74633d.invoke(this.f74634e.getInputText());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: wm0.n$d0 */
    static final class C29515d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29515d0(C29507n nVar) {
            super(1);
            this.f74635d = nVar;
        }

        /* renamed from: a */
        public final void mo69368a(C28250b bVar) {
            C41536l.m120489i(bVar, "it");
            C29507n.m89674W1(this.f74635d, false, (C29510b) null, true, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69368a((C28250b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$e */
    /* synthetic */ class C29516e extends C41535k implements C43075l {
        C29516e(Object obj) {
            super(1, obj, C30363j.class, "setFirstName", "setFirstName(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo69369b(String str) {
            C41536l.m120489i(str, "p0");
            ((C30363j) this.receiver).mo70693Ok(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69369b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$e0 */
    static final class C29517e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74636d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29517e0(C29507n nVar) {
            super(1);
            this.f74636d = nVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C29507n.m89674W1(this.f74636d, false, (C29510b) null, true, 2, (Object) null);
            if (th instanceof ClientPhoneSameAsChildsException) {
                this.f74636d.m89679b2(C32343x.m95388F("text.junior.child.phone.validation.same.as.parent.error.empty.state", new Object[0]));
            } else {
                this.f74636d.handleError(th);
            }
        }
    }

    /* renamed from: wm0.n$f */
    /* synthetic */ class C29518f extends C41535k implements C43075l {
        C29518f(Object obj) {
            super(1, obj, C30363j.class, "setLastName", "setLastName(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo69371b(String str) {
            C41536l.m120489i(str, "p0");
            ((C30363j) this.receiver).mo70690Dk(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69371b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$f0 */
    static final class C29519f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29519f0(C29507n nVar) {
            super(1);
            this.f74637d = nVar;
        }

        /* renamed from: a */
        public final void mo69372a(ScoolCardInfoUiModel scoolCardInfoUiModel) {
            C29507n.m89674W1(this.f74637d, true, C29510b.APPROVE_BUTTON, false, 4, (Object) null);
            this.f74637d.m89664M1().f67948h.setEnabled(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69372a((ScoolCardInfoUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$g */
    /* synthetic */ class C29520g extends C41535k implements C43075l {
        C29520g(Object obj) {
            super(1, obj, C30363j.class, "setPhoneNumber", "setPhoneNumber(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo69373b(String str) {
            C41536l.m120489i(str, "p0");
            ((C30363j) this.receiver).mo70689C7(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69373b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$g0 */
    static final class C29521g0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29521g0(C29507n nVar) {
            super(1);
            this.f74638d = nVar;
        }

        /* renamed from: a */
        public final void mo69374a(ScoolCardInfoUiModel scoolCardInfoUiModel) {
            C41536l.m120489i(scoolCardInfoUiModel, "it");
            C29507n.m89674W1(this.f74638d, false, C29510b.APPROVE_BUTTON, false, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69374a((ScoolCardInfoUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$h */
    /* synthetic */ class C29522h extends C41535k implements C43075l {
        C29522h(Object obj) {
            super(1, obj, C30363j.class, "setPin", "setPin(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo69375b(String str) {
            C41536l.m120489i(str, "p0");
            ((C30363j) this.receiver).mo70704ul(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69375b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$h0 */
    static final class C29523h0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29523h0(C29507n nVar) {
            super(1);
            this.f74639d = nVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C29507n.m89674W1(this.f74639d, false, C29510b.APPROVE_BUTTON, false, 4, (Object) null);
            this.f74639d.m89677Z1(th);
            this.f74639d.m89664M1().f67948h.setEnabled(true);
        }
    }

    /* renamed from: wm0.n$i */
    static final class C29524i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29524i(C29507n nVar) {
            super(1);
            this.f74640d = nVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f74640d.m89664M1().f67948h;
            C41536l.m120488h(button, "binding.buttonReject");
            C32343x.m95483r1(button, !bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* renamed from: wm0.n$i0 */
    static final class C29525i0 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f74641a;

        C29525i0(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f74641a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f74641a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f74641a.invoke(obj);
        }
    }

    /* renamed from: wm0.n$j */
    /* synthetic */ class C29526j extends C41535k implements C43075l {
        C29526j(Object obj) {
            super(1, obj, C29507n.class, "handleInput", "handleInput(Lge/bog/mobilebank/junior/presentation/model/input/ActivateJuniorInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo69380b(C30103b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C29507n) this.receiver).m89666O1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69380b((C30103b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$j0 */
    public static final class C29527j0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29527j0(Fragment fragment) {
            super(0);
            this.f74642d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f74642d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: wm0.n$k */
    /* synthetic */ class C29528k extends C41535k implements C43075l {
        C29528k(Object obj) {
            super(1, obj, C29507n.class, "onValidateChildResult", "onValidateChildResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo69381b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C29507n) this.receiver).m89672U1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69381b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$k0 */
    public static final class C29529k0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74643d;

        /* renamed from: e */
        final /* synthetic */ Fragment f74644e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29529k0(C43064a aVar, Fragment fragment) {
            super(0);
            this.f74643d = aVar;
            this.f74644e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f74643d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f74644e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: wm0.n$l */
    static final class C29530l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29530l(C29507n nVar) {
            super(1);
            this.f74645d = nVar;
        }

        /* renamed from: a */
        public final void mo69382a(C31128a aVar) {
            C29507n nVar = this.f74645d;
            C41536l.m120488h(aVar, "response");
            nVar.m89668Q1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69382a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$l0 */
    public static final class C29531l0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29531l0(Fragment fragment) {
            super(0);
            this.f74646d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f74646d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: wm0.n$m */
    /* synthetic */ class C29532m extends C41535k implements C43075l {
        C29532m(Object obj) {
            super(1, obj, C29507n.class, "fillRequestData", "fillRequestData(Lge/bog/mobilebank/cleanarch/junior/presentation/JuniorRequestDataUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo69383b(JuniorRequestDataUiModel juniorRequestDataUiModel) {
            ((C29507n) this.receiver).m89663L1(juniorRequestDataUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69383b((JuniorRequestDataUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$n */
    /* synthetic */ class C29533n extends C41535k implements C43075l {
        C29533n(Object obj) {
            super(1, obj, C29507n.class, "createDatePickerDialog", "createDatePickerDialog(Lge/bog/mobilebank/shared/common/presentation/DatePickerData;)V", 0);
        }

        /* renamed from: b */
        public final void mo69384b(C37586a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C29507n) this.receiver).m89661J1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69384b((C37586a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$o */
    /* synthetic */ class C29534o extends C41535k implements C43075l {
        C29534o(Object obj) {
            super(1, obj, C29507n.class, "onRejectResult", "onRejectResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo69385b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C29507n) this.receiver).m89670S1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69385b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$p */
    /* synthetic */ class C29535p extends C41535k implements C43075l {
        C29535p(Object obj) {
            super(1, obj, C29507n.class, "onRegisterChildOnBoardingRequest", "onRegisterChildOnBoardingRequest(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo69386b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C29507n) this.receiver).m89669R1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69386b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$q */
    /* synthetic */ class C29536q extends C41535k implements C43075l {
        C29536q(Object obj) {
            super(1, obj, C29507n.class, "onRequestOtpResult", "onRequestOtpResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo69387b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C29507n) this.receiver).m89671T1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69387b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$r */
    static final class C29537r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29537r(C29507n nVar) {
            super(1);
            this.f74647d = nVar;
        }

        /* renamed from: a */
        public final void mo69388a(boolean z) {
            this.f74647d.m89679b2(C32343x.m95388F("text.junior.child.phone.validation.same.as.parent.error", new Object[0]));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69388a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$s */
    static final class C29538s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74648d;

        /* renamed from: e */
        final /* synthetic */ C5023l f74649e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29538s(C29507n nVar, C5023l lVar) {
            super(1);
            this.f74648d = nVar;
            this.f74649e = lVar;
        }

        /* renamed from: a */
        public final void mo69389a(Long l) {
            C30363j Cw = this.f74648d.m89665N1().mo70728Cw();
            C41536l.m120488h(l, "date");
            Cw.mo70695Rp(l.longValue());
            Input input = this.f74648d.m89664M1().f67947g;
            String g = C32319m.m95300g(l.longValue(), this.f74649e.getContext());
            C41536l.m120488h(g, "formatDateDayMonthYear(date, context)");
            input.setInputText(g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69389a((Long) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$t */
    static final class C29539t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29539t(C29507n nVar) {
            super(1);
            this.f74650d = nVar;
        }

        /* renamed from: a */
        public final void mo69390a(C28251c cVar) {
            C29507n.m89674W1(this.f74650d, true, C29510b.APPROVE_BUTTON, false, 4, (Object) null);
            this.f74650d.m89664M1().f67948h.setEnabled(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69390a((C28251c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$u */
    static final class C29540u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74651d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29540u(C29507n nVar) {
            super(1);
            this.f74651d = nVar;
        }

        /* renamed from: a */
        public final void mo69391a(C28251c cVar) {
            C41536l.m120489i(cVar, "it");
            C29507n.m89674W1(this.f74651d, false, C29510b.APPROVE_BUTTON, false, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69391a((C28251c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$v */
    static final class C29541v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74652d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29541v(C29507n nVar) {
            super(1);
            this.f74652d = nVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C29507n.m89674W1(this.f74652d, false, C29510b.APPROVE_BUTTON, false, 4, (Object) null);
            this.f74652d.m89677Z1(th);
            this.f74652d.m89664M1().f67948h.setEnabled(true);
        }
    }

    /* renamed from: wm0.n$w */
    static final class C29542w extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C29507n f74653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29542w(C29507n nVar) {
            super(2);
            this.f74653d = nVar;
        }

        /* renamed from: a */
        public final void mo69393a(Throwable th, C41238w wVar) {
            C41536l.m120489i(th, "error");
            this.f74653d.m89677Z1(th);
            C29507n.m89674W1(this.f74653d, false, C29510b.APPROVE_BUTTON, false, 4, (Object) null);
            this.f74653d.m89664M1().f67946f.setEnabled(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo69393a((Throwable) obj, (C41238w) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$x */
    static final class C29543x extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29543x f74654d = new C29543x();

        C29543x() {
            super(1);
        }

        /* renamed from: a */
        public final void mo69394a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69394a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$y */
    static final class C29544y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29544y(C29507n nVar) {
            super(1);
            this.f74655d = nVar;
        }

        /* renamed from: a */
        public final void mo69395a(C41238w wVar) {
            C29507n.m89674W1(this.f74655d, true, C29510b.APPROVE_BUTTON, false, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69395a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.n$z */
    static final class C29545z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29507n f74656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29545z(C29507n nVar) {
            super(1);
            this.f74656d = nVar;
        }

        /* renamed from: a */
        public final void mo69396a(C41238w wVar) {
            C29507n.m89674W1(this.f74656d, true, C29510b.REJECT_BUTTON, false, 4, (Object) null);
            this.f74656d.m89664M1().f67946f.setEnabled(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69396a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: D1 */
    private final void m89655D1(Input input, C43075l lVar) {
        input.getTextInput().addTextChangedListener(new C29514d(lVar, input));
    }

    /* renamed from: E1 */
    private final void m89656E1() {
        Input input = m89664M1().f67951k;
        C41536l.m120488h(input, "binding.firstNameInput");
        m89655D1(input, new C29516e(m89665N1().mo70728Cw()));
        Input input2 = m89664M1().f67955o;
        C41536l.m120488h(input2, "binding.lastNameInput");
        m89655D1(input2, new C29518f(m89665N1().mo70728Cw()));
        Input input3 = m89664M1().f67958r;
        C41536l.m120488h(input3, "binding.phoneInput");
        m89655D1(input3, new C29520g(m89665N1().mo70728Cw()));
        m89664M1().f67958r.setInputButtonClickListener(new C29503j(this));
        Input input4 = m89664M1().f67954n;
        C41536l.m120488h(input4, "binding.idNumberInput");
        m89655D1(input4, new C29522h(m89665N1().mo70728Cw()));
        m89664M1().f67948h.setOnClickListener(new C29504k(this));
        m89664M1().f67947g.setOnClickListener(new C29505l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m89657F1(C29507n nVar, View view) {
        C41536l.m120489i(nVar, "this$0");
        nVar.m89667P1();
        nVar.m89664M1().f67958r.getTextInput().clearFocus();
        nVar.m89664M1().f67958r.clearFocus();
        nVar.m89665N1().mo70728Cw().mo70694Qk();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m89658G1(C29507n nVar, View view) {
        C41536l.m120489i(nVar, "this$0");
        nVar.m89665N1().mo70731Jw();
        nVar.requireActivity().finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m89659H1(C29507n nVar, View view) {
        C41536l.m120489i(nVar, "this$0");
        nVar.m89665N1().mo70728Cw().mo70697Y5();
    }

    /* renamed from: I1 */
    private final void m89660I1() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C30365k Ew = m89665N1().mo70730Ew();
        Ew.mo70716f().mo4819k(getViewLifecycleOwner(), new C29525i0(new C29526j(this)));
        Ew.mo70722pr().mo4819k(getViewLifecycleOwner(), new C29525i0(new C29528k(this)));
        Ew.mo70706Fr().mo4819k(getViewLifecycleOwner(), new C29525i0(new C29530l(this)));
        Ew.mo70717hq().mo4819k(getViewLifecycleOwner(), new C29525i0(new C29532m(this)));
        LiveData Ae = Ew.mo70705Ae();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Ae, viewLifecycleOwner2, new C29533n(this));
        Ew.mo70726vg().mo4819k(getViewLifecycleOwner(), new C29525i0(new C29534o(this)));
        Ew.mo70721pq().mo4819k(viewLifecycleOwner, new C29525i0(new C29535p(this)));
        Ew.mo70713W7().mo4819k(viewLifecycleOwner, new C29525i0(new C29536q(this)));
        C37224b.m109963b(Ew.mo70715eg(), viewLifecycleOwner, new C29537r(this));
        Ew.mo70707L4().mo4819k(viewLifecycleOwner, new C29525i0(new C29524i(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m89661J1(C37586a aVar) {
        C5023l.C5029f e = C5023l.C5029f.m19565c().mo16276e(aVar.mo90772a());
        Long b = aVar.mo90773b();
        if (b != null) {
            C41536l.m120488h(e, "it");
            e.mo16278g(b);
        }
        C5023l a = e.mo16277f(0).mo16275a();
        a.mo16267J1(new C29500g(new C29538s(this, a)));
        a.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m89662K1(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final void m89663L1(JuniorRequestDataUiModel juniorRequestDataUiModel) {
        boolean z;
        String str;
        String str2;
        Long l;
        String f;
        Input input = m89664M1().f67958r;
        if (juniorRequestDataUiModel == null) {
            z = true;
        } else {
            z = false;
        }
        input.setHasInputButton(z);
        Input input2 = m89664M1().f67951k;
        String str3 = "";
        if (juniorRequestDataUiModel == null || (str = juniorRequestDataUiModel.mo52341d()) == null) {
            str = str3;
        }
        input2.setInputText(str);
        Input input3 = m89664M1().f67955o;
        if (juniorRequestDataUiModel == null || (str2 = juniorRequestDataUiModel.mo52343e()) == null) {
            str2 = str3;
        }
        input3.setInputText(str2);
        String str4 = null;
        if (juniorRequestDataUiModel != null) {
            l = juniorRequestDataUiModel.mo52339a();
        } else {
            l = null;
        }
        if (l == null) {
            m89664M1().f67947g.setInputText(str3);
        } else {
            Input input4 = m89664M1().f67947g;
            Long a = juniorRequestDataUiModel.mo52339a();
            C41536l.m120486f(a);
            String g = C32319m.m95300g(a.longValue(), getContext());
            C41536l.m120488h(g, "formatDateDayMonthYear(r…hildBirthDate!!, context)");
            input4.setInputText(g);
        }
        if (juniorRequestDataUiModel != null) {
            str4 = juniorRequestDataUiModel.mo52346g();
        }
        if (str4 == null) {
            m89664M1().f67954n.setInputText(str3);
        } else {
            Input input5 = m89664M1().f67954n;
            String g2 = juniorRequestDataUiModel.mo52346g();
            C41536l.m120486f(g2);
            input5.setInputText(g2.toString());
        }
        Input input6 = m89664M1().f67958r;
        if (!(juniorRequestDataUiModel == null || (f = juniorRequestDataUiModel.mo52345f()) == null)) {
            str3 = f;
        }
        input6.setInputText(str3);
        m89681d2(juniorRequestDataUiModel);
        m89665N1().mo70728Cw().mo70701p7();
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final C27054e m89664M1() {
        C27054e eVar = this.f74625h;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final C30372r m89665N1() {
        return (C30372r) this.f74624g.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public final void m89666O1(C30103b bVar) {
        boolean z;
        String str;
        boolean z2;
        m89664M1().f67946f.setEnabled(bVar.mo70386h());
        C30104c c = bVar.mo70384f().mo70363c();
        Input input = m89664M1().f67958r;
        boolean z3 = true;
        if (!c.mo70390c() || c.mo70392e()) {
            z = false;
        } else {
            z = true;
        }
        input.setHasInputButton(z);
        m89664M1().f67958r.setInputButtonEnabled(bVar.mo70384f().mo70365e());
        Input input2 = m89664M1().f67958r;
        if (!c.mo70390c() || !c.mo70392e()) {
            str = null;
        } else {
            str = C32343x.m95388F("text.junior.activation.page.child.phone.number.verified", new Object[0]);
        }
        input2.setInfoText(str);
        Input input3 = m89664M1().f67958r;
        if (!c.mo70390c() || c.mo70392e()) {
            if (c.mo70391d().length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
            }
        }
        input3.setEnabled(z3);
    }

    /* renamed from: P1 */
    private final void m89667P1() {
        IBinder iBinder;
        Object systemService = requireContext().getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View view = getView();
        if (view != null) {
            iBinder = view.getWindowToken();
        } else {
            iBinder = null;
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final void m89668Q1(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C29539t(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C29540u(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C29541v(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public final void m89669R1(C31128a aVar) {
        C31132b.m92644f(aVar, (int[]) null, new C29542w(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, C29543x.f74654d, 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C29544y(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public final void m89670S1(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C29545z(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C29509a0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C29511b0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public final void m89671T1(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C29513c0(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C29515d0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C29517e0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m89672U1(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C29519f0(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C29521g0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C29523h0(this), 1, (Object) null);
    }

    /* renamed from: V1 */
    private final void m89673V1(boolean z, C29510b bVar, boolean z2) {
        boolean z3;
        int i;
        ProgressBar progressBar = m89664M1().f67956p;
        C41536l.m120488h(progressBar, "binding.loaderProgress");
        if (!z || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        C32343x.m95483r1(progressBar, z3, false, 2, (Object) null);
        FrameLayout frameLayout = m89664M1().f67957q;
        C41536l.m120488h(frameLayout, "binding.loadingWall");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        if (bVar == null) {
            i = -1;
        } else {
            i = C29512c.f74631a[bVar.ordinal()];
        }
        if (i == 1) {
            m89664M1().f67946f.setLoading(z);
        } else if (i == 2) {
            m89664M1().f67948h.setLoading(z);
        }
    }

    /* renamed from: W1 */
    static /* synthetic */ void m89674W1(C29507n nVar, boolean z, C29510b bVar, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nVar.m89673V1(z, bVar, z2);
    }

    /* renamed from: X1 */
    private final void m89675X1() {
        m89664M1().f67945e.setText(C32343x.m95388F("text.junior.activation.page.description", new Object[0]));
        m89664M1().f67945e.setTitle(C32343x.m95388F("text.junior.activation.page.title", new Object[0]));
        m89664M1().f67951k.setHintText((CharSequence) C32343x.m95388F("text.junior.activation.page.child.name", new Object[0]));
        m89664M1().f67955o.setHintText((CharSequence) C32343x.m95388F("text.junior.activation.page.child.last.name", new Object[0]));
        m89664M1().f67947g.setHintText((CharSequence) C32343x.m95388F("text.junior.activation.page.birth.date", new Object[0]));
        m89664M1().f67954n.setHintText((CharSequence) C32343x.m95388F("text.junior.activation.page.pin", new Object[0]));
        m89664M1().f67946f.setButtonText(C32343x.m95388F("text.junior.activation.page.button.ok", new Object[0]));
        m89664M1().f67958r.setHintText((CharSequence) C32343x.m95388F("text.junior.activation.page.child.phone.number", new Object[0]));
        m89664M1().f67958r.setEnabled(false);
        m89664M1().f67948h.setButtonText(C32343x.m95388F("text.junior.activation.page.button.reject", new Object[0]));
        m89664M1().f67958r.setInputButtonText(C32343x.m95388F("text.junior.activation.page.verify.child.phone.number", new Object[0]));
        m89664M1().f67958r.getTextInput().setFilters(new InputFilter[]{new C29502i()});
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final CharSequence m89676Y1(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C41536l.m120488h(charSequence, "src");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public final void m89677Z1(Throwable th) {
        FragmentManager supportFragmentManager;
        C13310d dVar = new C13310d();
        dVar.mo35638P1(Integer.valueOf(C25743a.f65515a));
        dVar.mo35648c2(C32343x.m95388F("text.junior.activation.page.error.popup.title", new Object[0]));
        dVar.mo35639Q1(C32343x.m95431a0(th, (String) null, 1, (Object) null));
        dVar.mo35637O1(Integer.valueOf(C25744b.f65516a));
        dVar.mo35644X1(C32343x.m95388F("text.junior.activation.page.error.popup.button", new Object[0]));
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_SINGLE_BUTTON);
        dVar.mo35643V1(new C29506m(dVar));
        C1505h activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            dVar.mo4576A1(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m89678a2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public final void m89679b2(String str) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_SINGLE_BUTTON);
        dVar.mo35639Q1(str);
        dVar.mo35644X1(C32343x.m95388F("text.junior.child.phone.validation.same.as.parent.error.dialog.button", new Object[0]));
        dVar.mo4586v1(false);
        dVar.mo35643V1(new C29499f(dVar));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m89680c2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: d2 */
    private final void m89681d2(JuniorRequestDataUiModel juniorRequestDataUiModel) {
        if (juniorRequestDataUiModel == null) {
            m89664M1().f67945e.setText(C32343x.m95388F("text.junior.activation.page.description.for.empty.state", new Object[0]));
            m89664M1().f67958r.setEnabled(true);
            Button button = m89664M1().f67948h;
            C41536l.m120488h(button, "binding.buttonReject");
            C32343x.m95455i0(button);
        } else {
            Button button2 = m89664M1().f67948h;
            C41536l.m120488h(button2, "binding.buttonReject");
            C32343x.m95447f1(button2);
        }
        m89664M1().f67946f.setOnClickListener(new C29501h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public static final void m89682e2(C29507n nVar, View view) {
        C41536l.m120489i(nVar, "this$0");
        nVar.m89665N1().mo70728Cw().mo70700kq();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f74625h = C27054e.m83890d(getLayoutInflater());
        ConstraintLayout c = m89664M1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f74625h = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m89675X1();
        m89656E1();
        m89660I1();
    }
}

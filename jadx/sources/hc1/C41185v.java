package hc1;

import ah1.C40314b;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.biometric.C0577w;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.LiveData;
import ba1.C10139a0;
import ba1.C10205l;
import ba1.C10220y;
import ba1.C10221z;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import hc1.C41130b0;
import hc1.C41155h0;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView;
import p341ge.bog.designsystem.components.passcode.PasscodeCompactView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.network.ConnectionFailedException;
import p420fh.C12902d;
import p420fh.C12910e;
import p642vh.C18368l;
import p670xi.C18765b;
import p670xi.C18767d;
import sso.type.AuthElementType;
import sso.type.StrongAuthMethod;
import sso.type.UserContactType;
import ua1.C28664n0;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: hc1.v */
public final class C41185v extends C1483c implements C41155h0.C41158c {

    /* renamed from: C */
    public static final C41187b f97155C = new C41187b((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C41217g f97156A = C41219i.m119469a(C41222k.SYNCHRONIZED, new C41195j(this, (C41806a) null, (C43064a) null));

    /* renamed from: B */
    private final C41217g f97157B = C41219i.m119470b(new C41194i(this));

    /* renamed from: t */
    private final C41217g f97158t = C41219i.m119469a(C41222k.NONE, new C41197l(this, (C41806a) null, (C43064a) null, new C41196k(this), (C43064a) null));

    /* renamed from: u */
    private C28664n0 f97159u;

    /* renamed from: v */
    private final C41217g f97160v = C41219i.m119470b(new C41191f(this));

    /* renamed from: w */
    private final C41217g f97161w = C41219i.m119470b(new C41192g(this));

    /* renamed from: x */
    private final C41217g f97162x = C41219i.m119470b(new C41198m(this));

    /* renamed from: y */
    private C41186a f97163y;

    /* renamed from: z */
    private C41155h0 f97164z;

    /* renamed from: hc1.v$a */
    public interface C41186a {
        /* renamed from: O */
        void mo37615O(String str, String str2, String str3, String str4);

        /* renamed from: R */
        void mo37616R(String str, String str2);

        /* renamed from: S */
        void mo37617S(boolean z);
    }

    /* renamed from: hc1.v$b */
    public static final class C41187b {
        private C41187b() {
        }

        public /* synthetic */ C41187b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C41185v m119422d(C41187b bVar, String str, C41145d dVar, C41143c cVar, int i, Object obj) {
            if ((i & 4) != 0) {
                cVar = C41143c.DEFAULT;
            }
            return bVar.mo95636a(str, dVar, cVar);
        }

        /* renamed from: e */
        public static /* synthetic */ C41185v m119423e(C41187b bVar, String str, HashMap hashMap, C41143c cVar, int i, Object obj) {
            if ((i & 4) != 0) {
                cVar = C41143c.DEFAULT;
            }
            return bVar.mo95638c(str, hashMap, cVar);
        }

        /* renamed from: a */
        public final C41185v mo95636a(String str, C41145d dVar, C41143c cVar) {
            C41536l.m120489i(str, "otpServiceId");
            C41536l.m120489i(dVar, "scaParams");
            C41536l.m120489i(cVar, "authConfig");
            C41185v vVar = new C41185v();
            vVar.setArguments(C0908e.m3336b(C41233s.m119492a("AUTH_CONFIG", cVar), C41233s.m119492a("SERVICE_ID", str), C41233s.m119492a("SCA_PARAMS", dVar.mo95599a())));
            return vVar;
        }

        /* renamed from: b */
        public final C41185v mo95637b(String str, HashMap hashMap) {
            C41536l.m120489i(str, "otpServiceId");
            C41536l.m120489i(hashMap, "operationData");
            return m119423e(this, str, hashMap, (C41143c) null, 4, (Object) null);
        }

        /* renamed from: c */
        public final C41185v mo95638c(String str, HashMap hashMap, C41143c cVar) {
            C41536l.m120489i(str, "otpServiceId");
            C41536l.m120489i(hashMap, "operationData");
            C41536l.m120489i(cVar, "authConfig");
            C41185v vVar = new C41185v();
            vVar.setArguments(C0908e.m3336b(C41233s.m119492a("AUTH_CONFIG", cVar), C41233s.m119492a("SERVICE_ID", str), C41233s.m119492a("OPERATION_DATA", hashMap), C41233s.m119492a("LEGACY_SCA", Boolean.TRUE)));
            return vVar;
        }
    }

    /* renamed from: hc1.v$c */
    public /* synthetic */ class C41188c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97165a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f97166b;

        static {
            int[] iArr = new int[C18767d.values().length];
            iArr[C18767d.PHONE.ordinal()] = 1;
            iArr[C18767d.EMAIL.ordinal()] = 2;
            f97165a = iArr;
            int[] iArr2 = new int[AuthElementType.values().length];
            iArr2[AuthElementType.PASSCODE.ordinal()] = 1;
            iArr2[AuthElementType.PASSWORD.ordinal()] = 2;
            iArr2[AuthElementType.OTP.ordinal()] = 3;
            f97166b = iArr2;
        }
    }

    /* renamed from: hc1.v$d */
    public static final class C41189d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ C41185v f97167a;

        /* renamed from: b */
        final /* synthetic */ ConstraintLayout.C0620b f97168b;

        public C41189d(C41185v vVar, ConstraintLayout.C0620b bVar) {
            this.f97167a = vVar;
            this.f97168b = bVar;
        }

        public void onTransitionCancel(Transition transition) {
            C41536l.m120489i(transition, "transition");
            this.f97167a.m119387b2().f72853k.setLayoutParams(this.f97168b);
        }

        public void onTransitionEnd(Transition transition) {
            C41536l.m120489i(transition, "transition");
        }

        public void onTransitionPause(Transition transition) {
            C41536l.m120489i(transition, "transition");
        }

        public void onTransitionResume(Transition transition) {
            C41536l.m120489i(transition, "transition");
        }

        public void onTransitionStart(Transition transition) {
            C41536l.m120489i(transition, "transition");
        }
    }

    /* renamed from: hc1.v$e */
    public static final class C41190e implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ C41185v f97169a;

        /* renamed from: b */
        final /* synthetic */ ConstraintLayout.C0620b f97170b;

        public C41190e(C41185v vVar, ConstraintLayout.C0620b bVar) {
            this.f97169a = vVar;
            this.f97170b = bVar;
        }

        public void onTransitionCancel(Transition transition) {
            C41536l.m120489i(transition, "transition");
        }

        public void onTransitionEnd(Transition transition) {
            C41536l.m120489i(transition, "transition");
            this.f97169a.m119387b2().f72853k.setLayoutParams(this.f97170b);
        }

        public void onTransitionPause(Transition transition) {
            C41536l.m120489i(transition, "transition");
        }

        public void onTransitionResume(Transition transition) {
            C41536l.m120489i(transition, "transition");
        }

        public void onTransitionStart(Transition transition) {
            C41536l.m120489i(transition, "transition");
        }
    }

    /* renamed from: hc1.v$f */
    static final class C41191f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41185v f97171d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41191f(C41185v vVar) {
            super(0);
            this.f97171d = vVar;
        }

        /* renamed from: b */
        public final Map invoke() {
            return C41344r0.m119931m(C41233s.m119492a(AuthElementType.PASSCODE, this.f97171d.m119387b2().f72856n), C41233s.m119492a(AuthElementType.PASSWORD, this.f97171d.m119387b2().f72857o), C41233s.m119492a(AuthElementType.OTP, this.f97171d.m119387b2().f72854l));
        }
    }

    /* renamed from: hc1.v$g */
    static final class C41192g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41185v f97172d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41192g(C41185v vVar) {
            super(0);
            this.f97172d = vVar;
        }

        /* renamed from: b */
        public final Map invoke() {
            return C41344r0.m119931m(C41233s.m119492a(AuthElementType.PASSCODE, this.f97172d.m119387b2().f72856n), C41233s.m119492a(AuthElementType.PASSWORD, this.f97172d.m119387b2().f72858p), C41233s.m119492a(AuthElementType.OTP, this.f97172d.m119387b2().f72855m));
        }
    }

    /* renamed from: hc1.v$h */
    public static final class C41193h implements C18765b {

        /* renamed from: d */
        final /* synthetic */ C41185v f97173d;

        C41193h(C41185v vVar) {
            this.f97173d = vVar;
        }

        /* renamed from: n */
        public void mo46551n() {
            this.f97173d.m119358E2();
        }
    }

    /* renamed from: hc1.v$i */
    static final class C41194i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41185v f97174d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41194i(C41185v vVar) {
            super(0);
            this.f97174d = vVar;
        }

        /* renamed from: b */
        public final C10205l.C10206a invoke() {
            return this.f97174d.m119389d2().mo26772b(this.f97174d);
        }
    }

    /* renamed from: hc1.v$j */
    public static final class C41195j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f97175d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97176e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97177f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41195j(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f97175d = componentCallbacks;
            this.f97176e = aVar;
            this.f97177f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f97175d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10205l.class), this.f97176e, this.f97177f);
        }
    }

    /* renamed from: hc1.v$k */
    public static final class C41196k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41196k(Fragment fragment) {
            super(0);
            this.f97178d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f97178d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: hc1.v$l */
    public static final class C41197l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97179d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97180e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97181f;

        /* renamed from: g */
        final /* synthetic */ C43064a f97182g;

        /* renamed from: h */
        final /* synthetic */ C43064a f97183h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41197l(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f97179d = fragment;
            this.f97180e = aVar;
            this.f97181f = aVar2;
            this.f97182g = aVar3;
            this.f97183h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f97179d, this.f97180e, this.f97181f, this.f97182g, C41520a0.m120436b(C41130b0.class), this.f97183h);
        }
    }

    /* renamed from: hc1.v$m */
    static final class C41198m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41185v f97184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41198m(C41185v vVar) {
            super(0);
            this.f97184d = vVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f97184d.requireArguments().getBoolean("LEGACY_SCA", false));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m119350A2(C41185v vVar, String str) {
        boolean z;
        C41536l.m120489i(vVar, "this$0");
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            vVar.m119387b2().f72855m.setCodeText(str);
        }
    }

    /* renamed from: B2 */
    private final void m119352B2(AuthElementType authElementType) {
        m119391f2().mo95573Vw(authElementType);
    }

    /* renamed from: C2 */
    private final void m119354C2(C35947l.C35949b bVar) {
        ApiException apiException;
        Throwable a = bVar.mo88517a();
        String str = null;
        if (a instanceof ApiException) {
            apiException = (ApiException) a;
        } else {
            apiException = null;
        }
        if (apiException != null) {
            str = apiException.getErrorMessage();
        }
        mo95635L2(false);
        mo95633J2(str);
    }

    /* renamed from: D2 */
    private final void m119356D2(C41155h0.C41156a aVar, boolean z) {
        m119382W1(false);
        C41155h0 a = C41155h0.f97096C.mo95607a(aVar, z);
        this.f97164z = a;
        if (a != null) {
            a.mo4576A1(getChildFragmentManager(), "SingleComponentAuthDialog");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public final void m119358E2() {
        StrongAuthMethod strongAuthMethod;
        if (m119387b2().f72854l.getVisibility() == 0) {
            int i = C41188c.f97165a[m119387b2().f72855m.getOtpType().ordinal()];
            if (i == 1) {
                C10205l.C10206a c2 = m119388c2();
                if (c2 != null) {
                    c2.mo26774a();
                }
                strongAuthMethod = StrongAuthMethod.SMS;
            } else if (i != 2) {
                strongAuthMethod = null;
            } else {
                strongAuthMethod = StrongAuthMethod.MAIL;
            }
            if (strongAuthMethod != null) {
                m119391f2().mo95576ex(strongAuthMethod);
            }
        }
    }

    /* renamed from: F2 */
    private final void m119360F2() {
        C1533o.m5445b(this, "ScaVerificationDialogFragment.CLOSE", C0908e.m3336b(new C41224m[0]));
    }

    /* renamed from: H2 */
    private final void m119363H2(C41224m mVar) {
        String str;
        UserContact userContact = (UserContact) mVar.mo95675a();
        UserContact userContact2 = (UserContact) mVar.mo95676b();
        String str2 = null;
        if (userContact != null) {
            str = userContact.mo88418a();
        } else {
            str = null;
        }
        if (str != null) {
            m119387b2().f72855m.setPhoneEnabled(true);
            m119387b2().f72855m.setPhoneNumber(userContact.mo88418a());
        } else {
            m119387b2().f72855m.setPhoneEnabled(false);
        }
        if (userContact2 != null) {
            str2 = userContact2.mo88418a();
        }
        if (str2 != null) {
            m119387b2().f72855m.setEmailEnabled(true);
            m119387b2().f72855m.setEmail(userContact2.mo88418a());
            return;
        }
        m119387b2().f72855m.setEmailEnabled(false);
    }

    /* renamed from: I2 */
    private final void m119365I2() {
        Window window;
        View decorView;
        Dialog n1 = mo4579n1();
        if (n1 != null && (window = n1.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewCompat.m3550F0(decorView, new C10139a0());
        }
    }

    /* renamed from: M2 */
    private final void m119370M2(List list) {
        int i;
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        Iterator it = m119385Z1().entrySet().iterator();
        while (true) {
            i = 8;
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            AuthElementType authElementType = (AuthElementType) entry.getKey();
            ViewGroup viewGroup = (ViewGroup) entry.getValue();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((C41127a) obj).mo95555a() == authElementType) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            C41127a aVar = (C41127a) obj;
            if (aVar != null) {
                i = 0;
            }
            viewGroup.setVisibility(i);
            if (aVar != null) {
                m119402q2(aVar);
            }
        }
        View view = m119387b2().f72862t;
        if (list.size() > 1) {
            i = 0;
        }
        view.setVisibility(i);
        if (!list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((C41127a) it3.next()).mo95555a() == AuthElementType.OTP) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z && !m119391f2().mo95562Ew()) {
            m119391f2().mo95577fx(true);
            m119358E2();
        }
    }

    /* renamed from: O2 */
    private final void m119373O2(UserContact userContact) {
        UserContactType f = userContact.mo88424f();
        String a = userContact.mo88418a();
        if (a != null) {
            if (f == UserContactType.PHONE) {
                C12910e.m48798p(this, getString(C10220y.sca_verification_otp_to_mobile) + ' ' + a, (C12902d.C12905b) null, false, 6, (Object) null);
            } else if (f == UserContactType.MAIL) {
                C12910e.m48798p(this, getString(C10220y.sca_verification_otp_to_email) + ' ' + a, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }
    }

    /* renamed from: P2 */
    private final void m119375P2(Dialog dialog) {
        Object obj;
        Context context;
        if (dialog != null) {
            Rect rect = new Rect();
            requireActivity().getWindow().getDecorView().getRootView().getWindowVisibleDisplayFrame(rect);
            if (requireActivity().getWindow().getDecorView().getRootView().getHeight() - rect.height() > C43193c.m123892b((double) C18368l.m62762k(80))) {
                View currentFocus = dialog.getCurrentFocus();
                if (currentFocus == null || (context = currentFocus.getContext()) == null) {
                    obj = null;
                } else {
                    obj = context.getSystemService("input_method");
                }
                InputMethodManager inputMethodManager = (InputMethodManager) obj;
                if (inputMethodManager != null && inputMethodManager.isActive()) {
                    inputMethodManager.toggleSoftInput(0, 2);
                }
            }
        }
    }

    /* renamed from: V1 */
    private final void m119381V1() {
        boolean z;
        for (Map.Entry entry : m119386a2().entrySet()) {
            AuthElementType authElementType = (AuthElementType) entry.getKey();
            ViewGroup viewGroup = (ViewGroup) entry.getValue();
            if (((View) C41344r0.m119929k(m119385Z1(), authElementType)).getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (viewGroup instanceof PasscodeCompactView) {
                    C41130b0.m119231Aw(m119391f2(), authElementType, ((PasscodeCompactView) viewGroup).getValue(), false, 4, (Object) null);
                } else if (viewGroup instanceof Input) {
                    C41130b0.m119231Aw(m119391f2(), authElementType, ((Input) viewGroup).getInputText(), false, 4, (Object) null);
                } else if (viewGroup instanceof OneTimePasswordView) {
                    C41130b0.m119231Aw(m119391f2(), authElementType, ((OneTimePasswordView) viewGroup).getCodeText(), false, 4, (Object) null);
                }
            }
        }
    }

    /* renamed from: W1 */
    private final void m119382W1(boolean z) {
        ConstraintLayout.C0620b bVar;
        if (z) {
            ViewGroup.LayoutParams layoutParams = m119387b2().f72853k.getLayoutParams();
            if (layoutParams != null) {
                bVar = (ConstraintLayout.C0620b) layoutParams;
                bVar.f2534j = -1;
                bVar.f2532i = 0;
                bVar.f2538l = 0;
                bVar.f2497H = 1.0f;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = m119387b2().f72853k.getLayoutParams();
            if (layoutParams2 != null) {
                bVar = (ConstraintLayout.C0620b) layoutParams2;
                bVar.f2534j = 0;
                bVar.f2532i = -1;
                bVar.f2538l = -1;
                bVar.f2497H = Utils.FLOAT_EPSILON;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(400);
        autoTransition.addTarget(m119387b2().f72853k);
        autoTransition.addListener(new C41189d(this, bVar));
        autoTransition.addListener(new C41190e(this, bVar));
        TransitionManager.beginDelayedTransition(m119387b2().f72853k, autoTransition);
        m119387b2().f72853k.setLayoutParams(bVar);
    }

    /* renamed from: X1 */
    private final void m119383X1() {
        for (Map.Entry value : m119386a2().entrySet()) {
            ViewGroup viewGroup = (ViewGroup) value.getValue();
            if (viewGroup instanceof PasscodeCompactView) {
                ((PasscodeCompactView) viewGroup).mo36430h();
            } else if (viewGroup instanceof Input) {
                ((Input) viewGroup).setInputText("");
            } else if (viewGroup instanceof OneTimePasswordView) {
                ((OneTimePasswordView) viewGroup).mo36273o();
            }
        }
    }

    /* renamed from: Y1 */
    private final void m119384Y1(List list) {
        boolean z;
        AuthElementType authElementType;
        C41127a aVar = (C41127a) C41358y.m120009Y(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C41127a) next).mo95555a() != AuthElementType.BIOMETRY) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 1) {
            z = true;
        }
        C41155h0 h0Var = this.f97164z;
        if (h0Var != null) {
            h0Var.mo4577k1();
        }
        AuthElementType authElementType2 = null;
        if (aVar != null) {
            authElementType = aVar.mo95555a();
        } else {
            authElementType = null;
        }
        AuthElementType authElementType3 = AuthElementType.BIOMETRY;
        if (authElementType != authElementType3) {
            if (aVar != null) {
                authElementType2 = aVar.mo95555a();
            }
            if (authElementType2 == AuthElementType.PASSCODE && z) {
                m119356D2(C41155h0.C41156a.PASSCODE, aVar.mo95556b());
            } else if (aVar != null) {
                m119370M2(list);
                m119382W1(true);
            }
        } else if (C0577w.m2200b(requireContext()).mo2453a() != 0) {
            m119352B2(authElementType3);
        } else {
            m119356D2(C41155h0.C41156a.BIOMETRIC, aVar.mo95556b());
        }
    }

    /* renamed from: Z1 */
    private final Map m119385Z1() {
        return (Map) this.f97160v.getValue();
    }

    /* renamed from: a2 */
    private final Map m119386a2() {
        return (Map) this.f97161w.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public final C28664n0 m119387b2() {
        C28664n0 n0Var = this.f97159u;
        C41536l.m120486f(n0Var);
        return n0Var;
    }

    /* renamed from: c2 */
    private final C10205l.C10206a m119388c2() {
        return (C10205l.C10206a) this.f97157B.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public final C10205l m119389d2() {
        return (C10205l) this.f97156A.getValue();
    }

    /* renamed from: e2 */
    private final boolean m119390e2() {
        return ((Boolean) this.f97162x.getValue()).booleanValue();
    }

    /* renamed from: f2 */
    private final C41130b0 m119391f2() {
        return (C41130b0) this.f97158t.getValue();
    }

    /* renamed from: g2 */
    private final void m119392g2() {
        C28664n0 b2 = m119387b2();
        b2.f72847e.setTitle(getString(C10220y.sca_verification_confirm_operation));
        Input input = b2.f72858p;
        C41536l.m120488h(input, "passwordInput");
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C41129b.m119230b(input, requireContext);
        b2.f72849g.setOnClickListener(new C41148e(this));
        b2.f72848f.setOnClickListener(new C41176m(this));
        b2.f72856n.setForgotPasswordClickListener(new C41177n(this));
        b2.f72852j.setOnClickListener(new C41178o(this));
        b2.f72863u.setOnClickListener(new C41179p(this));
        b2.f72858p.setEndIconImageSmallClickListener(new C41180q(b2, this));
        b2.f72855m.setOneTimePasswordListener(new C41193h(this));
        b2.f72855m.setResendButtonClickListener(new C41181r(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m119393h2(C41185v vVar, View view) {
        C41536l.m120489i(vVar, "this$0");
        if (vVar.mo4582p1()) {
            vVar.m119375P2(vVar.mo4579n1());
            view.postDelayed(new C41175l(vVar), 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m119394i2(C41185v vVar) {
        C41536l.m120489i(vVar, "this$0");
        vVar.m119360F2();
        vVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m119395j2(C41185v vVar, View view) {
        C41536l.m120489i(vVar, "this$0");
        vVar.m119381V1();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m119396k2(C41185v vVar) {
        C41536l.m120489i(vVar, "this$0");
        vVar.m119352B2(AuthElementType.PASSCODE);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m119397l2(C41185v vVar, View view) {
        C41536l.m120489i(vVar, "this$0");
        vVar.m119352B2(AuthElementType.PASSWORD);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m119398m2(C41185v vVar, View view) {
        C41536l.m120489i(vVar, "this$0");
        vVar.m119352B2(AuthElementType.OTP);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m119399n2(C28664n0 n0Var, C41185v vVar, View view) {
        C41536l.m120489i(n0Var, "$this_with");
        C41536l.m120489i(vVar, "this$0");
        Input input = n0Var.f72858p;
        C41536l.m120488h(input, "passwordInput");
        Context requireContext = vVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C41129b.m119230b(input, requireContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m119400o2(C41185v vVar, View view) {
        C41536l.m120489i(vVar, "this$0");
        vVar.m119358E2();
    }

    private final void observeData() {
        LiveData b;
        m119391f2().mo95569Mw().mo4819k(this, new C41182s(this));
        m119391f2().mo95568Lw().mo4819k(this, new C41183t(this));
        m119391f2().mo95561Dw().mo4819k(this, new C41184u(this));
        m119391f2().mo95564Gw().mo4819k(this, new C41150f(this));
        m119391f2().mo95566Iw().mo4819k(this, new C41152g(this));
        m119391f2().mo95563Fw().mo4819k(this, new C41154h(this));
        m119391f2().mo95565Hw().mo4819k(this, new C41170i(this));
        m119391f2().mo95560Cw().mo4819k(this, new C41172j(this));
        C10205l.C10206a c2 = m119388c2();
        if (c2 != null && (b = c2.mo26775b()) != null) {
            b.mo4819k(this, new C41174k(this));
        }
    }

    /* renamed from: p2 */
    private final void m119401p2() {
        String str;
        Map map;
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("AUTH_CONFIG");
        if (serializable != null) {
            C41143c cVar = (C41143c) serializable;
            String string = requireArguments.getString("SERVICE_ID");
            if (m119390e2()) {
                str = "OPERATION_DATA";
            } else {
                str = "SCA_PARAMS";
            }
            Serializable serializable2 = requireArguments.getSerializable(str);
            if (serializable2 instanceof Map) {
                map = (Map) serializable2;
            } else {
                map = null;
            }
            if (map == null) {
                map = C41344r0.m119928j();
            }
            m119391f2().mo95570Nw(cVar, string, map, m119390e2());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ge.bog.sso_client.sca_verification.ScaAuthConfiguration");
    }

    /* renamed from: q2 */
    private final void m119402q2(C41127a aVar) {
        int i = C41188c.f97166b[aVar.mo95555a().ordinal()];
        if (i != 1) {
            int i2 = 0;
            if (i == 2) {
                Button button = m119387b2().f72852j;
                if (!aVar.mo95556b()) {
                    i2 = 8;
                }
                button.setVisibility(i2);
            } else if (i == 3) {
                Button button2 = m119387b2().f72863u;
                if (!aVar.mo95556b()) {
                    i2 = 8;
                }
                button2.setVisibility(i2);
            }
        } else {
            m119387b2().f72856n.setShowForgotButton(aVar.mo95556b());
        }
    }

    /* renamed from: r2 */
    public static final C41185v m119403r2(String str, HashMap hashMap) {
        return f97155C.mo95637b(str, hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m119404s2(C41185v vVar, C35947l lVar) {
        C41536l.m120489i(vVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            vVar.m119363H2((C41224m) ((C35947l.C35951d) lVar).mo88520a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m119405t2(C41185v vVar, C41238w wVar) {
        C41536l.m120489i(vVar, "this$0");
        vVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m119406u2(C41185v vVar, C35947l lVar) {
        String str;
        ApiException apiException;
        C41536l.m120489i(vVar, "this$0");
        if (lVar instanceof C35947l.C35950c) {
            C41186a aVar = vVar.f97163y;
            if (aVar != null) {
                aVar.mo37617S(true);
            }
        } else if (lVar instanceof C35947l.C35951d) {
            C41186a aVar2 = vVar.f97163y;
            if (aVar2 != null) {
                aVar2.mo37617S(false);
            }
        } else if (lVar instanceof C35947l.C35949b) {
            C35947l.C35949b bVar = (C35947l.C35949b) lVar;
            if (bVar.mo88517a() instanceof ConnectionFailedException) {
                str = vVar.getString(C10220y.no_internet);
            } else {
                Throwable a = bVar.mo88517a();
                if (a instanceof ApiException) {
                    apiException = (ApiException) a;
                } else {
                    apiException = null;
                }
                if (apiException == null || (str = apiException.getErrorMessage()) == null) {
                    str = vVar.getString(C10220y.no_internet);
                    C41536l.m120488h(str, "getString(R.string.no_internet)");
                }
            }
            C41536l.m120488h(str, "if (it.exception is Conn…et)\n                    }");
            C41186a aVar3 = vVar.f97163y;
            if (aVar3 != null) {
                aVar3.mo37617S(false);
            }
            C41186a aVar4 = vVar.f97163y;
            if (aVar4 != null) {
                aVar4.mo37616R(str, vVar.getTag());
            }
            vVar.mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m119407v2(C41185v vVar, C35947l lVar) {
        C41536l.m120489i(vVar, "this$0");
        if (lVar instanceof C35947l.C35950c) {
            vVar.mo95635L2(true);
        } else if (lVar instanceof C35947l.C35951d) {
            vVar.mo95635L2(false);
        } else if (lVar instanceof C35947l.C35949b) {
            vVar.m119383X1();
            C41536l.m120488h(lVar, "it");
            vVar.m119354C2((C35947l.C35949b) lVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m119408w2(C41185v vVar, C35947l lVar) {
        C41536l.m120489i(vVar, "this$0");
        if (lVar instanceof C35947l.C35950c) {
            vVar.mo95635L2(true);
        } else if (lVar instanceof C35947l.C35951d) {
            vVar.m119373O2((UserContact) ((C35947l.C35951d) lVar).mo88520a());
            vVar.mo95635L2(false);
        } else if (lVar instanceof C35947l.C35949b) {
            C41536l.m120488h(lVar, "result");
            vVar.m119354C2((C35947l.C35949b) lVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m119409x2(C41185v vVar, C41130b0.C41132b bVar) {
        C41536l.m120489i(vVar, "this$0");
        if (bVar.mo95585a()) {
            C41186a aVar = vVar.f97163y;
            if (aVar != null) {
                String b = bVar.mo95586b();
                if (b == null) {
                    b = vVar.getString(C10220y.f28368P0);
                    C41536l.m120488h(b, "getString(R.string.error_loading_data)");
                }
                aVar.mo37616R(b, vVar.getTag());
            }
            vVar.mo4577k1();
            return;
        }
        vVar.mo95633J2(bVar.mo95586b());
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m119410y2(C41185v vVar, List list) {
        C41536l.m120489i(vVar, "this$0");
        C41536l.m120488h(list, "it");
        vVar.m119384Y1(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m119411z2(C41185v vVar, C41130b0.C41131a aVar) {
        C41536l.m120489i(vVar, "this$0");
        C41186a aVar2 = vVar.f97163y;
        if (aVar2 != null) {
            aVar2.mo37615O(aVar.mo95579a(), aVar.mo95580b(), aVar.mo95581c(), vVar.getTag());
        }
    }

    /* renamed from: A1 */
    public void mo4576A1(FragmentManager fragmentManager, String str) {
        C41536l.m120489i(fragmentManager, "manager");
        if (str == null) {
            str = "ScaVerificationDialogFragment";
        }
        super.mo4576A1(fragmentManager, str);
    }

    /* renamed from: J2 */
    public final void mo95633J2(String str) {
        mo95635L2(false);
        if (str == null) {
            str = getString(C10220y.f28368P0);
            C41536l.m120488h(str, "getString(R.string.error_loading_data)");
        }
        C12910e.m48792j(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: K2 */
    public final void mo95634K2(String str) {
        if (m119391f2().mo95572Uw() || !m119391f2().mo95571Tw()) {
            C41186a aVar = this.f97163y;
            if (aVar != null) {
                if (str == null) {
                    str = getString(C10220y.f28368P0);
                    C41536l.m120488h(str, "getString(R.string.error_loading_data)");
                }
                aVar.mo37616R(str, getTag());
            }
            mo4577k1();
            return;
        }
        mo95633J2(str);
        m119391f2().mo95575dx();
    }

    /* renamed from: L2 */
    public final void mo95635L2(boolean z) {
        Button button;
        int i;
        mo4586v1(!z);
        if (m119391f2().mo95572Uw() || !m119391f2().mo95567Jw()) {
            C41186a aVar = this.f97163y;
            if (aVar != null) {
                aVar.mo37617S(z);
                return;
            }
            return;
        }
        C28664n0 n0Var = this.f97159u;
        FrameLayout frameLayout = null;
        if (n0Var != null) {
            button = n0Var.f72848f;
        } else {
            button = null;
        }
        if (button != null) {
            button.setLoading(z);
        }
        C28664n0 n0Var2 = this.f97159u;
        if (n0Var2 != null) {
            frameLayout = n0Var2.f72850h;
        }
        if (frameLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            frameLayout.setVisibility(i);
        }
        C41155h0 h0Var = this.f97164z;
        if (h0Var != null) {
            h0Var.mo95606g2(z);
        }
    }

    public void onAttach(Context context) {
        C41186a aVar;
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        try {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                aVar = (C41186a) parentFragment;
                this.f97163y = aVar;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ge.bog.sso_client.sca_verification.ScaVerificationDialogFragment.AuthenticationListener");
        } catch (Exception unused) {
            aVar = (C41186a) context;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo4588y1(0, C10221z.TransparentBottomSheetDialogTheme);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f97159u = C28664n0.m87769d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m119387b2().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f97159u = null;
    }

    public void onDetach() {
        super.onDetach();
        this.f97163y = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m119392g2();
        m119401p2();
        m119365I2();
    }

    /* renamed from: q0 */
    public void mo95608q0() {
        m119360F2();
    }

    /* renamed from: u */
    public void mo95609u(C41155h0.C41159d dVar) {
        C41536l.m120489i(dVar, C11755a.C11756a.f34100b);
        m119391f2().mo95578zw(dVar.mo95611a(), dVar.mo95612b(), true);
    }

    /* renamed from: u0 */
    public boolean mo95610u0(AuthElementType authElementType) {
        C41536l.m120489i(authElementType, "authElementType");
        m119352B2(authElementType);
        return true;
    }
}

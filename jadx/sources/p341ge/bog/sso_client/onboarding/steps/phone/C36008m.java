package p341ge.bog.sso_client.onboarding.steps.phone;

import ah1.C40314b;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.app.C0218d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10145d;
import ba1.C10212q;
import ba1.C10214s;
import ba1.C10220y;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41238w;
import ib1.C36382c1;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.CountryCode;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.onboarding.OnBoardingActivity;
import p642vh.C18368l;
import sso.type.UserContactType;
import tb1.C38743f;
import ua1.C28637e0;
import ub1.C39052c;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: ge.bog.sso_client.onboarding.steps.phone.m */
public final class C36008m extends Fragment {

    /* renamed from: h */
    public static final C36009a f87108h = new C36009a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28637e0 f87109d;

    /* renamed from: e */
    private final C41217g f87110e = C41219i.m119469a(C41222k.NONE, new C36015g(this, (C41806a) null, (C43064a) null, new C36014f(this), (C43064a) null));

    /* renamed from: f */
    private UserContactType f87111f = UserContactType.PHONE;

    /* renamed from: g */
    private final C41217g f87112g = C41219i.m119470b(new C36011c(this));

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.m$a */
    public static final class C36009a {
        private C36009a() {
        }

        public /* synthetic */ C36009a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C36008m m107185b(C36009a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.mo88718a(z);
        }

        /* renamed from: a */
        public final C36008m mo88718a(boolean z) {
            C36008m mVar = new C36008m();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_add_contact", z);
            mVar.setArguments(bundle);
            return mVar;
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.m$b */
    public /* synthetic */ class C36010b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f87113a;

        static {
            int[] iArr = new int[UserContactType.values().length];
            iArr[UserContactType.PHONE.ordinal()] = 1;
            f87113a = iArr;
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.m$c */
    static final class C36011c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36008m f87114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36011c(C36008m mVar) {
            super(0);
            this.f87114d = mVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f87114d.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("is_add_contact") : false);
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.m$d */
    public static final class C36012d implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C36008m f87115d;

        public C36012d(C36008m mVar) {
            this.f87115d = mVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f87115d.m107166J1();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.m$e */
    public static final class C36013e implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C36008m f87116d;

        public C36013e(C36008m mVar) {
            this.f87116d = mVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f87116d.m107166J1();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.m$f */
    public static final class C36014f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f87117d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36014f(Fragment fragment) {
            super(0);
            this.f87117d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f87117d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f87117d.requireActivity());
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.steps.phone.m$g */
    public static final class C36015g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f87118d;

        /* renamed from: e */
        final /* synthetic */ C41806a f87119e;

        /* renamed from: f */
        final /* synthetic */ C43064a f87120f;

        /* renamed from: g */
        final /* synthetic */ C43064a f87121g;

        /* renamed from: h */
        final /* synthetic */ C43064a f87122h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36015g(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f87118d = fragment;
            this.f87119e = aVar;
            this.f87120f = aVar2;
            this.f87121g = aVar3;
            this.f87122h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f87118d, this.f87119e, this.f87120f, this.f87121g, C41520a0.m120436b(C36382c1.class), this.f87122h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m107157A1(C36008m mVar, Boolean bool) {
        C41536l.m120489i(mVar, "this$0");
        if (C41536l.m120484d(bool, Boolean.TRUE)) {
            C38743f a = C38743f.f92655E.mo92374a();
            C1505h activity = mVar.getActivity();
            if (activity != null) {
                a.mo4576A1(((C0218d) activity).getSupportFragmentManager(), (String) null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m107158B1(C36008m mVar, C41238w wVar) {
        C41536l.m120489i(mVar, "this$0");
        C13310d c = new C39052c().mo92742c(C13310d.C13312b.ONLY_ICON_SINGLE_BUTTON, mVar.getString(C10220y.onboarding_aml_reject_dialog_title), mVar.getString(C10220y.onboarding_aml_reject_dialog_text), Integer.valueOf(C10214s.icons_48_contacts_email_close_outline), Integer.valueOf(C10212q.f28274i), mVar.getString(C10220y.onboarding_finished_dialog_button_text), (String) null);
        c.mo35643V1(new C36007l(mVar, c));
        c.mo4576A1(mVar.getChildFragmentManager(), (String) null);
        mVar.m107179t1().mo89192tn("get_back_popup_shown", new C41224m[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m107159C1(C36008m mVar, C13310d dVar, Button button) {
        C41536l.m120489i(mVar, "this$0");
        C41536l.m120489i(dVar, "$dialog");
        C41536l.m120489i(button, "it");
        Context context = mVar.getContext();
        if (context != null) {
            ((OnBoardingActivity) context).finish();
            dVar.mo4577k1();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ge.bog.sso_client.onboarding.OnBoardingActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m107160D1(C36008m mVar, UserContactType userContactType) {
        C41536l.m120489i(mVar, "this$0");
        mVar.m107165I1(userContactType);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m107161E1(Input input, CountryCodeActionSheet countryCodeActionSheet, C36008m mVar, View view) {
        C41536l.m120489i(input, "$this_apply");
        C41536l.m120489i(countryCodeActionSheet, "$actionSheet");
        C41536l.m120489i(mVar, "this$0");
        C1505h activity = mVar.getActivity();
        if (activity != null) {
            countryCodeActionSheet.mo4576A1(((C0218d) activity).getSupportFragmentManager(), (String) null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m107162F1(C36008m mVar, C35947l lVar) {
        C41536l.m120489i(mVar, "this$0");
        C28637e0 e0Var = null;
        if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            C28637e0 e0Var2 = mVar.f87109d;
            if (e0Var2 == null) {
                C41536l.m120506z("binding");
            } else {
                e0Var = e0Var2;
            }
            e0Var.f72714e.setLoading(true);
            return;
        }
        C28637e0 e0Var3 = mVar.f87109d;
        if (e0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            e0Var = e0Var3;
        }
        e0Var.f72714e.setLoading(false);
    }

    /* renamed from: G1 */
    private final void m107163G1(Input input) {
        EditText textInput = input.getTextInput();
        textInput.requestFocus();
        Object systemService = textInput.getContext().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            inputMethodManager.toggleSoftInput(2, 1);
            inputMethodManager.showSoftInput(textInput, 2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: H1 */
    private final void m107164H1() {
        C28637e0 e0Var = null;
        if (this.f87111f == UserContactType.PHONE) {
            C28637e0 e0Var2 = this.f87109d;
            if (e0Var2 == null) {
                C41536l.m120506z("binding");
            } else {
                e0Var = e0Var2;
            }
            Input input = e0Var.f72717h;
            C41536l.m120488h(input, "binding.phoneInput");
            m107163G1(input);
            return;
        }
        C28637e0 e0Var3 = this.f87109d;
        if (e0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            e0Var = e0Var3;
        }
        Input input2 = e0Var.f72715f;
        C41536l.m120488h(input2, "binding.emailInput");
        m107163G1(input2);
    }

    /* renamed from: I1 */
    private final void m107165I1(UserContactType userContactType) {
        UserContactType userContactType2;
        int i;
        if (userContactType == null) {
            userContactType2 = UserContactType.MAIL;
        } else {
            userContactType2 = userContactType;
        }
        this.f87111f = userContactType2;
        if (userContactType == null) {
            i = -1;
        } else {
            i = C36010b.f87113a[userContactType.ordinal()];
        }
        C28637e0 e0Var = null;
        if (i == 1) {
            C28637e0 e0Var2 = this.f87109d;
            if (e0Var2 == null) {
                C41536l.m120506z("binding");
                e0Var2 = null;
            }
            e0Var2.f72717h.setVisibility(0);
            C28637e0 e0Var3 = this.f87109d;
            if (e0Var3 == null) {
                C41536l.m120506z("binding");
                e0Var3 = null;
            }
            e0Var3.f72715f.setVisibility(8);
            C28637e0 e0Var4 = this.f87109d;
            if (e0Var4 == null) {
                C41536l.m120506z("binding");
                e0Var4 = null;
            }
            e0Var4.f72718i.setText(getString(C10220y.onboarding_phone_title));
            C28637e0 e0Var5 = this.f87109d;
            if (e0Var5 == null) {
                C41536l.m120506z("binding");
            } else {
                e0Var = e0Var5;
            }
            e0Var.f72718i.setDrawableSrc(Integer.valueOf(C10214s.ic_phone));
            return;
        }
        C28637e0 e0Var6 = this.f87109d;
        if (e0Var6 == null) {
            C41536l.m120506z("binding");
            e0Var6 = null;
        }
        e0Var6.f72717h.setVisibility(8);
        C28637e0 e0Var7 = this.f87109d;
        if (e0Var7 == null) {
            C41536l.m120506z("binding");
            e0Var7 = null;
        }
        e0Var7.f72715f.setVisibility(0);
        C28637e0 e0Var8 = this.f87109d;
        if (e0Var8 == null) {
            C41536l.m120506z("binding");
            e0Var8 = null;
        }
        e0Var8.f72718i.setText(getString(C10220y.onboarding_email_title));
        C28637e0 e0Var9 = this.f87109d;
        if (e0Var9 == null) {
            C41536l.m120506z("binding");
        } else {
            e0Var = e0Var9;
        }
        e0Var.f72718i.setDrawableSrc(Integer.valueOf(C10214s.ic_email_onboarding));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (cf1.C40440x.m117139M(r1, "@", false, 2, (java.lang.Object) null) != false) goto L_0x0079;
     */
    /* renamed from: J1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m107166J1() {
        /*
            r7 = this;
            sso.type.UserContactType r0 = r7.f87111f
            sso.type.UserContactType r1 = sso.type.UserContactType.PHONE
            r2 = 1
            r3 = 5
            r4 = 0
            java.lang.String r5 = "binding"
            r6 = 0
            if (r0 != r1) goto L_0x0035
            ua1.e0 r0 = r7.f87109d
            if (r0 != 0) goto L_0x0014
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r0 = r6
        L_0x0014:
            ge.bog.designsystem.components.buttons.Button r0 = r0.f72714e
            ua1.e0 r1 = r7.f87109d
            if (r1 != 0) goto L_0x001e
            kotlin.jvm.internal.C41536l.m120506z(r5)
            goto L_0x001f
        L_0x001e:
            r6 = r1
        L_0x001f:
            ge.bog.designsystem.components.input.Input r1 = r6.f72717h
            android.widget.EditText r1 = r1.getTextInput()
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            if (r1 <= r3) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = r4
        L_0x0031:
            r0.setEnabled(r2)
            goto L_0x007c
        L_0x0035:
            ua1.e0 r0 = r7.f87109d
            if (r0 != 0) goto L_0x003d
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r0 = r6
        L_0x003d:
            ge.bog.designsystem.components.buttons.Button r0 = r0.f72714e
            ua1.e0 r1 = r7.f87109d
            if (r1 != 0) goto L_0x0047
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r1 = r6
        L_0x0047:
            ge.bog.designsystem.components.input.Input r1 = r1.f72715f
            android.widget.EditText r1 = r1.getTextInput()
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            if (r1 <= r3) goto L_0x0078
            ua1.e0 r1 = r7.f87109d
            if (r1 != 0) goto L_0x005f
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r1 = r6
        L_0x005f:
            ge.bog.designsystem.components.input.Input r1 = r1.f72715f
            android.widget.EditText r1 = r1.getTextInput()
            android.text.Editable r1 = r1.getText()
            java.lang.String r3 = "binding.emailInput.textInput.text"
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            java.lang.String r3 = "@"
            r5 = 2
            boolean r1 = cf1.C40440x.m117139M(r1, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r2 = r4
        L_0x0079:
            r0.setEnabled(r2)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.sso_client.onboarding.steps.phone.C36008m.m107166J1():void");
    }

    /* renamed from: s1 */
    private final String m107178s1() {
        String str;
        C28637e0 e0Var = null;
        if (this.f87111f == UserContactType.PHONE) {
            StringBuilder sb = new StringBuilder();
            C28637e0 e0Var2 = this.f87109d;
            if (e0Var2 == null) {
                C41536l.m120506z("binding");
                e0Var2 = null;
            }
            String phonePrefixText = e0Var2.f72717h.getPhonePrefixText();
            if (phonePrefixText == null || (str = C40439w.m117103B(phonePrefixText, "+", "", false, 4, (Object) null)) == null) {
                str = "";
            }
            sb.append(str);
            C28637e0 e0Var3 = this.f87109d;
            if (e0Var3 == null) {
                C41536l.m120506z("binding");
            } else {
                e0Var = e0Var3;
            }
            sb.append(e0Var.f72717h.getInputText());
            return sb.toString();
        }
        C28637e0 e0Var4 = this.f87109d;
        if (e0Var4 == null) {
            C41536l.m120506z("binding");
        } else {
            e0Var = e0Var4;
        }
        return e0Var.f72715f.getInputText();
    }

    /* renamed from: t1 */
    private final C36382c1 m107179t1() {
        return (C36382c1) this.f87110e.getValue();
    }

    /* renamed from: u1 */
    private final boolean m107180u1() {
        return ((Boolean) this.f87112g.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ge.bog.sso_client.models.CountryCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ge.bog.sso_client.models.CountryCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ge.bog.sso_client.models.CountryCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: ge.bog.sso_client.models.CountryCode} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m107181v1(p341ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet r4, p341ge.bog.sso_client.onboarding.steps.phone.C36008m r5, java.util.List r6) {
        /*
            java.lang.String r0 = "$actionSheet"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.C41536l.m120488h(r6, r0)
            r4.mo88693j2(r6)
            java.util.Iterator r0 = r6.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            r3 = r1
            ge.bog.sso_client.models.CountryCode r3 = (p341ge.bog.sso_client.models.CountryCode) r3
            java.lang.Boolean r3 = r3.mo88221d()
            if (r3 == 0) goto L_0x002f
            boolean r3 = r3.booleanValue()
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 == 0) goto L_0x0016
            goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            ge.bog.sso_client.models.CountryCode r1 = (p341ge.bog.sso_client.models.CountryCode) r1
            if (r1 == 0) goto L_0x0062
            r4.mo88692i2(r1)
            ua1.e0 r5 = r5.f87109d
            if (r5 != 0) goto L_0x0045
            java.lang.String r5 = "binding"
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r5 = r2
        L_0x0045:
            ge.bog.designsystem.components.input.Input r5 = r5.f72717h
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = 43
            r0.append(r3)
            java.lang.String r1 = r1.mo88219a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.setPhonePrefixText(r0)
            he1.w r5 = he1.C41238w.f97225a
            goto L_0x0063
        L_0x0062:
            r5 = r2
        L_0x0063:
            if (r5 != 0) goto L_0x008a
            java.util.Iterator r5 = r6.iterator()
        L_0x0069:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0083
            java.lang.Object r6 = r5.next()
            r0 = r6
            ge.bog.sso_client.models.CountryCode r0 = (p341ge.bog.sso_client.models.CountryCode) r0
            java.lang.String r0 = r0.mo88220b()
            java.lang.String r1 = "GE"
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
            if (r0 == 0) goto L_0x0069
            r2 = r6
        L_0x0083:
            ge.bog.sso_client.models.CountryCode r2 = (p341ge.bog.sso_client.models.CountryCode) r2
            if (r2 == 0) goto L_0x008a
            r4.mo88692i2(r2)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.sso_client.onboarding.steps.phone.C36008m.m107181v1(ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet, ge.bog.sso_client.onboarding.steps.phone.m, java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m107182x1(C36008m mVar, View view) {
        String str;
        C41536l.m120489i(mVar, "this$0");
        C28637e0 e0Var = null;
        if (mVar.m107180u1()) {
            mVar.m107179t1().mo89177my(new UserContact((String) null, mVar.f87111f, mVar.m107178s1(), (Boolean) null, (Boolean) null, 16, (DefaultConstructorMarker) null), false);
        } else {
            C36382c1 t1 = mVar.m107179t1();
            C28637e0 e0Var2 = mVar.f87109d;
            if (e0Var2 == null) {
                C41536l.m120506z("binding");
                e0Var2 = null;
            }
            String phonePrefixText = e0Var2.f72717h.getPhonePrefixText();
            if (phonePrefixText == null || (str = C40439w.m117103B(phonePrefixText, "+", "", false, 4, (Object) null)) == null) {
                str = "";
            }
            C28637e0 e0Var3 = mVar.f87109d;
            if (e0Var3 == null) {
                C41536l.m120506z("binding");
                e0Var3 = null;
            }
            t1.mo89164gy(str, e0Var3.f72717h.getInputText());
        }
        Context requireContext = mVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C28637e0 e0Var4 = mVar.f87109d;
        if (e0Var4 == null) {
            C41536l.m120506z("binding");
        } else {
            e0Var = e0Var4;
        }
        ConstraintLayout c = e0Var.mo3946b();
        C41536l.m120488h(c, "binding.root");
        C10145d.m37091e(requireContext, c);
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m107183y1(C36008m mVar, CountryCodeActionSheet countryCodeActionSheet, CountryCode countryCode) {
        C41536l.m120489i(mVar, "this$0");
        C41536l.m120489i(countryCodeActionSheet, "$actionSheet");
        C28637e0 e0Var = mVar.f87109d;
        if (e0Var == null) {
            C41536l.m120506z("binding");
            e0Var = null;
        }
        Input input = e0Var.f72717h;
        input.setPhonePrefixText('+' + countryCode.mo88219a());
        C41536l.m120488h(countryCode, "it");
        countryCodeActionSheet.mo88692i2(countryCode);
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m107184z1(C36008m mVar, C35947l lVar) {
        C41536l.m120489i(mVar, "this$0");
        C28637e0 e0Var = mVar.f87109d;
        if (e0Var == null) {
            C41536l.m120506z("binding");
            e0Var = null;
        }
        e0Var.f72714e.setLoading(lVar instanceof C35947l.C35950c);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28637e0 d = C28637e0.m87648d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f87109d = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ConstraintLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onPause() {
        super.onPause();
        C1505h activity = getActivity();
        if (activity != null) {
            C28637e0 e0Var = this.f87109d;
            if (e0Var == null) {
                C41536l.m120506z("binding");
                e0Var = null;
            }
            ConstraintLayout c = e0Var.mo3946b();
            C41536l.m120488h(c, "binding.root");
            C10145d.m37091e(activity, c);
        }
    }

    public void onResume() {
        super.onResume();
        m107164H1();
        m107166J1();
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        CountryCodeActionSheet countryCodeActionSheet = new CountryCodeActionSheet();
        countryCodeActionSheet.mo26369Z1(C18368l.m62762k(TextTypeView.SEPARATOR_FULL));
        C1505h activity = countryCodeActionSheet.getActivity();
        C28637e0 e0Var = null;
        if (activity != null) {
            str = activity.getString(C10220y.onboarding_choose_country_code);
        } else {
            str = null;
        }
        countryCodeActionSheet.mo26370a2(str);
        C28637e0 e0Var2 = this.f87109d;
        if (e0Var2 == null) {
            C41536l.m120506z("binding");
            e0Var2 = null;
        }
        e0Var2.f72715f.getTextInput().addTextChangedListener(new C36012d(this));
        if (m107180u1()) {
            m107179t1().mo89144Rc().mo89262e().mo89243b().mo4819k(getViewLifecycleOwner(), new C35998c(this));
            UserContactType userContactType = (UserContactType) m107179t1().mo89144Rc().mo89262e().mo89243b().mo4814f();
            if (userContactType != null) {
                m107165I1(userContactType);
            }
        }
        C28637e0 e0Var3 = this.f87109d;
        if (e0Var3 == null) {
            C41536l.m120506z("binding");
            e0Var3 = null;
        }
        Input input = e0Var3.f72717h;
        input.setPhoneNumberPrefixClickListener(new C35999d(input, countryCodeActionSheet, this));
        input.getTextInput().addTextChangedListener(new C36013e(this));
        m107179t1().mo89201wr().mo4819k(getViewLifecycleOwner(), new C36000e(this));
        m107179t1().mo89196ux().mo4819k(getViewLifecycleOwner(), new C36001f(countryCodeActionSheet, this));
        C28637e0 e0Var4 = this.f87109d;
        if (e0Var4 == null) {
            C41536l.m120506z("binding");
        } else {
            e0Var = e0Var4;
        }
        e0Var.f72714e.setOnClickListener(new C36002g(this));
        countryCodeActionSheet.mo88691g2().mo4819k(getViewLifecycleOwner(), new C36003h(this, countryCodeActionSheet));
        m107179t1().mo89183qj().mo4819k(getViewLifecycleOwner(), new C36004i(this));
        m107179t1().mo89189sm().mo4819k(getViewLifecycleOwner(), new C36005j(this));
        m107179t1().mo89185qx().mo4819k(getViewLifecycleOwner(), new C36006k(this));
        m107179t1().mo89143Qx();
    }
}

package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Base64;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import bf0.C19376a;
import bf0.C19377b;
import cf1.C40407d;
import fg0.C20473a;
import fg0.C20474b;
import fg0.C20475c;
import fg0.C20476d;
import g31.C32054a;
import g41.C32081a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ie0.C25183c;
import ie0.C25185e;
import ie0.C25187g;
import ie0.C25188h;
import ie0.C25190j;
import ie0.C25191k;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n41.C37353c;
import p045d.C5769a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataActivity;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p380ck.C10463g;
import p420fh.C12902d;
import p420fh.C12910e;
import p601sg.C17777b;
import p601sg.C17779d;
import p642vh.C18368l;
import ue0.C28713b0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity */
public final class TermsAndConditionsActivity extends C23644a {

    /* renamed from: M */
    public static final C23631a f61636M = new C23631a((DefaultConstructorMarker) null);

    /* renamed from: I */
    public PreferencesApiManager f61637I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C28713b0 f61638J;

    /* renamed from: K */
    private final C41217g f61639K = new C1617p0(C41520a0.m120436b(TermsAndConditionsViewModel$ViewModel.class), new C23638h(this), new C23637g(this), new C23639i((C43064a) null, this));

    /* renamed from: L */
    private final List f61640L = new ArrayList();

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity$a */
    public static final class C23631a {
        private C23631a() {
        }

        public /* synthetic */ C23631a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo60510a(Context context) {
            C41536l.m120489i(context, "context");
            return new Intent(context, TermsAndConditionsActivity.class);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity$b */
    private static final class C23632b extends ReplacementSpan {

        /* renamed from: d */
        private final int f61641d;

        public C23632b(int i) {
            this.f61641d = i;
        }

        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            C41536l.m120489i(canvas, "canvas");
            C41536l.m120489i(charSequence, "text");
            C41536l.m120489i(paint, "paint");
            float f2 = (float) i3;
            canvas.drawRect(f + ((float) this.f61641d), f2, f, f2, paint);
        }

        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            C41536l.m120489i(paint, "paint");
            C41536l.m120489i(charSequence, "text");
            return this.f61641d;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity$c */
    static final class C23633c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TermsAndConditionsActivity f61642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23633c(TermsAndConditionsActivity termsAndConditionsActivity) {
            super(1);
            this.f61642d = termsAndConditionsActivity;
        }

        /* renamed from: a */
        public final void mo60513a(C31128a aVar) {
            C28713b0 M2 = this.f61642d.f61638J;
            C28713b0 b0Var = null;
            if (M2 == null) {
                C41536l.m120506z("binding");
                M2 = null;
            }
            M2.f73140i.setLoading(false);
            if (aVar instanceof C31128a.C31131c) {
                this.f61642d.m76411V2((C19377b) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f61642d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
                this.f61642d.finish();
            } else if (aVar instanceof C31128a.C31130b) {
                C28713b0 M22 = this.f61642d.f61638J;
                if (M22 == null) {
                    C41536l.m120506z("binding");
                    M22 = null;
                }
                M22.f73140i.setLoading(true);
            }
            C28713b0 M23 = this.f61642d.f61638J;
            if (M23 == null) {
                C41536l.m120506z("binding");
            } else {
                b0Var = M23;
            }
            b0Var.f73140i.setEnabled(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60513a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity$d */
    static final class C23634d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TermsAndConditionsActivity f61643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23634d(TermsAndConditionsActivity termsAndConditionsActivity) {
            super(1);
            this.f61643d = termsAndConditionsActivity;
        }

        /* renamed from: a */
        public final void mo60514a(C31128a aVar) {
            C28713b0 M2 = this.f61643d.f61638J;
            C28713b0 b0Var = null;
            if (M2 == null) {
                C41536l.m120506z("binding");
                M2 = null;
            }
            M2.f73140i.setLoading(false);
            if (aVar instanceof C31128a.C31131c) {
                TermsAndConditionsActivity termsAndConditionsActivity = this.f61643d;
                termsAndConditionsActivity.mo67715G2(GTOnboardingReviewDataActivity.C23622a.m76380b(GTOnboardingReviewDataActivity.f61614J, termsAndConditionsActivity, false, 2, (Object) null));
            } else if (aVar instanceof C31128a.C31129a) {
                this.f61643d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            } else if (aVar instanceof C31128a.C31130b) {
                C28713b0 M22 = this.f61643d.f61638J;
                if (M22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    b0Var = M22;
                }
                b0Var.f73140i.setLoading(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60514a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity$e */
    public static final class C23635e extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ TermsAndConditionsActivity f61644a;

        C23635e(TermsAndConditionsActivity termsAndConditionsActivity) {
            this.f61644a = termsAndConditionsActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C28713b0 M2 = this.f61644a.f61638J;
            if (M2 == null) {
                C41536l.m120506z("binding");
                M2 = null;
            }
            M2.f73138g.getParent().requestLayout();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity$f */
    static final class C23636f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61645a;

        C23636f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61645a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61645a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61645a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity$g */
    public static final class C23637g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23637g(ComponentActivity componentActivity) {
            super(0);
            this.f61646d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61646d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity$h */
    public static final class C23638h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23638h(ComponentActivity componentActivity) {
            super(0);
            this.f61647d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61647d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity$i */
    public static final class C23639i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61648d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61649e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23639i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61648d = aVar;
            this.f61649e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61648d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61649e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: P2 */
    private final void m76406P2(List list) {
        C28713b0 b0Var = this.f61638J;
        if (b0Var == null) {
            C41536l.m120506z("binding");
            b0Var = null;
        }
        LinearLayout linearLayout = b0Var.f73138g;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C19376a aVar = (C19376a) it.next();
            if (!C41536l.m120484d(aVar.mo47590c(), "DW_GEORGIAN_TRANSLATIONS")) {
                View view = new View(this);
                view.setBackgroundColor(C0767a.m2893c(this, C25183c.f64643e));
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, C18368l.m62762k(1)));
                linearLayout.addView(view);
                View.inflate(linearLayout.getContext(), C25188h.item_disclosure_type, linearLayout);
                CheckboxView checkboxView = (CheckboxView) linearLayout.getChildAt(linearLayout.getChildCount() - 1).findViewById(C25187g.termsCheckBox);
                checkboxView.setOnCheckedStateChangeListener(new C20475c(this));
                TextView textView = (TextView) linearLayout.getChildAt(linearLayout.getChildCount() - 1).findViewById(C25187g.f64711n4);
                textView.setText(aVar.mo47589b());
                textView.setOnClickListener(new C20476d(this, aVar));
                List list2 = this.f61640L;
                C41536l.m120488h(checkboxView, "termsCheckBox");
                list2.add(checkboxView);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public static final void m76407Q2(TermsAndConditionsActivity termsAndConditionsActivity, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(termsAndConditionsActivity, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        termsAndConditionsActivity.m76419d3();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m76408R2(TermsAndConditionsActivity termsAndConditionsActivity, C19376a aVar, View view) {
        C41536l.m120489i(termsAndConditionsActivity, "this$0");
        C41536l.m120489i(aVar, "$disclosure");
        termsAndConditionsActivity.m76415Z2(aVar.mo47588a());
    }

    /* renamed from: T2 */
    private final TermsAndConditionsViewModel$ViewModel m76409T2() {
        return (TermsAndConditionsViewModel$ViewModel) this.f61639K.getValue();
    }

    /* renamed from: U2 */
    private final void m76410U2() {
        C28713b0 b0Var = null;
        if (mo60509S2().getLanguage() != C37353c.KA) {
            C28713b0 b0Var2 = this.f61638J;
            if (b0Var2 == null) {
                C41536l.m120506z("binding");
                b0Var2 = null;
            }
            TextView textView = b0Var2.f73136e;
            C41536l.m120488h(textView, "binding.additionalAgreementInformation");
            C32343x.m95483r1(textView, false, false, 2, (Object) null);
            return;
        }
        Drawable b = C5769a.m23210b(this, C25185e.f64657l);
        C41536l.m120486f(b);
        Resources resources = getResources();
        int i = C17779d.external_link_drawable_size;
        b.setBounds(0, 0, resources.getDimensionPixelSize(i), getResources().getDimensionPixelSize(i));
        Drawable r = C0836a.m3156r(b);
        C41536l.m120488h(r, "wrap(drawable)");
        C0836a.m3152n(r, C18368l.m62755d(this, C17777b.f49603w));
        String string = getString(C25190j.gt_onboarding_additional_agreement_information_start);
        C41536l.m120488h(string, "getString(R.string.gt_on…eement_information_start)");
        String string2 = getString(C25190j.gt_onboarding_additional_agreement_information_end);
        C41536l.m120488h(string2, "getString(R.string.gt_on…greement_information_end)");
        String str = string + " " + string2 + "  ";
        C28713b0 b0Var3 = this.f61638J;
        if (b0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            b0Var = b0Var3;
        }
        TextView textView2 = b0Var.f73136e;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        valueOf.setSpan(new TextAppearanceSpan(this, C25191k.f64740a), 0, string.length(), 33);
        valueOf.setSpan(new TextAppearanceSpan(this, C25191k.f64741b), C40440x.m117156X(str, string2, 0, false, 6, (Object) null), str.length() - 2, 33);
        valueOf.setSpan(new C23632b(getResources().getDimensionPixelSize(C17779d.spacing_3xs)), str.length() - 2, str.length() - 1, 33);
        valueOf.setSpan(new ImageSpan(r, 1), str.length() - 1, str.length(), 17);
        textView2.setText(valueOf);
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final void m76411V2(C19377b bVar) {
        m76418c3(bVar.mo47595c());
        m76406P2(bVar.mo47596d());
        m76416a3(bVar.mo47596d());
    }

    /* renamed from: W2 */
    private final void m76412W2() {
        C28713b0 b0Var = this.f61638J;
        if (b0Var == null) {
            C41536l.m120506z("binding");
            b0Var = null;
        }
        b0Var.f73140i.setOnClickListener(new C20474b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m76413X2(TermsAndConditionsActivity termsAndConditionsActivity, View view) {
        C41536l.m120489i(termsAndConditionsActivity, "this$0");
        C32054a.C32055a aVar = C32054a.C32055a.f78897f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(aVar, F, " ", " ");
        termsAndConditionsActivity.m76409T2().mo60519lw().mo49024Gd();
    }

    /* renamed from: Y2 */
    private final void m76414Y2() {
        m76409T2().mo60520mw().mo49025D().mo4819k(this, new C23636f(new C23633c(this)));
        m76409T2().mo60520mw().mo49026t7().mo4819k(this, new C23636f(new C23634d(this)));
    }

    /* renamed from: Z2 */
    private final void m76415Z2(String str) {
        if (Patterns.WEB_URL.matcher(str).matches()) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return;
            } catch (Exception e) {
                Log.e("Runtime Exception:", e.getMessage(), e);
            }
        }
        String string = getString(C25190j.f64736c);
        C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
        C12910e.m48790h(this, string, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: a3 */
    private final void m76416a3(List list) {
        C28713b0 b0Var;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            b0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C19376a) obj).mo47590c(), "DW_GEORGIAN_TRANSLATIONS")) {
                break;
            }
        }
        C19376a aVar = (C19376a) obj;
        if (aVar != null) {
            if (Patterns.WEB_URL.matcher(aVar.mo47588a()).matches()) {
                C28713b0 b0Var2 = this.f61638J;
                if (b0Var2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    b0Var = b0Var2;
                }
                b0Var.f73136e.setOnClickListener(new C20473a(this, aVar));
                return;
            }
            String string = getString(C25190j.f64736c);
            C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
            C12910e.m48790h(this, string, (C12902d.C12905b) null, false, 6, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m76417b3(TermsAndConditionsActivity termsAndConditionsActivity, C19376a aVar, View view) {
        C41536l.m120489i(termsAndConditionsActivity, "this$0");
        C41536l.m120489i(aVar, "$disclosure");
        termsAndConditionsActivity.m76415Z2(aVar.mo47588a());
    }

    /* renamed from: c3 */
    private final void m76418c3(String str) {
        byte[] bytes = str.getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 1);
        C28713b0 b0Var = this.f61638J;
        if (b0Var == null) {
            C41536l.m120506z("binding");
            b0Var = null;
        }
        b0Var.f73139h.loadData(encodeToString, "text/html", "base64");
    }

    /* renamed from: d3 */
    private final void m76419d3() {
        C28713b0 b0Var = this.f61638J;
        if (b0Var == null) {
            C41536l.m120506z("binding");
            b0Var = null;
        }
        Button button = b0Var.f73140i;
        List list = this.f61640L;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((CheckboxView) it.next()).isChecked()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        button.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28713b0 d = C28713b0.m87969d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f61638J = d;
        C28713b0 b0Var = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        m76414Y2();
        m76412W2();
        m76410U2();
        C28713b0 b0Var2 = this.f61638J;
        if (b0Var2 == null) {
            C41536l.m120506z("binding");
        } else {
            b0Var = b0Var2;
        }
        b0Var.f73139h.setWebViewClient(new C23635e(this));
    }

    /* renamed from: S2 */
    public final PreferencesApiManager mo60509S2() {
        PreferencesApiManager preferencesApiManager = this.f61637I;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }
}

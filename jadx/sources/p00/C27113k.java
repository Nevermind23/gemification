package p00;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32297d;
import g91.C32335t0;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n00.C26336a;
import n41.C37353c;
import o00.C26656a;
import o00.C26657b;
import org.parceler.C42035e;
import p112i1.C6507b;
import p112i1.C6509d;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.components.ripplepulse.ScrollViewExt;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10328q;
import p366bk.C10329r;
import p90.C27272c8;
import p90.C27278d4;
import p90.C27364m2;
import r90.C27950a;
import ue1.C43064a;

/* renamed from: p00.k */
public final class C27113k extends C27103a {

    /* renamed from: P */
    public static final C27114a f68083P = new C27114a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public static final Map f68084Q = C41344r0.m119931m(C41233s.m119492a("Sans.ttf", "bog_medium.ttf"), C41233s.m119492a("SansCaps.ttf", "bog_headline_medium.ttf"), C41233s.m119492a("SansExtraLight.ttf", "bog_regular.ttf"), C41233s.m119492a("SansExtraLightCaps.ttf", "bog_headline_light.ttf"), C41233s.m119492a("nusxuri_bold.ttf", "bog_bold.ttf"), C41233s.m119492a("mtavruli_bold.ttf", "bog_headline_bold.ttf"), C41233s.m119492a("mark-geo-caps-regular.ttf", "bog_haedline_regular.ttf"));

    /* renamed from: A */
    private boolean f68085A;

    /* renamed from: B */
    private final C41217g f68086B = C41219i.m119470b(new C27117d(this));

    /* renamed from: C */
    private final C41217g f68087C = C41219i.m119470b(new C27118e(this));

    /* renamed from: D */
    private final C41217g f68088D = C41219i.m119470b(new C27115b(this));

    /* renamed from: E */
    private final C41217g f68089E = C41219i.m119470b(new C27121h(this));

    /* renamed from: F */
    private final C41217g f68090F = C41219i.m119470b(new C27119f(this));

    /* renamed from: G */
    private final C41217g f68091G = C41219i.m119470b(new C27122i(this));

    /* renamed from: H */
    private final C41217g f68092H = C41219i.m119470b(new C27124k(this));

    /* renamed from: I */
    private boolean f68093I;

    /* renamed from: J */
    private final C41217g f68094J = C41219i.m119470b(new C27116c(this));

    /* renamed from: K */
    private C26656a f68095K;

    /* renamed from: L */
    private C26657b f68096L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final Handler f68097M = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final Runnable f68098N = new C27104b(this);

    /* renamed from: O */
    private final C27123j f68099O = new C27123j(this);

    /* renamed from: y */
    public PreferencesApiManager f68100y;

    /* renamed from: z */
    private C27278d4 f68101z;

    /* renamed from: p00.k$a */
    public static final class C27114a {
        private C27114a() {
        }

        public /* synthetic */ C27114a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C27113k m84066c(C27114a aVar, String str, boolean z, String str2, ArrayList arrayList, Summary summary, String str3, int i, Object obj) {
            String str4;
            ArrayList arrayList2;
            Summary summary2;
            if ((i & 2) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if ((i & 8) != 0) {
                arrayList2 = null;
            } else {
                arrayList2 = arrayList;
            }
            if ((i & 16) != 0) {
                summary2 = null;
            } else {
                summary2 = summary;
            }
            if ((i & 32) != 0) {
                str3 = "";
            }
            return aVar.mo66416b(str, z2, str4, arrayList2, summary2, str3);
        }

        /* renamed from: a */
        public final C27113k mo66415a(String str) {
            C41536l.m120489i(str, "html");
            return m84066c(this, str, false, (String) null, (ArrayList) null, (Summary) null, (String) null, 62, (Object) null);
        }

        /* renamed from: b */
        public final C27113k mo66416b(String str, boolean z, String str2, ArrayList arrayList, Summary summary, String str3) {
            C41536l.m120489i(str, "html");
            C41536l.m120489i(str3, "title");
            C27113k kVar = new C27113k();
            Bundle bundle = new Bundle();
            bundle.putString("HTML", str);
            bundle.putBoolean("SHOW_AGREEMENT_CHECKBOX", z);
            bundle.putString("BUTTON_TITLE", str2);
            bundle.putParcelableArrayList("SCHEDULE_INFO", arrayList);
            bundle.putParcelable("SUMMERY", C42035e.m122121c(summary));
            bundle.putString("TITLE", str3);
            kVar.setArguments(bundle);
            return kVar;
        }

        /* renamed from: d */
        public final String mo66417d(String str) {
            C41536l.m120489i(str, "htmlString");
            String B = C40439w.m117103B(str, "file:///android_asset/", "font/", false, 4, (Object) null);
            String str2 = B;
            for (Map.Entry entry : C27113k.f68084Q.entrySet()) {
                str2 = C40439w.m117103B(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return str2;
        }
    }

    /* renamed from: p00.k$b */
    static final class C27115b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27113k f68102d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27115b(C27113k kVar) {
            super(0);
            this.f68102d = kVar;
        }

        public final String invoke() {
            String str;
            Bundle arguments = this.f68102d.getArguments();
            if (arguments == null || (str = arguments.getString("BUTTON_TITLE")) == null) {
                str = this.f68102d.getString(C10328q.pre_contract_i_agree);
            }
            C41536l.m120488h(str, "arguments?.getString(BUT…ing.pre_contract_i_agree)");
            return str;
        }
    }

    /* renamed from: p00.k$c */
    static final class C27116c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27113k f68103d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27116c(C27113k kVar) {
            super(0);
            this.f68103d = kVar;
        }

        /* renamed from: b */
        public final ValueAnimator invoke() {
            return this.f68103d.m84041c2();
        }
    }

    /* renamed from: p00.k$d */
    static final class C27117d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27113k f68104d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27117d(C27113k kVar) {
            super(0);
            this.f68104d = kVar;
        }

        /* renamed from: b */
        public final C37353c invoke() {
            C37353c language = this.f68104d.mo66412X1().getLanguage();
            C41536l.m120488h(language, "preferencesApiManager.getLanguage()");
            return language;
        }
    }

    /* renamed from: p00.k$e */
    static final class C27118e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27113k f68105d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27118e(C27113k kVar) {
            super(0);
            this.f68105d = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getString("HTML");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                p00.k r0 = r2.f68105d
                android.os.Bundle r0 = r0.getArguments()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "HTML"
                java.lang.String r0 = r0.getString(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p00.C27113k.C27118e.invoke():java.lang.String");
        }
    }

    /* renamed from: p00.k$f */
    static final class C27119f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27113k f68106d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27119f(C27113k kVar) {
            super(0);
            this.f68106d = kVar;
        }

        /* renamed from: b */
        public final ArrayList invoke() {
            Bundle arguments = this.f68106d.getArguments();
            return (ArrayList) (arguments != null ? arguments.getParcelable("SCHEDULE_INFO") : null);
        }
    }

    /* renamed from: p00.k$g */
    public static final class C27120g extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ C27113k f68107a;

        C27120g(C27113k kVar) {
            this.f68107a = kVar;
        }

        public void onPageFinished(WebView webView, String str) {
            C41536l.m120489i(webView, "view");
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            super.onPageFinished(webView, str);
            this.f68107a.mo66414v2(false);
            if (this.f68107a.m84037Y1() != null) {
                this.f68107a.m84034U1().f68544n.setVisibility(0);
            }
            this.f68107a.f68097M.postDelayed(this.f68107a.f68098N, 300);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C41536l.m120489i(webView, "view");
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f68107a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C41536l.m120489i(webView, "view");
            C41536l.m120489i(webResourceRequest, "request");
            this.f68107a.startActivity(new Intent("android.intent.action.VIEW", webResourceRequest.getUrl()));
            return true;
        }
    }

    /* renamed from: p00.k$h */
    static final class C27121h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27113k f68108d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27121h(C27113k kVar) {
            super(0);
            this.f68108d = kVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f68108d.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("SHOW_AGREEMENT_CHECKBOX", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: p00.k$i */
    static final class C27122i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27113k f68109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27122i(C27113k kVar) {
            super(0);
            this.f68109d = kVar;
        }

        /* renamed from: b */
        public final Summary invoke() {
            Bundle arguments = this.f68109d.getArguments();
            return (Summary) C42035e.m122119a(arguments != null ? arguments.getParcelable("SUMMERY") : null);
        }
    }

    /* renamed from: p00.k$j */
    public static final class C27123j extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C27113k f68110a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27123j(C27113k kVar) {
            super(5000000, 1);
            this.f68110a = kVar;
        }

        public void onFinish() {
        }

        public void onTick(long j) {
            this.f68110a.m84034U1().f68541k.scrollBy(0, 100);
        }
    }

    /* renamed from: p00.k$k */
    static final class C27124k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27113k f68111d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27124k(C27113k kVar) {
            super(0);
            this.f68111d = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getString("TITLE");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                p00.k r0 = r2.f68111d
                android.os.Bundle r0 = r0.getArguments()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "TITLE"
                java.lang.String r0 = r0.getString(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p00.C27113k.C27124k.invoke():java.lang.String");
        }
    }

    /* renamed from: Q1 */
    private final boolean m84030Q1(ScrollView scrollView) {
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        if (scrollView.getHeight() < childAt.getHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: R1 */
    private final void m84031R1() {
        C26656a aVar;
        this.f68085A = true;
        if ((!m84038Z1() || m84034U1().f68537g.isChecked()) && (aVar = this.f68095K) != null) {
            aVar.mo39137m();
        }
    }

    /* renamed from: S1 */
    private final String m84032S1() {
        return (String) this.f68088D.getValue();
    }

    /* renamed from: T1 */
    private final ValueAnimator m84033T1() {
        return (ValueAnimator) this.f68094J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final C27278d4 m84034U1() {
        C27278d4 d4Var = this.f68101z;
        C41536l.m120486f(d4Var);
        return d4Var;
    }

    /* renamed from: V1 */
    private final C37353c m84035V1() {
        return (C37353c) this.f68086B.getValue();
    }

    /* renamed from: W1 */
    private final String m84036W1() {
        return (String) this.f68087C.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final ArrayList m84037Y1() {
        return (ArrayList) this.f68090F.getValue();
    }

    /* renamed from: Z1 */
    private final boolean m84038Z1() {
        return ((Boolean) this.f68089E.getValue()).booleanValue();
    }

    /* renamed from: a2 */
    private final Summary m84039a2() {
        return (Summary) this.f68091G.getValue();
    }

    /* renamed from: b2 */
    private final String m84040b2() {
        return (String) this.f68092H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public final ValueAnimator m84041c2() {
        int i;
        int H = C32343x.m95392H(20.0f);
        if (m84038Z1()) {
            i = C32343x.m95392H(100.0f);
        } else {
            i = C32343x.m95392H(60.0f);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i + (H * 2)});
        ofInt.addUpdateListener(new C27112j(this));
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(250);
        C41536l.m120488h(ofInt, "ofInt(height, height + b…_PANEL.toLong()\n        }");
        return ofInt;
    }

    /* renamed from: c3 */
    private final void m84042c3() {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C27950a.m86287d("link.terms.general.service.conditions", false, 2, (Object) null))));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public static final void m84043d2(C27113k kVar, ValueAnimator valueAnimator) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(valueAnimator, "valueAnimator");
        C27278d4 d4Var = kVar.f68101z;
        if (d4Var != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C41536l.m120487g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = d4Var.f68543m.getLayoutParams();
            C41536l.m120488h(layoutParams, "binding.parentContainer.layoutParams");
            layoutParams.height = intValue;
            d4Var.f68543m.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e2 */
    private final void m84044e2() {
        int i;
        m84057r2();
        if (m84037Y1() != null) {
            m84055p2();
        }
        m84049j2();
        m84056q2(m84035V1());
        m84059t2();
        if (m84038Z1()) {
            i = 150;
        } else {
            i = 100;
        }
        m84034U1().f68535e.setLayoutParams(new LinearLayout.LayoutParams(-1, C32343x.m95394I(i)));
        m84034U1().f68542l.setButtonText(m84032S1());
        m84034U1().f68541k.setScrollViewListener(new C27105c(this));
        m84034U1().f68540j.mo86538e();
        TranslateAnimation translateAnimation = new TranslateAnimation(0, Utils.FLOAT_EPSILON, 0, Utils.FLOAT_EPSILON, 2, -0.2f, 2, 0.2f);
        translateAnimation.setDuration(1500);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        m84034U1().f68536f.setAnimation(translateAnimation);
        m84050k2();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m84045f2(C27113k kVar, ScrollViewExt scrollViewExt, int i, int i2, int i3, int i4) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(scrollViewExt, "v");
        if (i2 == scrollViewExt.getChildAt(0).getMeasuredHeight() - scrollViewExt.getMeasuredHeight() && !kVar.f68093I) {
            kVar.m84048i2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m84046g2(C27113k kVar) {
        ScrollViewExt scrollViewExt;
        C41536l.m120489i(kVar, "this$0");
        C27278d4 d4Var = kVar.f68101z;
        if (d4Var != null && (scrollViewExt = d4Var.f68541k) != null && !kVar.m84030Q1(scrollViewExt)) {
            kVar.m84048i2();
        }
    }

    /* renamed from: h2 */
    public static final C27113k m84047h2(String str) {
        return f68083P.mo66415a(str);
    }

    /* renamed from: i2 */
    private final void m84048i2() {
        this.f68093I = true;
        this.f68099O.cancel();
        m84060w2();
    }

    /* renamed from: j2 */
    private final void m84049j2() {
        if (m84038Z1()) {
            m84034U1().f68537g.setVisibility(0);
            m84034U1().f68539i.setVisibility(0);
            return;
        }
        m84034U1().f68537g.setVisibility(8);
        m84034U1().f68539i.setVisibility(8);
    }

    /* renamed from: k2 */
    private final void m84050k2() {
        m84034U1().f68539i.setOnClickListener(new C27107e(this));
        m84034U1().f68545o.setOnClickListener(new C27108f(this));
        m84034U1().f68542l.setOnClickListener(new C27109g(this));
        m84034U1().f68537g.setOnCheckedChangeListener(new C27110h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m84051l2(C27113k kVar, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(kVar, "this$0");
        kVar.m84034U1().f68542l.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m84052m2(C27113k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        kVar.m84042c3();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m84053n2(C27113k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        if (!kVar.f68093I) {
            kVar.f68099O.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m84054o2(C27113k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        kVar.m84031R1();
    }

    /* renamed from: p2 */
    private final void m84055p2() {
        C26336a aVar = new C26336a();
        m84034U1().f68544n.setNestedScrollingEnabled(false);
        m84034U1().f68544n.setLayoutManager(new LinearLayoutManager(getContext()));
        m84034U1().f68544n.setAdapter(aVar);
        aVar.mo65514k(m84037Y1(), m84039a2());
    }

    /* renamed from: q2 */
    private final void m84056q2(C37353c cVar) {
        int i;
        int b = C32335t0.m95357b();
        SpannableString spannableString = new SpannableString(getString(C10328q.accept_terms_and_conditions));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(b);
        if (cVar == C37353c.KA) {
            i = 10;
        } else {
            i = 6;
        }
        spannableString.setSpan(foregroundColorSpan, i, spannableString.length(), 33);
        m84034U1().f68539i.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* renamed from: r2 */
    private final void m84057r2() {
        boolean z;
        ToolbarView toolbarView;
        C27272c8 c8Var;
        if (m84040b2().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C27278d4 d4Var = this.f68101z;
            if (d4Var == null || (c8Var = d4Var.f68546p) == null) {
                toolbarView = null;
            } else {
                toolbarView = c8Var.f68494e;
            }
            if (toolbarView != null) {
                toolbarView.setTitle(m84040b2());
            }
        }
        m84034U1().f68546p.f68494e.setNavigationOnClickListener(new C27111i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m84058s2(C27113k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        if (kVar.mo4582p1()) {
            kVar.mo4577k1();
        }
    }

    /* renamed from: t2 */
    private final void m84059t2() {
        int i;
        String d = f68083P.mo66417d(m84036W1());
        WebSettings settings = m84034U1().f68547q.getSettings();
        C41536l.m120488h(settings, "binding.webView.settings");
        settings.setDefaultTextEncodingName("utf-8");
        mo66414v2(true);
        m84034U1().f68547q.loadDataWithBaseURL("file:///android_res/", d, "text/html", "utf-8", (String) null);
        m84034U1().f68547q.setWebViewClient(new C27120g(this));
        if (C6509d.m25695a("ALGORITHMIC_DARKENING")) {
            C6507b.m25691b(m84034U1().f68547q.getSettings(), true);
        } else if (C6509d.m25695a("FORCE_DARK")) {
            WebSettings settings2 = m84034U1().f68547q.getSettings();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            if (C32343x.m95476p0(requireContext)) {
                i = 2;
            } else {
                i = 0;
            }
            C6507b.m25692c(settings2, i);
        }
    }

    /* renamed from: w2 */
    private final void m84060w2() {
        m84034U1().f68545o.setVisibility(8);
        m84034U1().f68540j.mo86539f();
        m84034U1().f68536f.animate().alpha(Utils.FLOAT_EPSILON).withEndAction(new C27106d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m84061x2(C27113k kVar) {
        C41536l.m120489i(kVar, "this$0");
        C27278d4 d4Var = kVar.f68101z;
        if (d4Var != null) {
            d4Var.f68536f.setVisibility(8);
            d4Var.f68542l.setVisibility(0);
            if (kVar.m84038Z1()) {
                d4Var.f68542l.setAlpha(Utils.FLOAT_EPSILON);
                d4Var.f68542l.animate().alpha(1.0f);
                d4Var.f68542l.setEnabled(false);
            } else {
                d4Var.f68539i.setText(kVar.m84032S1());
            }
            kVar.m84033T1().start();
        }
    }

    /* renamed from: A1 */
    public void mo4576A1(FragmentManager fragmentManager, String str) {
        C41536l.m120489i(fragmentManager, "manager");
        if (str == null) {
            str = "PreContractDialogFragment";
        }
        super.mo4576A1(fragmentManager, str);
    }

    /* renamed from: X1 */
    public final PreferencesApiManager mo66412X1() {
        PreferencesApiManager preferencesApiManager = this.f68100y;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttach(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.precontract.presentation.callback.PreContractAcceptListener"
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C41536l.m120489i(r4, r1)
            super.onAttach((android.content.Context) r4)
            r4 = 0
            androidx.fragment.app.h r1 = r3.requireActivity()     // Catch:{ Exception -> 0x0025 }
            kotlin.jvm.internal.C41536l.m120487g(r1, r0)     // Catch:{ Exception -> 0x0025 }
            o00.a r1 = (o00.C26656a) r1     // Catch:{ Exception -> 0x0025 }
            r3.f68095K = r1     // Catch:{ Exception -> 0x0025 }
            androidx.fragment.app.h r1 = r3.requireActivity()     // Catch:{ Exception -> 0x0025 }
            boolean r2 = r1 instanceof o00.C26657b     // Catch:{ Exception -> 0x0025 }
            if (r2 == 0) goto L_0x0021
            o00.b r1 = (o00.C26657b) r1     // Catch:{ Exception -> 0x0025 }
            goto L_0x0022
        L_0x0021:
            r1 = r4
        L_0x0022:
            r3.f68096L = r1     // Catch:{ Exception -> 0x0025 }
            goto L_0x003d
        L_0x0025:
            androidx.fragment.app.Fragment r1 = r3.getParentFragment()
            kotlin.jvm.internal.C41536l.m120487g(r1, r0)
            o00.a r1 = (o00.C26656a) r1
            r3.f68095K = r1
            androidx.fragment.app.Fragment r0 = r3.getParentFragment()
            boolean r1 = r0 instanceof o00.C26657b
            if (r1 == 0) goto L_0x003b
            r4 = r0
            o00.b r4 = (o00.C26657b) r4
        L_0x003b:
            r3.f68096L = r4
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p00.C27113k.onAttach(android.content.Context):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo4588y1(0, C10329r.PreContractDialogTheme);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        RelativeLayout c = C27278d4.m84414d(layoutInflater, viewGroup, false).mo3946b();
        C41536l.m120488h(c, "inflate(inflater, container, false).root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        m84033T1().cancel();
        this.f68097M.removeCallbacks(this.f68098N);
        this.f68101z = null;
    }

    public void onDetach() {
        super.onDetach();
        this.f68095K = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C26657b bVar;
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.f68085A && (bVar = this.f68096L) != null) {
            bVar.mo39136C();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        this.f68101z = C27278d4.m84413a(view);
        m84044e2();
    }

    /* renamed from: u2 */
    public final void mo66413u2(String str) {
        mo66414v2(false);
        if (str == null) {
            str = getString(C10328q.f28940T1);
            C41536l.m120488h(str, "getString(R.string.common_text_error_loading_data)");
        }
        C32297d.m95156d(this, str);
    }

    /* renamed from: v2 */
    public final void mo66414v2(boolean z) {
        LinearLayout linearLayout;
        int i;
        C27364m2 m2Var;
        C27278d4 d4Var = this.f68101z;
        if (d4Var == null || (m2Var = d4Var.f68538h) == null) {
            linearLayout = null;
        } else {
            linearLayout = m2Var.mo3946b();
        }
        if (linearLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
        }
        mo4586v1(!z);
    }
}

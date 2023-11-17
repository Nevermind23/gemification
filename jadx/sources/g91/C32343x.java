package g91;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.C1200m3;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1613n0;
import cf1.C40419j;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import de1.C40640a;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40776f;
import gd1.C40992a;
import hc1.C41185v;
import hd1.C41205b;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import jg1.C41438c;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37223a;
import org.json.JSONException;
import org.json.JSONObject;
import p00.C27113k;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p366bk.C10329r;
import p380ck.C10463g;
import p380ck.C10464h;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: g91.x */
public abstract class C32343x {

    /* renamed from: g91.x$a */
    public static final class C32344a implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C43075l f79776d;

        C32344a(C43075l lVar) {
            this.f79776d = lVar;
        }

        public void afterTextChanged(Editable editable) {
            C43075l lVar = this.f79776d;
            if (lVar != null) {
                lVar.invoke(String.valueOf(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: g91.x$b */
    static final class C32345b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43064a f79777d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32345b(C43064a aVar) {
            super(1);
            this.f79777d = aVar;
        }

        /* renamed from: a */
        public final void mo72844a(C41205b bVar) {
            C43064a aVar = this.f79777d;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72844a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: g91.x$c */
    static final class C32346c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f79778d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32346c(C43075l lVar) {
            super(1);
            this.f79778d = lVar;
        }

        /* renamed from: a */
        public final void mo72845a(Object obj) {
            C43075l lVar = this.f79778d;
            if (lVar != null) {
                lVar.invoke(obj);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72845a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: g91.x$d */
    static final class C32347d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f79779d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32347d(C43075l lVar) {
            super(1);
            this.f79779d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C43075l lVar = this.f79779d;
            if (lVar != null) {
                C41536l.m120488h(th, "it");
                lVar.invoke(th);
            }
        }
    }

    /* renamed from: g91.x$e */
    static final class C32348e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43064a f79780d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32348e(C43064a aVar) {
            super(1);
            this.f79780d = aVar;
        }

        /* renamed from: a */
        public final void mo72847a(C41205b bVar) {
            C43064a aVar = this.f79780d;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72847a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: g91.x$f */
    static final class C32349f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f79781d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32349f(C43075l lVar) {
            super(1);
            this.f79781d = lVar;
        }

        /* renamed from: a */
        public final void mo72848a(Object obj) {
            C43075l lVar = this.f79781d;
            if (lVar != null) {
                lVar.invoke(obj);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72848a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: g91.x$g */
    static final class C32350g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f79782d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32350g(C43075l lVar) {
            super(1);
            this.f79782d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C43075l lVar = this.f79782d;
            if (lVar != null) {
                C41536l.m120488h(th, "it");
                lVar.invoke(th);
            }
        }
    }

    /* renamed from: g91.x$h */
    static final class C32351h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43064a f79783d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32351h(C43064a aVar) {
            super(1);
            this.f79783d = aVar;
        }

        /* renamed from: a */
        public final void mo72850a(C41205b bVar) {
            C43064a aVar = this.f79783d;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72850a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: g91.x$i */
    static final class C32352i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f79784d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32352i(C43075l lVar) {
            super(1);
            this.f79784d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C43075l lVar = this.f79784d;
            if (lVar != null) {
                C41536l.m120488h(th, "it");
                lVar.invoke(th);
            }
        }
    }

    /* renamed from: g91.x$j */
    public static final class C32353j implements TabLayout.C5149d {

        /* renamed from: a */
        final /* synthetic */ C43075l f79785a;

        C32353j(C43075l lVar) {
            this.f79785a = lVar;
        }

        /* renamed from: a */
        public void mo16942a(TabLayout.C5153g gVar) {
            C43075l lVar = this.f79785a;
            if (lVar != null) {
                lVar.invoke(gVar);
            }
        }

        /* renamed from: b */
        public void mo16943b(TabLayout.C5153g gVar) {
        }

        /* renamed from: c */
        public void mo16944c(TabLayout.C5153g gVar) {
        }
    }

    /* renamed from: g91.x$k */
    public static final class C32354k implements Animation.AnimationListener {

        /* renamed from: d */
        final /* synthetic */ C43064a f79786d;

        /* renamed from: e */
        final /* synthetic */ C43064a f79787e;

        /* renamed from: f */
        final /* synthetic */ C43064a f79788f;

        C32354k(C43064a aVar, C43064a aVar2, C43064a aVar3) {
            this.f79786d = aVar;
            this.f79787e = aVar2;
            this.f79788f = aVar3;
        }

        public void onAnimationEnd(Animation animation) {
            C41536l.m120489i(animation, "animation");
            C43064a aVar = this.f79787e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animation animation) {
            C41536l.m120489i(animation, "animation");
            C43064a aVar = this.f79786d;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationStart(Animation animation) {
            C41536l.m120489i(animation, "animation");
            C43064a aVar = this.f79788f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m95378A(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: A0 */
    public static final void m95379A0(C1613n0 n0Var, String str, String str2, String str3, String str4) {
        C41536l.m120489i(n0Var, "<this>");
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, "label");
        C41536l.m120489i(str3, UrlHandler.ACTION);
        C36546y.m108282F().mo27156w(str, str2, str3, str4);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final void m95380B(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: B0 */
    public static /* synthetic */ void m95381B0(Activity activity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        m95495w0(activity, str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final void m95382C(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: C0 */
    public static /* synthetic */ void m95383C0(C1613n0 n0Var, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        m95501z0(n0Var, str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static final void m95384D(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m95385D0(Activity activity, String str, String str2, String str3, C10464h.C10465a aVar, Bundle bundle) {
        C41536l.m120489i(activity, "<this>");
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, "label");
        C41536l.m120489i(str3, UrlHandler.ACTION);
        C41536l.m120489i(aVar, "type");
        C36546y.m108282F().mo27137H(str, str3, str2, bundle, aVar);
    }

    /* renamed from: E */
    public static final String m95386E(String str, boolean z, Object... objArr) {
        C41536l.m120489i(objArr, "additionalVariables");
        return C27950a.m86290g(str, z, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: E0 */
    public static final void m95387E0(Fragment fragment, String str, String str2, String str3, C10464h.C10465a aVar, Bundle bundle) {
        C41536l.m120489i(fragment, "<this>");
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, "label");
        C41536l.m120489i(str3, UrlHandler.ACTION);
        C41536l.m120489i(aVar, "type");
        C36546y.m108282F().mo27137H(str, str3, str2, bundle, aVar);
    }

    /* renamed from: F */
    public static final String m95388F(String str, Object... objArr) {
        C41536l.m120489i(objArr, "additionalVariables");
        return C27950a.m86290g(str, false, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: F0 */
    public static final void m95389F0(C1613n0 n0Var, String str, String str2, String str3, C10464h.C10465a aVar, Bundle bundle) {
        C41536l.m120489i(n0Var, "<this>");
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, "label");
        C41536l.m120489i(str3, UrlHandler.ACTION);
        C41536l.m120489i(aVar, "type");
        C36546y.m108282F().mo27137H(str, str3, str2, bundle, aVar);
    }

    /* renamed from: G */
    public static final String m95390G(String str, Object... objArr) {
        String str2;
        String F;
        C41536l.m120489i(objArr, "additionalVariables");
        if (str == null || (F = m95388F(str, new Object[0])) == null) {
            str2 = null;
        } else {
            str2 = m95398K(F, Arrays.copyOf(objArr, objArr.length));
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: G0 */
    public static final void m95391G0(C10463g gVar, String str, String str2, String str3, C10464h.C10465a aVar, Bundle bundle) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(str, "category");
        C41536l.m120489i(aVar, "type");
        gVar.mo27137H(str, str2, str3, bundle, aVar);
    }

    /* renamed from: H */
    public static final int m95392H(float f) {
        return C32355x0.m95510a(f);
    }

    /* renamed from: H0 */
    public static /* synthetic */ void m95393H0(Activity activity, String str, String str2, String str3, C10464h.C10465a aVar, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bundle = null;
        }
        m95385D0(activity, str, str4, str3, aVar, bundle);
    }

    /* renamed from: I */
    public static final int m95394I(int i) {
        return C32355x0.m95510a((float) i);
    }

    /* renamed from: I0 */
    public static /* synthetic */ void m95395I0(Fragment fragment, String str, String str2, String str3, C10464h.C10465a aVar, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bundle = null;
        }
        m95387E0(fragment, str, str4, str3, aVar, bundle);
    }

    /* renamed from: J */
    public static final float m95396J(float f) {
        return (float) C32355x0.m95510a(f);
    }

    /* renamed from: J0 */
    public static /* synthetic */ void m95397J0(C1613n0 n0Var, String str, String str2, String str3, C10464h.C10465a aVar, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bundle = null;
        }
        m95389F0(n0Var, str, str4, str3, aVar, bundle);
    }

    /* renamed from: K */
    private static final String m95398K(String str, Object... objArr) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            str = new C40419j("\\{" + i + "s\\}").mo94490g(str, C40419j.f96017e.mo94495c(obj.toString()));
        }
        return str;
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m95399K0(C10463g gVar, String str, String str2, String str3, C10464h.C10465a aVar, Bundle bundle, int i, Object obj) {
        String str4;
        Bundle bundle2;
        if ((i & 2) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            aVar = C10464h.C10465a.FACEBOOKANDFIREBASE;
        }
        C10464h.C10465a aVar2 = aVar;
        if ((i & 16) != 0) {
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        m95391G0(gVar, str, str4, str5, aVar2, bundle2);
    }

    /* renamed from: L */
    public static final String m95400L(String str) {
        C41536l.m120489i(str, "<this>");
        return C40439w.m117103B(str, "$", "\\$", false, 4, (Object) null);
    }

    /* renamed from: L0 */
    public static final void m95401L0(View view) {
        C41536l.m120489i(view, "<this>");
        view.setVisibility(8);
    }

    /* renamed from: M */
    public static final void m95402M(ViewGroup viewGroup) {
        C41536l.m120489i(viewGroup, "<this>");
        viewGroup.getLayoutTransition().enableTransitionType(4);
    }

    /* renamed from: M0 */
    public static final void m95403M0(TextView textView) {
        boolean z;
        C41536l.m120489i(textView, "<this>");
        CharSequence text = textView.getText();
        boolean z2 = false;
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CharSequence text2 = textView.getText();
            if (text2 == null || C40439w.m117118v(text2)) {
                z2 = true;
            }
            if (!z2) {
                m95407O0(textView);
                return;
            }
        }
        m95401L0(textView);
    }

    /* renamed from: N */
    public static final String m95404N(double d, String str, boolean z) {
        C41536l.m120489i(str, "ccy");
        String l = C32303f.m95201l(d, str, Boolean.valueOf(z));
        C41536l.m120488h(l, "getFormattedAmount(this, ccy, withSpace)");
        return l;
    }

    /* renamed from: N0 */
    public static final void m95405N0(View view) {
        C41536l.m120489i(view, "<this>");
        view.setVisibility(4);
    }

    /* renamed from: O */
    public static final String m95406O(String str, String str2) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "ccy");
        String m = C32303f.m95202m(str, str2);
        C41536l.m120488h(m, "getFormattedAmount(this, ccy)");
        return m;
    }

    /* renamed from: O0 */
    public static final void m95407O0(View view) {
        C41536l.m120489i(view, "<this>");
        view.setVisibility(0);
    }

    /* renamed from: P */
    public static final String m95408P(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "<this>");
        C41536l.m120489i(str, "ccy");
        String n = C32303f.m95203n(bigDecimal, str);
        C41536l.m120488h(n, "getFormattedAmount(this, ccy)");
        return n;
    }

    /* renamed from: P0 */
    public static final Object m95409P0(Object obj, boolean z) {
        if (z) {
            return null;
        }
        return obj;
    }

    /* renamed from: Q */
    public static /* synthetic */ String m95410Q(double d, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m95404N(d, str, z);
    }

    /* renamed from: Q0 */
    public static final C40734b m95411Q0(C40734b bVar) {
        C41536l.m120489i(bVar, "<this>");
        C40734b z = bVar.mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "this.observeOn(AndroidSchedulers.mainThread())");
        return z;
    }

    /* renamed from: R */
    public static final String m95412R(Object obj, String str) {
        C41536l.m120489i(obj, "<this>");
        C41536l.m120489i(str, "format");
        Locale locale = Locale.US;
        C41536l.m120488h(locale, "US");
        return m95414S(obj, str, locale);
    }

    /* renamed from: R0 */
    public static final C40749p m95413R0(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        C40749p o0 = pVar.mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "this.observeOn(AndroidSchedulers.mainThread())");
        return o0;
    }

    /* renamed from: S */
    public static final String m95414S(Object obj, String str, Locale locale) {
        C41536l.m120489i(obj, "<this>");
        C41536l.m120489i(str, "format");
        C41536l.m120489i(locale, C11772k.C11773a.f34182n);
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format(locale, str, Arrays.copyOf(new Object[]{obj}, 1));
        C41536l.m120488h(format, "format(locale, format, *args)");
        return format;
    }

    /* renamed from: S0 */
    public static final C40762x m95415S0(C40762x xVar) {
        C41536l.m120489i(xVar, "<this>");
        C40762x B = xVar.mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "this.observeOn(AndroidSchedulers.mainThread())");
        return B;
    }

    /* renamed from: T */
    public static final Spanned m95416T(String str) {
        C41536l.m120489i(str, "<this>");
        Spanned C = C32359z0.m95532C(str);
        C41536l.m120488h(C, "fromHtml(this)");
        return C;
    }

    /* renamed from: T0 */
    public static final void m95417T0(TabLayout tabLayout, C43075l lVar) {
        C41536l.m120489i(tabLayout, "<this>");
        tabLayout.addOnTabSelectedListener((TabLayout.C5149d) new C32353j(lVar));
    }

    /* renamed from: U */
    public static final int m95418U(int i, Context context) {
        C41536l.m120489i(context, "context");
        return C0767a.m2893c(context, i);
    }

    /* renamed from: U0 */
    public static final Parcelable m95419U0(Fragment fragment, String str) {
        Parcelable parcelable;
        C41536l.m120489i(fragment, "<this>");
        C41536l.m120489i(str, "key");
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            parcelable = arguments.getParcelable(str);
        } else {
            parcelable = null;
        }
        C41536l.m120486f(parcelable);
        return parcelable;
    }

    /* renamed from: V */
    public static final String m95420V(String str, String str2, Object... objArr) {
        C41536l.m120489i(objArr, "additionalVariables");
        String F = m95388F(str, Arrays.copyOf(objArr, objArr.length));
        if (!C41536l.m120484d(F, str) || str2 == null) {
            return F;
        }
        return str2;
    }

    /* renamed from: V0 */
    public static final Double m95421V0(String str) {
        Number number;
        C41536l.m120489i(str, "<this>");
        try {
            number = NumberFormat.getInstance(Locale.US).parse(str);
        } catch (ParseException unused) {
            number = null;
        }
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    /* renamed from: W */
    public static final int m95422W(int i) {
        return C32355x0.m95516g(i);
    }

    /* renamed from: W0 */
    public static final void m95423W0(C41438c cVar, Object obj) {
        C41536l.m120489i(cVar, "<this>");
        C41536l.m120489i(obj, "subscriber");
        if (!cVar.mo96183k(obj)) {
            cVar.mo96185q(obj);
        }
    }

    /* renamed from: X */
    public static final Drawable m95424X(int i, Context context) {
        if (context == null) {
            context = C36546y.m108285N();
        }
        return C0767a.m2895e(context, i);
    }

    /* renamed from: X0 */
    public static final void m95425X0(TextTypeView textTypeView) {
        C41536l.m120489i(textTypeView, "<this>");
        String valueText = textTypeView.getValueText();
        C41536l.m120488h(valueText, "this.valueText");
        if (!C40439w.m117118v(valueText)) {
            textTypeView.setValueTextIgnoringEmpty("");
            textTypeView.getBogInputLayout().expandHint();
        }
    }

    /* renamed from: Y */
    public static /* synthetic */ Drawable m95426Y(int i, Context context, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context = null;
        }
        return m95424X(i, context);
    }

    /* renamed from: Y0 */
    public static final BigDecimal m95427Y0(BigDecimal bigDecimal, int i) {
        C41536l.m120489i(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(i, 4);
        C41536l.m120488h(scale, "this.setScale(scale, BigDecimal.ROUND_HALF_UP)");
        return scale;
    }

    /* renamed from: Z */
    public static final String m95428Z(Throwable th, String str) {
        C41536l.m120489i(th, "<this>");
        if (th instanceof ApiError) {
            return m95388F(((ApiError) th).mo84685a().getKey(), new Object[0]);
        }
        if (str == null) {
            return th.getMessage();
        }
        return str;
    }

    /* renamed from: Z0 */
    public static final void m95429Z0(Activity activity) {
        C41536l.m120489i(activity, "<this>");
        activity.getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    /* renamed from: a0 */
    public static /* synthetic */ String m95431a0(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return m95428Z(th, str);
    }

    /* renamed from: a1 */
    public static final void m95432a1(Animation animation, C43064a aVar, C43064a aVar2, C43064a aVar3) {
        C41536l.m120489i(animation, "<this>");
        animation.setAnimationListener(new C32354k(aVar3, aVar2, aVar));
    }

    /* renamed from: b0 */
    public static final Object m95434b0(Map map, Object obj) {
        Object obj2;
        C41536l.m120489i(map, "<this>");
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C41536l.m120484d(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m95435b1(Animation animation, C43064a aVar, C43064a aVar2, C43064a aVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        if ((i & 4) != 0) {
            aVar3 = null;
        }
        m95432a1(animation, aVar, aVar2, aVar3);
    }

    /* renamed from: c0 */
    public static final ViewGroup.MarginLayoutParams m95437c0(View view) {
        C41536l.m120489i(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        return null;
    }

    /* renamed from: c1 */
    public static final void m95438c1(Fragment fragment) {
        int i;
        Resources.Theme theme;
        C41536l.m120489i(fragment, "<this>");
        int themeType = PreferencesApiManager.getInstance().getThemeType();
        if (themeType == 1) {
            i = C10329r.SoloTheme;
        } else if (themeType != 2) {
            i = C10329r.AppTheme;
        } else {
            i = C10329r.WealthTheme;
        }
        Context context = fragment.getContext();
        if (context != null && (theme = context.getTheme()) != null) {
            theme.applyStyle(i, true);
        }
    }

    /* renamed from: d0 */
    public static final C27113k m95440d0(FragmentManager fragmentManager, String str) {
        C41536l.m120489i(fragmentManager, "<this>");
        C41536l.m120489i(str, "tag");
        Fragment k0 = fragmentManager.mo4418k0(str);
        if (k0 instanceof C27113k) {
            return (C27113k) k0;
        }
        return null;
    }

    /* renamed from: d1 */
    public static final void m95441d1(View view, int i) {
        C41536l.m120489i(view, "<this>");
        C32290b1.m95124n(view, i);
    }

    /* renamed from: e0 */
    public static /* synthetic */ C27113k m95443e0(FragmentManager fragmentManager, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "PreContractDialogFragment";
        }
        return m95440d0(fragmentManager, str);
    }

    /* renamed from: e1 */
    public static final void m95444e1(Activity activity, boolean z) {
        C41536l.m120489i(activity, "<this>");
        WindowInsetsControllerCompat a = C1200m3.m4285a(activity.getWindow(), activity.getWindow().getDecorView());
        C41536l.m120488h(a, "getInsetsController(window, window.decorView)");
        a.mo3542d(!z);
    }

    /* renamed from: f0 */
    public static final C41185v m95446f0(FragmentManager fragmentManager, String str) {
        C41536l.m120489i(fragmentManager, "<this>");
        C41536l.m120489i(str, "tag");
        Fragment k0 = fragmentManager.mo4418k0(str);
        if (k0 instanceof C41185v) {
            return (C41185v) k0;
        }
        return null;
    }

    /* renamed from: f1 */
    public static final void m95447f1(View view) {
        C41536l.m120489i(view, "<this>");
        view.setVisibility(0);
    }

    /* renamed from: g0 */
    public static /* synthetic */ C41185v m95449g0(FragmentManager fragmentManager, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "ScaVerificationDialogFragment";
        }
        return m95446f0(fragmentManager, str);
    }

    /* renamed from: g1 */
    public static final C40734b m95450g1(C40734b bVar) {
        C41536l.m120489i(bVar, "<this>");
        C40734b I = bVar.mo94890I(C40640a.m117458b());
        C41536l.m120488h(I, "this.subscribeOn(Schedulers.io())");
        return I;
    }

    /* renamed from: h0 */
    public static final String m95452h0(int i, Object... objArr) {
        C41536l.m120489i(objArr, "args");
        String string = C36546y.m108285N().getString(i, Arrays.copyOf(objArr, objArr.length));
        C41536l.m120488h(string, "getInstance().getString(this, *args)");
        return string;
    }

    /* renamed from: h1 */
    public static final C40749p m95453h1(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        C40749p J0 = pVar.mo94987J0(C40640a.m117458b());
        C41536l.m120488h(J0, "this.subscribeOn(Schedulers.io())");
        return J0;
    }

    /* renamed from: i0 */
    public static final void m95455i0(View view) {
        C41536l.m120489i(view, "<this>");
        view.setVisibility(8);
    }

    /* renamed from: i1 */
    public static final C40762x m95456i1(C40762x xVar) {
        C41536l.m120489i(xVar, "<this>");
        C40762x K = xVar.mo95072K(C40640a.m117458b());
        C41536l.m120488h(K, "this.subscribeOn(Schedulers.io())");
        return K;
    }

    /* renamed from: j */
    public static final void m95457j(EditText editText, C43075l lVar) {
        C41536l.m120489i(editText, "<this>");
        editText.addTextChangedListener(new C32344a(lVar));
    }

    /* renamed from: j0 */
    public static final void m95458j0(View view, boolean z) {
        C41536l.m120489i(view, "<this>");
        m95455i0(view);
        if (z) {
            m95447f1(view);
        }
    }

    /* renamed from: j1 */
    public static final C40734b m95459j1(C40734b bVar) {
        C41536l.m120489i(bVar, "<this>");
        return m95411Q0(m95450g1(bVar));
    }

    /* renamed from: k */
    public static final Drawable m95460k(Drawable drawable, int i) {
        C41536l.m120489i(drawable, "<this>");
        Drawable mutate = drawable.mutate();
        C41536l.m120488h(mutate, "this.mutate()");
        Drawable r = C0836a.m3156r(mutate);
        C41536l.m120488h(r, "wrap(normalDrawable)");
        C0836a.m3152n(r, i);
        return r;
    }

    /* renamed from: k0 */
    public static final void m95461k0(Intent intent, String str, C43075l lVar) {
        C41536l.m120489i(intent, "<this>");
        C41536l.m120489i(str, "name");
        C41536l.m120489i(lVar, "callback");
        if (intent.hasExtra(str) && intent.getStringExtra(str) != null) {
            String stringExtra = intent.getStringExtra(str);
            C41536l.m120486f(stringExtra);
            lVar.invoke(stringExtra);
        }
    }

    /* renamed from: k1 */
    public static final C40749p m95462k1(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        return m95413R0(m95453h1(pVar));
    }

    /* renamed from: l */
    public static final BigDecimal m95463l(double d) {
        return new BigDecimal(d);
    }

    /* renamed from: l0 */
    public static final View m95464l0(int i, ViewGroup viewGroup, boolean z) {
        C41536l.m120489i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, z);
        C41536l.m120488h(inflate, "from(parent.context)\n   …is, parent, attachToRoot)");
        return inflate;
    }

    /* renamed from: l1 */
    public static final C40762x m95465l1(C40762x xVar) {
        C41536l.m120489i(xVar, "<this>");
        return m95415S0(m95456i1(xVar));
    }

    /* renamed from: m */
    public static final C37223a m95466m(Object obj) {
        return new C37223a(obj);
    }

    /* renamed from: m0 */
    public static final View m95467m0(ViewGroup viewGroup, int i, boolean z) {
        C41536l.m120489i(viewGroup, "<this>");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, z);
        C41536l.m120488h(inflate, "from(context)\n        .i…tRes, this, attachToRoot)");
        return inflate;
    }

    /* renamed from: m1 */
    public static final int m95468m1(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: n */
    public static final HashMap m95469n(Object obj) {
        C41536l.m120489i(obj, "<this>");
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(new Gson().mo18181w(obj));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C41536l.m120487g(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                Object obj2 = jSONObject.get(str);
                C41536l.m120488h(obj2, C11755a.C11756a.f34100b);
                hashMap.put(str, obj2);
            }
        } catch (JSONException unused) {
        }
        return hashMap;
    }

    /* renamed from: n0 */
    public static /* synthetic */ View m95470n0(int i, ViewGroup viewGroup, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m95464l0(i, viewGroup, z);
    }

    /* renamed from: n1 */
    public static final String m95471n1(Object obj) {
        C41536l.m120489i(obj, "<this>");
        String w = new Gson().mo18181w(obj);
        C41536l.m120488h(w, "Gson().toJson(this)");
        return w;
    }

    /* renamed from: o */
    public static final void m95472o(C40776f fVar) {
        C41536l.m120489i(fVar, "<this>");
        fVar.onNext(C41238w.f97225a);
    }

    /* renamed from: o0 */
    public static /* synthetic */ View m95473o0(ViewGroup viewGroup, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m95467m0(viewGroup, i, z);
    }

    /* renamed from: o1 */
    public static final void m95474o1(TextGroupView textGroupView) {
        C41536l.m120489i(textGroupView, "<this>");
        textGroupView.setActive(!textGroupView.mo36844a());
    }

    /* renamed from: p */
    public static final void m95475p(Collection collection, Collection collection2) {
        C41536l.m120489i(collection, "<this>");
        C41536l.m120489i(collection2, "newCollection");
        ArrayList arrayList = new ArrayList(collection2);
        collection.clear();
        collection.addAll(arrayList);
    }

    /* renamed from: p0 */
    public static final boolean m95476p0(Context context) {
        C41536l.m120489i(context, "<this>");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: p1 */
    public static final void m95477p1(View view, boolean z) {
        C41536l.m120489i(view, "<this>");
        m95483r1(view, z, false, 2, (Object) null);
    }

    /* renamed from: q */
    public static final C41205b m95478q(C40734b bVar, C43064a aVar, C43064a aVar2, C43075l lVar) {
        C41536l.m120489i(bVar, "<this>");
        C41205b G = bVar.mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a()).mo94904r(new C32323o(new C32351h(aVar))).mo94888G(new C32325p(aVar2), new C32327q(new C32352i(lVar)));
        C41536l.m120488h(G, "onLoading: (() -> Unit)?…ror?.invoke(it)\n        }");
        return G;
    }

    /* renamed from: q0 */
    public static final boolean m95479q0(Object obj, C43075l lVar) {
        C41536l.m120489i(lVar, "comparer");
        if (obj == null || !((Boolean) lVar.invoke(obj)).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: q1 */
    public static final void m95480q1(View view, boolean z, boolean z2) {
        C41536l.m120489i(view, "<this>");
        if (z) {
            m95447f1(view);
        } else if (z2) {
            m95405N0(view);
        } else {
            m95455i0(view);
        }
    }

    /* renamed from: r */
    public static final C41205b m95481r(C40749p pVar, C43064a aVar, C43075l lVar, C43075l lVar2) {
        C41536l.m120489i(pVar, "<this>");
        C41205b G0 = pVar.mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94980F(new C32337u(new C32348e(aVar))).mo94983G0(new C32339v(new C32349f(lVar2)), new C32341w(new C32350g(lVar)));
        C41536l.m120488h(G0, "onLoading: (() -> Unit)?…ror?.invoke(it)\n        }");
        return G0;
    }

    /* renamed from: r0 */
    public static final boolean m95482r0(Object obj, Object obj2) {
        return obj != null || C41536l.m120484d(obj, obj2);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m95483r1(View view, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        m95480q1(view, z, z2);
    }

    /* renamed from: s */
    public static final C41205b m95484s(C40762x xVar, C43064a aVar, C43075l lVar, C43075l lVar2) {
        C41536l.m120489i(xVar, "<this>");
        C41205b I = xVar.mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95083l(new C32329r(new C32345b(aVar))).mo95070I(new C32332s(new C32346c(lVar)), new C32334t(new C32347d(lVar2)));
        C41536l.m120488h(I, "onLoading: (() -> Unit)?…ror?.invoke(it)\n        }");
        return I;
    }

    /* renamed from: s0 */
    public static final boolean m95485s0(String str) {
        return !(str == null || str.length() == 0);
    }

    /* renamed from: s1 */
    public static final boolean m95486s1(SwitchCompat switchCompat) {
        C41536l.m120489i(switchCompat, "<this>");
        boolean isChecked = switchCompat.isChecked();
        switchCompat.toggle();
        switchCompat.jumpDrawablesToCurrentState();
        return isChecked;
    }

    /* renamed from: t */
    public static /* synthetic */ C41205b m95487t(C40749p pVar, C43064a aVar, C43075l lVar, C43075l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            lVar2 = null;
        }
        return m95481r(pVar, aVar, lVar, lVar2);
    }

    /* renamed from: t0 */
    public static final boolean m95488t0(Object obj, Object obj2) {
        return obj == null || C41536l.m120484d(obj, obj2);
    }

    /* renamed from: t1 */
    public static final void m95489t1(C41438c cVar, Object obj) {
        C41536l.m120489i(cVar, "<this>");
        C41536l.m120489i(obj, "subscriber");
        if (cVar.mo96183k(obj)) {
            cVar.mo96186s(obj);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ C41205b m95490u(C40762x xVar, C43064a aVar, C43075l lVar, C43075l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            lVar2 = null;
        }
        return m95484s(xVar, aVar, lVar, lVar2);
    }

    /* renamed from: u0 */
    public static final boolean m95491u0(Object obj, C43075l lVar) {
        C41536l.m120489i(lVar, "comparer");
        if (obj == null || ((Boolean) lVar.invoke(obj)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m95492v(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: v0 */
    public static final boolean m95493v0(String str) {
        C41536l.m120489i(str, "<this>");
        return new C40419j("-?\\d+(\\.\\d+)?").mo94489f(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m95494w(C43064a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: w0 */
    public static final void m95495w0(Activity activity, String str, String str2, String str3) {
        C41536l.m120489i(activity, "<this>");
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, "label");
        C41536l.m120489i(str3, UrlHandler.ACTION);
        C36546y.m108282F().mo27152s(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m95496x(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m95497x0(Activity activity, String str, String str2, String str3, String str4) {
        C41536l.m120489i(activity, "<this>");
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, "label");
        C41536l.m120489i(str3, UrlHandler.ACTION);
        C36546y.m108282F().mo27156w(str, str2, str3, str4);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m95498y(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m95499y0(Fragment fragment, String str, String str2, String str3) {
        C41536l.m120489i(fragment, "<this>");
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, "label");
        C41536l.m120489i(str3, UrlHandler.ACTION);
        C36546y.m108282F().mo27152s(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m95500z(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: z0 */
    public static final void m95501z0(C1613n0 n0Var, String str, String str2, String str3) {
        C41536l.m120489i(n0Var, "<this>");
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, "label");
        C41536l.m120489i(str3, UrlHandler.ACTION);
        C36546y.m108282F().mo27152s(str, str2, str3);
    }
}

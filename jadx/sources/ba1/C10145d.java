package ba1;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import ba1.C10146d0;
import kotlin.jvm.internal.C41536l;
import p217q2.C7833e;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: ba1.d */
public abstract class C10145d {
    /* renamed from: b */
    public static final C7833e m37088b(Object obj) {
        return C7833e.f22754c.mo22768b(obj);
    }

    /* renamed from: c */
    public static final String m37089c(String str, C10146d0.C10172e eVar) {
        String a;
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(eVar, "config");
        C10195g0 g = eVar.mo26716g();
        if (g == null || (a = g.mo26763a(str, new Object[0])) == null) {
            return "";
        }
        return a;
    }

    /* renamed from: d */
    public static final String m37090d(String str, int i, Context context, C10146d0.C10172e eVar) {
        String str2;
        String a;
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(eVar, "config");
        C10195g0 g = eVar.mo26716g();
        if (g != null && (a = g.mo26763a(str, new Object[0])) != null) {
            return a;
        }
        if (context != null) {
            str2 = context.getString(i);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: e */
    public static final void m37091e(Context context, View view) {
        C41536l.m120489i(context, "<this>");
        C41536l.m120489i(view, "view");
        Object systemService = context.getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: f */
    public static final void m37092f(Input input) {
        C41536l.m120489i(input, "<this>");
        input.setEndIconImageSmallClickListener(new C10143c(input));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m37093g(Input input, View view) {
        C41536l.m120489i(input, "$this_setPasswordType");
        input.getTextInput().setInputType(input.getTextInput().getInputType() ^ 128);
    }

    /* renamed from: h */
    public static final String m37094h(Boolean bool) {
        return C41536l.m120484d(bool, Boolean.TRUE) ? "Y" : "N";
    }
}

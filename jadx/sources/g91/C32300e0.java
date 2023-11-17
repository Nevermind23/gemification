package g91;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import bf1.C40342g;
import java.net.URL;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10318g;
import p366bk.C10328q;
import u00.C28535c;
import ve1.C43151a;

/* renamed from: g91.e0 */
public final class C32300e0 {

    /* renamed from: a */
    public static final C32300e0 f79712a = new C32300e0();

    /* renamed from: g91.e0$a */
    private static final class C32301a implements C40342g {

        /* renamed from: a */
        private final View f79713a;

        /* renamed from: g91.e0$a$a */
        private static final class C32302a implements Iterator, C43151a {

            /* renamed from: d */
            private final ViewGroup f79714d;

            /* renamed from: e */
            private int f79715e;

            /* renamed from: f */
            private final int f79716f;

            public C32302a(ViewGroup viewGroup) {
                C41536l.m120489i(viewGroup, "view");
                this.f79714d = viewGroup;
                this.f79716f = viewGroup.getChildCount();
            }

            /* renamed from: b */
            private final void m95179b() {
                if (this.f79716f != this.f79714d.getChildCount()) {
                    throw new ConcurrentModificationException();
                }
            }

            /* renamed from: d */
            public View next() {
                if (hasNext()) {
                    ViewGroup viewGroup = this.f79714d;
                    int i = this.f79715e;
                    this.f79715e = i + 1;
                    View childAt = viewGroup.getChildAt(i);
                    C41536l.m120488h(childAt, "view.getChildAt(index++)");
                    return childAt;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                m95179b();
                if (this.f79715e < this.f79716f) {
                    return true;
                }
                return false;
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        public C32301a(View view) {
            C41536l.m120489i(view, "view");
            this.f79713a = view;
        }

        public Iterator iterator() {
            View view = this.f79713a;
            if (!(view instanceof ViewGroup)) {
                return C41341q.m119907j().iterator();
            }
            return new C32302a((ViewGroup) view);
        }
    }

    private C32300e0() {
    }

    /* renamed from: c */
    public static final Object m95167c(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    /* renamed from: f */
    public static final String m95168f(int i) {
        int i2 = (i >> 16) & C11051p3.f31759c;
        int i3 = (i >> 8) & C11051p3.f31759c;
        int i4 = i & C11051p3.f31759c;
        return "rgba(" + i2 + ", " + i3 + ", " + i4 + ", " + (((float) ((i >> 24) & C11051p3.f31759c)) / 255.0f) + ")";
    }

    /* renamed from: g */
    public static final Image m95169g(int i) {
        return new Image.Resource(i, (Boolean) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public static final String m95170h(C28535c cVar) {
        C41536l.m120489i(cVar, "item");
        int intValue = ((Number) m95167c(Integer.valueOf(cVar.mo68261c()), 0)).intValue();
        String V = C32343x.m95420V(cVar.mo68262d(), C32343x.m95452h0(C10328q.common_text_commission, new Object[0]), new Object[0]);
        if (intValue <= 0) {
            return V;
        }
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("%s (%s)", Arrays.copyOf(new Object[]{V, Integer.valueOf(intValue)}, 2));
        C41536l.m120488h(format, "format(format, *args)");
        return format;
    }

    /* renamed from: i */
    public static final void m95171i(Context context, String str, ViewGroup viewGroup, View view) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "accessType");
        C41536l.m120489i(viewGroup, "fieldsContainer");
        C41536l.m120489i(view, "button");
        int c = C0767a.m2893c(context, C10318g.disabled_color);
        if (C41536l.m120484d(str, "V")) {
            view.setVisibility(8);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C41536l.m120488h(childAt, "getChildAt(index)");
                if (childAt instanceof TextTypeView) {
                    childAt.setOnClickListener((View.OnClickListener) null);
                    ((TextTypeView) childAt).getBogInputLayout().setValueTextColor(c);
                }
            }
        } else if (C41536l.m120484d(str, "C")) {
            view.setVisibility(8);
        }
    }

    /* renamed from: l */
    public static final boolean m95172l(String str) {
        C41536l.m120489i(str, "<this>");
        try {
            new URL(str).toURI();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo72816a(Object... objArr) {
        C41536l.m120489i(objArr, "objs");
        int length = objArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            if (objArr[i] == null) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: b */
    public final C40342g mo72817b(View view) {
        C41536l.m120489i(view, "<this>");
        return new C32301a(view);
    }

    /* renamed from: d */
    public final Object mo72818d(Object obj, Object obj2) {
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = language.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (C40440x.m117139M(lowerCase, "ka", false, 2, (Object) null)) {
            return obj;
        }
        return obj2;
    }

    /* renamed from: e */
    public final String mo72819e(String str, String str2) {
        C41536l.m120489i(str, "georgian");
        C41536l.m120489i(str2, "english");
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = language.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (C40440x.m117139M(lowerCase, "ka", false, 2, (Object) null)) {
            return str;
        }
        return str2;
    }

    /* renamed from: j */
    public final Object mo72820j(Object obj, Object obj2) {
        return mo72821k() ? obj : obj2;
    }

    /* renamed from: k */
    public final boolean mo72821k() {
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = language.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return C40440x.m117139M(lowerCase, "ka", false, 2, (Object) null);
    }
}

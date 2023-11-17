package p547oi;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: oi.a */
public final class C17199a implements C17201b {

    /* renamed from: a */
    private String f48412a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f48413b;

    /* renamed from: c */
    private final InputFilter f48414c;

    /* renamed from: oi.a$a */
    public static final class C17200a implements InputFilter {

        /* renamed from: a */
        final /* synthetic */ C17199a f48415a;

        C17200a(C17199a aVar) {
            this.f48415a = aVar;
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            boolean z;
            boolean z2;
            C41536l.m120489i(charSequence, "source");
            C41536l.m120489i(spanned, "dest");
            boolean z3 = true;
            int i5 = 0;
            if (spanned.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (charSequence.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && charSequence.charAt(0) == '0' && spanned.charAt(0) == '0' && (i3 == 1 || i3 == 0)) {
                    return "";
                }
            }
            if (charSequence.length() <= 0) {
                z3 = false;
            }
            if (z3 && i3 == 0 && charSequence.charAt(0) == '.') {
                int length = spanned.length();
                String d = this.f48415a.mo44615d();
                if (d != null) {
                    i5 = d.length();
                }
                if (length - i5 > this.f48415a.f48413b) {
                    return "";
                }
                return "0.";
            }
            int W = C40440x.m117155W(spanned, '.', 0, false, 6, (Object) null);
            if (W != -1) {
                if (i3 <= W) {
                    return null;
                }
                int length2 = spanned.length() - W;
                String d2 = this.f48415a.mo44615d();
                if (d2 != null) {
                    i5 = d2.length();
                }
                if (length2 - i5 > this.f48415a.f48413b) {
                    return "";
                }
                return null;
            } else if (!C41536l.m120484d(charSequence, ".")) {
                return null;
            } else {
                int length3 = spanned.length();
                String d3 = this.f48415a.mo44615d();
                if (d3 != null) {
                    i5 = d3.length();
                }
                if ((length3 - i5) - i3 > this.f48415a.f48413b) {
                    return "";
                }
                return null;
            }
        }
    }

    public C17199a(String str) {
        this.f48412a = str;
        this.f48413b = 2;
        this.f48414c = new C17200a(this);
    }

    /* renamed from: a */
    public void mo44613a(String str) {
        this.f48412a = str;
    }

    /* renamed from: b */
    public InputFilter mo44614b() {
        return this.f48414c;
    }

    /* renamed from: d */
    public String mo44615d() {
        return this.f48412a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17199a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}

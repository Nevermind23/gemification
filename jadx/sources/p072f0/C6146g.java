package p072f0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C1378e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: f0.g */
final class C6146g implements TextWatcher {

    /* renamed from: d */
    private final EditText f19106d;

    /* renamed from: e */
    private final boolean f19107e;

    /* renamed from: f */
    private C1378e.C1384e f19108f;

    /* renamed from: g */
    private int f19109g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f19110h = 0;

    /* renamed from: i */
    private boolean f19111i;

    /* renamed from: f0.g$a */
    private static class C6147a extends C1378e.C1384e {

        /* renamed from: a */
        private final Reference f19112a;

        C6147a(EditText editText) {
            this.f19112a = new WeakReference(editText);
        }

        /* renamed from: b */
        public void mo1790b() {
            super.mo1790b();
            C6146g.m24558c((EditText) this.f19112a.get(), 1);
        }
    }

    C6146g(EditText editText, boolean z) {
        this.f19106d = editText;
        this.f19107e = z;
        this.f19111i = true;
    }

    /* renamed from: a */
    private C1378e.C1384e m24557a() {
        if (this.f19108f == null) {
            this.f19108f = new C6147a(this.f19106d);
        }
        return this.f19108f;
    }

    /* renamed from: c */
    static void m24558c(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C1378e.m4730b().mo3994o(editableText);
            C6138d.m24524b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: e */
    private boolean m24559e() {
        return !this.f19111i || (!this.f19107e && !C1378e.m4734h());
    }

    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public boolean mo19722b() {
        return this.f19111i;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: d */
    public void mo19724d(boolean z) {
        if (this.f19111i != z) {
            if (this.f19108f != null) {
                C1378e.m4730b().mo3999t(this.f19108f);
            }
            this.f19111i = z;
            if (z) {
                m24558c(this.f19106d, C1378e.m4730b().mo3989d());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f19106d.isInEditMode() && !m24559e() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int d = C1378e.m4730b().mo3989d();
            if (d != 0) {
                if (d == 1) {
                    C1378e.m4730b().mo3997r((Spannable) charSequence, i, i + i3, this.f19109g, this.f19110h);
                    return;
                } else if (d != 3) {
                    return;
                }
            }
            C1378e.m4730b().mo3998s(m24557a());
        }
    }
}

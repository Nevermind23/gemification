package p072f0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C1378e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: f0.d */
final class C6138d implements InputFilter {

    /* renamed from: a */
    private final TextView f19095a;

    /* renamed from: b */
    private C1378e.C1384e f19096b;

    /* renamed from: f0.d$a */
    private static class C6139a extends C1378e.C1384e {

        /* renamed from: a */
        private final Reference f19097a;

        /* renamed from: b */
        private final Reference f19098b;

        C6139a(TextView textView, C6138d dVar) {
            this.f19097a = new WeakReference(textView);
            this.f19098b = new WeakReference(dVar);
        }

        /* renamed from: c */
        private boolean m24525c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo1790b() {
            CharSequence text;
            CharSequence o;
            super.mo1790b();
            TextView textView = (TextView) this.f19097a.get();
            if (m24525c(textView, (InputFilter) this.f19098b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (o = C1378e.m4730b().mo3994o(text))) {
                int selectionStart = Selection.getSelectionStart(o);
                int selectionEnd = Selection.getSelectionEnd(o);
                textView.setText(o);
                if (o instanceof Spannable) {
                    C6138d.m24524b((Spannable) o, selectionStart, selectionEnd);
                }
            }
        }
    }

    C6138d(TextView textView) {
        this.f19095a = textView;
    }

    /* renamed from: a */
    private C1378e.C1384e m24523a() {
        if (this.f19096b == null) {
            this.f19096b = new C6139a(this.f19095a, this);
        }
        return this.f19096b;
    }

    /* renamed from: b */
    static void m24524b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f19095a.isInEditMode()) {
            return charSequence;
        }
        int d = C1378e.m4730b().mo3989d();
        if (d != 0) {
            boolean z = true;
            if (d == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f19095a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C1378e.m4730b().mo3995p(charSequence, 0, charSequence.length());
            } else if (d != 3) {
                return charSequence;
            }
        }
        C1378e.m4730b().mo3998s(m24523a());
        return charSequence;
    }
}

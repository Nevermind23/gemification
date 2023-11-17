package vx0;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: vx0.b */
public interface C39492b extends TextWatcher {

    /* renamed from: vx0.b$a */
    public static final class C39493a {
        /* renamed from: a */
        public static void m114809a(C39492b bVar, Editable editable) {
            bVar.mo80367r(String.valueOf(editable));
        }

        /* renamed from: b */
        public static void m114810b(C39492b bVar, CharSequence charSequence, int i, int i2, int i3) {
        }

        /* renamed from: c */
        public static void m114811c(C39492b bVar, CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    void afterTextChanged(Editable editable);

    void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

    void onTextChanged(CharSequence charSequence, int i, int i2, int i3);

    /* renamed from: r */
    void mo80367r(String str);
}

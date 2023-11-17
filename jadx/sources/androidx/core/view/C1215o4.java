package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: androidx.core.view.o4 */
public final /* synthetic */ class C1215o4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f3824d;

    public /* synthetic */ C1215o4(View view) {
        this.f3824d = view;
    }

    public final void run() {
        ((InputMethodManager) this.f3824d.getContext().getSystemService("input_method")).showSoftInput(this.f3824d, 0);
    }
}

package androidx.core.view;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.core.view.p2 */
public final /* synthetic */ class C1219p2 implements View.OnUnhandledKeyEventListener {

    /* renamed from: a */
    public final /* synthetic */ ViewCompat.OnUnhandledKeyEventListenerCompat f3825a;

    public /* synthetic */ C1219p2(ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        this.f3825a = onUnhandledKeyEventListenerCompat;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return this.f3825a.onUnhandledKeyEvent(view, keyEvent);
    }
}

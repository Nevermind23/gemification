package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
public final class C1077a extends ClickableSpan {

    /* renamed from: d */
    private final int f3773d;

    /* renamed from: e */
    private final AccessibilityNodeInfoCompat f3774e;

    /* renamed from: f */
    private final int f3775f;

    public C1077a(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
        this.f3773d = i;
        this.f3774e = accessibilityNodeInfoCompat;
        this.f3775f = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3773d);
        this.f3774e.mo3584O(this.f3775f, bundle);
    }
}

package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p136k.C6769a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: d */
    private final int f2426d = getResources().getDimensionPixelOffset(C6769a.browser_actions_context_menu_min_padding);

    /* renamed from: e */
    private final int f2427e = getResources().getDimensionPixelOffset(C6769a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f2426d * 2), this.f2427e), 1073741824), i2);
    }
}

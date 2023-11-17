package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import com.google.android.material.tabs.TabLayout;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10321j;
import p642vh.C18368l;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogTabLayout */
public class BogTabLayout extends TabLayout {
    private Typeface mTypeface;

    public BogTabLayout(Context context) {
        super(context);
        setThemeSpecificColors();
    }

    private void setThemeSpecificColors() {
        int c = C0767a.m2893c(getContext(), C10318g.f28630R0);
        int d = C18368l.m62755d(getContext(), C10316e.f28605g);
        int d2 = C18368l.m62755d(getContext(), C10316e.f28606i);
        setTabTextColors(c, d);
        setSelectedTabIndicatorColor(d2);
    }

    public void addTab(TabLayout.C5153g gVar) {
        super.addTab(gVar);
        if (this.mTypeface == null) {
            this.mTypeface = C0808h.m3033h(getContext(), C10321j.bog_headline_medium);
        }
        resetFonts();
    }

    public Typeface getTypeface() {
        return this.mTypeface;
    }

    public void resetFonts() {
        ViewGroup viewGroup;
        if (this.mTypeface == null) {
            this.mTypeface = C0808h.m3033h(getContext(), C10321j.bog_headline_medium);
        }
        if (getChildCount() > 0 && (viewGroup = (ViewGroup) getChildAt(0)) != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i);
                int childCount = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup2.getChildAt(i2);
                    if (childAt instanceof TextView) {
                        ((TextView) childAt).setTypeface(this.mTypeface, 0);
                    }
                }
            }
        }
    }

    public void setTypeface(Typeface typeface) {
        this.mTypeface = typeface;
        resetFonts();
    }

    public BogTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setThemeSpecificColors();
    }

    public BogTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setThemeSpecificColors();
    }
}

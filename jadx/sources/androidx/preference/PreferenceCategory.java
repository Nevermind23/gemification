package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.C0820l;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: I */
    public boolean mo5021I() {
        return !super.mo5071u();
    }

    /* renamed from: u */
    public boolean mo5071u() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0820l.m3058a(context, C1677c.preferenceCategoryStyle, 16842892));
    }
}

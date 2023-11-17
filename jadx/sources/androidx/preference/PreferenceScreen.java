package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.C0820l;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: O */
    private boolean f4771O = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0820l.m3058a(context, C1677c.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo5015y() {
        if (mo5061g() == null && mo5060f() == null && mo5081L() != 0) {
            mo5066o();
            throw null;
        }
    }
}

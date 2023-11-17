package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.res.C0820l;

public abstract class DialogPreference extends Preference {

    /* renamed from: G */
    private CharSequence f4706G;

    /* renamed from: H */
    private CharSequence f4707H;

    /* renamed from: I */
    private Drawable f4708I;

    /* renamed from: J */
    private CharSequence f4709J;

    /* renamed from: K */
    private CharSequence f4710K;

    /* renamed from: L */
    private int f4711L;

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1681g.f4876i, i, i2);
        String o = C0820l.m3072o(obtainStyledAttributes, C1681g.f4896s, C1681g.f4878j);
        this.f4706G = o;
        if (o == null) {
            this.f4706G = mo5068s();
        }
        this.f4707H = C0820l.m3072o(obtainStyledAttributes, C1681g.f4894r, C1681g.f4880k);
        this.f4708I = C0820l.m3060c(obtainStyledAttributes, C1681g.f4890p, C1681g.f4882l);
        this.f4709J = C0820l.m3072o(obtainStyledAttributes, C1681g.f4900u, C1681g.f4884m);
        this.f4710K = C0820l.m3072o(obtainStyledAttributes, C1681g.f4898t, C1681g.f4886n);
        this.f4711L = C0820l.m3071n(obtainStyledAttributes, C1681g.f4892q, C1681g.f4888o, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo5015y() {
        mo5066o();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0820l.m3058a(context, C1677c.dialogPreferenceStyle, 16842897));
    }
}

package p171m8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0481r;
import androidx.core.widget.C1295d;
import p009a8.C0072b;
import p009a8.C0081k;
import p080f8.C6170a;

/* renamed from: m8.a */
public class C7141a extends C0481r {

    /* renamed from: j */
    private static final int f21146j = C0081k.f375w;

    /* renamed from: k */
    private static final int[][] f21147k = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: h */
    private ColorStateList f21148h;

    /* renamed from: i */
    private boolean f21149i;

    public C7141a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f131O);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f21148h == null) {
            int d = C6170a.m24583d(this, C0072b.f153l);
            int d2 = C6170a.m24583d(this, C0072b.f156o);
            int d3 = C6170a.m24583d(this, C0072b.f159r);
            int[][] iArr = f21147k;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C6170a.m24587h(d3, d, 1.0f);
            iArr2[1] = C6170a.m24587h(d3, d2, 0.54f);
            iArr2[2] = C6170a.m24587h(d3, d2, 0.38f);
            iArr2[3] = C6170a.m24587h(d3, d2, 0.38f);
            this.f21148h = new ColorStateList(iArr, iArr2);
        }
        return this.f21148h;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21149i && C1295d.m4506b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f21149i = z;
        if (z) {
            C1295d.m4508d(this, getMaterialThemeColorsTintList());
        } else {
            C1295d.m4508d(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7141a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f21146j
            android.content.Context r8 = p249s8.C8273a.m31120c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p009a8.C0082l.f444G4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C5088l.m19898i(r0, r1, r2, r3, r4, r5)
            int r10 = p009a8.C0082l.f454H4
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p184n8.C7343c.m28003a(r8, r9, r10)
            androidx.core.widget.C1295d.m4508d(r7, r8)
        L_0x0028:
            int r8 = p009a8.C0082l.f464I4
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f21149i = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p171m8.C7141a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

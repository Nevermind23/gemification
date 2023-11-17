package p058e;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p058e.C5871b;

/* renamed from: e.e */
public abstract class C5878e extends C5871b {

    /* renamed from: p */
    private C5879a f18466p;

    /* renamed from: q */
    private boolean f18467q;

    /* renamed from: e.e$a */
    static class C5879a extends C5871b.C5875d {

        /* renamed from: J */
        int[][] f18468J;

        C5879a(C5879a aVar, C5878e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f18468J = aVar.f18468J;
            } else {
                this.f18468J = new int[mo19161f()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public int mo19221A(int[] iArr) {
            int[][] iArr2 = this.f18468J;
            int h = mo19164h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: o */
        public void mo19171o(int i, int i2) {
            super.mo19171o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f18468J, 0, iArr, 0, i);
            this.f18468J = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo19109r();

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public int mo19222z(int[] iArr, Drawable drawable) {
            int a = mo19156a(drawable);
            this.f18468J[a] = iArr;
            return a;
        }
    }

    C5878e(C5879a aVar) {
        if (aVar != null) {
            mo19090h(aVar);
        }
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo19090h(C5871b.C5875d dVar) {
        super.mo19090h(dVar);
        if (dVar instanceof C5879a) {
            this.f18466p = (C5879a) dVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo19220j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f18467q && super.mutate() == this) {
            this.f18466p.mo19109r();
            this.f18467q = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract boolean onStateChange(int[] iArr);
}

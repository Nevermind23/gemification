package p443hc;

import com.google.zxing.C5766o;

/* renamed from: hc.i */
public final class C15479i {

    /* renamed from: a */
    private final boolean f43922a;

    C15479i(boolean z) {
        this.f43922a = z;
    }

    /* renamed from: a */
    public void mo42566a(C5766o[] oVarArr) {
        if (this.f43922a && oVarArr != null && oVarArr.length >= 3) {
            C5766o oVar = oVarArr[0];
            oVarArr[0] = oVarArr[2];
            oVarArr[2] = oVar;
        }
    }
}

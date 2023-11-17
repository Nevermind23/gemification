package com.google.zxing;

import com.github.mikephil.charting.utils.Utils;
import p213pb.C7798a;

/* renamed from: com.google.zxing.o */
public class C5766o {

    /* renamed from: a */
    private final float f18216a;

    /* renamed from: b */
    private final float f18217b;

    public C5766o(float f, float f2) {
        this.f18216a = f;
        this.f18217b = f2;
    }

    /* renamed from: a */
    private static float m23202a(C5766o oVar, C5766o oVar2, C5766o oVar3) {
        float f = oVar2.f18216a;
        float f2 = oVar2.f18217b;
        return ((oVar3.f18216a - f) * (oVar.f18217b - f2)) - ((oVar3.f18217b - f2) * (oVar.f18216a - f));
    }

    /* renamed from: b */
    public static float m23203b(C5766o oVar, C5766o oVar2) {
        return C7798a.m29507a(oVar.f18216a, oVar.f18217b, oVar2.f18216a, oVar2.f18217b);
    }

    /* renamed from: e */
    public static void m23204e(C5766o[] oVarArr) {
        C5766o oVar;
        C5766o oVar2;
        C5766o oVar3;
        float b = m23203b(oVarArr[0], oVarArr[1]);
        float b2 = m23203b(oVarArr[1], oVarArr[2]);
        float b3 = m23203b(oVarArr[0], oVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            oVar3 = oVarArr[0];
            oVar2 = oVarArr[1];
            oVar = oVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            oVar3 = oVarArr[2];
            oVar2 = oVarArr[0];
            oVar = oVarArr[1];
        } else {
            oVar3 = oVarArr[1];
            oVar2 = oVarArr[0];
            oVar = oVarArr[2];
        }
        if (m23202a(oVar2, oVar3, oVar) < Utils.FLOAT_EPSILON) {
            C5766o oVar4 = oVar;
            oVar = oVar2;
            oVar2 = oVar4;
        }
        oVarArr[0] = oVar2;
        oVarArr[1] = oVar3;
        oVarArr[2] = oVar;
    }

    /* renamed from: c */
    public final float mo18901c() {
        return this.f18216a;
    }

    /* renamed from: d */
    public final float mo18902d() {
        return this.f18217b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5766o) {
            C5766o oVar = (C5766o) obj;
            if (this.f18216a == oVar.f18216a && this.f18217b == oVar.f18217b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f18216a) * 31) + Float.floatToIntBits(this.f18217b);
    }

    public final String toString() {
        return "(" + this.f18216a + ',' + this.f18217b + ')';
    }
}

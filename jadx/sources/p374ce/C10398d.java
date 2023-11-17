package p374ce;

import android.content.res.TypedArray;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import p458id.C15607g;

/* renamed from: ce.d */
public class C10398d {

    /* renamed from: a */
    private C10397c f29606a;

    /* renamed from: b */
    private C10397c f29607b;

    public C10398d(TypedArray typedArray) {
        C10397c cVar;
        C10397c cVar2;
        ArrayList arrayList = new ArrayList(3);
        int i = C15607g.f44334J;
        if (typedArray.hasValue(i)) {
            arrayList.add(C10399e.m37822i(typedArray.getInteger(i, 0)));
        }
        int i2 = C15607g.f44331G;
        if (typedArray.hasValue(i2)) {
            arrayList.add(C10399e.m37819f(typedArray.getInteger(i2, 0)));
        }
        int i3 = C15607g.f44333I;
        if (typedArray.hasValue(i3)) {
            arrayList.add(C10399e.m37821h(typedArray.getInteger(i3, 0)));
        }
        int i4 = C15607g.f44330F;
        if (typedArray.hasValue(i4)) {
            arrayList.add(C10399e.m37818e(typedArray.getInteger(i4, 0)));
        }
        int i5 = C15607g.f44332H;
        if (typedArray.hasValue(i5)) {
            arrayList.add(C10399e.m37820g(typedArray.getInteger(i5, 0)));
        }
        int i6 = C15607g.f44329E;
        if (typedArray.hasValue(i6)) {
            arrayList.add(C10399e.m37817d(typedArray.getInteger(i6, 0)));
        }
        int i7 = C15607g.f44327C;
        if (typedArray.hasValue(i7)) {
            arrayList.add(C10399e.m37815b(C10395a.m37802h(typedArray.getString(i7)), Utils.FLOAT_EPSILON));
        }
        if (typedArray.getBoolean(C15607g.f44335K, false)) {
            arrayList.add(C10399e.m37824k());
        }
        if (typedArray.getBoolean(C15607g.f44328D, false)) {
            arrayList.add(C10399e.m37816c());
        }
        if (!arrayList.isEmpty()) {
            cVar = C10399e.m37814a((C10397c[]) arrayList.toArray(new C10397c[0]));
        } else {
            cVar = C10399e.m37816c();
        }
        this.f29606a = cVar;
        ArrayList arrayList2 = new ArrayList(3);
        int i8 = C15607g.f44362f0;
        if (typedArray.hasValue(i8)) {
            arrayList2.add(C10399e.m37822i(typedArray.getInteger(i8, 0)));
        }
        int i9 = C15607g.f44356c0;
        if (typedArray.hasValue(i9)) {
            arrayList2.add(C10399e.m37819f(typedArray.getInteger(i9, 0)));
        }
        int i12 = C15607g.f44360e0;
        if (typedArray.hasValue(i12)) {
            arrayList2.add(C10399e.m37821h(typedArray.getInteger(i12, 0)));
        }
        int i13 = C15607g.f44354b0;
        if (typedArray.hasValue(i13)) {
            arrayList2.add(C10399e.m37818e(typedArray.getInteger(i13, 0)));
        }
        int i14 = C15607g.f44358d0;
        if (typedArray.hasValue(i14)) {
            arrayList2.add(C10399e.m37820g(typedArray.getInteger(i14, 0)));
        }
        int i15 = C15607g.f44352a0;
        if (typedArray.hasValue(i15)) {
            arrayList2.add(C10399e.m37817d(typedArray.getInteger(i15, 0)));
        }
        int i16 = C15607g.f44349Y;
        if (typedArray.hasValue(i16)) {
            arrayList2.add(C10399e.m37815b(C10395a.m37802h(typedArray.getString(i16)), Utils.FLOAT_EPSILON));
        }
        if (typedArray.getBoolean(C15607g.f44364g0, false)) {
            arrayList2.add(C10399e.m37824k());
        }
        if (typedArray.getBoolean(C15607g.f44350Z, false)) {
            arrayList2.add(C10399e.m37816c());
        }
        if (!arrayList2.isEmpty()) {
            cVar2 = C10399e.m37814a((C10397c[]) arrayList2.toArray(new C10397c[0]));
        } else {
            cVar2 = C10399e.m37816c();
        }
        this.f29607b = cVar2;
    }

    /* renamed from: a */
    public C10397c mo27067a() {
        return this.f29606a;
    }

    /* renamed from: b */
    public C10397c mo27068b() {
        return this.f29607b;
    }
}

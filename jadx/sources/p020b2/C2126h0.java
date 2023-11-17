package p020b2;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p033c2.C2224c;
import p048d2.C5807i;
import p294w1.C8733a;
import p319y1.C9025n;

/* renamed from: b2.h0 */
public class C2126h0 implements C2138n0 {

    /* renamed from: a */
    public static final C2126h0 f6280a = new C2126h0();

    /* renamed from: b */
    private static final C2224c.C2225a f6281b = C2224c.C2225a.m8482a("c", "v", "i", "o");

    private C2126h0() {
    }

    /* renamed from: b */
    public C9025n mo7008a(C2224c cVar, float f) {
        if (cVar.mo7158v() == C2224c.C2226b.BEGIN_ARRAY) {
            cVar.mo7152k();
        }
        cVar.mo7153n();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6281b);
            if (x == 0) {
                z = cVar.mo7146E0();
            } else if (x == 1) {
                list = C2143s.m8237f(cVar, f);
            } else if (x == 2) {
                list2 = C2143s.m8237f(cVar, f);
            } else if (x != 3) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                list3 = C2143s.m8237f(cVar, f);
            }
        }
        cVar.mo7155q();
        if (cVar.mo7158v() == C2224c.C2226b.END_ARRAY) {
            cVar.mo7154o();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C9025n(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                arrayList.add(new C8733a(C5807i.m23362a((PointF) list.get(i2), (PointF) list3.get(i2)), C5807i.m23362a(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                int i3 = size - 1;
                arrayList.add(new C8733a(C5807i.m23362a((PointF) list.get(i3), (PointF) list3.get(i3)), C5807i.m23362a(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new C9025n(pointF, z, arrayList);
        }
    }
}

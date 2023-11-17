package p020b2;

import android.graphics.Path;
import com.airbnb.lottie.C2325h;
import java.util.Collections;
import p033c2.C2224c;
import p061e2.C6013a;
import p307x1.C8935a;
import p307x1.C8938d;
import p319y1.C9026o;

/* renamed from: b2.i0 */
abstract class C2128i0 {

    /* renamed from: a */
    private static final C2224c.C2225a f6284a = C2224c.C2225a.m8482a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* renamed from: a */
    static C9026o m8205a(C2224c cVar, C2325h hVar) {
        Path.FillType fillType;
        C8938d dVar = null;
        String str = null;
        C8935a aVar = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6284a);
            if (x == 0) {
                str = cVar.mo7147I0();
            } else if (x == 1) {
                aVar = C2117d.m8181c(cVar, hVar);
            } else if (x == 2) {
                dVar = C2117d.m8186h(cVar, hVar);
            } else if (x == 3) {
                z = cVar.mo7146E0();
            } else if (x == 4) {
                i = cVar.mo7157t();
            } else if (x != 5) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                z2 = cVar.mo7146E0();
            }
        }
        if (dVar == null) {
            dVar = new C8938d(Collections.singletonList(new C6013a(100)));
        }
        C8938d dVar2 = dVar;
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new C9026o(str, z, fillType, aVar, dVar2, z2);
    }
}

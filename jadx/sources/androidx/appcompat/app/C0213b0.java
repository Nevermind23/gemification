package androidx.appcompat.app;

import androidx.core.p016os.C0918j;
import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: androidx.appcompat.app.b0 */
abstract class C0213b0 {
    /* renamed from: a */
    private static C0918j m671a(C0918j jVar, C0918j jVar2) {
        Locale locale;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < jVar.mo3367g() + jVar2.mo3367g(); i++) {
            if (i < jVar.mo3367g()) {
                locale = jVar.mo3364d(i);
            } else {
                locale = jVar2.mo3364d(i - jVar.mo3367g());
            }
            if (locale != null) {
                linkedHashSet.add(locale);
            }
        }
        return C0918j.m3349a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* renamed from: b */
    static C0918j m672b(C0918j jVar, C0918j jVar2) {
        if (jVar == null || jVar.mo3366f()) {
            return C0918j.m3352e();
        }
        return m671a(jVar, jVar2);
    }
}

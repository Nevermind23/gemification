package com.airbnb.lottie;

import android.support.p013v4.media.session.C0125b;
import androidx.collection.ArraySet;
import androidx.core.util.C1004d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p048d2.C5806h;

/* renamed from: com.airbnb.lottie.l0 */
public class C2335l0 {

    /* renamed from: a */
    private boolean f7325a = false;

    /* renamed from: b */
    private final Set f7326b = new ArraySet();

    /* renamed from: c */
    private final Map f7327c = new HashMap();

    /* renamed from: d */
    private final Comparator f7328d = new C2336a();

    /* renamed from: com.airbnb.lottie.l0$a */
    class C2336a implements Comparator {
        C2336a() {
        }

        /* renamed from: a */
        public int compare(C1004d dVar, C1004d dVar2) {
            float floatValue = ((Float) dVar.f3643b).floatValue();
            float floatValue2 = ((Float) dVar2.f3643b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public void mo7578a(String str, float f) {
        if (this.f7325a) {
            C5806h hVar = (C5806h) this.f7327c.get(str);
            if (hVar == null) {
                hVar = new C5806h();
                this.f7327c.put(str, hVar);
            }
            hVar.mo19009a(f);
            if (str.equals("__container")) {
                Iterator it = this.f7326b.iterator();
                if (it.hasNext()) {
                    C0125b.m366a(it.next());
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7579b(boolean z) {
        this.f7325a = z;
    }
}

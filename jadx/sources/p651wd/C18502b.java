package p651wd;

import android.graphics.Rect;
import p374ce.C10395a;
import p374ce.C10396b;

/* renamed from: wd.b */
public abstract class C18502b {
    /* renamed from: a */
    public static Rect m62989a(C10396b bVar, C10395a aVar) {
        int i;
        int e = bVar.mo27062e();
        int c = bVar.mo27060c();
        int i2 = 0;
        if (aVar.mo27053e(bVar, 5.0E-4f)) {
            return new Rect(0, 0, e, c);
        }
        if (C10395a.m37800f(e, c).mo27056j() > aVar.mo27056j()) {
            int round = Math.round(((float) c) * aVar.mo27056j());
            e = round;
            i2 = Math.round(((float) (e - round)) / 2.0f);
            i = 0;
        } else {
            int round2 = Math.round(((float) e) / aVar.mo27056j());
            i = Math.round(((float) (c - round2)) / 2.0f);
            c = round2;
        }
        return new Rect(i2, i, e + i2, c + i);
    }
}

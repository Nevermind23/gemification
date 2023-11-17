package p430gd;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p416fd.C12861p;

/* renamed from: gd.q */
public abstract class C12987q {

    /* renamed from: a */
    private static final String f38299a = "q";

    /* renamed from: gd.q$a */
    class C12988a implements Comparator {

        /* renamed from: d */
        final /* synthetic */ C12861p f38300d;

        C12988a(C12861p pVar) {
            this.f38300d = pVar;
        }

        /* renamed from: a */
        public int compare(C12861p pVar, C12861p pVar2) {
            return Float.compare(C12987q.this.mo33776c(pVar2, this.f38300d), C12987q.this.mo33776c(pVar, this.f38300d));
        }
    }

    /* renamed from: a */
    public List mo33783a(List list, C12861p pVar) {
        if (pVar == null) {
            return list;
        }
        Collections.sort(list, new C12988a(pVar));
        return list;
    }

    /* renamed from: b */
    public C12861p mo33784b(List list, C12861p pVar) {
        List a = mo33783a(list, pVar);
        String str = f38299a;
        Log.i(str, "Viewfinder size: " + pVar);
        Log.i(str, "Preview in order of preference: " + a);
        return (C12861p) a.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract float mo33776c(C12861p pVar, C12861p pVar2);

    /* renamed from: d */
    public abstract Rect mo33777d(C12861p pVar, C12861p pVar2);
}

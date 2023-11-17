package p051d5;

import android.support.p013v4.media.session.C0125b;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import p036c5.C2261a;
import p036c5.C2262b;

/* renamed from: d5.d */
public class C5834d implements C2262b {

    /* renamed from: b */
    private static C5834d f18355b;

    /* renamed from: c */
    private static final Integer f18356c = 100;

    /* renamed from: a */
    private Queue f18357a = new LinkedList();

    private C5834d() {
    }

    /* renamed from: c */
    public static synchronized C5834d m23506c() {
        C5834d dVar;
        synchronized (C5834d.class) {
            if (f18355b == null) {
                f18355b = new C5834d();
            }
            dVar = f18355b;
        }
        return dVar;
    }

    /* renamed from: d */
    private boolean m23507d() {
        return this.f18357a.size() >= f18356c.intValue();
    }

    /* renamed from: a */
    public boolean mo7302a(Collection collection) {
        if (collection != null) {
            this.f18357a.addAll(collection);
        }
        return m23507d();
    }

    /* renamed from: b */
    public C2261a mo7303b() {
        C0125b.m366a(this.f18357a.poll());
        return null;
    }

    public boolean isEmpty() {
        return this.f18357a.isEmpty();
    }
}

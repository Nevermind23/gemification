package p600sf;

import android.support.p013v4.media.session.C0125b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p530nf.C16918a;
import p530nf.C16920c;
import p572qf.C17497b;

/* renamed from: sf.e */
public final class C17775e implements C16918a, C16920c {

    /* renamed from: a */
    private final Set f49588a = new HashSet();

    /* renamed from: b */
    private boolean f49589b = false;

    /* renamed from: a */
    public void mo45359a() {
        C17497b.m60997a();
        this.f49589b = true;
        Iterator it = this.f49588a.iterator();
        if (it.hasNext()) {
            C0125b.m366a(it.next());
            throw null;
        }
    }
}

package p558pf;

import android.content.Context;
import java.util.Set;
import p530nf.C16919b;
import p627uf.C18156d;

/* renamed from: pf.a */
public abstract class C17343a {

    /* renamed from: pf.a$a */
    public interface C17344a {
        /* renamed from: k */
        Set mo32872k();
    }

    /* renamed from: a */
    public static boolean m60707a(Context context) {
        boolean z;
        Set k = ((C17344a) C16919b.m59518a(context, C17344a.class)).mo32872k();
        if (k.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        C18156d.m62249d(z, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (k.isEmpty()) {
            return true;
        }
        return ((Boolean) k.iterator().next()).booleanValue();
    }
}

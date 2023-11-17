package p267u0;

import kotlin.jvm.internal.C41536l;

/* renamed from: u0.y */
public final class C8520y {

    /* renamed from: a */
    public static final C8520y f24218a = new C8520y();

    private C8520y() {
    }

    /* renamed from: a */
    public static final String m31900a(String str) {
        C41536l.m120489i(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}

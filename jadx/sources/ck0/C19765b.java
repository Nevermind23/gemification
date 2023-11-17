package ck0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ck0.b */
public final class C19765b {

    /* renamed from: a */
    private final String f54141a;

    public C19765b(String str) {
        C41536l.m120489i(str, "walletId");
        this.f54141a = str;
    }

    /* renamed from: a */
    public final String mo48008a() {
        return this.f54141a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19765b) && C41536l.m120484d(this.f54141a, ((C19765b) obj).f54141a);
    }

    public int hashCode() {
        return this.f54141a.hashCode();
    }

    public String toString() {
        String str = this.f54141a;
        return "WalletId(walletId=" + str + ")";
    }
}

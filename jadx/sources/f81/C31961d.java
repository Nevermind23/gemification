package f81;

import android.content.Intent;
import kotlin.jvm.internal.C41536l;

/* renamed from: f81.d */
public final class C31961d {

    /* renamed from: a */
    private final Intent f78741a;

    /* renamed from: b */
    private final boolean f78742b;

    /* renamed from: c */
    private final boolean f78743c;

    public C31961d(Intent intent, boolean z, boolean z2) {
        C41536l.m120489i(intent, "intent");
        this.f78741a = intent;
        this.f78742b = z;
        this.f78743c = z2;
    }

    /* renamed from: a */
    public final Intent mo72452a() {
        return this.f78741a;
    }

    /* renamed from: b */
    public final boolean mo72453b() {
        return this.f78742b;
    }

    /* renamed from: c */
    public final boolean mo72454c() {
        return this.f78743c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31961d)) {
            return false;
        }
        C31961d dVar = (C31961d) obj;
        return C41536l.m120484d(this.f78741a, dVar.f78741a) && this.f78742b == dVar.f78742b && this.f78743c == dVar.f78743c;
    }

    public int hashCode() {
        int hashCode = this.f78741a.hashCode() * 31;
        boolean z = this.f78742b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f78743c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        Intent intent = this.f78741a;
        boolean z = this.f78742b;
        boolean z2 = this.f78743c;
        return "PushProcessData(intent=" + intent + ", showAuthWindow=" + z + ", isAuthorized=" + z2 + ")";
    }
}

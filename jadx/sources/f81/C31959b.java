package f81;

import android.content.Intent;
import kotlin.jvm.internal.C41536l;

/* renamed from: f81.b */
public final class C31959b {

    /* renamed from: a */
    private final Intent f78740a;

    public C31959b(Intent intent) {
        this.f78740a = intent;
    }

    /* renamed from: a */
    public final Intent mo72441a() {
        return this.f78740a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31959b) && C41536l.m120484d(this.f78740a, ((C31959b) obj).f78740a);
    }

    public int hashCode() {
        Intent intent = this.f78740a;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }

    public String toString() {
        Intent intent = this.f78740a;
        return "IntentContainer(intent=" + intent + ")";
    }
}

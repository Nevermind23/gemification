package p342j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: j$.time.zone.f */
final class C9354f extends C9355g {

    /* renamed from: c */
    private final Set f25918c;

    C9354f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String add : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(add);
        }
        this.f25918c = Collections.unmodifiableSet(linkedHashSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C9351c mo25166b(String str) {
        if (this.f25918c.contains(str)) {
            return new C9351c(TimeZone.getTimeZone(str));
        }
        throw new C9352d("Not a built-in time zone: " + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Set mo25167c() {
        return this.f25918c;
    }
}

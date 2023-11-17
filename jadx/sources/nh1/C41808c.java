package nh1;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;

/* renamed from: nh1.c */
public final class C41808c implements C41806a {

    /* renamed from: a */
    private final String f98144a;

    public C41808c(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f98144a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C41808c) && C41536l.m120484d(getValue(), ((C41808c) obj).getValue());
        }
        return true;
    }

    public String getValue() {
        return this.f98144a;
    }

    public int hashCode() {
        String value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    public String toString() {
        return getValue();
    }
}

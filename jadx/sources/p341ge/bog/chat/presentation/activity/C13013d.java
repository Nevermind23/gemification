package p341ge.bog.chat.presentation.activity;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.chat.presentation.activity.d */
public final class C13013d {

    /* renamed from: a */
    private final String f38367a;

    /* renamed from: b */
    private final String f38368b;

    /* renamed from: c */
    private final String f38369c;

    /* renamed from: d */
    private final String f38370d;

    public C13013d(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, C11769i.C11770a.f34149l);
        C41536l.m120489i(str3, "name");
        C41536l.m120489i(str4, "extension");
        this.f38367a = str;
        this.f38368b = str2;
        this.f38369c = str3;
        this.f38370d = str4;
    }

    /* renamed from: a */
    public final String mo34241a() {
        return this.f38370d;
    }

    /* renamed from: b */
    public final String mo34242b() {
        return this.f38369c;
    }

    /* renamed from: c */
    public final String mo34243c() {
        return this.f38367a;
    }

    /* renamed from: d */
    public final String mo34244d() {
        return this.f38368b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13013d)) {
            return false;
        }
        C13013d dVar = (C13013d) obj;
        return C41536l.m120484d(this.f38367a, dVar.f38367a) && C41536l.m120484d(this.f38368b, dVar.f38368b) && C41536l.m120484d(this.f38369c, dVar.f38369c) && C41536l.m120484d(this.f38370d, dVar.f38370d);
    }

    public int hashCode() {
        return (((((this.f38367a.hashCode() * 31) + this.f38368b.hashCode()) * 31) + this.f38369c.hashCode()) * 31) + this.f38370d.hashCode();
    }

    public String toString() {
        String str = this.f38367a;
        String str2 = this.f38368b;
        String str3 = this.f38369c;
        String str4 = this.f38370d;
        return "BotFileUiModel(title=" + str + ", url=" + str2 + ", name=" + str3 + ", extension=" + str4 + ")";
    }
}

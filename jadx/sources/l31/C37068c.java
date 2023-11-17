package l31;

import j31.C36726b;
import kotlin.jvm.internal.C41536l;

/* renamed from: l31.c */
public final class C37068c {

    /* renamed from: a */
    private final C37069d f89228a;

    /* renamed from: b */
    private final C37067b f89229b;

    /* renamed from: c */
    private final C36726b f89230c;

    /* renamed from: d */
    private final String f89231d;

    public C37068c(C37069d dVar, C37067b bVar, C36726b bVar2, String str) {
        C41536l.m120489i(dVar, "buttonType");
        C41536l.m120489i(str, "dictionaryKey");
        this.f89228a = dVar;
        this.f89229b = bVar;
        this.f89230c = bVar2;
        this.f89231d = str;
    }

    /* renamed from: a */
    public final C37069d mo90001a() {
        return this.f89228a;
    }

    /* renamed from: b */
    public final C36726b mo90002b() {
        return this.f89230c;
    }

    /* renamed from: c */
    public final String mo90003c() {
        return this.f89231d;
    }

    /* renamed from: d */
    public final C37067b mo90004d() {
        return this.f89229b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37068c)) {
            return false;
        }
        C37068c cVar = (C37068c) obj;
        return this.f89228a == cVar.f89228a && C41536l.m120484d(this.f89229b, cVar.f89229b) && C41536l.m120484d(this.f89230c, cVar.f89230c) && C41536l.m120484d(this.f89231d, cVar.f89231d);
    }

    public int hashCode() {
        int hashCode = this.f89228a.hashCode() * 31;
        C37067b bVar = this.f89229b;
        int i = 0;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C36726b bVar2 = this.f89230c;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f89231d.hashCode();
    }

    public String toString() {
        C37069d dVar = this.f89228a;
        C37067b bVar = this.f89229b;
        C36726b bVar2 = this.f89230c;
        String str = this.f89231d;
        return "PopupAction(buttonType=" + dVar + ", firebaseClickEventName=" + bVar + ", deepLink=" + bVar2 + ", dictionaryKey=" + str + ")";
    }
}

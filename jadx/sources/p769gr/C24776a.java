package p769gr;

import j31.C36726b;
import kotlin.jvm.internal.C41536l;
import l31.C37067b;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: gr.a */
public final class C24776a {

    /* renamed from: a */
    private final String f63673a;

    /* renamed from: b */
    private final String f63674b;

    /* renamed from: c */
    private final String f63675c;

    /* renamed from: d */
    private final Image f63676d;

    /* renamed from: e */
    private final String f63677e;

    /* renamed from: f */
    private final C36726b f63678f;

    /* renamed from: g */
    private final String f63679g;

    /* renamed from: h */
    private final boolean f63680h;

    /* renamed from: i */
    private final C37067b f63681i;

    /* renamed from: j */
    private final C37067b f63682j;

    public C24776a(String str, String str2, String str3, Image image, String str4, C36726b bVar, String str5, boolean z, C37067b bVar2, C37067b bVar3) {
        C41536l.m120489i(str, "popupType");
        C41536l.m120489i(str2, "title");
        C41536l.m120489i(str3, "infoText");
        C41536l.m120489i(image, "icon");
        C41536l.m120489i(str4, "positiveButtonTitle");
        C41536l.m120489i(str5, "negativeButtonTitle");
        this.f63673a = str;
        this.f63674b = str2;
        this.f63675c = str3;
        this.f63676d = image;
        this.f63677e = str4;
        this.f63678f = bVar;
        this.f63679g = str5;
        this.f63680h = z;
        this.f63681i = bVar2;
        this.f63682j = bVar3;
    }

    /* renamed from: a */
    public final Image mo63178a() {
        return this.f63676d;
    }

    /* renamed from: b */
    public final String mo63179b() {
        return this.f63675c;
    }

    /* renamed from: c */
    public final C37067b mo63180c() {
        return this.f63682j;
    }

    /* renamed from: d */
    public final String mo63181d() {
        return this.f63679g;
    }

    /* renamed from: e */
    public final String mo63182e() {
        return this.f63673a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24776a)) {
            return false;
        }
        C24776a aVar = (C24776a) obj;
        return C41536l.m120484d(this.f63673a, aVar.f63673a) && C41536l.m120484d(this.f63674b, aVar.f63674b) && C41536l.m120484d(this.f63675c, aVar.f63675c) && C41536l.m120484d(this.f63676d, aVar.f63676d) && C41536l.m120484d(this.f63677e, aVar.f63677e) && C41536l.m120484d(this.f63678f, aVar.f63678f) && C41536l.m120484d(this.f63679g, aVar.f63679g) && this.f63680h == aVar.f63680h && C41536l.m120484d(this.f63681i, aVar.f63681i) && C41536l.m120484d(this.f63682j, aVar.f63682j);
    }

    /* renamed from: f */
    public final C36726b mo63184f() {
        return this.f63678f;
    }

    /* renamed from: g */
    public final C37067b mo63185g() {
        return this.f63681i;
    }

    /* renamed from: h */
    public final String mo63186h() {
        return this.f63677e;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f63673a.hashCode() * 31) + this.f63674b.hashCode()) * 31) + this.f63675c.hashCode()) * 31) + this.f63676d.hashCode()) * 31) + this.f63677e.hashCode()) * 31;
        C36726b bVar = this.f63678f;
        int i = 0;
        int hashCode2 = (((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f63679g.hashCode()) * 31;
        boolean z = this.f63680h;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        C37067b bVar2 = this.f63681i;
        int hashCode3 = (i2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        C37067b bVar3 = this.f63682j;
        if (bVar3 != null) {
            i = bVar3.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: i */
    public final String mo63188i() {
        return this.f63674b;
    }

    public String toString() {
        String str = this.f63673a;
        String str2 = this.f63674b;
        String str3 = this.f63675c;
        Image image = this.f63676d;
        String str4 = this.f63677e;
        C36726b bVar = this.f63678f;
        String str5 = this.f63679g;
        boolean z = this.f63680h;
        C37067b bVar2 = this.f63681i;
        C37067b bVar3 = this.f63682j;
        return "CommonPopupUiModel(popupType=" + str + ", title=" + str2 + ", infoText=" + str3 + ", icon=" + image + ", positiveButtonTitle=" + str4 + ", positiveButtonDeepLink=" + bVar + ", negativeButtonTitle=" + str5 + ", cancelable=" + z + ", positiveButtonFirebaseEvent=" + bVar2 + ", negativeButtonFirebaseEvent=" + bVar3 + ")";
    }
}

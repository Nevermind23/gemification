package si0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: si0.a */
public final class C28228a {

    /* renamed from: a */
    private final long f71586a;

    /* renamed from: b */
    private final Image f71587b;

    /* renamed from: c */
    private final String f71588c;

    /* renamed from: d */
    private final boolean f71589d;

    public C28228a(long j, Image image, String str, boolean z) {
        C41536l.m120489i(str, "text");
        this.f71586a = j;
        this.f71587b = image;
        this.f71588c = str;
        this.f71589d = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C28228a m86764b(C28228a aVar, long j, Image image, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.f71586a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            image = aVar.f71587b;
        }
        Image image2 = image;
        if ((i & 4) != 0) {
            str = aVar.f71588c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = aVar.f71589d;
        }
        return aVar.mo67755a(j2, image2, str2, z);
    }

    /* renamed from: a */
    public final C28228a mo67755a(long j, Image image, String str, boolean z) {
        C41536l.m120489i(str, "text");
        return new C28228a(j, image, str, z);
    }

    /* renamed from: c */
    public final Image mo67756c() {
        return this.f71587b;
    }

    /* renamed from: d */
    public final long mo67757d() {
        return this.f71586a;
    }

    /* renamed from: e */
    public final String mo67758e() {
        return this.f71588c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28228a)) {
            return false;
        }
        C28228a aVar = (C28228a) obj;
        return this.f71586a == aVar.f71586a && C41536l.m120484d(this.f71587b, aVar.f71587b) && C41536l.m120484d(this.f71588c, aVar.f71588c) && this.f71589d == aVar.f71589d;
    }

    /* renamed from: f */
    public final boolean mo67760f() {
        return this.f71589d;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f71586a) * 31;
        Image image = this.f71587b;
        int hashCode = (((a + (image == null ? 0 : image.hashCode())) * 31) + this.f71588c.hashCode()) * 31;
        boolean z = this.f71589d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        long j = this.f71586a;
        Image image = this.f71587b;
        String str = this.f71588c;
        boolean z = this.f71589d;
        return "GiftCardFilterUiModel(id=" + j + ", icon=" + image + ", text=" + str + ", isChosen=" + z + ")";
    }
}

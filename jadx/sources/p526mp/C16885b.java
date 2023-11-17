package p526mp;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: mp.b */
public final class C16885b {

    /* renamed from: a */
    private final String f47198a;

    /* renamed from: b */
    private final String f47199b;

    /* renamed from: c */
    private final Image f47200c;

    /* renamed from: d */
    private final String f47201d;

    /* renamed from: e */
    private final String f47202e;

    public C16885b(String str, String str2, Image image, String str3, String str4) {
        C41536l.m120489i(image, "icon");
        this.f47198a = str;
        this.f47199b = str2;
        this.f47200c = image;
        this.f47201d = str3;
        this.f47202e = str4;
    }

    /* renamed from: a */
    public final String mo44021a() {
        return this.f47202e;
    }

    /* renamed from: b */
    public final Image mo44022b() {
        return this.f47200c;
    }

    /* renamed from: c */
    public final String mo44023c() {
        return this.f47201d;
    }

    /* renamed from: d */
    public final String mo44024d() {
        return this.f47199b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16885b)) {
            return false;
        }
        C16885b bVar = (C16885b) obj;
        return C41536l.m120484d(this.f47198a, bVar.f47198a) && C41536l.m120484d(this.f47199b, bVar.f47199b) && C41536l.m120484d(this.f47200c, bVar.f47200c) && C41536l.m120484d(this.f47201d, bVar.f47201d) && C41536l.m120484d(this.f47202e, bVar.f47202e);
    }

    public int hashCode() {
        String str = this.f47198a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f47199b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f47200c.hashCode()) * 31;
        String str3 = this.f47201d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f47202e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f47198a;
        String str2 = this.f47199b;
        Image image = this.f47200c;
        String str3 = this.f47201d;
        String str4 = this.f47202e;
        return "DebitCardUiModel(cardNameKey=" + str + ", typeName=" + str2 + ", icon=" + image + ", subProductCode=" + str3 + ", cardPriceValue=" + str4 + ")";
    }
}

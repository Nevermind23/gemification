package p455ho;

import j31.C36725a;
import kotlin.jvm.internal.C41536l;

/* renamed from: ho.e */
public final class C15551e {

    /* renamed from: a */
    private final String f44145a;

    /* renamed from: b */
    private final String f44146b;

    /* renamed from: c */
    private final C36725a f44147c;

    /* renamed from: d */
    private final String f44148d;

    /* renamed from: e */
    private final String f44149e;

    public C15551e(String str, String str2, C36725a aVar, String str3, String str4) {
        this.f44145a = str;
        this.f44146b = str2;
        this.f44147c = aVar;
        this.f44148d = str3;
        this.f44149e = str4;
    }

    /* renamed from: a */
    public final String mo42731a() {
        return this.f44145a;
    }

    /* renamed from: b */
    public final String mo42732b() {
        return this.f44149e;
    }

    /* renamed from: c */
    public final C36725a mo42733c() {
        return this.f44147c;
    }

    /* renamed from: d */
    public final String mo42734d() {
        return this.f44148d;
    }

    /* renamed from: e */
    public final String mo42735e() {
        return this.f44146b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15551e)) {
            return false;
        }
        C15551e eVar = (C15551e) obj;
        return C41536l.m120484d(this.f44145a, eVar.f44145a) && C41536l.m120484d(this.f44146b, eVar.f44146b) && C41536l.m120484d(this.f44147c, eVar.f44147c) && C41536l.m120484d(this.f44148d, eVar.f44148d) && C41536l.m120484d(this.f44149e, eVar.f44149e);
    }

    public int hashCode() {
        String str = this.f44145a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44146b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C36725a aVar = this.f44147c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.f44148d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f44149e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f44145a;
        String str2 = this.f44146b;
        C36725a aVar = this.f44147c;
        String str3 = this.f44148d;
        String str4 = this.f44149e;
        return "DebitCard(cardNameKey=" + str + ", typeName=" + str2 + ", cardSmallImage=" + aVar + ", subProductCode=" + str3 + ", cardPriceValue=" + str4 + ")";
    }
}

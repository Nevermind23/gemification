package p419fg;

import kotlin.jvm.internal.C41536l;

/* renamed from: fg.c */
public final class C12874c {

    /* renamed from: a */
    private final String f38025a;

    /* renamed from: b */
    private final Integer f38026b;

    /* renamed from: c */
    private final Integer f38027c;

    /* renamed from: d */
    private final String f38028d;

    public C12874c(String str, Integer num, Integer num2, String str2) {
        this.f38025a = str;
        this.f38026b = num;
        this.f38027c = num2;
        this.f38028d = str2;
    }

    /* renamed from: a */
    public final String mo33566a() {
        return this.f38025a;
    }

    /* renamed from: b */
    public final Integer mo33567b() {
        return this.f38026b;
    }

    /* renamed from: c */
    public final String mo33568c() {
        return this.f38028d;
    }

    /* renamed from: d */
    public final Integer mo33569d() {
        return this.f38027c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12874c)) {
            return false;
        }
        C12874c cVar = (C12874c) obj;
        return C41536l.m120484d(this.f38025a, cVar.f38025a) && C41536l.m120484d(this.f38026b, cVar.f38026b) && C41536l.m120484d(this.f38027c, cVar.f38027c) && C41536l.m120484d(this.f38028d, cVar.f38028d);
    }

    public int hashCode() {
        String str = this.f38025a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f38026b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f38027c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f38028d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f38025a;
        Integer num = this.f38026b;
        Integer num2 = this.f38027c;
        String str2 = this.f38028d;
        return "ChatUserInfo(chatUserId=" + str + ", conversationId=" + num + ", participantId=" + num2 + ", nickname=" + str2 + ")";
    }
}

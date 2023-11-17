package p341ge.bog.chat.presentation.activity;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.chat.presentation.activity.f */
public final class C13017f {

    /* renamed from: a */
    private final String f38377a;

    /* renamed from: b */
    private final String f38378b;

    public C13017f(String str, String str2) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "payload");
        this.f38377a = str;
        this.f38378b = str2;
    }

    /* renamed from: a */
    public final String mo34256a() {
        return this.f38378b;
    }

    /* renamed from: b */
    public final String mo34257b() {
        return this.f38377a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13017f)) {
            return false;
        }
        C13017f fVar = (C13017f) obj;
        return C41536l.m120484d(this.f38377a, fVar.f38377a) && C41536l.m120484d(this.f38378b, fVar.f38378b);
    }

    public int hashCode() {
        return (this.f38377a.hashCode() * 31) + this.f38378b.hashCode();
    }

    public String toString() {
        String str = this.f38377a;
        String str2 = this.f38378b;
        return "ChoiceUi(title=" + str + ", payload=" + str2 + ")";
    }
}

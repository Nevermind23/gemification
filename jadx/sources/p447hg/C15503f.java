package p447hg;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.presentation.FileTooBigException;

/* renamed from: hg.f */
public final class C15503f {

    /* renamed from: e */
    public static final C15504a f44009e = new C15504a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final byte[] f44010a;

    /* renamed from: b */
    private final String f44011b;

    /* renamed from: c */
    private final Long f44012c;

    /* renamed from: d */
    private final String f44013d;

    /* renamed from: hg.f$a */
    public static final class C15504a {
        private C15504a() {
        }

        public /* synthetic */ C15504a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15503f mo42615a(Context context, Uri uri, Long l) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(uri, "uri");
            C15502e eVar = C15502e.f44008a;
            C15501d c = eVar.mo42605c(context, uri);
            String a = c.mo42598a();
            Long b = c.mo42599b();
            if (l == null || b == null || b.longValue() <= l.longValue()) {
                byte[] e = eVar.mo42607e(context, uri);
                if (l == null || b != null || ((long) e.length) <= l.longValue()) {
                    return new C15503f(e, a, b, eVar.mo42606d(context, uri));
                }
                throw new FileTooBigException();
            }
            throw new FileTooBigException();
        }
    }

    public C15503f(byte[] bArr, String str, Long l, String str2) {
        C41536l.m120489i(bArr, "content");
        this.f44010a = bArr;
        this.f44011b = str;
        this.f44012c = l;
        this.f44013d = str2;
    }

    /* renamed from: a */
    public final byte[] mo42608a() {
        return this.f44010a;
    }

    /* renamed from: b */
    public final String mo42609b() {
        return this.f44013d;
    }

    /* renamed from: c */
    public final String mo42610c() {
        return this.f44011b;
    }

    /* renamed from: d */
    public final Long mo42611d() {
        return this.f44012c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15503f)) {
            return false;
        }
        C15503f fVar = (C15503f) obj;
        return C41536l.m120484d(this.f44010a, fVar.f44010a) && C41536l.m120484d(this.f44011b, fVar.f44011b) && C41536l.m120484d(this.f44012c, fVar.f44012c) && C41536l.m120484d(this.f44013d, fVar.f44013d);
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.f44010a) * 31;
        String str = this.f44011b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f44012c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f44013d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String arrays = Arrays.toString(this.f44010a);
        String str = this.f44011b;
        Long l = this.f44012c;
        String str2 = this.f44013d;
        return "FileWithMetadata(content=" + arrays + ", name=" + str + ", size=" + l + ", mimeType=" + str2 + ")";
    }
}

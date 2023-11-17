package dg1;

import cf1.C40407d;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.d0 */
public abstract class C40680d0 {
    /* renamed from: a */
    public static final byte[] m117694a(String str) {
        C41536l.m120489i(str, "<this>");
        byte[] bytes = str.getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final String m117695b(byte[] bArr) {
        C41536l.m120489i(bArr, "<this>");
        return new String(bArr, C40407d.f95989b);
    }
}

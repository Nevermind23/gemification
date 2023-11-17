package gb1;

import android.util.Base64;
import ba1.C10196h;
import ba1.C10198h0;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C41536l;
import p088g3.C6204a;
import p217q2.C7842i;
import ue1.C43075l;

/* renamed from: gb1.w */
public abstract class C32393w {
    /* renamed from: a */
    public static final void m95660a(C6204a.C6205a aVar, C7842i iVar, C10196h hVar) {
        C6204a.C6205a aVar2 = aVar;
        C10196h hVar2 = hVar;
        C41536l.m120489i(aVar2, "<this>");
        C41536l.m120489i(iVar, "query");
        C41536l.m120489i(hVar2, "keyManager");
        String a = C10198h0.f28253a.mo26766a();
        StringBuilder sb = new StringBuilder();
        String marshal = iVar.variables().marshal();
        StringBuilder sb2 = new StringBuilder();
        int length = marshal.length();
        for (int i = 0; i < length; i++) {
            char charAt = marshal.charAt(i);
            if (true ^ C40405b.m116978c(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        C41536l.m120488h(sb3, "filterTo(StringBuilder(), predicate).toString()");
        sb.append(sb3);
        StringBuilder sb4 = new StringBuilder();
        int length2 = a.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt2 = a.charAt(i2);
            if (!C40405b.m116978c(charAt2)) {
                sb4.append(charAt2);
            }
        }
        String sb5 = sb4.toString();
        C41536l.m120488h(sb5, "filterTo(StringBuilder(), predicate).toString()");
        sb.append(sb5);
        String sb6 = sb.toString();
        C41536l.m120488h(sb6, "StringBuilder()\n        …() })\n        .toString()");
        char[] charArray = sb6.toCharArray();
        C41536l.m120488h(charArray, "this as java.lang.String).toCharArray()");
        String g0 = C41358y.m120017g0(C41333m.m119785L(charArray), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        aVar2.mo19788a("X-Signature-Version", "1");
        aVar2.mo19788a("X-Date", a);
        Charset defaultCharset = Charset.defaultCharset();
        C41536l.m120488h(defaultCharset, "defaultCharset()");
        byte[] bytes = g0.getBytes(defaultCharset);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        String d = m95663d(hVar2.mo26765e(bytes), 0, 1, (Object) null);
        StringBuilder sb7 = new StringBuilder();
        int length3 = d.length();
        for (int i3 = 0; i3 < length3; i3++) {
            char charAt3 = d.charAt(i3);
            if (!C40405b.m116978c(charAt3)) {
                sb7.append(charAt3);
            }
        }
        String sb8 = sb7.toString();
        C41536l.m120488h(sb8, "filterTo(StringBuilder(), predicate).toString()");
        aVar2.mo19788a("X-Signature", sb8);
    }

    /* renamed from: b */
    public static final String m95661b(String str) {
        boolean z;
        C41536l.m120489i(str, "<this>");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(charAt));
        String substring = str.substring(1);
        C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    /* renamed from: c */
    public static final String m95662c(byte[] bArr, int i) {
        C41536l.m120489i(bArr, "<this>");
        String encodeToString = Base64.encodeToString(bArr, i);
        C41536l.m120488h(encodeToString, "encodeToString(this, flags)");
        return encodeToString;
    }

    /* renamed from: d */
    public static /* synthetic */ String m95663d(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return m95662c(bArr, i);
    }

    /* renamed from: e */
    public static final boolean m95664e(String str) {
        return C41536l.m120484d(str, "Y");
    }
}

package uf1;

import java.net.ProtocolException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41864a0;

/* renamed from: uf1.k */
public final class C43099k {

    /* renamed from: d */
    public static final C43100a f100540d = new C43100a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C41864a0 f100541a;

    /* renamed from: b */
    public final int f100542b;

    /* renamed from: c */
    public final String f100543c;

    /* renamed from: uf1.k$a */
    public static final class C43100a {
        private C43100a() {
        }

        public /* synthetic */ C43100a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43099k mo101674a(String str) {
            int i;
            C41864a0 a0Var;
            String str2;
            C41536l.m120489i(str, "statusLine");
            if (C40439w.m117109H(str, "HTTP/1.", false, 2, (Object) null)) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(C41536l.m120497q("Unexpected status line: ", str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    a0Var = C41864a0.HTTP_1_0;
                } else if (charAt == 1) {
                    a0Var = C41864a0.HTTP_1_1;
                } else {
                    throw new ProtocolException(C41536l.m120497q("Unexpected status line: ", str));
                }
            } else if (C40439w.m117109H(str, "ICY ", false, 2, (Object) null)) {
                a0Var = C41864a0.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException(C41536l.m120497q("Unexpected status line: ", str));
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        C41536l.m120488h(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(C41536l.m120497q("Unexpected status line: ", str));
                    }
                    return new C43099k(a0Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(C41536l.m120497q("Unexpected status line: ", str));
                }
            } else {
                throw new ProtocolException(C41536l.m120497q("Unexpected status line: ", str));
            }
        }
    }

    public C43099k(C41864a0 a0Var, int i, String str) {
        C41536l.m120489i(a0Var, "protocol");
        C41536l.m120489i(str, "message");
        this.f100541a = a0Var;
        this.f100542b = i;
        this.f100543c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f100541a == C41864a0.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f100542b);
        sb.append(' ');
        sb.append(this.f100543c);
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

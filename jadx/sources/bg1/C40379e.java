package bg1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41928u;
import pf1.C42197d;

/* renamed from: bg1.e */
public final class C40379e {

    /* renamed from: g */
    public static final C40380a f95926g = new C40380a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final boolean f95927a;

    /* renamed from: b */
    public final Integer f95928b;

    /* renamed from: c */
    public final boolean f95929c;

    /* renamed from: d */
    public final Integer f95930d;

    /* renamed from: e */
    public final boolean f95931e;

    /* renamed from: f */
    public final boolean f95932f;

    /* renamed from: bg1.e$a */
    public static final class C40380a {
        private C40380a() {
        }

        public /* synthetic */ C40380a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40379e mo94435a(C41928u uVar) {
            String str;
            C41928u uVar2 = uVar;
            C41536l.m120489i(uVar2, "responseHeaders");
            int size = uVar.size();
            int i = 0;
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            while (i < size) {
                int i2 = i + 1;
                if (C40439w.m117115s(uVar2.mo96926c(i), "Sec-WebSocket-Extensions", true)) {
                    String n = uVar2.mo96932n(i);
                    int i3 = 0;
                    while (i3 < n.length()) {
                        int r = C42197d.m122552r(n, ',', i3, 0, 4, (Object) null);
                        int p = C42197d.m122550p(n, ';', i3, r);
                        String Y = C42197d.m122531Y(n, i3, p);
                        int i4 = p + 1;
                        if (C40439w.m117115s(Y, "permessage-deflate", true)) {
                            if (z) {
                                z4 = true;
                            }
                            i3 = i4;
                            while (i3 < r) {
                                int p2 = C42197d.m122550p(n, ';', i3, r);
                                int p3 = C42197d.m122550p(n, '=', i3, p2);
                                String Y2 = C42197d.m122531Y(n, i3, p3);
                                if (p3 < p2) {
                                    str = C40440x.m117174p0(C42197d.m122531Y(n, p3 + 1, p2), "\"");
                                } else {
                                    str = null;
                                }
                                i3 = p2 + 1;
                                if (C40439w.m117115s(Y2, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    if (str == null) {
                                        num = null;
                                    } else {
                                        num = C40438v.m117098j(str);
                                    }
                                    if (num != null) {
                                    }
                                } else if (C40439w.m117115s(Y2, "client_no_context_takeover", true)) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    if (str != null) {
                                        z4 = true;
                                    }
                                    z2 = true;
                                } else if (C40439w.m117115s(Y2, "server_max_window_bits", true)) {
                                    if (num2 != null) {
                                        z4 = true;
                                    }
                                    if (str == null) {
                                        num2 = null;
                                    } else {
                                        num2 = C40438v.m117098j(str);
                                    }
                                    if (num2 != null) {
                                    }
                                } else if (C40439w.m117115s(Y2, "server_no_context_takeover", true)) {
                                    if (z3) {
                                        z4 = true;
                                    }
                                    if (str != null) {
                                        z4 = true;
                                    }
                                    z3 = true;
                                }
                                z4 = true;
                            }
                            z = true;
                        } else {
                            i3 = i4;
                            z4 = true;
                        }
                    }
                }
                i = i2;
            }
            return new C40379e(z, num, z2, num2, z3, z4);
        }
    }

    public C40379e(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.f95927a = z;
        this.f95928b = num;
        this.f95929c = z2;
        this.f95930d = num2;
        this.f95931e = z3;
        this.f95932f = z4;
    }

    /* renamed from: a */
    public final boolean mo94431a(boolean z) {
        if (z) {
            return this.f95929c;
        }
        return this.f95931e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40379e)) {
            return false;
        }
        C40379e eVar = (C40379e) obj;
        return this.f95927a == eVar.f95927a && C41536l.m120484d(this.f95928b, eVar.f95928b) && this.f95929c == eVar.f95929c && C41536l.m120484d(this.f95930d, eVar.f95930d) && this.f95931e == eVar.f95931e && this.f95932f == eVar.f95932f;
    }

    public int hashCode() {
        boolean z = this.f95927a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Integer num = this.f95928b;
        int i2 = 0;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z3 = this.f95929c;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode + (z3 ? 1 : 0)) * 31;
        Integer num2 = this.f95930d;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        boolean z4 = this.f95931e;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f95932f;
        if (!z5) {
            z2 = z5;
        }
        return i5 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f95927a + ", clientMaxWindowBits=" + this.f95928b + ", clientNoContextTakeover=" + this.f95929c + ", serverMaxWindowBits=" + this.f95930d + ", serverNoContextTakeover=" + this.f95931e + ", unknownValues=" + this.f95932f + ')';
    }
}

package p523mm;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p509lm.C16586a;

/* renamed from: mm.c */
public final class C16730c {

    /* renamed from: a */
    private final C16586a f46973a;

    public C16730c(C16586a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f46973a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C40734b m59153b(C16730c cVar, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        if ((i & 1) != 0) {
            str = "";
        }
        String str9 = str;
        if ((i & 16) != 0) {
            str7 = null;
        } else {
            str7 = str5;
        }
        if ((i & 32) != 0) {
            str8 = null;
        } else {
            str8 = str6;
        }
        return cVar.mo43859a(str9, str2, str3, str4, str7, str8);
    }

    /* renamed from: a */
    public final C40734b mo43859a(String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "customerId");
        C41536l.m120489i(str2, "cardDeliveryAddress");
        C41536l.m120489i(str3, "pointValue");
        return this.f46973a.mo42415o4(str2, str4, str3, str5, str6);
    }
}

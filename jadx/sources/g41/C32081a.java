package g41;

import android.os.Bundle;
import com.salesforce.marketingcloud.UrlHandler;
import g31.C32054a;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p380ck.C10463g;
import p380ck.C10464h;

/* renamed from: g41.a */
public final class C32081a {

    /* renamed from: a */
    public static final C32081a f78922a = new C32081a();

    private C32081a() {
    }

    /* renamed from: a */
    public static final void m94499a(C32054a aVar, C10463g gVar, String str, String str2) {
        String str3;
        String str4;
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(gVar, "analytics");
        C41536l.m120489i(str, UrlHandler.ACTION);
        C41536l.m120489i(str2, "label");
        String c = aVar.mo72554c();
        String a = aVar.mo72552a();
        if (a == null) {
            str3 = str;
        } else {
            str3 = a;
        }
        String b = aVar.mo72553b();
        if (b == null) {
            str4 = str2;
        } else {
            str4 = b;
        }
        C32343x.m95399K0(gVar, c, str3, str4, (C10464h.C10465a) null, (Bundle) null, 24, (Object) null);
    }
}

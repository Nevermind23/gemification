package p202p0;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.C41536l;

/* renamed from: p0.p */
public class C7588p {

    /* renamed from: a */
    private final Uri f22134a;

    /* renamed from: b */
    private final String f22135b;

    /* renamed from: c */
    private final String f22136c;

    public C7588p(Uri uri, String str, String str2) {
        this.f22134a = uri;
        this.f22135b = str;
        this.f22136c = str2;
    }

    /* renamed from: a */
    public String mo22195a() {
        return this.f22135b;
    }

    /* renamed from: b */
    public String mo22196b() {
        return this.f22136c;
    }

    /* renamed from: c */
    public Uri mo22197c() {
        return this.f22134a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (mo22197c() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(mo22197c()));
        }
        if (mo22195a() != null) {
            sb.append(" action=");
            sb.append(mo22195a());
        }
        if (mo22196b() != null) {
            sb.append(" mimetype=");
            sb.append(mo22196b());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7588p(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        C41536l.m120489i(intent, "intent");
    }
}

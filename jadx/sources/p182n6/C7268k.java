package p182n6;

import android.content.Context;
import android.content.res.Resources;
import p130j6.C6733i;

/* renamed from: n6.k */
public class C7268k {

    /* renamed from: a */
    private final Resources f21464a;

    /* renamed from: b */
    private final String f21465b;

    public C7268k(Context context) {
        C7264i.m27902k(context);
        Resources resources = context.getResources();
        this.f21464a = resources;
        this.f21465b = resources.getResourcePackageName(C6733i.f20302a);
    }

    /* renamed from: a */
    public String mo21640a(String str) {
        int identifier = this.f21464a.getIdentifier(str, "string", this.f21465b);
        if (identifier == 0) {
            return null;
        }
        return this.f21464a.getString(identifier);
    }
}

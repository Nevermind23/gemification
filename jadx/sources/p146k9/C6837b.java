package p146k9;

import android.content.Context;
import com.google.android.datatransport.cct.C3774a;
import p068e9.C6052b0;
import p068e9.C6099p;
import p094g9.C6285b0;
import p107h9.C6485h;
import p142k5.C6811b;
import p142k5.C6814e;
import p142k5.C6816g;
import p159l9.C7026i;
import p168m5.C7135u;
import p337z7.Task;

/* renamed from: k9.b */
public class C6837b {

    /* renamed from: c */
    private static final C6485h f20474c = new C6485h();

    /* renamed from: d */
    private static final String f20475d = m26570e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    private static final String f20476e = m26570e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    private static final C6814e f20477f = new C6836a();

    /* renamed from: a */
    private final C6840e f20478a;

    /* renamed from: b */
    private final C6814e f20479b;

    C6837b(C6840e eVar, C6814e eVar2) {
        this.f20478a = eVar;
        this.f20479b = eVar2;
    }

    /* renamed from: b */
    public static C6837b m26568b(Context context, C7026i iVar, C6052b0 b0Var) {
        C7135u.m27505f(context);
        C6816g g = C7135u.m27503c().mo21392g(new C3774a(f20475d, f20476e));
        C6811b b = C6811b.m26540b("json");
        C6814e eVar = f20477f;
        return new C6837b(new C6840e(g.mo20889a("FIREBASE_CRASHLYTICS_REPORT", C6285b0.class, b, eVar), iVar.mo21237b(), b0Var), eVar);
    }

    /* renamed from: e */
    private static String m26570e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public Task mo20892c(C6099p pVar, boolean z) {
        return this.f20478a.mo20894i(pVar, z).mo24883a();
    }
}

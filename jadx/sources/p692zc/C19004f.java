package p692zc;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: zc.f */
public final class C19004f {

    /* renamed from: a */
    private final C18998b f53069a;

    /* renamed from: b */
    private final String f53070b = "identomat_";

    /* renamed from: c */
    private Map f53071c = C41344r0.m119928j();

    public C19004f(C18998b bVar) {
        C41536l.m120489i(bVar, "flags");
        this.f53069a = bVar;
    }

    /* renamed from: a */
    private final Resources m64219a(Context context, Locale locale) {
        Configuration configuration = context.getResources().getConfiguration();
        C41536l.m120488h(configuration, "context.resources.configuration");
        Configuration configuration2 = new Configuration(configuration);
        configuration2.setLocale(locale);
        return context.createConfigurationContext(configuration2).getResources();
    }

    /* renamed from: b */
    private final String m64220b(String str) {
        try {
            Map map = (Map) this.f53071c.get(this.f53069a.mo47064m());
            if (map == null || !map.containsKey(str)) {
                return null;
            }
            return (String) map.get(str);
        } catch (Exception e) {
            Log.i(this.f53070b, String.valueOf(e.getMessage()));
            return null;
        }
    }

    /* renamed from: c */
    public final void mo47123c(Map map) {
        C41536l.m120489i(map, "<set-?>");
        this.f53071c = map;
    }

    /* renamed from: d */
    public final String mo47124d(Context context, String str) {
        String str2;
        if (context == null) {
            return str;
        }
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.toLowerCase();
            C41536l.m120488h(str2, "this as java.lang.String).toLowerCase()");
        }
        String q = C41536l.m120497q("identomat_", str2);
        String b = m64220b(q);
        if (b != null) {
            return b;
        }
        try {
            Resources a = m64219a(context, new Locale(this.f53069a.mo47064m()));
            if (a == null) {
                a = context.getResources();
                C41536l.m120488h(a, "context.resources");
            }
            return a.getString(a.getIdentifier(q, "string", context.getPackageName()));
        } catch (Exception unused) {
            return str;
        }
    }
}

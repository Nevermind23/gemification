package w41;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: w41.c */
public abstract class C39517c implements C41555e {

    /* renamed from: a */
    private final String f93964a;

    /* renamed from: w41.c$a */
    public interface C39518a {
        SharedPreferences getSharedPreferences();
    }

    public C39517c(String str) {
        C41536l.m120489i(str, "prefKey");
        this.f93964a = str;
    }

    /* renamed from: a */
    public final String mo93154a() {
        return this.f93964a;
    }
}

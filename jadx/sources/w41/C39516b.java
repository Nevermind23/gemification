package w41;

import af1.C40303i;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import w41.C39517c;

/* renamed from: w41.b */
public final class C39516b extends C39517c {

    /* renamed from: b */
    private final Enum f93962b;

    /* renamed from: c */
    private final Class f93963c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39516b(String str, Enum enumR, Class cls) {
        super(str);
        C41536l.m120489i(str, "prefKey");
        C41536l.m120489i(cls, "class");
        this.f93962b = enumR;
        this.f93963c = cls;
    }

    /* renamed from: b */
    public Enum getValue(C39517c.C39518a aVar, C40303i iVar) {
        C41536l.m120489i(aVar, "thisRef");
        C41536l.m120489i(iVar, "property");
        Enum b = C39519d.m114855b(aVar.getSharedPreferences().getString(mo93154a(), (String) null), this.f93963c);
        if (b == null) {
            return this.f93962b;
        }
        return b;
    }

    /* renamed from: c */
    public void setValue(C39517c.C39518a aVar, C40303i iVar, Enum enumR) {
        String str;
        C41536l.m120489i(aVar, "thisRef");
        C41536l.m120489i(iVar, "property");
        SharedPreferences.Editor edit = aVar.getSharedPreferences().edit();
        C41536l.m120488h(edit, "editor");
        String a = mo93154a();
        if (enumR != null) {
            str = enumR.name();
        } else {
            str = null;
        }
        edit.putString(a, str);
        edit.apply();
    }
}

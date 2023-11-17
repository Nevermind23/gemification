package w41;

import af1.C40303i;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import w41.C39517c;

/* renamed from: w41.g */
public final class C39522g extends C39517c {

    /* renamed from: b */
    private final String f93967b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39522g(String str, String str2) {
        super(str);
        C41536l.m120489i(str, "prefKey");
        this.f93967b = str2;
    }

    /* renamed from: b */
    public String getValue(C39517c.C39518a aVar, C40303i iVar) {
        C41536l.m120489i(aVar, "thisRef");
        C41536l.m120489i(iVar, "property");
        return aVar.getSharedPreferences().getString(mo93154a(), this.f93967b);
    }

    /* renamed from: c */
    public void setValue(C39517c.C39518a aVar, C40303i iVar, String str) {
        C41536l.m120489i(aVar, "thisRef");
        C41536l.m120489i(iVar, "property");
        SharedPreferences.Editor edit = aVar.getSharedPreferences().edit();
        C41536l.m120488h(edit, "editor");
        edit.putString(mo93154a(), str);
        edit.apply();
    }
}

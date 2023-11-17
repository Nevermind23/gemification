package w41;

import af1.C40303i;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import w41.C39517c;

/* renamed from: w41.a */
public final class C39515a extends C39517c {

    /* renamed from: b */
    private final boolean f93961b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39515a(String str, boolean z) {
        super(str);
        C41536l.m120489i(str, "prefKey");
        this.f93961b = z;
    }

    /* renamed from: b */
    public Boolean getValue(C39517c.C39518a aVar, C40303i iVar) {
        C41536l.m120489i(aVar, "thisRef");
        C41536l.m120489i(iVar, "property");
        return Boolean.valueOf(aVar.getSharedPreferences().getBoolean(mo93154a(), this.f93961b));
    }

    /* renamed from: c */
    public void mo93151c(C39517c.C39518a aVar, C40303i iVar, boolean z) {
        C41536l.m120489i(aVar, "thisRef");
        C41536l.m120489i(iVar, "property");
        SharedPreferences.Editor edit = aVar.getSharedPreferences().edit();
        C41536l.m120488h(edit, "editor");
        edit.putBoolean(mo93154a(), z);
        edit.apply();
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj, C40303i iVar, Object obj2) {
        mo93151c((C39517c.C39518a) obj, iVar, ((Boolean) obj2).booleanValue());
    }
}

package p423fk;

import android.content.Context;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import p267u0.C8502v;
import p341ge.bog.mobilebank.app.p431db.BogDatabase;
import p409ek.C12477a;

/* renamed from: fk.a */
public final class C12922a {
    /* renamed from: a */
    public final BogDatabase mo33676a(C36546y yVar) {
        C41536l.m120489i(yVar, "app");
        Context applicationContext = yVar.getApplicationContext();
        C41536l.m120488h(applicationContext, "app.applicationContext");
        return (BogDatabase) C8502v.m31831a(applicationContext, BogDatabase.class, "bog_db_room.db").mo23824c().mo23823b(C12477a.m47515a()).mo23826e().mo23825d();
    }
}

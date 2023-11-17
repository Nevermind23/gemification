package jj0;

import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.Map;
import kj0.C25740a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh0.C27009d;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import xh0.C29792i;

/* renamed from: jj0.b */
public final class C25461b {

    /* renamed from: a */
    private final PreferencesApiManager f65120a;

    public C25461b(PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f65120a = preferencesApiManager;
    }

    /* renamed from: a */
    public final C25740a mo64031a(C29792i iVar, long j) {
        String str;
        String str2;
        String str3;
        C41536l.m120489i(iVar, "offer");
        boolean e = this.f65120a.getLanguage().mo90435e();
        long c = iVar.mo69995c();
        if (e) {
            str = iVar.mo69997e();
        } else {
            str = iVar.mo69999f();
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        String d = iVar.mo69996d();
        if (d == null) {
            str3 = "";
        } else {
            str3 = d;
        }
        Image.Url url = new Image.Url(str3, new Image.Resource(C27009d.f67789h, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null);
        String d2 = iVar.mo69996d();
        List b = iVar.mo69994b();
        List a = iVar.mo69993a();
        return new C25740a(j, c, iVar.mo69997e(), iVar.mo69999f(), str2, url, d2, b, a);
    }
}

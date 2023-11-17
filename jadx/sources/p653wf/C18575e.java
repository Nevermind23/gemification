package p653wf;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import ee1.C40774e;
import jd1.C41399f;
import p341ge.bog.chat.ChatInternal;
import p341ge.bog.chat.data.ChatUser;
import p419fg.C12875d;

/* renamed from: wf.e */
public final /* synthetic */ class C18575e implements C41399f {

    /* renamed from: d */
    public final /* synthetic */ C40774e f52092d;

    /* renamed from: e */
    public final /* synthetic */ Context f52093e;

    /* renamed from: f */
    public final /* synthetic */ boolean f52094f;

    /* renamed from: g */
    public final /* synthetic */ ChatUser f52095g;

    /* renamed from: h */
    public final /* synthetic */ ChatInternal f52096h;

    /* renamed from: i */
    public final /* synthetic */ FragmentManager f52097i;

    public /* synthetic */ C18575e(C40774e eVar, Context context, boolean z, ChatUser chatUser, ChatInternal chatInternal, FragmentManager fragmentManager) {
        this.f52092d = eVar;
        this.f52093e = context;
        this.f52094f = z;
        this.f52095g = chatUser;
        this.f52096h = chatInternal;
        this.f52097i = fragmentManager;
    }

    public final void accept(Object obj) {
        ChatInternal.m49019k(this.f52092d, this.f52093e, this.f52094f, this.f52095g, this.f52096h, this.f52097i, (C12875d) obj);
    }
}

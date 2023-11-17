package p433gg;

import ed1.C40741h;
import ed1.C40749p;
import p341ge.bog.chat.data.ChatUser;
import p419fg.C12870a;

/* renamed from: gg.a */
public interface C15276a {

    /* renamed from: gg.a$a */
    public static final class C15277a {
        /* renamed from: a */
        public static /* synthetic */ void m55664a(C15276a aVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                aVar.mo42359o(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endChat");
        }
    }

    /* renamed from: a */
    void mo42344a();

    /* renamed from: b */
    void mo42345b(String str, String str2, boolean z);

    /* renamed from: c */
    void mo42346c(ChatUser chatUser);

    /* renamed from: d */
    void mo42347d();

    /* renamed from: e */
    C40749p mo42348e();

    /* renamed from: f */
    C40749p mo42349f(String str);

    /* renamed from: g */
    C40749p mo42350g();

    C40749p getUnreadMessageCount();

    /* renamed from: h */
    C40749p mo42352h();

    /* renamed from: i */
    C40741h mo42353i();

    /* renamed from: j */
    C40749p mo42354j();

    /* renamed from: k */
    void mo42355k(C12870a.C12871a aVar);

    /* renamed from: l */
    C40749p mo42356l(boolean z);

    /* renamed from: m */
    void mo42357m(boolean z, String str);

    /* renamed from: n */
    C40749p mo42358n();

    /* renamed from: o */
    void mo42359o(boolean z);
}

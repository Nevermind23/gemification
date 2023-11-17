package p341ge.bog.mobilebank.p2p.presentation.send;

import android.database.Cursor;
import y31.C40019a;

/* renamed from: ge.bog.mobilebank.p2p.presentation.send.c */
public interface C33536c {

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.c$a */
    public static final class C33537a {
        /* renamed from: a */
        public static /* synthetic */ void m98468a(C33536c cVar, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                cVar.mo79463B0(str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCardPickerClicked");
        }
    }

    /* renamed from: B0 */
    void mo79463B0(String str);

    /* renamed from: Du */
    void mo79467Du();

    /* renamed from: Yn */
    void mo79484Yn(Cursor cursor);

    /* renamed from: al */
    void mo79486al(C40019a aVar);

    /* renamed from: b2 */
    void mo79487b2(String str);

    /* renamed from: nb */
    void mo79495nb(String str);

    /* renamed from: qg */
    void mo79497qg(String str, String str2, String str3);
}

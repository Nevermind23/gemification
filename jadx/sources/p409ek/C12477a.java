package p409ek;

import kotlin.jvm.internal.C41536l;
import p280v0.C8684b;
import p318y0.C8998i;

/* renamed from: ek.a */
public abstract class C12477a {

    /* renamed from: a */
    private static final C8684b f37149a = new C12478a();

    /* renamed from: ek.a$a */
    public static final class C12478a extends C8684b {
        C12478a() {
            super(29, 30);
        }

        /* renamed from: a */
        public void mo6809a(C8998i iVar) {
            C41536l.m120489i(iVar, "database");
            try {
                iVar.mo23652L("DROP TABLE CommonDictionaryEntry");
            } catch (Exception unused) {
            }
            try {
                iVar.mo23652L("DROP TABLE PaymentProviderConfiguration");
            } catch (Exception unused2) {
            }
            try {
                iVar.mo23652L("DROP TABLE PaymentsDictionaryEntry");
            } catch (Exception unused3) {
            }
            try {
                iVar.mo23652L("DROP TABLE GeofenceLocationEntry");
            } catch (Exception unused4) {
            }
        }
    }

    /* renamed from: a */
    public static final C8684b m47515a() {
        return f37149a;
    }
}

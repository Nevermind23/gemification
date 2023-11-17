package com.facebook;

import java.util.Random;
import p006a5.C0050b;
import p297w4.C8808k;

public class FacebookException extends RuntimeException {
    static final long serialVersionUID = 1;

    /* renamed from: com.facebook.FacebookException$a */
    class C2603a implements C8808k.C8811c {

        /* renamed from: a */
        final /* synthetic */ String f8117a;

        C2603a(String str) {
            this.f8117a = str;
        }

        /* renamed from: a */
        public void mo8159a(boolean z) {
            if (z) {
                try {
                    C0050b.m190c(this.f8117a);
                } catch (Exception unused) {
                }
            }
        }
    }

    public FacebookException() {
    }

    public String toString() {
        return getMessage();
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str != null && C2626d.m10152w() && random.nextInt(100) > 50) {
            C8808k.m32791a(C8808k.C8812d.ErrorReport, new C2603a(str));
        }
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}

package p341ge.bog.mobilebank.cleanarch.presentation.pfm.faq.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import hd1.C41204a;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p380ck.C10464h;
import r40.C27917c;
import r40.C27918d;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.viewmodel.FAQViewModel */
public final class FAQViewModel extends C21481a {

    /* renamed from: d */
    private final C1644x f58914d = new C1644x();

    /* renamed from: e */
    public String f58915e;

    /* renamed from: f */
    public String f58916f;

    /* renamed from: g */
    public String f58917g;

    public FAQViewModel() {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: dw */
    public final String mo54989dw() {
        String str = this.f58916f;
        if (str != null) {
            return str;
        }
        C41536l.m120506z("analyticsAction");
        return null;
    }

    /* renamed from: ew */
    public final String mo54990ew() {
        String str = this.f58915e;
        if (str != null) {
            return str;
        }
        C41536l.m120506z("analyticsCategory");
        return null;
    }

    /* renamed from: fw */
    public final String mo54991fw() {
        String str = this.f58917g;
        if (str != null) {
            return str;
        }
        C41536l.m120506z("analyticsLabel");
        return null;
    }

    /* renamed from: gw */
    public final C1644x mo54992gw() {
        return this.f58914d;
    }

    /* renamed from: hw */
    public final void mo54993hw() {
        C36546y.m108282F().mo27137H(mo54990ew(), mo54989dw(), mo54991fw(), (Bundle) null, C10464h.C10465a.FIREBASE);
    }

    /* renamed from: iw */
    public final void mo54994iw(C27917c cVar) {
        C41536l.m120489i(cVar, "faqType");
        this.f58914d.mo4826r(C27918d.f71113a.mo67497a(cVar));
    }

    /* renamed from: jw */
    public final void mo54995jw(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f58916f = str;
    }

    /* renamed from: kw */
    public final void mo54996kw(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f58915e = str;
    }

    /* renamed from: lw */
    public final void mo54997lw(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f58917g = str;
    }
}

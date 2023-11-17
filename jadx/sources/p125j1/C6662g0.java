package p125j1;

import android.webkit.WebSettings;
import ig1.C41367a;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: j1.g0 */
public class C6662g0 {

    /* renamed from: a */
    private final WebkitToCompatConverterBoundaryInterface f20209a;

    public C6662g0(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f20209a = webkitToCompatConverterBoundaryInterface;
    }

    /* renamed from: a */
    public C6649b0 mo20671a(WebSettings webSettings) {
        return new C6649b0((WebSettingsBoundaryInterface) C41367a.m120055a(WebSettingsBoundaryInterface.class, this.f20209a.convertSettings(webSettings)));
    }
}

package p125j1;

import ig1.C41367a;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: j1.f0 */
public class C6660f0 implements C6658e0 {

    /* renamed from: a */
    final WebViewProviderFactoryBoundaryInterface f20208a;

    public C6660f0(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f20208a = webViewProviderFactoryBoundaryInterface;
    }

    /* renamed from: a */
    public String[] mo20669a() {
        return this.f20208a.getSupportedFeatures();
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C41367a.m120055a(WebkitToCompatConverterBoundaryInterface.class, this.f20208a.getWebkitToCompatConverter());
    }
}

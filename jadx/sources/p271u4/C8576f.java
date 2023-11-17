package p271u4;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: u4.f */
final class C8576f {

    /* renamed from: a */
    private final Set f24316a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f24317b = new HashMap();

    /* renamed from: u4.f$a */
    class C8577a implements ValueCallback {

        /* renamed from: a */
        final /* synthetic */ C8578b f24318a;

        C8577a(C8578b bVar) {
            this.f24318a = bVar;
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
            C8576f.this.f24317b.put(this.f24318a.f24321a, str);
        }
    }

    /* renamed from: u4.f$b */
    private static final class C8578b {

        /* renamed from: f */
        private static final int[] f24320f = new int[2];

        /* renamed from: a */
        public final String f24321a;

        /* renamed from: b */
        public final int f24322b;

        /* renamed from: c */
        public final int f24323c;

        /* renamed from: d */
        public final int f24324d;

        /* renamed from: e */
        public final int f24325e;

        public C8578b(WebView webView) {
            this.f24321a = String.format("%s{%s}", new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())});
            int[] iArr = f24320f;
            webView.getLocationOnScreen(iArr);
            this.f24322b = iArr[0];
            this.f24323c = iArr[1];
            this.f24324d = webView.getWidth();
            this.f24325e = webView.getHeight();
        }
    }

    C8576f() {
    }

    /* renamed from: c */
    private static String m32066c(C8578b bVar, String str) {
        String replace = str.replace("\\u003C", "<").replace("\\n", "").replace("\\\"", "\"");
        return String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", new Object[]{bVar.f24321a, Integer.valueOf(bVar.f24322b), Integer.valueOf(bVar.f24323c), Integer.valueOf(bVar.f24324d), Integer.valueOf(bVar.f24325e), replace.substring(1, replace.length() - 1)});
    }

    /* renamed from: b */
    public void mo23917b(PrintWriter printWriter) {
        try {
            for (C8578b bVar : this.f24316a) {
                String str = (String) this.f24317b.get(bVar.f24321a);
                if (str != null) {
                    printWriter.print("WebView HTML for ");
                    printWriter.print(bVar);
                    printWriter.println(":");
                    printWriter.println(m32066c(bVar, str));
                }
            }
        } catch (Exception unused) {
        }
        this.f24316a.clear();
        this.f24317b.clear();
    }

    /* renamed from: d */
    public void mo23918d(WebView webView) {
        C8578b bVar = new C8578b(webView);
        this.f24316a.add(bVar);
        webView.evaluateJavascript(String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", new Object[]{Integer.valueOf(bVar.f24322b), Integer.valueOf(bVar.f24323c), Float.valueOf(webView.getResources().getDisplayMetrics().scaledDensity)}), new C8577a(bVar));
    }
}

package p125j1;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p112i1.C6508c;
import p125j1.C6636a;
import p125j1.C6646a0;

/* renamed from: j1.c0 */
public abstract class C6651c0 {

    /* renamed from: A */
    public static final C6636a.C6638b f20152A = new C6636a.C6638b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: B */
    public static final C6636a.C6638b f20153B = new C6636a.C6638b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* renamed from: C */
    public static final C6636a.C6640d f20154C = new C6636a.C6640d("WEB_MESSAGE_GET_MESSAGE_PAYLOAD", "WEB_MESSAGE_GET_MESSAGE_PAYLOAD");

    /* renamed from: D */
    public static final C6636a.C6638b f20155D = new C6636a.C6638b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* renamed from: E */
    public static final C6636a.C6638b f20156E = new C6636a.C6638b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* renamed from: F */
    public static final C6636a.C6638b f20157F = new C6636a.C6638b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* renamed from: G */
    public static final C6636a.C6638b f20158G = new C6636a.C6638b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* renamed from: H */
    public static final C6636a.C6641e f20159H = new C6636a.C6641e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* renamed from: I */
    public static final C6636a.C6641e f20160I = new C6636a.C6641e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* renamed from: J */
    public static final C6636a.C6644h f20161J = new C6636a.C6644h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* renamed from: K */
    public static final C6636a.C6644h f20162K = new C6636a.C6644h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* renamed from: L */
    public static final C6636a.C6643g f20163L = new C6636a.C6643g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* renamed from: M */
    public static final C6646a0.C6647a f20164M = new C6646a0.C6647a("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* renamed from: N */
    public static final C6636a.C6644h f20165N = new C6636a.C6644h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* renamed from: O */
    public static final C6636a.C6645i f20166O = new C6652a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* renamed from: P */
    public static final C6636a.C6640d f20167P = new C6636a.C6640d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* renamed from: Q */
    public static final C6636a.C6640d f20168Q = new C6636a.C6640d("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE");

    /* renamed from: R */
    public static final C6636a.C6640d f20169R = new C6636a.C6640d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* renamed from: S */
    public static final C6636a.C6644h f20170S = new C6636a.C6644h("FORCE_DARK", "FORCE_DARK");

    /* renamed from: T */
    public static final C6636a.C6640d f20171T = new C6636a.C6640d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* renamed from: U */
    public static final C6636a.C6640d f20172U = new C6636a.C6640d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* renamed from: V */
    public static final C6636a.C6640d f20173V = new C6636a.C6640d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* renamed from: W */
    public static final C6636a.C6640d f20174W = new C6636a.C6640d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* renamed from: X */
    public static final C6636a.C6640d f20175X = new C6636a.C6640d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* renamed from: Y */
    public static final C6636a.C6640d f20176Y = new C6636a.C6640d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: Z */
    public static final C6636a.C6640d f20177Z = new C6636a.C6640d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: a */
    public static final C6636a.C6638b f20178a = new C6636a.C6638b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: a0 */
    public static final C6636a.C6640d f20179a0 = new C6636a.C6640d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: b */
    public static final C6636a.C6638b f20180b = new C6636a.C6638b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: c */
    public static final C6636a.C6641e f20181c = new C6636a.C6641e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: d */
    public static final C6636a.C6639c f20182d = new C6636a.C6639c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: e */
    public static final C6636a.C6642f f20183e = new C6636a.C6642f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* renamed from: f */
    public static final C6636a.C6642f f20184f = new C6636a.C6642f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: g */
    public static final C6636a.C6642f f20185g = new C6636a.C6642f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: h */
    public static final C6636a.C6642f f20186h = new C6636a.C6642f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: i */
    public static final C6636a.C6642f f20187i = new C6636a.C6642f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: j */
    public static final C6636a.C6642f f20188j = new C6636a.C6642f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k */
    public static final C6636a.C6639c f20189k = new C6636a.C6639c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l */
    public static final C6636a.C6639c f20190l = new C6636a.C6639c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m */
    public static final C6636a.C6639c f20191m = new C6636a.C6639c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n */
    public static final C6636a.C6639c f20192n = new C6636a.C6639c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o */
    public static final C6636a.C6639c f20193o = new C6636a.C6639c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p */
    public static final C6636a.C6639c f20194p = new C6636a.C6639c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q */
    public static final C6636a.C6638b f20195q = new C6636a.C6638b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r */
    public static final C6636a.C6638b f20196r = new C6636a.C6638b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s */
    public static final C6636a.C6639c f20197s = new C6636a.C6639c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t */
    public static final C6636a.C6642f f20198t = new C6636a.C6642f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u */
    public static final C6636a.C6639c f20199u = new C6636a.C6639c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v */
    public static final C6636a.C6638b f20200v = new C6636a.C6638b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w */
    public static final C6636a.C6638b f20201w = new C6636a.C6638b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x */
    public static final C6636a.C6642f f20202x = new C6636a.C6642f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y */
    public static final C6636a.C6642f f20203y = new C6636a.C6642f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z */
    public static final C6636a.C6642f f20204z = new C6636a.C6642f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* renamed from: j1.c0$a */
    class C6652a extends C6636a.C6645i {

        /* renamed from: d */
        private final Pattern f20205d = Pattern.compile("\\A\\d+");

        C6652a(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: d */
        public boolean mo20666d() {
            boolean d = super.mo20666d();
            if (!d || Build.VERSION.SDK_INT >= 29) {
                return d;
            }
            PackageInfo a = C6508c.m25693a();
            if (a == null) {
                return false;
            }
            Matcher matcher = this.f20205d.matcher(a.versionName);
            if (!matcher.find() || Integer.parseInt(a.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static UnsupportedOperationException m26067a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* renamed from: b */
    public static boolean m26068b(String str) {
        return m26069c(str, C6636a.m26050e());
    }

    /* renamed from: c */
    public static boolean m26069c(String str, Collection collection) {
        HashSet<C6680y> hashSet = new HashSet<>();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C6680y yVar = (C6680y) it.next();
            if (yVar.mo20664b().equals(str)) {
                hashSet.add(yVar);
            }
        }
        if (!hashSet.isEmpty()) {
            for (C6680y a : hashSet) {
                if (a.mo20663a()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }
}

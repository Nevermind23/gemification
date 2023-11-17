package de0;

import android.content.res.Resources;
import iu0.C36546y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l41.C37071a;
import p341ge.bog.mobilebank.R;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.shared2.network.NetworkException;
import p341ge.bog.mobilebank.shared2.network.models.BffApiError;
import r90.C27950a;
import retrofit2.HttpException;

/* renamed from: de0.b */
public abstract class C19983b implements C37071a {

    /* renamed from: b */
    public static final C19984a f54577b = new C19984a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Resources f54578a;

    /* renamed from: de0.b$a */
    public static final class C19984a {
        private C19984a() {
        }

        public /* synthetic */ C19984a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: de0.b$c */
    public static abstract class C19986c {

        /* renamed from: de0.b$c$a */
        public static final class C19987a extends C19986c {

            /* renamed from: a */
            private final String f54582a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19987a(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "key");
                this.f54582a = str;
            }

            /* renamed from: a */
            public final String mo48357a() {
                return this.f54582a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C19987a) && C41536l.m120484d(this.f54582a, ((C19987a) obj).f54582a);
            }

            public int hashCode() {
                return this.f54582a.hashCode();
            }

            public String toString() {
                String str = this.f54582a;
                return "Dictionary(key=" + str + ")";
            }
        }

        /* renamed from: de0.b$c$b */
        public static final class C19988b extends C19986c {

            /* renamed from: a */
            private final String f54583a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19988b(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "text");
                this.f54583a = str;
            }

            /* renamed from: a */
            public final String mo48361a() {
                return this.f54583a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C19988b) && C41536l.m120484d(this.f54583a, ((C19988b) obj).f54583a);
            }

            public int hashCode() {
                return this.f54583a.hashCode();
            }

            public String toString() {
                String str = this.f54583a;
                return "RawText(text=" + str + ")";
            }
        }

        /* renamed from: de0.b$c$c */
        public static final class C19989c extends C19986c {

            /* renamed from: a */
            private final int f54584a;

            public C19989c(int i) {
                super((DefaultConstructorMarker) null);
                this.f54584a = i;
            }

            /* renamed from: a */
            public final int mo48365a() {
                return this.f54584a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C19989c) && this.f54584a == ((C19989c) obj).f54584a;
            }

            public int hashCode() {
                return this.f54584a;
            }

            public String toString() {
                int i = this.f54584a;
                return "Resource(resId=" + i + ")";
            }
        }

        private C19986c() {
        }

        public /* synthetic */ C19986c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C19983b(Resources resources) {
        C41536l.m120489i(resources, "resources");
        this.f54578a = resources;
    }

    /* renamed from: b */
    private final String m65885b(C19986c cVar) {
        if ((cVar instanceof C19986c.C19988b) || (cVar instanceof C19986c.C19989c)) {
            return null;
        }
        if (cVar instanceof C19986c.C19987a) {
            return C27950a.m86287d(((C19986c.C19987a) cVar).mo48357a(), false, 2, (Object) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    private final String m65886c(C19986c cVar) {
        if (cVar instanceof C19986c.C19988b) {
            return ((C19986c.C19988b) cVar).mo48361a();
        }
        if (cVar instanceof C19986c.C19989c) {
            String string = this.f54578a.getString(((C19986c.C19989c) cVar).mo48365a());
            C41536l.m120488h(string, "resources.getString(resId)");
            return string;
        } else if (cVar instanceof C19986c.C19987a) {
            return C27950a.m86287d(((C19986c.C19987a) cVar).mo48357a(), false, 2, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    private final String m65887d(C19986c cVar) {
        if (cVar instanceof C19986c.C19988b) {
            return null;
        }
        if (cVar instanceof C19986c.C19989c) {
            return this.f54578a.getResourceEntryName(((C19986c.C19989c) cVar).mo48365a());
        }
        if (cVar instanceof C19986c.C19987a) {
            return ((C19986c.C19987a) cVar).mo48357a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: f */
    private final String m65888f(C19986c cVar) {
        if (cVar instanceof C19986c.C19988b) {
            return ((C19986c.C19988b) cVar).mo48361a();
        }
        if (cVar instanceof C19986c.C19989c) {
            return this.f54578a.getString(((C19986c.C19989c) cVar).mo48365a());
        }
        if (cVar instanceof C19986c.C19987a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public void mo48350a(Throwable th) {
        C19985b bVar;
        boolean z;
        String str;
        C19986c cVar;
        C19985b bVar2;
        C19986c cVar2;
        if (th instanceof NetworkException.NotConnectedToNetwork) {
            bVar = new C19985b("-5000", new C19986c.C19989c(R.string.error_text_not_connected_to_network), (String) null, 4, (DefaultConstructorMarker) null);
        } else if (th instanceof NetworkException.NoInternetException) {
            bVar = new C19985b("-5001", new C19986c.C19989c(R.string.error_text_no_internet_access), (String) null, 4, (DefaultConstructorMarker) null);
        } else {
            String str2 = "-5003";
            boolean z2 = false;
            boolean z3 = true;
            if (th instanceof ApiError) {
                BankApiResponse a = ((ApiError) th).mo84685a();
                String key = a.getKey();
                String errorValue = a.getErrorValue();
                if (key == null || key.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    cVar2 = new C19986c.C19987a(key);
                } else if (errorValue != null) {
                    cVar2 = new C19986c.C19988b(errorValue);
                } else {
                    cVar2 = new C19986c.C19989c(R.string.common_text_operation_error);
                }
                String code = a.getCode();
                if (code != null) {
                    str2 = code;
                }
                bVar2 = new C19985b(str2, cVar2, a.getError());
            } else if (th instanceof BffApiError) {
                BffApiError bffApiError = (BffApiError) th;
                String b = bffApiError.mo84716b();
                String d = bffApiError.mo84718d();
                if (b == null || b.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    cVar = new C19986c.C19987a(b);
                } else if (d != null) {
                    cVar = new C19986c.C19988b(d);
                } else {
                    cVar = new C19986c.C19989c(R.string.common_text_operation_error);
                }
                String a2 = bffApiError.mo84715a();
                if (a2 != null) {
                    str2 = a2;
                }
                bVar2 = new C19985b(str2, cVar, bffApiError.mo84717c());
            } else {
                if (th instanceof NetworkException.SessionExpiredException) {
                    z = true;
                } else {
                    z = C41536l.m120484d(th, NetworkException.PostLogoutSessionExpiredException.f83828d);
                }
                if (!z) {
                    z3 = C41536l.m120484d(th, NetworkException.ServerUnderMaintenanceException.f83829d);
                }
                if (z3) {
                    bVar = null;
                } else {
                    if (th instanceof HttpException) {
                        str = String.valueOf(((HttpException) th).mo97818a());
                    } else {
                        str = "-5002";
                    }
                    bVar = new C19985b(str, new C19986c.C19989c(R.string.common_text_operation_error), (String) null, 4, (DefaultConstructorMarker) null);
                }
            }
            bVar = bVar2;
        }
        if (bVar != null) {
            C36546y.m108282F().mo27135F(bVar.mo48352b(), m65887d(bVar.mo48353c()), m65888f(bVar.mo48353c()), bVar.mo48351a(), m65885b(bVar.mo48353c()), mo48348e());
            mo48349g(m65886c(bVar.mo48353c()));
        }
    }

    /* renamed from: e */
    public abstract String mo48348e();

    /* renamed from: g */
    public abstract void mo48349g(String str);

    /* renamed from: de0.b$b */
    public static final class C19985b {

        /* renamed from: a */
        private final String f54579a;

        /* renamed from: b */
        private final C19986c f54580b;

        /* renamed from: c */
        private final String f54581c;

        public C19985b(String str, C19986c cVar, String str2) {
            C41536l.m120489i(str, "errorCode");
            C41536l.m120489i(cVar, "errorText");
            this.f54579a = str;
            this.f54580b = cVar;
            this.f54581c = str2;
        }

        /* renamed from: a */
        public final String mo48351a() {
            return this.f54581c;
        }

        /* renamed from: b */
        public final String mo48352b() {
            return this.f54579a;
        }

        /* renamed from: c */
        public final C19986c mo48353c() {
            return this.f54580b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19985b)) {
                return false;
            }
            C19985b bVar = (C19985b) obj;
            return C41536l.m120484d(this.f54579a, bVar.f54579a) && C41536l.m120484d(this.f54580b, bVar.f54580b) && C41536l.m120484d(this.f54581c, bVar.f54581c);
        }

        public int hashCode() {
            int hashCode = ((this.f54579a.hashCode() * 31) + this.f54580b.hashCode()) * 31;
            String str = this.f54581c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f54579a;
            C19986c cVar = this.f54580b;
            String str2 = this.f54581c;
            return "ErrorDetails(errorCode=" + str + ", errorText=" + cVar + ", details=" + str2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19985b(String str, C19986c cVar, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, cVar, (i & 4) != 0 ? null : str2);
        }
    }
}

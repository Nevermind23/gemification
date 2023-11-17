package p398dn;

import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32343x;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.model.usrinfo.UserInfo;
import p537nm.C17102s;
import p537nm.C17103t;
import p674xm.C18810l;
import ue1.C43075l;

/* renamed from: dn.b */
public final class C12327b {

    /* renamed from: a */
    public static final C12327b f36972a = new C12327b();

    /* renamed from: dn.b$a */
    static final class C12328a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f36973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12328a(long j) {
            super(1);
            this.f36973d = j;
        }

        /* renamed from: a */
        public final Boolean invoke(ServiceCenterUiModel serviceCenterUiModel) {
            boolean z;
            C41536l.m120489i(serviceCenterUiModel, "sc");
            if (serviceCenterUiModel.mo55422a() == this.f36973d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    private C12327b() {
    }

    /* renamed from: a */
    public final C18810l mo32910a(long j, List list) {
        C41536l.m120489i(list, "cities");
        return mo32911b(list, new C12328a(j));
    }

    /* renamed from: b */
    public final C18810l mo32911b(List list, C43075l lVar) {
        Object obj;
        C41536l.m120489i(list, "<this>");
        C41536l.m120489i(lVar, "matcher");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ServiceCenterUiModel serviceCenterUiModel = (ServiceCenterUiModel) it.next();
            List<ServiceCenterUiModel> g = serviceCenterUiModel.mo55429g();
            if (g != null) {
                for (ServiceCenterUiModel serviceCenterUiModel2 : g) {
                    List<ServiceCenterUiModel> g2 = serviceCenterUiModel2.mo55429g();
                    if (g2 != null) {
                        for (ServiceCenterUiModel serviceCenterUiModel3 : g2) {
                            List g3 = serviceCenterUiModel3.mo55429g();
                            if (g3 != null) {
                                Iterator it2 = g3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    if (((Boolean) lVar.invoke((ServiceCenterUiModel) obj)).booleanValue()) {
                                        break;
                                    }
                                }
                                ServiceCenterUiModel serviceCenterUiModel4 = (ServiceCenterUiModel) obj;
                                if (serviceCenterUiModel4 != null) {
                                    return new C18810l(serviceCenterUiModel4, serviceCenterUiModel.mo55424d() + ", " + serviceCenterUiModel2.mo55424d() + ", " + serviceCenterUiModel3.mo55424d());
                                }
                            }
                        }
                        continue;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final String mo32912c(double d, String str) {
        C41536l.m120489i(str, "cardFeeCcy");
        if (d <= Utils.DOUBLE_EPSILON) {
            return C32343x.m95388F("text.card.applications.card.price.free", new Object[0]);
        }
        String k = C32303f.m95200k(d, str);
        C41536l.m120488h(k, "getFormattedAmount(\n    …     cardFeeCcy\n        )");
        return k;
    }

    /* renamed from: d */
    public final String mo32913d(C17103t tVar) {
        double d;
        String str;
        C41536l.m120489i(tVar, "it");
        C17102s a = tVar.mo44487a();
        if (a != null) {
            d = a.mo44479a();
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        C17102s a2 = tVar.mo44487a();
        if (a2 == null || (str = a2.mo44480b()) == null) {
            str = "GEL";
        }
        return mo32912c(d, str);
    }

    /* renamed from: e */
    public final String mo32914e(UserInfo userInfo) {
        String str;
        String str2;
        C41536l.m120489i(userInfo, "<this>");
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = language.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (C40440x.m117139M(lowerCase, "ka", false, 2, (Object) null)) {
            str = userInfo.firstName;
            str2 = "firstName";
        } else {
            str = userInfo.firstNameInt;
            str2 = "firstNameInt";
        }
        C41536l.m120488h(str, str2);
        return str;
    }

    /* renamed from: f */
    public final String mo32915f(UserInfo userInfo) {
        String str;
        String str2;
        C41536l.m120489i(userInfo, "<this>");
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = language.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (C40440x.m117139M(lowerCase, "ka", false, 2, (Object) null)) {
            str = userInfo.lastName;
            str2 = "lastName";
        } else {
            str = userInfo.lastNameInt;
            str2 = "lastNameInt";
        }
        C41536l.m120488h(str, str2);
        return str;
    }

    /* renamed from: g */
    public final String mo32916g(DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel) {
        C41536l.m120489i(debitCardPayrollInfoUiModel, "<this>");
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = language.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (C40440x.m117139M(lowerCase, "ka", false, 2, (Object) null)) {
            return debitCardPayrollInfoUiModel.mo39551e();
        }
        return debitCardPayrollInfoUiModel.mo39549d();
    }
}
